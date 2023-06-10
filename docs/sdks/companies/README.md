# companies

## Overview

Companies

### Available Operations

* [enrich](#enrich) - Enrich a company profile
* [listEmployees](#listemployees) - List company employees
* [listJobs](#listjobs) - List company jobs
* [search](#search) - Search Companies

## enrich

Enrich a company profile

### Example Usage

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
                .setSecurity(new Security("quibusdam") {{
                    bearerAuth = "";
                }})
                .build();

            EnrichCompanyRequest req = new EnrichCompanyRequest("unde");            

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

### Parameters

| Parameter                                                                                                     | Type                                                                                                          | Required                                                                                                      | Description                                                                                                   |
| ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                     | [structure.Structure.models.operations.EnrichCompanyRequest](../../models/operations/EnrichCompanyRequest.md) | :heavy_check_mark:                                                                                            | The request object to use for the request.                                                                    |


### Response

**[structure.Structure.models.operations.EnrichCompanyResponse](../../models/operations/EnrichCompanyResponse.md)**


## listEmployees

List company employees

### Example Usage

```java
package hello.world;

import structure.Structure.SDK;
import structure.Structure.models.operations.ListEmployeesRequest;
import structure.Structure.models.operations.ListEmployeesResponse;
import structure.Structure.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("nulla") {{
                    bearerAuth = "";
                }})
                .build();

            ListEmployeesRequest req = new ListEmployeesRequest("corrupti") {{
                offset = "illum";
                perPage = "vel";
            }};            

            ListEmployeesResponse res = sdk.companies.listEmployees(req);

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
| `request`                                                                                                     | [structure.Structure.models.operations.ListEmployeesRequest](../../models/operations/ListEmployeesRequest.md) | :heavy_check_mark:                                                                                            | The request object to use for the request.                                                                    |


### Response

**[structure.Structure.models.operations.ListEmployeesResponse](../../models/operations/ListEmployeesResponse.md)**


## listJobs

List company jobs

### Example Usage

```java
package hello.world;

import structure.Structure.SDK;
import structure.Structure.models.operations.ListJobsRequest;
import structure.Structure.models.operations.ListJobsResponse;
import structure.Structure.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("error") {{
                    bearerAuth = "";
                }})
                .build();

            ListJobsRequest req = new ListJobsRequest("deserunt") {{
                offset = "suscipit";
                perPage = "iure";
            }};            

            ListJobsResponse res = sdk.companies.listJobs(req);

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

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [structure.Structure.models.operations.ListJobsRequest](../../models/operations/ListJobsRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |


### Response

**[structure.Structure.models.operations.ListJobsResponse](../../models/operations/ListJobsResponse.md)**


## search

Search Companies

### Example Usage

```java
package hello.world;

import structure.Structure.SDK;
import structure.Structure.models.operations.SearchCompaniesApplicationJSON;
import structure.Structure.models.operations.SearchCompaniesResponse;
import structure.Structure.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("magnam") {{
                    bearerAuth = "";
                }})
                .build();

            SearchCompaniesApplicationJSON req = new SearchCompaniesApplicationJSON() {{
                filter = "debitis";
                limit = "ipsa";
                page = "delectus";
                query = "tempora";
            }};            

            SearchCompaniesResponse res = sdk.companies.search(req);

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

| Parameter                                                                                                                         | Type                                                                                                                              | Required                                                                                                                          | Description                                                                                                                       |
| --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                         | [structure.Structure.models.operations.SearchCompaniesApplicationJSON](../../models/operations/SearchCompaniesApplicationJSON.md) | :heavy_check_mark:                                                                                                                | The request object to use for the request.                                                                                        |


### Response

**[structure.Structure.models.operations.SearchCompaniesResponse](../../models/operations/SearchCompaniesResponse.md)**

