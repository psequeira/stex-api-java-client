# Body

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) | order type (BUY / SELL / STOP_LIMIT_BUY / STOP_LIMIT_SELL) | 
**amount** | [**BigDecimal**](BigDecimal.md) |  | 
**price** | [**BigDecimal**](BigDecimal.md) |  | 
**triggerPrice** | [**BigDecimal**](BigDecimal.md) | stop price for stop-limit orders. Required if the order is of type STOP_LIMIT_BUY or STOP_LIMIT_SELL |  [optional]

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
BUY | &quot;BUY&quot;
SELL | &quot;SELL&quot;
STOP_LIMIT_BUY | &quot;STOP_LIMIT_BUY&quot;
STOP_LIMIT_SELL | &quot;STOP_LIMIT_SELL&quot;
