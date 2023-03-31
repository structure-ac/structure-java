/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package structure.Structure.models.operations;

import java.net.http.HttpResponse;

public class EnrichPersonResponse {
    public byte[] body;
    public EnrichPersonResponse withBody(byte[] body) {
        this.body = body;
        return this;
    }
    
    public String contentType;
    public EnrichPersonResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public Integer statusCode;
    public EnrichPersonResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public EnrichPersonResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
