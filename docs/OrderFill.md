# OrderFill

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** |  |  [optional]
**buyOrderId** | **Integer** |  |  [optional]
**sellOrderId** | **Integer** |  |  [optional]
**price** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**amount** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**tradeType** | [**TradeTypeEnum**](#TradeTypeEnum) | trade type BUY or SELL |  [optional]
**timestamp** | **Integer** |  |  [optional]

<a name="TradeTypeEnum"></a>
## Enum: TradeTypeEnum
Name | Value
---- | -----
BUY | &quot;BUY&quot;
SELL | &quot;SELL&quot;
