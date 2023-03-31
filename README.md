# Structure

<!-- Start SDK Installation -->
## SDK Installation

### Gradle

```groovy
implementation 'structure.Structure:Structure:0.0.3'
```
<!-- End SDK Installation -->

## SDK Example Usage
<!-- Start SDK Example Usage -->
```java
package hello.world;

import structure.Structure.SDK;
import structure.Structure.models.shared.Security;
import structure.Structure.models.operations.EnrichCompanyRequest;
import structure.Structure.models.operations.EnrichCompanyResponse;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security() {{
                    bearerAuth = "Bearer YOUR_BEARER_TOKEN_HERE";
                }})
                .build();

            EnrichCompanyRequest req = new EnrichCompanyRequest() {{
                countryCode = "corrupti";
                headquarters = "provident";
                id = "distinctio";
                name = "quibusdam";
            }}            

            EnrichCompanyResponse res = sdk.companies.enrich(req);

            if (res.body.isPresent()) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
```
<!-- End SDK Example Usage -->

<!-- Start SDK Available Operations -->
## Available Resources and Operations


### accounts

* `listUsers` - Show current user accounts

### companies

* `enrich` - Enrich a company profile
* `listEmployees` - List company employees
* `listJobs` - List company jobs
* `search` - Search Companies

### people

* `enrich` - Enrich a person profile
* `search` - Search People

### user

* `login` - Login user
* `me` - Show current user
<!-- End SDK Available Operations -->

### Maturity

This SDK is in beta, and there may be breaking changes between versions without a major version update. Therefore, we recommend pinning usage 
to a specific package version. This way, you can install the same version each time without breaking changes unless you are intentionally 
looking for the latest version.

### Contributions

While we value open-source contributions to this SDK, this library is generated programmatically. 
Feel free to open a PR or a Github issue as a proof of concept and we'll do our best to include it in a future release !

### SDK Created by [Speakeasy](https://docs.speakeasyapi.dev/docs/using-speakeasy/client-sdks)
