

# BatchTransferCurrencyRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**addresses** | **List&lt;String&gt;** | An array of valid EVM based addresses to transfer currency to. |  [optional] |
|**walletIds** | **List&lt;String&gt;** | An array of wallet ids within the MetaFab ecosystem to transfer currency to. |  [optional] |
|**amounts** | **List&lt;BigDecimal&gt;** | An array of currency amounts to transfer. Ordering corresponds to the ordering of provided &#x60;addresses&#x60; and/or &#x60;walletIds&#x60;. If both &#x60;addresses&#x60; and &#x60;walletIds&#x60; are provided, &#x60;addresses&#x60; are first in the order. |  |
|**references** | **List&lt;BigDecimal&gt;** | An optional array of uint256 numbers to reference each transfer in the batch. Ordering corresponds to the ordering of provided &#x60;addresses&#x60; or &#x60;walletIds&#x60;. If both &#x60;addresses&#x60; and &#x60;walletIds&#x60; are provided, &#x60;addresses&#x60; are first in the order. |  [optional] |



