# RoleControllerApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createRole**](RoleControllerApi.md#createRole) | **POST** /api/role/new | 
[**deleteRole**](RoleControllerApi.md#deleteRole) | **DELETE** /api/role/{id} | 
[**getAllRoles**](RoleControllerApi.md#getAllRoles) | **GET** /api/role/all | 
[**getById1**](RoleControllerApi.md#getById1) | **GET** /api/role/{id} | 

<a name="createRole"></a>
# **createRole**
> RoleResponseDTO createRole(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RoleControllerApi;


RoleControllerApi apiInstance = new RoleControllerApi();
RoleRequestDTO body = new RoleRequestDTO(); // RoleRequestDTO | 
try {
    RoleResponseDTO result = apiInstance.createRole(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleControllerApi#createRole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RoleRequestDTO**](RoleRequestDTO.md)|  |

### Return type

[**RoleResponseDTO**](RoleResponseDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteRole"></a>
# **deleteRole**
> Object deleteRole(id)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RoleControllerApi;


RoleControllerApi apiInstance = new RoleControllerApi();
Integer id = 56; // Integer | 
try {
    Object result = apiInstance.deleteRole(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleControllerApi#deleteRole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAllRoles"></a>
# **getAllRoles**
> GenericListDTORoleResponseDTO getAllRoles()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RoleControllerApi;


RoleControllerApi apiInstance = new RoleControllerApi();
try {
    GenericListDTORoleResponseDTO result = apiInstance.getAllRoles();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleControllerApi#getAllRoles");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GenericListDTORoleResponseDTO**](GenericListDTORoleResponseDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getById1"></a>
# **getById1**
> RoleResponseDTO getById1(id)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RoleControllerApi;


RoleControllerApi apiInstance = new RoleControllerApi();
Integer id = 56; // Integer | 
try {
    RoleResponseDTO result = apiInstance.getById1(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleControllerApi#getById1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |

### Return type

[**RoleResponseDTO**](RoleResponseDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

