/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package structure.Structure.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SearchCompaniesApplicationJSON {
    /**
     * Filter for searching
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("filter")
    public String filter;

    public SearchCompaniesApplicationJSON withFilter(String filter) {
        this.filter = filter;
        return this;
    }
    
    /**
     * Number of results per page (0-100) default 10
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("limit")
    public String limit;

    public SearchCompaniesApplicationJSON withLimit(String limit) {
        this.limit = limit;
        return this;
    }
    
    /**
     * The offset number to start at
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("page")
    public String page;

    public SearchCompaniesApplicationJSON withPage(String page) {
        this.page = page;
        return this;
    }
    
    /**
     * Query for searching
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("query")
    public String query;

    public SearchCompaniesApplicationJSON withQuery(String query) {
        this.query = query;
        return this;
    }
    
    public SearchCompaniesApplicationJSON(){}
}
