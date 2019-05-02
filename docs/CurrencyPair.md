# CurrencyPair

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Currency pair ID |  [optional]
**currencyId** | **Integer** | Currency id as returned by /public/currencies |  [optional]
**currencyCode** | **String** | Currency code as returned by /public/currencies |  [optional]
**currencyName** | **String** | Full name of the currency |  [optional]
**marketCurrencyId** | **Integer** | Currency id of the market currency as returned by /public/currencies |  [optional]
**marketCode** | **String** | CurrencyPairGroup code as returned by /public/markets |  [optional]
**marketName** | **String** | Full name of the market |  [optional]
**minOrderAmount** | **String** | The minimum amount of the order that can be placed |  [optional]
**minBuyPrice** | **String** | The minimum price of the bid |  [optional]
**minSellPrice** | **String** | The minimum price of the ask |  [optional]
**buyFeePercent** | **String** | Bid fee in percents |  [optional]
**sellFeePercent** | **String** | Ask fee in percents |  [optional]
**active** | **Boolean** | Indicates is the currency pair active (trades are enabled) or not |  [optional]
**delisted** | **Boolean** | Indicates if the currency pair is delisted |  [optional]
**pairMessage** | **String** | Message that is shown on the currency pair trade page |  [optional]
**currencyPrecision** | **Integer** | Number of decimal places allowed for this currency |  [optional]
**marketPrecision** | **Integer** | Number of decimal places allowed for the currency of the market |  [optional]
**symbol** | **String** | CurrencyPairGroup symbol |  [optional]
**groupName** | **String** | Currency pair group name |  [optional]
**groupId** | **Integer** | Currency pair group ID |  [optional]
**amountMultiplier** | **Integer** | Amount multiplier used to trade for some pairs with low price |  [optional]
