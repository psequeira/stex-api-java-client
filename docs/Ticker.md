# Ticker

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Currency pair ID |  [optional]
**amountMultiplier** | **Integer** | Multiplier for the ammpont. Used if the currency in the pair is too cheap to be trade, In this case a lot is sold. |  [optional]
**currencyCode** | **String** | Code of the currency |  [optional]
**marketCode** | **String** | Code of the market currency |  [optional]
**currencyName** | **String** | Full name of the currency |  [optional]
**marketName** | **String** | Full name of the market currency |  [optional]
**symbol** | **String** | CurrencyPairGroup symbol |  [optional]
**groupName** | **String** | Currency Pair Group name |  [optional]
**groupId** | **Integer** | Currency Pair Group id |  [optional]
**ask** | **String** | Best ASK. |  [optional]
**bid** | **String** | Best BID. |  [optional]
**last** | **String** | Last trade price |  [optional]
**low** | **String** | Min trade price of the last 24 hours. |  [optional]
**high** | **String** | Max trade price of the last 24 hours. |  [optional]
**open** | **String** | Trade price 24 hours ago. |  [optional]
**volume** | **String** | Trading volume in market currency of the last 24 hours. |  [optional]
**volumeQuote** | **String** | Trading volume in currency of the last 24 hours. |  [optional]
**fiatsRate** | [**TickerFiatsRate**](TickerFiatsRate.md) |  |  [optional]
**timestamp** | **Integer** | Timestamp of the provided data |  [optional]
