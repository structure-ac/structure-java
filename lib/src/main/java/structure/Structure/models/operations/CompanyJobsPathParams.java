/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package structure.Structure.models.operations;

import structure.Structure.utils.SpeakeasyMetadata;

public class CompanyJobsPathParams {
    /**
     * ID of the company
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")public String id;
    public CompanyJobsPathParams withId(String id) {
        this.id = id;
        return this;
    }
    
}