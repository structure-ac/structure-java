/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package structure.Structure.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import structure.Structure.utils.SpeakeasyMetadata;

public class EnrichCompanyRequest {
    /**
     * ID of the company
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    public String id;
    public EnrichCompanyRequest withId(String id) {
        this.id = id;
        return this;
    }
    

    public EnrichCompanyRequest(@JsonProperty("id") String id) {
    this.id = id;
  }
}
