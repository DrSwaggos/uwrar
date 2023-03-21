# MappingControllerApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteRolesRightsMapping**](MappingControllerApi.md#deleteRolesRightsMapping) | **DELETE** /api/mapping/splitRolesFromRights | 
[**deleteUsersRolesMapping**](MappingControllerApi.md#deleteUsersRolesMapping) | **DELETE** /api/mapping/splitUsersFromRoles | 
[**getRightsForRole**](MappingControllerApi.md#getRightsForRole) | **GET** /api/mapping/rightsForRole/{role} | 
[**getRightsForUser**](MappingControllerApi.md#getRightsForUser) | **GET** /api/mapping/rightsForUser/{user} | 
[**getRolesForRight**](MappingControllerApi.md#getRolesForRight) | **GET** /api/mapping/rolesForRight/{right} | 
[**getRolesForUser**](MappingControllerApi.md#getRolesForUser) | **GET** /api/mapping/rolesForUser/{user} | 
[**getUsersForRight**](MappingControllerApi.md#getUsersForRight) | **GET** /api/mapping/usersForRight/{right} | 
[**getUsersForRole**](MappingControllerApi.md#getUsersForRole) | **GET** /api/mapping/usersForRole/{role} | 
[**putRolesRightsMapping**](MappingControllerApi.md#putRolesRightsMapping) | **PUT** /api/mapping/mapRolesToRights | 
[**putUsersRolesMapping**](MappingControllerApi.md#putUsersRolesMapping) | **PUT** /api/mapping/mapUsersToRoles | 

<a name="deleteRolesRightsMapping"></a>
# **deleteRolesRightsMapping**
> Object deleteRolesRightsMapping(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MappingControllerApi;


MappingControllerApi apiInstance = new MappingControllerApi();
MappingRequestDTORoleRequestDTORightRequestDTO body = new MappingRequestDTORoleRequestDTORightRequestDTO(); // MappingRequestDTORoleRequestDTORightRequestDTO | 
try {
    Object result = apiInstance.deleteRolesRightsMapping(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MappingControllerApi#deleteRolesRightsMapping");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MappingRequestDTORoleRequestDTORightRequestDTO**](MappingRequestDTORoleRequestDTORightRequestDTO.md)|  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteUsersRolesMapping"></a>
# **deleteUsersRolesMapping**
> Object deleteUsersRolesMapping(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MappingControllerApi;


MappingControllerApi apiInstance = new MappingControllerApi();
MappingRequestDTOUserRequestDTORoleRequestDTO body = new MappingRequestDTOUserRequestDTORoleRequestDTO(); // MappingRequestDTOUserRequestDTORoleRequestDTO | 
try {
    Object result = apiInstance.deleteUsersRolesMapping(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MappingControllerApi#deleteUsersRolesMapping");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MappingRequestDTOUserRequestDTORoleRequestDTO**](MappingRequestDTOUserRequestDTORoleRequestDTO.md)|  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getRightsForRole"></a>
# **getRightsForRole**
> GenericListDTORightResponseDTO getRightsForRole(role)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MappingControllerApi;


MappingControllerApi apiInstance = new MappingControllerApi();
Integer role = 56; // Integer | 
try {
    GenericListDTORightResponseDTO result = apiInstance.getRightsForRole(role);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MappingControllerApi#getRightsForRole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **role** | **Integer**|  |

### Return type

[**GenericListDTORightResponseDTO**](GenericListDTORightResponseDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getRightsForUser"></a>
# **getRightsForUser**
> GenericListDTORightResponseDTO getRightsForUser(user)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MappingControllerApi;


MappingControllerApi apiInstance = new MappingControllerApi();
Integer user = 56; // Integer | 
try {
    GenericListDTORightResponseDTO result = apiInstance.getRightsForUser(user);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MappingControllerApi#getRightsForUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user** | **Integer**|  |

### Return type

[**GenericListDTORightResponseDTO**](GenericListDTORightResponseDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getRolesForRight"></a>
# **getRolesForRight**
> GenericListDTORoleResponseDTO getRolesForRight(right)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MappingControllerApi;


MappingControllerApi apiInstance = new MappingControllerApi();
Integer right = 56; // Integer | 
try {
    GenericListDTORoleResponseDTO result = apiInstance.getRolesForRight(right);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MappingControllerApi#getRolesForRight");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **right** | **Integer**|  |

### Return type

[**GenericListDTORoleResponseDTO**](GenericListDTORoleResponseDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getRolesForUser"></a>
# **getRolesForUser**
> GenericListDTORoleResponseDTO getRolesForUser(user)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MappingControllerApi;


MappingControllerApi apiInstance = new MappingControllerApi();
Integer user = 56; // Integer | 
try {
    GenericListDTORoleResponseDTO result = apiInstance.getRolesForUser(user);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MappingControllerApi#getRolesForUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user** | **Integer**|  |

### Return type

[**GenericListDTORoleResponseDTO**](GenericListDTORoleResponseDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getUsersForRight"></a>
# **getUsersForRight**
> GenericListDTOUserResponseDTO getUsersForRight(right)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MappingControllerApi;


MappingControllerApi apiInstance = new MappingControllerApi();
Integer right = 56; // Integer | 
try {
    GenericListDTOUserResponseDTO result = apiInstance.getUsersForRight(right);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MappingControllerApi#getUsersForRight");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **right** | **Integer**|  |

### Return type

[**GenericListDTOUserResponseDTO**](GenericListDTOUserResponseDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getUsersForRole"></a>
# **getUsersForRole**
> GenericListDTOUserResponseDTO getUsersForRole(role)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MappingControllerApi;


MappingControllerApi apiInstance = new MappingControllerApi();
Integer role = 56; // Integer | 
try {
    GenericListDTOUserResponseDTO result = apiInstance.getUsersForRole(role);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MappingControllerApi#getUsersForRole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **role** | **Integer**|  |

### Return type

[**GenericListDTOUserResponseDTO**](GenericListDTOUserResponseDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="putRolesRightsMapping"></a>
# **putRolesRightsMapping**
> Object putRolesRightsMapping(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MappingControllerApi;


MappingControllerApi apiInstance = new MappingControllerApi();
MappingRequestDTORoleRequestDTORightRequestDTO body = new MappingRequestDTORoleRequestDTORightRequestDTO(); // MappingRequestDTORoleRequestDTORightRequestDTO | 
try {
    Object result = apiInstance.putRolesRightsMapping(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MappingControllerApi#putRolesRightsMapping");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MappingRequestDTORoleRequestDTORightRequestDTO**](MappingRequestDTORoleRequestDTORightRequestDTO.md)|  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="putUsersRolesMapping"></a>
# **putUsersRolesMapping**
> Object putUsersRolesMapping(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MappingControllerApi;


MappingControllerApi apiInstance = new MappingControllerApi();
MappingRequestDTOUserRequestDTORoleRequestDTO body = new MappingRequestDTOUserRequestDTORoleRequestDTO(); // MappingRequestDTOUserRequestDTORoleRequestDTO | 
try {
    Object result = apiInstance.putUsersRolesMapping(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MappingControllerApi#putUsersRolesMapping");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MappingRequestDTOUserRequestDTORoleRequestDTO**](MappingRequestDTOUserRequestDTORoleRequestDTO.md)|  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

