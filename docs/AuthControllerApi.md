# AuthControllerApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAuthToken**](AuthControllerApi.md#createAuthToken) | **POST** /api/auth/authenticate | 

<a name="createAuthToken"></a>
# **createAuthToken**
> AuthResponseDTO createAuthToken(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AuthControllerApi;


AuthControllerApi apiInstance = new AuthControllerApi();
AuthRequestDTO body = new AuthRequestDTO(); // AuthRequestDTO | 
try {
    AuthResponseDTO result = apiInstance.createAuthToken(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthControllerApi#createAuthToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AuthRequestDTO**](AuthRequestDTO.md)|  |

### Return type

[**AuthResponseDTO**](AuthResponseDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

