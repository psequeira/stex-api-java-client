# Order

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | unique ID of the order |  [optional]
**currencyPairId** | **Integer** | id of the currency pair the order is placed at |  [optional]
**price** | **String** | the price of the order |  [optional]
**triggerPrice** | **String** | the stop price of the stop-limit order |  [optional]
**initialAmount** | **String** | amount of the order |  [optional]
**processedAmount** | **String** | amount that already has been processed at the time of request |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | order type BUY or SELL |  [optional]
**originalType** | [**OriginalTypeEnum**](#OriginalTypeEnum) | order type BUY or SELL |  [optional]
**created** | [**OffsetDateTime**](OffsetDateTime.md) | Order creation date and time (UTC) |  [optional]
**timestamp** | **Integer** | Order creation timestamp (in seconds) UTC |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | order status at the time of the request |  [optional]

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
BUY | &quot;BUY&quot;
SELL | &quot;SELL&quot;
STOP_LIMIT_BUY | &quot;STOP_LIMIT_BUY&quot;
STOP_LIMIT_SELL | &quot;STOP_LIMIT_SELL&quot;

<a name="OriginalTypeEnum"></a>
## Enum: OriginalTypeEnum
Name | Value
---- | -----
BUY | &quot;BUY&quot;
SELL | &quot;SELL&quot;
STOP_LIMIT_BUY | &quot;STOP_LIMIT_BUY&quot;
STOP_LIMIT_SELL | &quot;STOP_LIMIT_SELL&quot;

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
PROCESSING | &quot;PROCESSING&quot;
PENDING | &quot;PENDING&quot;
FINISHED | &quot;FINISHED&quot;
PARTIAL | &quot;PARTIAL&quot;
CANCELLED | &quot;CANCELLED&quot;
