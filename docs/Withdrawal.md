# Withdrawal

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** |  |  [optional]
**amount** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**currencyId** | **Integer** |  |  [optional]
**currencyCode** | **String** |  |  [optional]
**fee** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**feeCurrencyId** | **Integer** |  |  [optional]
**feeCurrencyCode** | **String** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**createdTs** | **Integer** |  |  [optional]
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**updatedTs** | **Integer** |  |  [optional]
**txid** | **String** |  |  [optional]
**withdrawalAddress** | [**WalletAddress**](WalletAddress.md) |  |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
NOT_CONFIRMED | &quot;Not Confirmed&quot;
CANCELLED_BY_USER | &quot;Cancelled by User&quot;
AWAITING_APPROVAL | &quot;Awaiting Approval&quot;
APPROVED | &quot;Approved&quot;
PROCESSING | &quot;Processing&quot;
FINISHED | &quot;Finished&quot;
WITHDRAWAL_ERROR | &quot;Withdrawal Error&quot;
CANCELLED_BY_ADMIN | &quot;Cancelled by Admin&quot;
AWAITING | &quot;Awaiting&quot;
