# RightControllerApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllRights**](RightControllerApi.md#getAllRights) | **GET** /api/right/all | 
[**getById2**](RightControllerApi.md#getById2) | **GET** /api/right/{id} | 

<a name="getAllRights"></a>
# **getAllRights**
> GenericListDTORightResponseDTO getAllRights()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RightControllerApi;


RightControllerApi apiInstance = new RightControllerApi();
try {
    GenericListDTORightResponseDTO result = apiInstance.getAllRights();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RightControllerApi#getAllRights");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GenericListDTORightResponseDTO**](GenericListDTORightResponseDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getById2"></a>
# **getById2**
> RightResponseDTO getById2(id)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RightControllerApi;


RightControllerApi apiInstance = new RightControllerApi();
Integer id = 56; // Integer | 
try {
    RightResponseDTO result = apiInstance.getById2(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RightControllerApi#getById2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |

### Return type

[**RightResponseDTO**](RightResponseDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

