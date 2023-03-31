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