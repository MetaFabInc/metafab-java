

# CreateContractRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**address** | **String** | The address of the existing contract. |  |
|**forwarderAddress** | **String** | The address of the ERC2771 forwarding contract trusted by the contract. |  [optional] |
|**abi** | **String** | JSON of the abi. |  |
|**chain** | [**ChainEnum**](#ChainEnum) | The blockchain you want to deploy this currency on. Support for new blockchains are added over time. |  |



## Enum: ChainEnum

| Name | Value |
|---- | -----|
| ETHEREUM | &quot;ETHEREUM&quot; |
| GOERLI | &quot;GOERLI&quot; |
| MATIC | &quot;MATIC&quot; |
| MATICMUMBAI | &quot;MATICMUMBAI&quot; |
| ARBITRUM | &quot;ARBITRUM&quot; |
| ARBITRUMGOERLI | &quot;ARBITRUMGOERLI&quot; |



