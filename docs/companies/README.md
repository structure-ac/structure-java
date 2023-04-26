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
                    bearerAuth = "Bearer YOUR_BEARER_TOKEN_HERE";
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
                    bearerAuth = "Bearer YOUR_BEARER_TOKEN_HERE";
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
                    bearerAuth = "Bearer YOUR_BEARER_TOKEN_HERE";
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
                    bearerAuth = "Bearer YOUR_BEARER_TOKEN_HERE";
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
