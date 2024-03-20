# DocumentSearchApi

All URIs are relative to *https://vanity.api.visier.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**simpleSearchDocumentHeaders**](DocumentSearchApi.md#simpleSearchDocumentHeaders) | **GET** /v1alpha/search/simple/document-headers | Perform a simple search for Visier document headers |


<a name="simpleSearchDocumentHeaders"></a>
# **simpleSearchDocumentHeaders**
> SimpleDocumentHeaderSearchResponseDTO simpleSearchDocumentHeaders().q(q).limit(limit).offset(offset).execute();

Perform a simple search for Visier document headers

Perform a simple search for Visier document headers, such as analysis titles. Simple search doesn&#39;t support keywords, Boolean expressions, or any other advanced search features.  Example: &#x60;GET /v1alpha/search/simple/document-headers?q&#x3D;My+Query&amp;limit&#x3D;10&#x60; returns the first 10 document headers that best match the query string &#x60;My Query&#x60;.   &lt;br&gt;**Note:** &lt;em&gt;This API is in **alpha**. While in alpha, APIs may change in a breaking way without notice; functionality may be removed, and no deprecation notices will be issued.  If you are interested in using this API, please contact your Customer Success Manager (CSM).&lt;/em&gt;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.VisierModelQuery;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DocumentSearchApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://vanity.api.visier.io";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    
    // Configure HTTP bearer authorization: BearerAuth
    configuration.token = "BEARER TOKEN";
    
    configuration.cookieAuth  = "YOUR API KEY";
    
    // Configure OAuth2 access token for authorization: OAuth2Auth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    
    // Configure OAuth2 access token for authorization: OAuth2Auth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    VisierModelQuery client = new VisierModelQuery(configuration);
    String q = "q_example"; // The search query string.
    Integer limit = 56; // The maximum number of results to return. Defaults to 100.
    Integer offset = 56; // The index to start retrieving results from, also known as offset. Defaults to 0.
    try {
      SimpleDocumentHeaderSearchResponseDTO result = client
              .documentSearch
              .simpleSearchDocumentHeaders()
              .q(q)
              .limit(limit)
              .offset(offset)
              .execute();
      System.out.println(result);
      System.out.println(result.getDocumentHeaders());
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentSearchApi#simpleSearchDocumentHeaders");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SimpleDocumentHeaderSearchResponseDTO> response = client
              .documentSearch
              .simpleSearchDocumentHeaders()
              .q(q)
              .limit(limit)
              .offset(offset)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentSearchApi#simpleSearchDocumentHeaders");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **q** | **String**| The search query string. | [optional] |
| **limit** | **Integer**| The maximum number of results to return. Defaults to 100. | [optional] |
| **offset** | **Integer**| The index to start retrieving results from, also known as offset. Defaults to 0. | [optional] |

### Return type

[**SimpleDocumentHeaderSearchResponseDTO**](SimpleDocumentHeaderSearchResponseDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth), [CookieAuth](../README.md#CookieAuth), [OAuth2Auth](../README.md#OAuth2Auth), [OAuth2Auth](../README.md#OAuth2Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

