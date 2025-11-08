# DoctorApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createDoctor**](DoctorApi.md#createDoctor) | **POST** /api/v1/doctor |  |
| [**getDoctors**](DoctorApi.md#getDoctors) | **GET** /api/v1/doctor | Get all Doctors from the system |


<a id="createDoctor"></a>
# **createDoctor**
> createDoctor(apiDoctor)



Create a new Doctor

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DoctorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DoctorApi apiInstance = new DoctorApi(defaultClient);
    ApiDoctor apiDoctor = new ApiDoctor(); // ApiDoctor | 
    try {
      apiInstance.createDoctor(apiDoctor);
    } catch (ApiException e) {
      System.err.println("Exception when calling DoctorApi#createDoctor");
      System.err.println("Status code: " + e.getCode());
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
| **apiDoctor** | [**ApiDoctor**](ApiDoctor.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **500** | Internal Error |  -  |

<a id="getDoctors"></a>
# **getDoctors**
> List&lt;ApiDoctor&gt; getDoctors(fieldOfExpertise)

Get all Doctors from the system

Get all Doctors from the system

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DoctorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DoctorApi apiInstance = new DoctorApi(defaultClient);
    String fieldOfExpertise = "fieldOfExpertise_example"; // String | Return all doctors that match this fieldOfExpertise
    try {
      List<ApiDoctor> result = apiInstance.getDoctors(fieldOfExpertise);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DoctorApi#getDoctors");
      System.err.println("Status code: " + e.getCode());
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
| **fieldOfExpertise** | **String**| Return all doctors that match this fieldOfExpertise | [optional] |

### Return type

[**List&lt;ApiDoctor&gt;**](ApiDoctor.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **500** | Internal Error |  -  |

