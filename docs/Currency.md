# Currency

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Currency ID |  [optional]
**code** | **String** | Currency code (short name) |  [optional]
**name** | **String** | Currency full name |  [optional]
**active** | **Boolean** | Currency status |  [optional]
**delisted** | **Boolean** | Is currency delisted? |  [optional]
**precision** | **Integer** | The number of the digits after comma |  [optional]
**minimumWithdrawalAmount** | **String** | Minimum amount that can be withdrawn |  [optional]
**minimumDepositAmount** | **String** | Minimum amount that can be deposited |  [optional]
**depositFeeCurrencyId** | **String** | Currency of the fee for deposit |  [optional]
**depositFeeCurrencyCode** | **String** | Currency code of the fee for deposit |  [optional]
**depositFeeConst** | **String** | The fee amount that is taken for deposit (if not calculated as percent) |  [optional]
**depositFeePercent** | **String** | The percent that is taken as deposit fee (if not set in deposit_fee_const) |  [optional]
**withdrawalFeeCurrencyId** | **Integer** | Currency of the fee for withdrawals |  [optional]
**withdrawalFeeCurrencyCode** | **String** | Currency code of the fee for deposit |  [optional]
**withdrawalFeeConst** | **String** | The fee amount that is taken for withdrawal (if not calculated as percent) |  [optional]
**withdrawalFeePercent** | **String** | The percent that is taken as withdrawal fee (if not set in deposit_fee_const) |  [optional]
**blockExplorerUrl** | **String** | Block explorer URL |  [optional]
