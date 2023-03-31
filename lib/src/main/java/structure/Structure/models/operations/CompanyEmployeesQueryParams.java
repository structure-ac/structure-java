/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package structure.Structure.models.operations;

import structure.Structure.utils.SpeakeasyMetadata;

public class CompanyEmployeesQueryParams {
    /**
     * The offset number to start at
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=offset")public String offset;
    public CompanyEmployeesQueryParams withOffset(String offset) {
        this.offset = offset;
        return this;
    }
    
    /**
     * Number of results per page (0-100)
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=per_page")public String perPage;
    public CompanyEmployeesQueryParams withPerPage(String perPage) {
        this.perPage = perPage;
        return this;
    }
    
}