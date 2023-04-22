/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package structure.Structure.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Company - returns the company
 */
public class Company {
    /**
     * The company's description
     */
    
    public String about;
    public Company withAbout(String about) {
        this.about = about;
        return this;
    }
    
    /**
     * Affiliated companies to the company
     */
    
    public String[] affiliated;
    public Company withAffiliated(String[] affiliated) {
        this.affiliated = affiliated;
        return this;
    }
    
    /**
     * The size of the company
     */
    
    public String companySize;
    public Company withCompanySize(String companySize) {
        this.companySize = companySize;
        return this;
    }
    
    /**
     * The country's country code
     */
    
    public String countryCode;
    public Company withCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }
    
    /**
     * A sample of the company's employees. See the employees endpoint for the full list.
     */
    
    public String[] employees;
    public Company withEmployees(String[] employees) {
        this.employees = employees;
        return this;
    }
    
    /**
     * The number of company employees on LinkedIn
     */
    
    public Double employeesInLinkedin;
    public Company withEmployeesInLinkedin(Double employeesInLinkedin) {
        this.employeesInLinkedin = employeesInLinkedin;
        return this;
    }
    
    /**
     * The number of company followers on LinkedIn
     */
    
    public Double followers;
    public Company withFollowers(Double followers) {
        this.followers = followers;
        return this;
    }
    
    /**
     * The year the company was founded
     */
    
    public Double founded;
    public Company withFounded(Double founded) {
        this.founded = founded;
        return this;
    }
    
    /**
     * The funding status of the company
     */
    
    public String funding;
    public Company withFunding(String funding) {
        this.funding = funding;
        return this;
    }
    
    /**
     * The country's headquarters
     */
    
    public String headquarters;
    public Company withHeadquarters(String headquarters) {
        this.headquarters = headquarters;
        return this;
    }
    
    /**
     * The key for looking up the company
     */
    
    public Double id;
    public Company withId(Double id) {
        this.id = id;
        return this;
    }
    
    /**
     * The company's industries
     */
    
    public String industries;
    public Company withIndustries(String industries) {
        this.industries = industries;
        return this;
    }
    
    /**
     * The company's investors
     */
    
    public String investors;
    public Company withInvestors(String investors) {
        this.investors = investors;
        return this;
    }
    
    /**
     * Sample of company's Jobs. See the jobs endpoint for the full list.
     */
    
    public String[] jobs;
    public Company withJobs(String[] jobs) {
        this.jobs = jobs;
        return this;
    }
    
    /**
     * The company's LinkedIn ID
     */
    
    public String lid;
    public Company withLid(String lid) {
        this.lid = lid;
        return this;
    }
    
    /**
     * The company's locations
     */
    
    public String[] locations;
    public Company withLocations(String[] locations) {
        this.locations = locations;
        return this;
    }
    
    /**
     * URL to the company's logo
     */
    
    public String logo;
    public Company withLogo(String logo) {
        this.logo = logo;
        return this;
    }
    
    /**
     * The company's name
     */
    
    public String name;
    public Company withName(String name) {
        this.name = name;
        return this;
    }
    
    /**
     * The type of organization
     */
    
    public String organizationType;
    public Company withOrganizationType(String organizationType) {
        this.organizationType = organizationType;
        return this;
    }
    
    /**
     * The company's profiles
     */
    
    public String[] profiles;
    public Company withProfiles(String[] profiles) {
        this.profiles = profiles;
        return this;
    }
    
    /**
     * The comapny's headquarters region
     */
    
    public String region;
    public Company withRegion(String region) {
        this.region = region;
        return this;
    }
    
    /**
     * Similar companies to this company
     */
    
    public String[] similar;
    public Company withSimilar(String[] similar) {
        this.similar = similar;
        return this;
    }
    
    /**
     * The company's slogan
     */
    
    public String slogan;
    public Company withSlogan(String slogan) {
        this.slogan = slogan;
        return this;
    }
    
    /**
     * The company's specialities
     */
    
    public String specialities;
    public Company withSpecialities(String specialities) {
        this.specialities = specialities;
        return this;
    }
    
    /**
     * The company's sphere of products
     */
    
    public String sphere;
    public Company withSphere(String sphere) {
        this.sphere = sphere;
        return this;
    }
    
    /**
     * The type of company (public, private, etc.)
     */
    
    public String type;
    public Company withType(String type) {
        this.type = type;
        return this;
    }
    
    /**
     * The company's linkedIn URL
     */
    
    public String url;
    public Company withUrl(String url) {
        this.url = url;
        return this;
    }
    
    /**
     * The company's website
     */
    
    public String website;
    public Company withWebsite(String website) {
        this.website = website;
        return this;
    }
    

    public Company(@JsonProperty("about") String about, @JsonProperty("affiliated") String[] affiliated, @JsonProperty("company_size") String companySize, @JsonProperty("country_code") String countryCode, @JsonProperty("employees") String[] employees, @JsonProperty("employees_in_linkedin") Double employeesInLinkedin, @JsonProperty("followers") Double followers, @JsonProperty("founded") Double founded, @JsonProperty("funding") String funding, @JsonProperty("headquarters") String headquarters, @JsonProperty("id") Double id, @JsonProperty("industries") String industries, @JsonProperty("investors") String investors, @JsonProperty("jobs") String[] jobs, @JsonProperty("lid") String lid, @JsonProperty("locations") String[] locations, @JsonProperty("logo") String logo, @JsonProperty("name") String name, @JsonProperty("organization_type") String organizationType, @JsonProperty("profiles") String[] profiles, @JsonProperty("region") String region, @JsonProperty("similar") String[] similar, @JsonProperty("slogan") String slogan, @JsonProperty("specialities") String specialities, @JsonProperty("sphere") String sphere, @JsonProperty("type") String type, @JsonProperty("url") String url, @JsonProperty("website") String website) {
    this.about = about;
this.affiliated = affiliated;
this.companySize = companySize;
this.countryCode = countryCode;
this.employees = employees;
this.employeesInLinkedin = employeesInLinkedin;
this.followers = followers;
this.founded = founded;
this.funding = funding;
this.headquarters = headquarters;
this.id = id;
this.industries = industries;
this.investors = investors;
this.jobs = jobs;
this.lid = lid;
this.locations = locations;
this.logo = logo;
this.name = name;
this.organizationType = organizationType;
this.profiles = profiles;
this.region = region;
this.similar = similar;
this.slogan = slogan;
this.specialities = specialities;
this.sphere = sphere;
this.type = type;
this.url = url;
this.website = website;
  }
}
