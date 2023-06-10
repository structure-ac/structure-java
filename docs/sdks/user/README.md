# user

## Overview

User

### Available Operations

* [login](#login) - Login user
* [me](#me) - Show current user

## login

Login user

### Example Usage

```java
package hello.world;

import structure.Structure.SDK;
import structure.Structure.models.operations.LoginApplicationJSON;
import structure.Structure.models.operations.LoginResponse;
import structure.Structure.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("nisi") {{
                    bearerAuth = "";
                }})
                .build();

            LoginApplicationJSON req = new LoginApplicationJSON("recusandae", "temporibus");            

            LoginResponse res = sdk.user.login(req);

            if (res.body != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                     | Type                                                                                                          | Required                                                                                                      | Description                                                                                                   |
| ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                     | [structure.Structure.models.operations.LoginApplicationJSON](../../models/operations/LoginApplicationJSON.md) | :heavy_check_mark:                                                                                            | The request object to use for the request.                                                                    |


### Response

**[structure.Structure.models.operations.LoginResponse](../../models/operations/LoginResponse.md)**


## me

Show current user

### Example Usage

```java
package hello.world;

import structure.Structure.SDK;
import structure.Structure.models.operations.MeResponse;
import structure.Structure.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("ab") {{
                    bearerAuth = "";
                }})
                .build();

            MeResponse res = sdk.user.me();

            if (res.body != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```


### Response

**[structure.Structure.models.operations.MeResponse](../../models/operations/MeResponse.md)**

