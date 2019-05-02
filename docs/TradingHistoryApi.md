# TradingHistoryApi

All URIs are relative to *https://api3.stex.com/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**reportsOrdersGet**](TradingHistoryApi.md#reportsOrdersGet) | **GET** /reports/orders | Get past orders
[**reportsOrdersOrderIdGet**](TradingHistoryApi.md#reportsOrdersOrderIdGet) | **GET** /reports/orders/{orderId} | Get specified order details

<a name="reportsOrdersGet"></a>
# **reportsOrdersGet**
> OrdersResponse reportsOrdersGet(currencyPairId, orderStatus, timeStart, timeEnd, limit, offset)

Get past orders

Get the list of closed (finished, partial or cancelled) orders

### Example
```java
// Import classes:
//import com.pseq.stex.client.invoker.ApiClient;
//import com.pseq.stex.client.invoker.ApiException;
//import com.pseq.stex.client.invoker.Configuration;
//import com.pseq.stex.client.invoker.auth.*;
//import com.baeldung.petstore.client.api.TradingHistoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

TradingHistoryApi apiInstance = new TradingHistoryApi();
Integer currencyPairId = 56; // Integer | 
String orderStatus = "orderStatus_example"; // String | 
String timeStart = "timeStart_example"; // String | Datetime in iso format.
String timeEnd = "timeEnd_example"; // String | Datetime in iso format.
Integer limit = 56; // Integer | 
Integer offset = 56; // Integer | 
try {
    OrdersResponse result = apiInstance.reportsOrdersGet(currencyPairId, orderStatus, timeStart, timeEnd, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TradingHistoryApi#reportsOrdersGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currencyPairId** | **Integer**|  | [optional]
 **orderStatus** | **String**|  | [optional] [enum: ALL, FINISHED, CANCELLED, PARTIAL]
 **timeStart** | **String**| Datetime in iso format. | [optional]
 **timeEnd** | **String**| Datetime in iso format. | [optional]
 **limit** | **Integer**|  | [optional] [enum: ]
 **offset** | **Integer**|  | [optional]

### Return type

[**OrdersResponse**](OrdersResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="reportsOrdersOrderIdGet"></a>
# **reportsOrdersOrderIdGet**
> OrderDetailsResponse reportsOrdersOrderIdGet(orderId)

Get specified order details

Get trades and fees information for given order

### Example
```java
// Import classes:
//import com.pseq.stex.client.invoker.ApiClient;
//import com.pseq.stex.client.invoker.ApiException;
//import com.pseq.stex.client.invoker.Configuration;
//import com.pseq.stex.client.invoker.auth.*;
//import com.baeldung.petstore.client.api.TradingHistoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

TradingHistoryApi apiInstance = new TradingHistoryApi();
Integer orderId = 56; // Integer | 
try {
    OrderDetailsResponse result = apiInstance.reportsOrdersOrderIdGet(orderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TradingHistoryApi#reportsOrdersOrderIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **Integer**|  |

### Return type

[**OrderDetailsResponse**](OrderDetailsResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

