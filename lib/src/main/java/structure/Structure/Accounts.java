/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package structure.Structure;

import java.net.http.HttpResponse;
import structure.Structure.utils.HTTPClient;
import structure.Structure.utils.HTTPRequest;

/**
 * Accounts
 */
public class Accounts {
	
	private SDKConfiguration sdkConfiguration;

	public Accounts(SDKConfiguration sdkConfiguration) {
		this.sdkConfiguration = sdkConfiguration;
	}

    /**
     * Show current user accounts
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public structure.Structure.models.operations.ListUsersResponse listUsers() throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = structure.Structure.utils.Utils.generateURL(baseUrl, "/accounts");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "*/*");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion));
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        structure.Structure.models.operations.ListUsersResponse res = new structure.Structure.models.operations.ListUsersResponse(contentType, httpRes.statusCode()) {{
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