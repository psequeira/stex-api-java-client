# TradingApi

All URIs are relative to *https://api3.stex.com/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**tradingOrderOrderIdDelete**](TradingApi.md#tradingOrderOrderIdDelete) | **DELETE** /trading/order/{orderId} | Cancel order
[**tradingOrderOrderIdGet**](TradingApi.md#tradingOrderOrderIdGet) | **GET** /trading/order/{orderId} | Get a single order
[**tradingOrdersCurrencyPairIdDelete**](TradingApi.md#tradingOrdersCurrencyPairIdDelete) | **DELETE** /trading/orders/{currencyPairId} | Delete active orders for given currency pair
[**tradingOrdersCurrencyPairIdGet**](TradingApi.md#tradingOrdersCurrencyPairIdGet) | **GET** /trading/orders/{currencyPairId} | List your currently open orders for given currency pair
[**tradingOrdersCurrencyPairIdPost**](TradingApi.md#tradingOrdersCurrencyPairIdPost) | **POST** /trading/orders/{currencyPairId} | Create new order and put it to the orders processing queue
[**tradingOrdersDelete**](TradingApi.md#tradingOrdersDelete) | **DELETE** /trading/orders | Delete all active orders
[**tradingOrdersGet**](TradingApi.md#tradingOrdersGet) | **GET** /trading/orders | List your currently open orders

<a name="tradingOrderOrderIdDelete"></a>
# **tradingOrderOrderIdDelete**
> DeletedOrdersResponse tradingOrderOrderIdDelete(orderId)

Cancel order

### Example
```java
// Import classes:
//import com.pseq.stex.client.invoker.ApiClient;
//import com.pseq.stex.client.invoker.ApiException;
//import com.pseq.stex.client.invoker.Configuration;
//import com.pseq.stex.client.invoker.auth.*;
//import com.baeldung.petstore.client.api.TradingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

TradingApi apiInstance = new TradingApi();
Integer orderId = 56; // Integer | 
try {
    DeletedOrdersResponse result = apiInstance.tradingOrderOrderIdDelete(orderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TradingApi#tradingOrderOrderIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **Integer**|  |

### Return type

[**DeletedOrdersResponse**](DeletedOrdersResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="tradingOrderOrderIdGet"></a>
# **tradingOrderOrderIdGet**
> OrderResponse tradingOrderOrderIdGet(orderId)

Get a single order

Get information about the given order 

### Example
```java
// Import classes:
//import com.pseq.stex.client.invoker.ApiClient;
//import com.pseq.stex.client.invoker.ApiException;
//import com.pseq.stex.client.invoker.Configuration;
//import com.pseq.stex.client.invoker.auth.*;
//import com.baeldung.petstore.client.api.TradingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

TradingApi apiInstance = new TradingApi();
Integer orderId = 56; // Integer | 
try {
    OrderResponse result = apiInstance.tradingOrderOrderIdGet(orderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TradingApi#tradingOrderOrderIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **Integer**|  |

### Return type

[**OrderResponse**](OrderResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="tradingOrdersCurrencyPairIdDelete"></a>
# **tradingOrdersCurrencyPairIdDelete**
> DeletedOrdersResponse tradingOrdersCurrencyPairIdDelete(currencyPairId)

Delete active orders for given currency pair

Puts an request to delete all active (processing or pending) of the given currency pair orders to orders processing queue

### Example
```java
// Import classes:
//import com.pseq.stex.client.invoker.ApiClient;
//import com.pseq.stex.client.invoker.ApiException;
//import com.pseq.stex.client.invoker.Configuration;
//import com.pseq.stex.client.invoker.auth.*;
//import com.baeldung.petstore.client.api.TradingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

TradingApi apiInstance = new TradingApi();
Integer currencyPairId = 56; // Integer | 
try {
    DeletedOrdersResponse result = apiInstance.tradingOrdersCurrencyPairIdDelete(currencyPairId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TradingApi#tradingOrdersCurrencyPairIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currencyPairId** | **Integer**|  |

### Return type

[**DeletedOrdersResponse**](DeletedOrdersResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="tradingOrdersCurrencyPairIdGet"></a>
# **tradingOrdersCurrencyPairIdGet**
> OrdersResponse tradingOrdersCurrencyPairIdGet(currencyPairId)

List your currently open orders for given currency pair

List of your currently open orders for certain currency pair.

### Example
```java
// Import classes:
//import com.pseq.stex.client.invoker.ApiClient;
//import com.pseq.stex.client.invoker.ApiException;
//import com.pseq.stex.client.invoker.Configuration;
//import com.pseq.stex.client.invoker.auth.*;
//import com.baeldung.petstore.client.api.TradingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

TradingApi apiInstance = new TradingApi();
Integer currencyPairId = 56; // Integer | 
try {
    OrdersResponse result = apiInstance.tradingOrdersCurrencyPairIdGet(currencyPairId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TradingApi#tradingOrdersCurrencyPairIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currencyPairId** | **Integer**|  |

### Return type

[**OrdersResponse**](OrdersResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="tradingOrdersCurrencyPairIdPost"></a>
# **tradingOrdersCurrencyPairIdPost**
> OrderResponse tradingOrdersCurrencyPairIdPost(currencyPairId, type, amount, price, triggerPrice)

Create new order and put it to the orders processing queue

### Example
```java
// Import classes:
//import com.pseq.stex.client.invoker.ApiClient;
//import com.pseq.stex.client.invoker.ApiException;
//import com.pseq.stex.client.invoker.Configuration;
//import com.pseq.stex.client.invoker.auth.*;
//import com.baeldung.petstore.client.api.TradingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

TradingApi apiInstance = new TradingApi();
Integer currencyPairId = 56; // Integer | 
String type = "type_example"; // String | 
BigDecimal amount = new BigDecimal(); // BigDecimal | 
BigDecimal price = new BigDecimal(); // BigDecimal | 
BigDecimal triggerPrice = new BigDecimal(); // BigDecimal | 
try {
    OrderResponse result = apiInstance.tradingOrdersCurrencyPairIdPost(currencyPairId, type, amount, price, triggerPrice);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TradingApi#tradingOrdersCurrencyPairIdPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currencyPairId** | **Integer**|  |
 **type** | **String**|  | [optional] [enum: BUY, SELL, STOP_LIMIT_BUY, STOP_LIMIT_SELL]
 **amount** | **BigDecimal**|  | [optional]
 **price** | **BigDecimal**|  | [optional]
 **triggerPrice** | **BigDecimal**|  | [optional]

### Return type

[**OrderResponse**](OrderResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="tradingOrdersDelete"></a>
# **tradingOrdersDelete**
> DeletedOrdersResponse tradingOrdersDelete()

Delete all active orders

Puts an request to delete all active (processing or pending) orders to orders processing queue

### Example
```java
// Import classes:
//import com.pseq.stex.client.invoker.ApiClient;
//import com.pseq.stex.client.invoker.ApiException;
//import com.pseq.stex.client.invoker.Configuration;
//import com.pseq.stex.client.invoker.auth.*;
//import com.baeldung.petstore.client.api.TradingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

TradingApi apiInstance = new TradingApi();
try {
    DeletedOrdersResponse result = apiInstance.tradingOrdersDelete();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TradingApi#tradingOrdersDelete");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**DeletedOrdersResponse**](DeletedOrdersResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="tradingOrdersGet"></a>
# **tradingOrdersGet**
> OrdersResponse tradingOrdersGet()

List your currently open orders

List of your currently open orders.

### Example
```java
// Import classes:
//import com.pseq.stex.client.invoker.ApiClient;
//import com.pseq.stex.client.invoker.ApiException;
//import com.pseq.stex.client.invoker.Configuration;
//import com.pseq.stex.client.invoker.auth.*;
//import com.baeldung.petstore.client.api.TradingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

TradingApi apiInstance = new TradingApi();
try {
    OrdersResponse result = apiInstance.tradingOrdersGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TradingApi#tradingOrdersGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**OrdersResponse**](OrdersResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

