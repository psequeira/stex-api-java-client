# ProfileApi

All URIs are relative to *https://api3.stex.com/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**profileDepositsGet**](ProfileApi.md#profileDepositsGet) | **GET** /profile/deposits | Get a list of deposits made by user
[**profileDepositsIdGet**](ProfileApi.md#profileDepositsIdGet) | **GET** /profile/deposits/{id} | Get deposit by id
[**profileInfoGet**](ProfileApi.md#profileInfoGet) | **GET** /profile/info | Account information
[**profileWalletsAddressWalletIdGet**](ProfileApi.md#profileWalletsAddressWalletIdGet) | **GET** /profile/wallets/address/{walletId} | Get deposit address for given wallet
[**profileWalletsAddressWalletIdPost**](ProfileApi.md#profileWalletsAddressWalletIdPost) | **POST** /profile/wallets/address/{walletId} | Create new deposit address
[**profileWalletsCurrencyIdPost**](ProfileApi.md#profileWalletsCurrencyIdPost) | **POST** /profile/wallets/{currencyId} | Create a wallet for given currency
[**profileWalletsGet**](ProfileApi.md#profileWalletsGet) | **GET** /profile/wallets | Get a list of user wallets
[**profileWalletsWalletIdGet**](ProfileApi.md#profileWalletsWalletIdGet) | **GET** /profile/wallets/{walletId} | Single wallet information
[**profileWithdrawPost**](ProfileApi.md#profileWithdrawPost) | **POST** /profile/withdraw | Create withdrawal request
[**profileWithdrawWithdrawalIdDelete**](ProfileApi.md#profileWithdrawWithdrawalIdDelete) | **DELETE** /profile/withdraw/{withdrawalId} | Cancel unconfirmed withdrawal
[**profileWithdrawalsGet**](ProfileApi.md#profileWithdrawalsGet) | **GET** /profile/withdrawals | Get a list of withdrawals made by user
[**profileWithdrawalsIdGet**](ProfileApi.md#profileWithdrawalsIdGet) | **GET** /profile/withdrawals/{id} | Get withdrawal by id

<a name="profileDepositsGet"></a>
# **profileDepositsGet**
> DepositsResponse profileDepositsGet(currencyId, sort, timeStart, timeEnd, limit, offset)

Get a list of deposits made by user

Returns a list of deposits the user has made to the exchange according to the filters and parameters passed in the request. Allows to filter deposits by currency, date range etc.

### Example
```java
// Import classes:
//import com.pseq.stex.client.invoker.ApiClient;
//import com.pseq.stex.client.invoker.ApiException;
//import com.pseq.stex.client.invoker.Configuration;
//import com.pseq.stex.client.invoker.auth.*;
//import com.pseq.stex.client.api.ProfileApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

ProfileApi apiInstance = new ProfileApi();
Integer currencyId = 56; // Integer | the ID of the currency to filter results by
String sort = "sort_example"; // String | Sort direction. Results are always ordered by date. You may adjust the order direction here
String timeStart = "timeStart_example"; // String | Timestamp in millisecond
String timeEnd = "timeEnd_example"; // String | Timestamp in millisecond
Integer limit = 56; // Integer | 
Integer offset = 56; // Integer | 
try {
    DepositsResponse result = apiInstance.profileDepositsGet(currencyId, sort, timeStart, timeEnd, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProfileApi#profileDepositsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currencyId** | **Integer**| the ID of the currency to filter results by | [optional]
 **sort** | **String**| Sort direction. Results are always ordered by date. You may adjust the order direction here | [optional] [enum: DESC, ASC]
 **timeStart** | **String**| Timestamp in millisecond | [optional]
 **timeEnd** | **String**| Timestamp in millisecond | [optional]
 **limit** | **Integer**|  | [optional] [enum: ]
 **offset** | **Integer**|  | [optional]

### Return type

[**DepositsResponse**](DepositsResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="profileDepositsIdGet"></a>
# **profileDepositsIdGet**
> DepositResponse profileDepositsIdGet(id)

Get deposit by id

### Example
```java
// Import classes:
//import com.pseq.stex.client.invoker.ApiClient;
//import com.pseq.stex.client.invoker.ApiException;
//import com.pseq.stex.client.invoker.Configuration;
//import com.pseq.stex.client.invoker.auth.*;
//import com.pseq.stex.client.api.ProfileApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

ProfileApi apiInstance = new ProfileApi();
String id = "id_example"; // String | 
try {
    DepositResponse result = apiInstance.profileDepositsIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProfileApi#profileDepositsIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**DepositResponse**](DepositResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="profileInfoGet"></a>
# **profileInfoGet**
> UserResponse profileInfoGet()

Account information

Get general information about the current user

### Example
```java
// Import classes:
//import com.pseq.stex.client.invoker.ApiClient;
//import com.pseq.stex.client.invoker.ApiException;
//import com.pseq.stex.client.invoker.Configuration;
//import com.pseq.stex.client.invoker.auth.*;
//import com.pseq.stex.client.api.ProfileApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

ProfileApi apiInstance = new ProfileApi();
try {
    UserResponse result = apiInstance.profileInfoGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProfileApi#profileInfoGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**UserResponse**](UserResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="profileWalletsAddressWalletIdGet"></a>
# **profileWalletsAddressWalletIdGet**
> WalletAddressResponse profileWalletsAddressWalletIdGet(walletId)

Get deposit address for given wallet

### Example
```java
// Import classes:
//import com.pseq.stex.client.invoker.ApiClient;
//import com.pseq.stex.client.invoker.ApiException;
//import com.pseq.stex.client.invoker.Configuration;
//import com.pseq.stex.client.invoker.auth.*;
//import com.pseq.stex.client.api.ProfileApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

ProfileApi apiInstance = new ProfileApi();
String walletId = "walletId_example"; // String | 
try {
    WalletAddressResponse result = apiInstance.profileWalletsAddressWalletIdGet(walletId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProfileApi#profileWalletsAddressWalletIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **walletId** | **String**|  |

### Return type

[**WalletAddressResponse**](WalletAddressResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="profileWalletsAddressWalletIdPost"></a>
# **profileWalletsAddressWalletIdPost**
> WalletAddressResponse profileWalletsAddressWalletIdPost(walletId)

Create new deposit address

This method allows to generate deposit address if no address was previously generated. It is also allowed to re-generate new address for some currencies.

### Example
```java
// Import classes:
//import com.pseq.stex.client.invoker.ApiClient;
//import com.pseq.stex.client.invoker.ApiException;
//import com.pseq.stex.client.invoker.Configuration;
//import com.pseq.stex.client.invoker.auth.*;
//import com.pseq.stex.client.api.ProfileApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

ProfileApi apiInstance = new ProfileApi();
String walletId = "walletId_example"; // String | 
try {
    WalletAddressResponse result = apiInstance.profileWalletsAddressWalletIdPost(walletId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProfileApi#profileWalletsAddressWalletIdPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **walletId** | **String**|  |

### Return type

[**WalletAddressResponse**](WalletAddressResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="profileWalletsCurrencyIdPost"></a>
# **profileWalletsCurrencyIdPost**
> WalletResponse profileWalletsCurrencyIdPost(currencyId)

Create a wallet for given currency

### Example
```java
// Import classes:
//import com.pseq.stex.client.invoker.ApiClient;
//import com.pseq.stex.client.invoker.ApiException;
//import com.pseq.stex.client.invoker.Configuration;
//import com.pseq.stex.client.invoker.auth.*;
//import com.pseq.stex.client.api.ProfileApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

ProfileApi apiInstance = new ProfileApi();
Integer currencyId = 56; // Integer | 
try {
    WalletResponse result = apiInstance.profileWalletsCurrencyIdPost(currencyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProfileApi#profileWalletsCurrencyIdPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currencyId** | **Integer**|  |

### Return type

[**WalletResponse**](WalletResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="profileWalletsGet"></a>
# **profileWalletsGet**
> WalletsResponse profileWalletsGet(sort, sortBy)

Get a list of user wallets

### Example
```java
// Import classes:
//import com.pseq.stex.client.invoker.ApiClient;
//import com.pseq.stex.client.invoker.ApiException;
//import com.pseq.stex.client.invoker.Configuration;
//import com.pseq.stex.client.invoker.auth.*;
//import com.pseq.stex.client.api.ProfileApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

ProfileApi apiInstance = new ProfileApi();
String sort = "sort_example"; // String | Sort direction.
String sortBy = "sortBy_example"; // String | Sort direction.
try {
    WalletsResponse result = apiInstance.profileWalletsGet(sort, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProfileApi#profileWalletsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sort** | **String**| Sort direction. | [optional] [enum: DESC, ASC]
 **sortBy** | **String**| Sort direction. | [optional] [enum: BALANCE, FROZEN, BONUS, TOTAL]

### Return type

[**WalletsResponse**](WalletsResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="profileWalletsWalletIdGet"></a>
# **profileWalletsWalletIdGet**
> WalletWithAddressResponse profileWalletsWalletIdGet(walletId)

Single wallet information

### Example
```java
// Import classes:
//import com.pseq.stex.client.invoker.ApiClient;
//import com.pseq.stex.client.invoker.ApiException;
//import com.pseq.stex.client.invoker.Configuration;
//import com.pseq.stex.client.invoker.auth.*;
//import com.pseq.stex.client.api.ProfileApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

ProfileApi apiInstance = new ProfileApi();
Integer walletId = 56; // Integer | 
try {
    WalletWithAddressResponse result = apiInstance.profileWalletsWalletIdGet(walletId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProfileApi#profileWalletsWalletIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **walletId** | **Integer**|  |

### Return type

[**WalletWithAddressResponse**](WalletWithAddressResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="profileWithdrawPost"></a>
# **profileWithdrawPost**
> WithdrawalResponse profileWithdrawPost(currencyId, amount, address, additionalAddress)

Create withdrawal request

### Example
```java
// Import classes:
//import com.pseq.stex.client.invoker.ApiClient;
//import com.pseq.stex.client.invoker.ApiException;
//import com.pseq.stex.client.invoker.Configuration;
//import com.pseq.stex.client.invoker.auth.*;
//import com.pseq.stex.client.api.ProfileApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

ProfileApi apiInstance = new ProfileApi();
Integer currencyId = 56; // Integer | 
BigDecimal amount = new BigDecimal(); // BigDecimal | 
String address = "address_example"; // String | 
String additionalAddress = "additionalAddress_example"; // String | 
try {
    WithdrawalResponse result = apiInstance.profileWithdrawPost(currencyId, amount, address, additionalAddress);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProfileApi#profileWithdrawPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currencyId** | **Integer**|  | [optional]
 **amount** | **BigDecimal**|  | [optional]
 **address** | **String**|  | [optional]
 **additionalAddress** | **String**|  | [optional]

### Return type

[**WithdrawalResponse**](WithdrawalResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="profileWithdrawWithdrawalIdDelete"></a>
# **profileWithdrawWithdrawalIdDelete**
> OperationStatus profileWithdrawWithdrawalIdDelete(withdrawalId)

Cancel unconfirmed withdrawal

### Example
```java
// Import classes:
//import com.pseq.stex.client.invoker.ApiClient;
//import com.pseq.stex.client.invoker.ApiException;
//import com.pseq.stex.client.invoker.Configuration;
//import com.pseq.stex.client.invoker.auth.*;
//import com.pseq.stex.client.api.ProfileApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

ProfileApi apiInstance = new ProfileApi();
String withdrawalId = "withdrawalId_example"; // String | 
try {
    OperationStatus result = apiInstance.profileWithdrawWithdrawalIdDelete(withdrawalId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProfileApi#profileWithdrawWithdrawalIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **withdrawalId** | **String**|  |

### Return type

[**OperationStatus**](OperationStatus.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="profileWithdrawalsGet"></a>
# **profileWithdrawalsGet**
> WithdrawalsResponse profileWithdrawalsGet(currencyId, sort, timeStart, timeEnd, limit, offset)

Get a list of withdrawals made by user

### Example
```java
// Import classes:
//import com.pseq.stex.client.invoker.ApiClient;
//import com.pseq.stex.client.invoker.ApiException;
//import com.pseq.stex.client.invoker.Configuration;
//import com.pseq.stex.client.invoker.auth.*;
//import com.pseq.stex.client.api.ProfileApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

ProfileApi apiInstance = new ProfileApi();
Integer currencyId = 56; // Integer | 
String sort = "sort_example"; // String | Sort direction. Results are always ordered by date. You may adjust the order direction here
Integer timeStart = 56; // Integer | Timestamp
Integer timeEnd = 56; // Integer | Timestamp
Integer limit = 56; // Integer | 
Integer offset = 56; // Integer | 
try {
    WithdrawalsResponse result = apiInstance.profileWithdrawalsGet(currencyId, sort, timeStart, timeEnd, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProfileApi#profileWithdrawalsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currencyId** | **Integer**|  | [optional]
 **sort** | **String**| Sort direction. Results are always ordered by date. You may adjust the order direction here | [optional] [enum: DESC, ASC]
 **timeStart** | **Integer**| Timestamp | [optional]
 **timeEnd** | **Integer**| Timestamp | [optional]
 **limit** | **Integer**|  | [optional] [enum: ]
 **offset** | **Integer**|  | [optional]

### Return type

[**WithdrawalsResponse**](WithdrawalsResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="profileWithdrawalsIdGet"></a>
# **profileWithdrawalsIdGet**
> WithdrawalResponse profileWithdrawalsIdGet(id)

Get withdrawal by id

### Example
```java
// Import classes:
//import com.pseq.stex.client.invoker.ApiClient;
//import com.pseq.stex.client.invoker.ApiException;
//import com.pseq.stex.client.invoker.Configuration;
//import com.pseq.stex.client.invoker.auth.*;
//import com.pseq.stex.client.api.ProfileApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

ProfileApi apiInstance = new ProfileApi();
String id = "id_example"; // String | 
try {
    WithdrawalResponse result = apiInstance.profileWithdrawalsIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProfileApi#profileWithdrawalsIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**WithdrawalResponse**](WithdrawalResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

