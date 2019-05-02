# Stex Api v3 Client

## Donate 
[BTC] 31o8WL5UHXqfPnVGAfpWp4peZyxWgYsdVh
[ETH] 0x193Bf69141801Df77Fd9e93d197D3c8772505B97

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>com.pseq</groupId>
    <artifactId>stex-api3-client</artifactId>
    <version>0.0.1-SNAPSHOT</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.pseq:stex-api3-client:0.0.1-SNAPSHOT"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/spring-swagger-codegen-api-client-0.0.1-SNAPSHOT.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import com.pseq.stex.client.invoker.*;
import com.pseq.stex.client.invoker.auth.*;
import com.pseq.stex.client.model.*;
import com.baeldung.petstore.client.api.ProfileApi;

import java.io.File;
import java.util.*;

public class ProfileApiExample {

    public static void main(String[] args) {
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
    }
}
```

## Documentation for API Endpoints

All URIs are relative to *https://api3.stex.com/*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ProfileApi* | [**profileDepositsGet**](docs/ProfileApi.md#profileDepositsGet) | **GET** /profile/deposits | Get a list of deposits made by user
*ProfileApi* | [**profileDepositsIdGet**](docs/ProfileApi.md#profileDepositsIdGet) | **GET** /profile/deposits/{id} | Get deposit by id
*ProfileApi* | [**profileInfoGet**](docs/ProfileApi.md#profileInfoGet) | **GET** /profile/info | Account information
*ProfileApi* | [**profileWalletsAddressWalletIdGet**](docs/ProfileApi.md#profileWalletsAddressWalletIdGet) | **GET** /profile/wallets/address/{walletId} | Get deposit address for given wallet
*ProfileApi* | [**profileWalletsAddressWalletIdPost**](docs/ProfileApi.md#profileWalletsAddressWalletIdPost) | **POST** /profile/wallets/address/{walletId} | Create new deposit address
*ProfileApi* | [**profileWalletsCurrencyIdPost**](docs/ProfileApi.md#profileWalletsCurrencyIdPost) | **POST** /profile/wallets/{currencyId} | Create a wallet for given currency
*ProfileApi* | [**profileWalletsGet**](docs/ProfileApi.md#profileWalletsGet) | **GET** /profile/wallets | Get a list of user wallets
*ProfileApi* | [**profileWalletsWalletIdGet**](docs/ProfileApi.md#profileWalletsWalletIdGet) | **GET** /profile/wallets/{walletId} | Single wallet information
*ProfileApi* | [**profileWithdrawPost**](docs/ProfileApi.md#profileWithdrawPost) | **POST** /profile/withdraw | Create withdrawal request
*ProfileApi* | [**profileWithdrawWithdrawalIdDelete**](docs/ProfileApi.md#profileWithdrawWithdrawalIdDelete) | **DELETE** /profile/withdraw/{withdrawalId} | Cancel unconfirmed withdrawal
*ProfileApi* | [**profileWithdrawalsGet**](docs/ProfileApi.md#profileWithdrawalsGet) | **GET** /profile/withdrawals | Get a list of withdrawals made by user
*ProfileApi* | [**profileWithdrawalsIdGet**](docs/ProfileApi.md#profileWithdrawalsIdGet) | **GET** /profile/withdrawals/{id} | Get withdrawal by id
*PublicApi* | [**publicChartCurrencyPairIdCandlesTypeGet**](docs/PublicApi.md#publicChartCurrencyPairIdCandlesTypeGet) | **GET** /public/chart/{currencyPairId}/{candlesType} | A list of candles for given currency pair
*PublicApi* | [**publicCurrenciesCurrencyIdGet**](docs/PublicApi.md#publicCurrenciesCurrencyIdGet) | **GET** /public/currencies/{currencyId} | Get currency info
*PublicApi* | [**publicCurrenciesGet**](docs/PublicApi.md#publicCurrenciesGet) | **GET** /public/currencies | Available Currencies
*PublicApi* | [**publicCurrencyPairsCurrencyPairIdGet**](docs/PublicApi.md#publicCurrencyPairsCurrencyPairIdGet) | **GET** /public/currency_pairs/{currencyPairId} | Get currency pair information
*PublicApi* | [**publicCurrencyPairsGroupCurrencyPairGroupIdGet**](docs/PublicApi.md#publicCurrencyPairsGroupCurrencyPairGroupIdGet) | **GET** /public/currency_pairs/group/{currencyPairGroupId} | Available currency pairs for a given group
*PublicApi* | [**publicCurrencyPairsListCodeGet**](docs/PublicApi.md#publicCurrencyPairsListCodeGet) | **GET** /public/currency_pairs/list/{code} | Available currency pairs
*PublicApi* | [**publicMarketsGet**](docs/PublicApi.md#publicMarketsGet) | **GET** /public/markets | Available markets
*PublicApi* | [**publicOrderbookCurrencyPairIdGet**](docs/PublicApi.md#publicOrderbookCurrencyPairIdGet) | **GET** /public/orderbook/{currencyPairId} | Orderbook for given currency pair
*PublicApi* | [**publicPairsGroupsGet**](docs/PublicApi.md#publicPairsGroupsGet) | **GET** /public/pairs-groups | Available currency pairs groups (as displayed at stex trading page)
*PublicApi* | [**publicPingGet**](docs/PublicApi.md#publicPingGet) | **GET** /public/ping | Test API is working and get server time
*PublicApi* | [**publicTickerCurrencyPairIdGet**](docs/PublicApi.md#publicTickerCurrencyPairIdGet) | **GET** /public/ticker/{currencyPairId} | Ticker for currency pair
*PublicApi* | [**publicTickerGet**](docs/PublicApi.md#publicTickerGet) | **GET** /public/ticker | Tickers list for all currency pairs
*PublicApi* | [**publicTradesCurrencyPairIdGet**](docs/PublicApi.md#publicTradesCurrencyPairIdGet) | **GET** /public/trades/{currencyPairId} | Trades for given currency pair
*TradingApi* | [**tradingOrderOrderIdDelete**](docs/TradingApi.md#tradingOrderOrderIdDelete) | **DELETE** /trading/order/{orderId} | Cancel order
*TradingApi* | [**tradingOrderOrderIdGet**](docs/TradingApi.md#tradingOrderOrderIdGet) | **GET** /trading/order/{orderId} | Get a single order
*TradingApi* | [**tradingOrdersCurrencyPairIdDelete**](docs/TradingApi.md#tradingOrdersCurrencyPairIdDelete) | **DELETE** /trading/orders/{currencyPairId} | Delete active orders for given currency pair
*TradingApi* | [**tradingOrdersCurrencyPairIdGet**](docs/TradingApi.md#tradingOrdersCurrencyPairIdGet) | **GET** /trading/orders/{currencyPairId} | List your currently open orders for given currency pair
*TradingApi* | [**tradingOrdersCurrencyPairIdPost**](docs/TradingApi.md#tradingOrdersCurrencyPairIdPost) | **POST** /trading/orders/{currencyPairId} | Create new order and put it to the orders processing queue
*TradingApi* | [**tradingOrdersDelete**](docs/TradingApi.md#tradingOrdersDelete) | **DELETE** /trading/orders | Delete all active orders
*TradingApi* | [**tradingOrdersGet**](docs/TradingApi.md#tradingOrdersGet) | **GET** /trading/orders | List your currently open orders
*TradingHistoryApi* | [**reportsOrdersGet**](docs/TradingHistoryApi.md#reportsOrdersGet) | **GET** /reports/orders | Get past orders
*TradingHistoryApi* | [**reportsOrdersOrderIdGet**](docs/TradingHistoryApi.md#reportsOrdersOrderIdGet) | **GET** /reports/orders/{orderId} | Get specified order details

## Documentation for Models

 - [Body](docs/Body.md)
 - [Body1](docs/Body1.md)
 - [Candle](docs/Candle.md)
 - [CandlesResponse](docs/CandlesResponse.md)
 - [CurrenciesResponse](docs/CurrenciesResponse.md)
 - [Currency](docs/Currency.md)
 - [CurrencyPair](docs/CurrencyPair.md)
 - [CurrencyPairGroup](docs/CurrencyPairGroup.md)
 - [CurrencyPairGroupsResponse](docs/CurrencyPairGroupsResponse.md)
 - [CurrencyPairResponse](docs/CurrencyPairResponse.md)
 - [CurrencyPairsResponse](docs/CurrencyPairsResponse.md)
 - [CurrencyResponse](docs/CurrencyResponse.md)
 - [DeletedOrders](docs/DeletedOrders.md)
 - [DeletedOrdersResponse](docs/DeletedOrdersResponse.md)
 - [Deposit](docs/Deposit.md)
 - [DepositResponse](docs/DepositResponse.md)
 - [DepositsResponse](docs/DepositsResponse.md)
 - [Error](docs/Error.md)
 - [ErrorError](docs/ErrorError.md)
 - [Market](docs/Market.md)
 - [MarketResponse](docs/MarketResponse.md)
 - [OperationStatus](docs/OperationStatus.md)
 - [Order](docs/Order.md)
 - [OrderDetails](docs/OrderDetails.md)
 - [OrderDetailsResponse](docs/OrderDetailsResponse.md)
 - [OrderFee](docs/OrderFee.md)
 - [OrderFill](docs/OrderFill.md)
 - [OrderResponse](docs/OrderResponse.md)
 - [Orderbook](docs/Orderbook.md)
 - [OrderbookAsk](docs/OrderbookAsk.md)
 - [OrderbookBid](docs/OrderbookBid.md)
 - [OrderbookResponse](docs/OrderbookResponse.md)
 - [OrdersResponse](docs/OrdersResponse.md)
 - [ServerTime](docs/ServerTime.md)
 - [ServerTimeResponse](docs/ServerTimeResponse.md)
 - [ServerTimeServerDatetime](docs/ServerTimeServerDatetime.md)
 - [Ticker](docs/Ticker.md)
 - [TickerFiatsRate](docs/TickerFiatsRate.md)
 - [TickerResponse](docs/TickerResponse.md)
 - [TickersResponse](docs/TickersResponse.md)
 - [Trade](docs/Trade.md)
 - [TradesResponse](docs/TradesResponse.md)
 - [User](docs/User.md)
 - [UserResponse](docs/UserResponse.md)
 - [UserVerifications](docs/UserVerifications.md)
 - [Wallet](docs/Wallet.md)
 - [WalletAddress](docs/WalletAddress.md)
 - [WalletAddressResponse](docs/WalletAddressResponse.md)
 - [WalletResponse](docs/WalletResponse.md)
 - [WalletWithAddress](docs/WalletWithAddress.md)
 - [WalletWithAddressResponse](docs/WalletWithAddressResponse.md)
 - [WalletsResponse](docs/WalletsResponse.md)
 - [Withdrawal](docs/Withdrawal.md)
 - [WithdrawalResponse](docs/WithdrawalResponse.md)
 - [WithdrawalsResponse](docs/WithdrawalsResponse.md)

## Documentation for Authorization

Authentication schemes defined for the API:
you should implement OAuth2 within your application
### OAuth2

- **Type**: OAuth
- **Flow**: accessCode
- **Authorization URL**: https://app.stex.com/oauth/authorize
- **Scopes**: 
  - : 


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.
