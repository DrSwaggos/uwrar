# StatsControllerApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDashboardStats**](StatsControllerApi.md#getDashboardStats) | **GET** /api/stats/dashboard | 

<a name="getDashboardStats"></a>
# **getDashboardStats**
> DashboardResponseDTO getDashboardStats()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.StatsControllerApi;


StatsControllerApi apiInstance = new StatsControllerApi();
try {
    DashboardResponseDTO result = apiInstance.getDashboardStats();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StatsControllerApi#getDashboardStats");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**DashboardResponseDTO**](DashboardResponseDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

