# Deposit

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** |  |  [optional]
**currencyId** | **Integer** |  |  [optional]
**currencyCode** | **String** |  |  [optional]
**depositFeeCurrencyId** | **Integer** |  |  [optional]
**depositFeeCurrencyCode** | **String** |  |  [optional]
**amount** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**fee** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**txid** | **String** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**timestamp** | **Integer** |  |  [optional]
**confirmations** | **String** | A string representing the current number of confirmations compared to required number of confirmations |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
PROCESSING | &quot;PROCESSING&quot;
AWAITING_APPROVAL | &quot;AWAITING APPROVAL&quot;
FINISHED | &quot;FINISHED&quot;
CANCELLED_BY_ADMIN | &quot;CANCELLED BY ADMIN&quot;
DEPOSIT_ERROR | &quot;DEPOSIT ERROR&quot;
HODL | &quot;HODL&quot;
