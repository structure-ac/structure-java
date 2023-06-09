/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package structure.Structure;

import java.net.http.HttpResponse;
import structure.Structure.utils.HTTPClient;
import structure.Structure.utils.HTTPRequest;
import structure.Structure.utils.SerializedBody;

/**
 * User
 */
public class User {
	
	private SDKConfiguration sdkConfiguration;

	public User(SDKConfiguration sdkConfiguration) {
		this.sdkConfiguration = sdkConfiguration;
	}

    /**
     * Login user
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public structure.Structure.models.operations.LoginResponse login(structure.Structure.models.operations.LoginApplicationJSON request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = structure.Structure.utils.Utils.generateURL(baseUrl, "/auths");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = structure.Structure.utils.Utils.serializeRequestBody(request, "request", "json");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "*/*");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        structure.Structure.models.operations.LoginResponse res = new structure.Structure.models.operations.LoginResponse(contentType, httpRes.statusCode()) {{
            body = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (structure.Structure.utils.Utils.matchContentType(contentType, "*/*")) {
                byte[] out = httpRes.body();
                res.body = out;
            }
        }
        else if (httpRes.statusCode() == 401) {
        }

        return res;
    }

    /**
     * Show current user
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public structure.Structure.models.operations.MeResponse me() throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = structure.Structure.utils.Utils.generateURL(baseUrl, "/me");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "*/*");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        structure.Structure.models.operations.MeResponse res = new structure.Structure.models.operations.MeResponse(contentType, httpRes.statusCode()) {{
            body = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (structure.Structure.utils.Utils.matchContentType(contentType, "*/*")) {
                byte[] out = httpRes.body();
                res.body = out;
            }
        }
        else if (httpRes.statusCode() == 401) {
        }

        return res;
    }
}