<!-- Start SDK Example Usage -->
```java
package hello.world;

import structure.Structure.SDK;
import structure.Structure.models.operations.EnrichCompanyRequest;
import structure.Structure.models.operations.EnrichCompanyResponse;
import structure.Structure.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("corrupti") {{
                    bearerAuth = "";
                }})
                .build();

            EnrichCompanyRequest req = new EnrichCompanyRequest("provident");            

            EnrichCompanyResponse res = sdk.companies.enrich(req);

            if (res.body != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
<!-- End SDK Example Usage -->