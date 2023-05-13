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
                    bearerAuth = "YOUR_BEARER_TOKEN_HERE";
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
                    bearerAuth = "YOUR_BEARER_TOKEN_HERE";
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
