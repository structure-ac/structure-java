/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package structure.Structure.models.operations;

import java.net.http.HttpResponse;

public class EnrichCompanyResponse {
    public byte[] body;
    public EnrichCompanyResponse withBody(byte[] body) {
        this.body = body;
        return this;
    }
    
    public String contentType;
    public EnrichCompanyResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public Integer statusCode;
    public EnrichCompanyResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public EnrichCompanyResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
