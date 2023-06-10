# people

## Overview

People

### Available Operations

* [enrich](#enrich) - Enrich a person profile
* [search](#search) - Search People

## enrich

Enrich a person profile

### Example Usage

```java
package hello.world;

import structure.Structure.SDK;
import structure.Structure.models.operations.EnrichPersonRequest;
import structure.Structure.models.operations.EnrichPersonResponse;
import structure.Structure.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("suscipit") {{
                    bearerAuth = "";
                }})
                .build();

            EnrichPersonRequest req = new EnrichPersonRequest("molestiae");            

            EnrichPersonResponse res = sdk.people.enrich(req);

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

| Parameter                                                                                                   | Type                                                                                                        | Required                                                                                                    | Description                                                                                                 |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                   | [structure.Structure.models.operations.EnrichPersonRequest](../../models/operations/EnrichPersonRequest.md) | :heavy_check_mark:                                                                                          | The request object to use for the request.                                                                  |


### Response

**[structure.Structure.models.operations.EnrichPersonResponse](../../models/operations/EnrichPersonResponse.md)**


## search

Search People

### Example Usage

```java
package hello.world;

import structure.Structure.SDK;
import structure.Structure.models.operations.SearchPeopleApplicationJSON;
import structure.Structure.models.operations.SearchPeopleResponse;
import structure.Structure.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("minus") {{
                    bearerAuth = "";
                }})
                .build();

            SearchPeopleApplicationJSON req = new SearchPeopleApplicationJSON() {{
                filter = "placeat";
                limit = "voluptatum";
                page = "iusto";
                query = "excepturi";
            }};            

            SearchPeopleResponse res = sdk.people.search(req);

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

| Parameter                                                                                                                   | Type                                                                                                                        | Required                                                                                                                    | Description                                                                                                                 |
| --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                   | [structure.Structure.models.operations.SearchPeopleApplicationJSON](../../models/operations/SearchPeopleApplicationJSON.md) | :heavy_check_mark:                                                                                                          | The request object to use for the request.                                                                                  |


### Response

**[structure.Structure.models.operations.SearchPeopleResponse](../../models/operations/SearchPeopleResponse.md)**

