/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package structure.Structure;

import java.net.http.HttpResponse;
import structure.Structure.utils.HTTPClient;
import structure.Structure.utils.HTTPRequest;
import structure.Structure.utils.SerializedBody;

/**
 * People
 */
public class People {
	
	private HTTPClient _defaultClient;
	private HTTPClient _securityClient;
	private String _serverUrl;
	private String _language;
	private String _sdkVersion;
	private String _genVersion;

	public People(HTTPClient defaultClient, HTTPClient securityClient, String serverUrl, String language, String sdkVersion, String genVersion) {
		this._defaultClient = defaultClient;
		this._securityClient = securityClient;
		this._serverUrl = serverUrl;
		this._language = language;
		this._sdkVersion = sdkVersion;
		this._genVersion = genVersion;
	}

    /**
     * Enrich a person profile
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public structure.Structure.models.operations.EnrichPersonResponse enrich(structure.Structure.models.operations.EnrichPersonRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = structure.Structure.utils.Utils.generateURL(structure.Structure.models.operations.EnrichPersonRequest.class, baseUrl, "/people/{id}/enrich", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        structure.Structure.models.operations.EnrichPersonResponse res = new structure.Structure.models.operations.EnrichPersonResponse() {{
            body = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (structure.Structure.utils.Utils.matchContentType(contentType, "*/*")) {
                byte[] out = httpRes.body();
                res.body = out;
            }
        }
        else if (httpRes.statusCode() == 401 || httpRes.statusCode() == 403 || httpRes.statusCode() == 404 || httpRes.statusCode() == 422) {
        }

        return res;
    }

    /**
     * Search People
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public structure.Structure.models.operations.SearchPeopleResponse search(structure.Structure.models.operations.SearchPeopleApplicationJSON request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = structure.Structure.utils.Utils.generateURL(baseUrl, "/people/search");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = structure.Structure.utils.Utils.serializeRequestBody(request, "request", "json");
        req.setBody(serializedRequestBody);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        structure.Structure.models.operations.SearchPeopleResponse res = new structure.Structure.models.operations.SearchPeopleResponse() {{
            body = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (structure.Structure.utils.Utils.matchContentType(contentType, "*/*")) {
                byte[] out = httpRes.body();
                res.body = out;
            }
        }
        else if (httpRes.statusCode() == 401 || httpRes.statusCode() == 403) {
        }

        return res;
    }
}