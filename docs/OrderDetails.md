# OrderDetails

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** |  |  [optional]
**currencyPairId** | **Integer** |  |  [optional]
**price** | **String** |  |  [optional]
**initialAmount** | [**BigDecimal**](BigDecimal.md) | Order original amount |  [optional]
**type** | **String** |  |  [optional]
**created** | **String** |  |  [optional]
**timestamp** | **String** |  |  [optional]
**status** | **String** |  |  [optional]
**trades** | [**List&lt;OrderFill&gt;**](OrderFill.md) | A list of trades filled the order |  [optional]
**fees** | [**List&lt;OrderFee&gt;**](OrderFee.md) | A list of fees taken for every trade |  [optional]
