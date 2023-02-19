

# ProfilePermissionsValue

Key should be the contract address, value is the permissions object request for the contract.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**chain** | **String** | The target chain for the contract and related permissions. |  [optional] |
|**scopes** | **List&lt;String&gt;** | An optional array of valid permissioning scopes. |  [optional] |
|**functions** | **List&lt;String&gt;** | An optional array of contract functions to request permission for. |  [optional] |
|**erc20Limit** | **Integer** | A maximum lifetime limit of erc20 that can be tranferred for this contract address. |  [optional] |
|**erc1155Limits** | **Map&lt;String, Integer&gt;** | An object mapping erc1155 ids to maximum lifetime transfer limits of each permitted item id supplied for this contract address. |  [optional] |



