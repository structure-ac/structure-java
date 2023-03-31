/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package structure.Structure.models.operations;

import java.net.http.HttpResponse;

public class SearchCompaniesResponse {
    public byte[] body;
    public SearchCompaniesResponse withBody(byte[] body) {
        this.body = body;
        return this;
    }
    
    public String contentType;
    public SearchCompaniesResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public Integer statusCode;
    public SearchCompaniesResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public SearchCompaniesResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
