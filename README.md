# Structure

<!-- Start SDK Installation -->
## SDK Installation

### Gradle

```groovy
implementation 'structure.Structure:Structure:1.0.0'
```
<!-- End SDK Installation -->

## SDK Example Usage
<!-- Start SDK Example Usage -->
```java
package hello.world;

import structure.Structure.SDK;
import structure.Structure.models.shared.Security;
import structure.Structure.models.operations.AccountsResponse;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security() {{
                    bearerAuth = new SchemeBearerAuth() {{
                        authorization = "Bearer YOUR_BEARER_TOKEN_HERE";
                    }};
                }})
                .build();

            AccountsResponse res = sdk.accounts.accounts();

            if (res.body.isPresent()) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
```
<!-- End SDK Example Usage -->

<!-- Start SDK Available Operations -->
## SDK Available Operations


### accounts

* `accounts` - Show current user accounts

### auths

* `auths` - Login user

### companies

* `companyEmployees` - Show company employees
* `companyJobs` - Show company jobs
* `enrichCompany` - Enrich a company profile
* `searchCompanies` - Search Companies

### me

* `me` - Show current user

### people

* `enrichPerson` - Enrich a person profile
* `searchSearch` - Search People
<!-- End SDK Available Operations -->

### Maturity

This SDK is in beta, and there may be breaking changes between versions without a major version update. Therefore, we recommend pinning usage 
to a specific package version. This way, you can install the same version each time without breaking changes unless you are intentionally 
looking for the latest version.

### Contributions

While we value open-source contributions to this SDK, this library is generated programmatically. 
Feel free to open a PR or a Github issue as a proof of concept and we'll do our best to include it in a future release !

### SDK Created by [Speakeasy](https://docs.speakeasyapi.dev/docs/using-speakeasy/client-sdks)
