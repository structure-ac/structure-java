/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package structure.Structure.utils;

import java.io.IOException;
import java.lang.reflect.Field;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.apache.http.NameValuePair;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public final class Utils {
    public static String generateURL(String baseURL, String path)
            throws IllegalArgumentException, IllegalAccessException {
        if (baseURL != null && baseURL.endsWith("/")) {
            baseURL = baseURL.split("/")[0];
        }

        return baseURL + path;
    }

    public static <T extends Object> String generateURL(Class<T> type, String baseURL, String path, T params,
            Map<String, Map<String, Map<String, Object>>> globals)
            throws IllegalArgumentException, IllegalAccessException, JsonProcessingException {
        if (baseURL != null && baseURL.endsWith("/")) {
            baseURL = baseURL.split("/")[0];
        }

        Map<String, String> pathParams = new HashMap<>();

        Field[] fields = type.getFields();

        for (Field field : fields) {
            PathParamsMetadata pathParamsMetadata = PathParamsMetadata.parse(field);
            if (pathParamsMetadata == null) {
                continue;
            }

            Object value = params != null ? field.get(params) : null;
            value = Utils.popualteGlobal(value, field.getName(), "pathParam", globals);
            if (value == null) {
                continue;
            }

            if (pathParamsMetadata.serialization != null && !pathParamsMetadata.serialization.isBlank()) {
                Map<String, String> serialized = parseSerializedParams(pathParamsMetadata, value);
                pathParams.putAll(serialized);
            } else {
                switch (pathParamsMetadata.style) {
                    case "simple":
                        switch (Types.getType(value.getClass())) {
                            case ARRAY:
                                Object[] array = (Object[]) value;
                                if (array.length == 0) {
                                    continue;
                                }

                                pathParams.put(pathParamsMetadata.name,
                                        String.join(",",
                                                Arrays.asList(array).stream().map(v -> Utils.valToString(v))
                                                        .collect(Collectors.toList())));
                                break;
                            case MAP:
                                Map<?, ?> map = (Map<?, ?>) value;
                                if (map.size() == 0) {
                                    continue;
                                }

                                pathParams.put(pathParamsMetadata.name,
                                        String.join(",", map.entrySet().stream().map(e -> {
                                            if (pathParamsMetadata.explode) {
                                                return String.format("%s=%s", Utils.valToString(e.getKey()),
                                                        Utils.valToString(e.getValue()));
                                            } else {
                                                return String.format("%s,%s", Utils.valToString(e.getKey()),
                                                        Utils.valToString(e.getValue()));
                                            }
                                        }).collect(Collectors.toList())));
                                break;
                            case OBJECT:
                                List<String> values = new ArrayList<String>();

                                Field[] valueFields = value.getClass().getFields();
                                for (Field valueField : valueFields) {
                                    PathParamsMetadata valuePathParamsMetadata = PathParamsMetadata.parse(valueField);
                                    if (valuePathParamsMetadata == null) {
                                        continue;
                                    }

                                    Object val = valueField.get(value);

                                    if (val == null) {
                                        continue;
                                    }

                                    if (pathParamsMetadata.explode) {
                                        values.add(String.format("%s=%s", valuePathParamsMetadata.name,
                                                Utils.valToString(val)));
                                    } else {
                                        values.add(String.format("%s,%s", valuePathParamsMetadata.name,
                                                Utils.valToString(val)));
                                    }
                                }

                                pathParams.put(pathParamsMetadata.name, String.join(",", values));
                                break;
                            default:
                                pathParams.put(pathParamsMetadata.name, Utils.valToString(value));
                                break;
                        }
                }
            }
        }

        return baseURL + templateUrl(path, pathParams);
    }

    public static boolean matchContentType(String contentType, String pattern) {
        if (contentType == null || contentType.isBlank()) {
            return false;
        }

        if (contentType.equals(pattern) || pattern.equals("*") || pattern.equals("*/*")) {
            return true;
        }

        String[] contentTypeParts = contentType.split(";");
        if (contentTypeParts.length == 0) {
            return false;
        }
        String mediaType = contentTypeParts[0];

        if (mediaType.equals(pattern)) {
            return true;
        }

        String[] mediaTypeParts = mediaType.split("/");
        if (mediaTypeParts.length == 2) {
            if (String.format("%s/*", mediaTypeParts[0]).equals(pattern)
                    || String.format("*/%s", mediaTypeParts[1]).equals(pattern)) {
                return true;
            }
        }

        return false;
    }

    public static SerializedBody serializeRequestBody(Object request, String requestField, String serializationMethod)
            throws NoSuchFieldException,
            IllegalArgumentException, IllegalAccessException, UnsupportedOperationException, IOException {
        return RequestBody.serialize(request, requestField, serializationMethod);
    }

    public static <T extends Object> List<NameValuePair> getQueryParams(Class<T> type, T params,
            Map<String, Map<String, Map<String, Object>>> globals) throws Exception {
        return QueryParameters.parseQueryParams(type, params, globals);
    }

    public static HTTPClient configureSecurityClient(HTTPClient client, Object security) throws Exception {
        return Security.createClient(client, security);
    }

    public static String templateUrl(String url, Map<String, String> params) {
        StringBuilder sb = new StringBuilder();

        Pattern p = Pattern.compile("(\\{.*?\\})");
        Matcher m = p.matcher(url);

        while (m.find()) {
            String match = m.group(1);
            String key = match.substring(1, match.length() - 1);
            String value = params.get(key);
            if (value != null) {
                m.appendReplacement(sb, value);
            }
        }
        m.appendTail(sb);

        return sb.toString();
    }

    public static Map<String, List<String>> getHeaders(Object headers) throws Exception {
        if (headers == null) {
            return null;
        }

        Map<String, List<String>> result = new HashMap<>();

        Field[] fields = headers.getClass().getFields();

        for (Field field : fields) {
            HeaderMetadata headerMetadata = HeaderMetadata.parse(field);
            if (headerMetadata == null) {
                continue;
            }

            Object value = field.get(headers);
            if (value == null) {
                continue;
            }

            switch (Types.getType(value.getClass())) {
                case OBJECT: {
                    List<String> items = new ArrayList<String>();

                    Field[] valueFields = value.getClass().getFields();
                    for (Field valueField : valueFields) {
                        HeaderMetadata valueHeaderMetadata = HeaderMetadata.parse(valueField);
                        if (valueHeaderMetadata == null || valueHeaderMetadata.name == null
                                || valueHeaderMetadata.name.isBlank()) {
                            continue;
                        }

                        Object valueFieldValue = valueField.get(value);
                        if (valueFieldValue == null) {
                            continue;
                        }

                        if (headerMetadata.explode) {
                            items.add(
                                    String.format("%s=%s", valueHeaderMetadata.name,
                                            Utils.valToString(valueFieldValue)));
                        } else {
                            items.add(valueHeaderMetadata.name);
                            items.add(Utils.valToString(valueFieldValue));
                        }
                    }

                    if (!result.containsKey(headerMetadata.name)) {
                        result.put(headerMetadata.name, new ArrayList<String>());
                    }

                    List<String> values = result.get(headerMetadata.name);
                    values.add(String.join(",", items));

                    break;
                }
                case MAP: {
                    Map<?, ?> map = (Map<?, ?>) value;
                    if (map.size() == 0) {
                        continue;
                    }

                    List<String> items = new ArrayList<String>();

                    for (Map.Entry<?, ?> entry : map.entrySet()) {
                        if (headerMetadata.explode) {
                            items.add(String.format("%s=%s", Utils.valToString(entry.getKey()),
                                    Utils.valToString(entry.getValue())));
                        } else {
                            items.add(Utils.valToString(entry.getKey()));
                            items.add(Utils.valToString(entry.getValue()));
                        }
                    }

                    if (!result.containsKey(headerMetadata.name)) {
                        result.put(headerMetadata.name, new ArrayList<String>());
                    }

                    List<String> values = result.get(headerMetadata.name);
                    values.add(String.join(",", items));

                    break;
                }
                case ARRAY: {
                    Object[] array = (Object[]) value;

                    if (array.length == 0) {
                        continue;
                    }

                    List<String> items = new ArrayList<String>();

                    for (Object item : array) {
                        items.add(Utils.valToString(item));
                    }

                    if (!result.containsKey(headerMetadata.name)) {
                        result.put(headerMetadata.name, new ArrayList<String>());
                    }

                    List<String> values = result.get(headerMetadata.name);
                    values.add(String.join(",", items));

                    break;
                }
                default: {
                    if (!result.containsKey(headerMetadata.name)) {
                        result.put(headerMetadata.name, new ArrayList<String>());
                    }

                    List<String> values = result.get(headerMetadata.name);
                    values.add(Utils.valToString(value));
                    break;
                }
            }
        }

        return result;
    }

    public static String valToString(Object value) {
        switch (Types.getType(value.getClass())) {
            case ENUM:
                try {
                    return String.valueOf(value.getClass().getDeclaredField("value").get(value));
                } catch (Exception e) {
                    return "ERROR_UNKNOWN_VALUE";
                }
            default:
                return String.valueOf(value);
        }
    }

    public static Object popualteGlobal(Object value, String fieldName, String paramType,
            Map<String, Map<String, Map<String, Object>>> globals) {
        if (value == null &&
                globals != null &&
                globals.containsKey("parameters") &&
                globals.get("parameters").containsKey(paramType)) {
            Object globalVal = globals.get("parameters").get(paramType).get(fieldName);
            if (globalVal != null) {
                value = globalVal;
            }
        }

        return value;
    }

    private static Map<String, String> parseSerializedParams(PathParamsMetadata pathParamsMetadata, Object value)
            throws JsonProcessingException {
        Map<String, String> params = new HashMap<>();

        switch (pathParamsMetadata.serialization) {
            case "json":
                ObjectMapper mapper = JSON.getMapper();
                String json = mapper.writeValueAsString(value);

                params.put(pathParamsMetadata.name, URLEncoder.encode(json, StandardCharsets.UTF_8));
                break;
        }

        return params;
    }

    private Utils() {
    }
}