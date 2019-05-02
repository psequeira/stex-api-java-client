# PublicApi

All URIs are relative to *https://api3.stex.com/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**publicChartCurrencyPairIdCandlesTypeGet**](PublicApi.md#publicChartCurrencyPairIdCandlesTypeGet) | **GET** /public/chart/{currencyPairId}/{candlesType} | A list of candles for given currency pair
[**publicCurrenciesCurrencyIdGet**](PublicApi.md#publicCurrenciesCurrencyIdGet) | **GET** /public/currencies/{currencyId} | Get currency info
[**publicCurrenciesGet**](PublicApi.md#publicCurrenciesGet) | **GET** /public/currencies | Available Currencies
[**publicCurrencyPairsCurrencyPairIdGet**](PublicApi.md#publicCurrencyPairsCurrencyPairIdGet) | **GET** /public/currency_pairs/{currencyPairId} | Get currency pair information
[**publicCurrencyPairsGroupCurrencyPairGroupIdGet**](PublicApi.md#publicCurrencyPairsGroupCurrencyPairGroupIdGet) | **GET** /public/currency_pairs/group/{currencyPairGroupId} | Available currency pairs for a given group
[**publicCurrencyPairsListCodeGet**](PublicApi.md#publicCurrencyPairsListCodeGet) | **GET** /public/currency_pairs/list/{code} | Available currency pairs
[**publicMarketsGet**](PublicApi.md#publicMarketsGet) | **GET** /public/markets | Available markets
[**publicOrderbookCurrencyPairIdGet**](PublicApi.md#publicOrderbookCurrencyPairIdGet) | **GET** /public/orderbook/{currencyPairId} | Orderbook for given currency pair
[**publicPairsGroupsGet**](PublicApi.md#publicPairsGroupsGet) | **GET** /public/pairs-groups | Available currency pairs groups (as displayed at stex trading page)
[**publicPingGet**](PublicApi.md#publicPingGet) | **GET** /public/ping | Test API is working and get server time
[**publicTickerCurrencyPairIdGet**](PublicApi.md#publicTickerCurrencyPairIdGet) | **GET** /public/ticker/{currencyPairId} | Ticker for currency pair
[**publicTickerGet**](PublicApi.md#publicTickerGet) | **GET** /public/ticker | Tickers list for all currency pairs
[**publicTradesCurrencyPairIdGet**](PublicApi.md#publicTradesCurrencyPairIdGet) | **GET** /public/trades/{currencyPairId} | Trades for given currency pair

<a name="publicChartCurrencyPairIdCandlesTypeGet"></a>
# **publicChartCurrencyPairIdCandlesTypeGet**
> CandlesResponse publicChartCurrencyPairIdCandlesTypeGet(currencyPairId, candlesType, timeStart, timeEnd, limit, offset)

A list of candles for given currency pair

Provides a list of candles for the chart. Candles are always ordered in descending order (the latest are first)

### Example
```java
// Import classes:
//import com.pseq.stex.client.invoker.ApiException;
//import com.pseq.stex.client.api.PublicApi;


PublicApi apiInstance = new PublicApi();
String currencyPairId = "currencyPairId_example"; // String | A currency pair ID you want to get candles for
String candlesType = "candlesType_example"; // String | Candle size 1 stays for 1 minute, 5 - 5 minutes and so on. 1D - stays for 1 day
Integer timeStart = 56; // Integer | Timestamp in second. Should be less then timeEnd
Integer timeEnd = 56; // Integer | Timestamp in second. Should be greater then timeStart
Integer limit = 56; // Integer | 
Integer offset = 56; // Integer | 
try {
    CandlesResponse result = apiInstance.publicChartCurrencyPairIdCandlesTypeGet(currencyPairId, candlesType, timeStart, timeEnd, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApi#publicChartCurrencyPairIdCandlesTypeGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currencyPairId** | **String**| A currency pair ID you want to get candles for |
 **candlesType** | **String**| Candle size 1 stays for 1 minute, 5 - 5 minutes and so on. 1D - stays for 1 day | [enum: 1, 5, 30, 60, 240, 720, 1D]
 **timeStart** | **Integer**| Timestamp in second. Should be less then timeEnd |
 **timeEnd** | **Integer**| Timestamp in second. Should be greater then timeStart |
 **limit** | **Integer**|  | [optional] [enum: ]
 **offset** | **Integer**|  | [optional]

### Return type

[**CandlesResponse**](CandlesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="publicCurrenciesCurrencyIdGet"></a>
# **publicCurrenciesCurrencyIdGet**
> CurrencyResponse publicCurrenciesCurrencyIdGet(currencyId)

Get currency info

### Example
```java
// Import classes:
//import com.pseq.stex.client.invoker.ApiException;
//import com.pseq.stex.client.api.PublicApi;


PublicApi apiInstance = new PublicApi();
Integer currencyId = 56; // Integer | 
try {
    CurrencyResponse result = apiInstance.publicCurrenciesCurrencyIdGet(currencyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApi#publicCurrenciesCurrencyIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currencyId** | **Integer**|  |

### Return type

[**CurrencyResponse**](CurrencyResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="publicCurrenciesGet"></a>
# **publicCurrenciesGet**
> CurrenciesResponse publicCurrenciesGet()

Available Currencies

Get list of avialable currencies. 

### Example
```java
// Import classes:
//import com.pseq.stex.client.invoker.ApiException;
//import com.pseq.stex.client.api.PublicApi;


PublicApi apiInstance = new PublicApi();
try {
    CurrenciesResponse result = apiInstance.publicCurrenciesGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApi#publicCurrenciesGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CurrenciesResponse**](CurrenciesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="publicCurrencyPairsCurrencyPairIdGet"></a>
# **publicCurrencyPairsCurrencyPairIdGet**
> CurrencyPairResponse publicCurrencyPairsCurrencyPairIdGet(currencyPairId)

Get currency pair information

### Example
```java
// Import classes:
//import com.pseq.stex.client.invoker.ApiException;
//import com.pseq.stex.client.api.PublicApi;


PublicApi apiInstance = new PublicApi();
Integer currencyPairId = 56; // Integer | 
try {
    CurrencyPairResponse result = apiInstance.publicCurrencyPairsCurrencyPairIdGet(currencyPairId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApi#publicCurrencyPairsCurrencyPairIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currencyPairId** | **Integer**|  |

### Return type

[**CurrencyPairResponse**](CurrencyPairResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="publicCurrencyPairsGroupCurrencyPairGroupIdGet"></a>
# **publicCurrencyPairsGroupCurrencyPairGroupIdGet**
> CurrencyPairsResponse publicCurrencyPairsGroupCurrencyPairGroupIdGet(currencyPairGroupId)

Available currency pairs for a given group

Returns a list of avialable currency pairs in the given currency pair group 

### Example
```java
// Import classes:
//import com.pseq.stex.client.invoker.ApiException;
//import com.pseq.stex.client.api.PublicApi;


PublicApi apiInstance = new PublicApi();
Integer currencyPairGroupId = 56; // Integer | 
try {
    CurrencyPairsResponse result = apiInstance.publicCurrencyPairsGroupCurrencyPairGroupIdGet(currencyPairGroupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApi#publicCurrencyPairsGroupCurrencyPairGroupIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currencyPairGroupId** | **Integer**|  |

### Return type

[**CurrencyPairsResponse**](CurrencyPairsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="publicCurrencyPairsListCodeGet"></a>
# **publicCurrencyPairsListCodeGet**
> CurrencyPairsResponse publicCurrencyPairsListCodeGet(code)

Available currency pairs

Returns a list of avialable currency pairs in the given market if {code} is one of the values returned by /public/markets. Returns all available currency pairs if ALL passed as a {code} 

### Example
```java
// Import classes:
//import com.pseq.stex.client.invoker.ApiException;
//import com.pseq.stex.client.api.PublicApi;


PublicApi apiInstance = new PublicApi();
String code = "code_example"; // String | 
try {
    CurrencyPairsResponse result = apiInstance.publicCurrencyPairsListCodeGet(code);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApi#publicCurrencyPairsListCodeGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **String**|  | [enum: ALL, marketSymbol]

### Return type

[**CurrencyPairsResponse**](CurrencyPairsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="publicMarketsGet"></a>
# **publicMarketsGet**
> MarketResponse publicMarketsGet()

Available markets

Get list of all avialable markets 

### Example
```java
// Import classes:
//import com.pseq.stex.client.invoker.ApiException;
//import com.pseq.stex.client.api.PublicApi;


PublicApi apiInstance = new PublicApi();
try {
    MarketResponse result = apiInstance.publicMarketsGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApi#publicMarketsGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**MarketResponse**](MarketResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="publicOrderbookCurrencyPairIdGet"></a>
# **publicOrderbookCurrencyPairIdGet**
> OrderbookResponse publicOrderbookCurrencyPairIdGet(currencyPairId, limitBids, limitAsks)

Orderbook for given currency pair

### Example
```java
// Import classes:
//import com.pseq.stex.client.invoker.ApiException;
//import com.pseq.stex.client.api.PublicApi;


PublicApi apiInstance = new PublicApi();
Integer currencyPairId = 56; // Integer | 
Integer limitBids = 56; // Integer | Return only top N bids. Returns all if set to 0
Integer limitAsks = 56; // Integer | Return only top N asks. Returns all if set to 0 or absent
try {
    OrderbookResponse result = apiInstance.publicOrderbookCurrencyPairIdGet(currencyPairId, limitBids, limitAsks);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApi#publicOrderbookCurrencyPairIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currencyPairId** | **Integer**|  |
 **limitBids** | **Integer**| Return only top N bids. Returns all if set to 0 | [optional]
 **limitAsks** | **Integer**| Return only top N asks. Returns all if set to 0 or absent | [optional]

### Return type

[**OrderbookResponse**](OrderbookResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="publicPairsGroupsGet"></a>
# **publicPairsGroupsGet**
> CurrencyPairGroupsResponse publicPairsGroupsGet()

Available currency pairs groups (as displayed at stex trading page)

Get list of all avialable currency pairs groups 

### Example
```java
// Import classes:
//import com.pseq.stex.client.invoker.ApiException;
//import com.pseq.stex.client.api.PublicApi;


PublicApi apiInstance = new PublicApi();
try {
    CurrencyPairGroupsResponse result = apiInstance.publicPairsGroupsGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApi#publicPairsGroupsGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CurrencyPairGroupsResponse**](CurrencyPairGroupsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="publicPingGet"></a>
# **publicPingGet**
> ServerTimeResponse publicPingGet()

Test API is working and get server time

### Example
```java
// Import classes:
//import com.pseq.stex.client.invoker.ApiException;
//import com.pseq.stex.client.api.PublicApi;


PublicApi apiInstance = new PublicApi();
try {
    ServerTimeResponse result = apiInstance.publicPingGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApi#publicPingGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ServerTimeResponse**](ServerTimeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="publicTickerCurrencyPairIdGet"></a>
# **publicTickerCurrencyPairIdGet**
> TickerResponse publicTickerCurrencyPairIdGet(currencyPairId)

Ticker for currency pair

Returns last 24H information about currency pair ticker 

### Example
```java
// Import classes:
//import com.pseq.stex.client.invoker.ApiException;
//import com.pseq.stex.client.api.PublicApi;


PublicApi apiInstance = new PublicApi();
String currencyPairId = "currencyPairId_example"; // String | 
try {
    TickerResponse result = apiInstance.publicTickerCurrencyPairIdGet(currencyPairId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApi#publicTickerCurrencyPairIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currencyPairId** | **String**|  |

### Return type

[**TickerResponse**](TickerResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="publicTickerGet"></a>
# **publicTickerGet**
> List&lt;TickersResponse&gt; publicTickerGet()

Tickers list for all currency pairs

Returns last 24H information about every currency pair. 

### Example
```java
// Import classes:
//import com.pseq.stex.client.invoker.ApiException;
//import com.pseq.stex.client.api.PublicApi;


PublicApi apiInstance = new PublicApi();
try {
    List<TickersResponse> result = apiInstance.publicTickerGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApi#publicTickerGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;TickersResponse&gt;**](TickersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="publicTradesCurrencyPairIdGet"></a>
# **publicTradesCurrencyPairIdGet**
> TradesResponse publicTradesCurrencyPairIdGet(currencyPairId, sort, from, till, limit, offset)

Trades for given currency pair

### Example
```java
// Import classes:
//import com.pseq.stex.client.invoker.ApiException;
//import com.pseq.stex.client.api.PublicApi;


PublicApi apiInstance = new PublicApi();
String currencyPairId = "currencyPairId_example"; // String | 
String sort = "sort_example"; // String | Direction of the sort - ASCending or DESCending by trade timestamp
Integer from = 56; // Integer | The timestamp in millisecond
Integer till = 56; // Integer | The timestamp in millisecond
Integer limit = 56; // Integer | 
Integer offset = 56; // Integer | 
try {
    TradesResponse result = apiInstance.publicTradesCurrencyPairIdGet(currencyPairId, sort, from, till, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApi#publicTradesCurrencyPairIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currencyPairId** | **String**|  |
 **sort** | **String**| Direction of the sort - ASCending or DESCending by trade timestamp | [optional] [enum: DESC, ASC]
 **from** | **Integer**| The timestamp in millisecond | [optional]
 **till** | **Integer**| The timestamp in millisecond | [optional]
 **limit** | **Integer**|  | [optional] [enum: ]
 **offset** | **Integer**|  | [optional]

### Return type

[**TradesResponse**](TradesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

