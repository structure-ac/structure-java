# accounts

## Overview

Accounts

### Available Operations

* [listUsers](#listusers) - Show current user accounts

## listUsers

Show current user accounts

### Example Usage

```java
package hello.world;

import structure.Structure.SDK;
import structure.Structure.models.operations.ListUsersResponse;
import structure.Structure.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("distinctio") {{
                    bearerAuth = "";
                }})
                .build();

            ListUsersResponse res = sdk.accounts.listUsers();

            if (res.body != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
