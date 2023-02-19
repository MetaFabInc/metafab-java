

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
| ARBITRUM | &quot;ARBITRUM&quot; |
| ARBITRUMGOERLI | &quot;ARBITRUMGOERLI&quot; |
| ARBITRUMNOVA | &quot;ARBITRUMNOVA&quot; |
| AVALANCHE | &quot;AVALANCHE&quot; |
| AVALANCHEFUJI | &quot;AVALANCHEFUJI&quot; |
| ETHEREUM | &quot;ETHEREUM&quot; |
| FANTOM | &quot;FANTOM&quot; |
| FANTOMTEST | &quot;FANTOMTEST&quot; |
| GOERLI | &quot;GOERLI&quot; |
| MATIC | &quot;MATIC&quot; |
| MATICMUMBAI | &quot;MATICMUMBAI&quot; |
| THUNDERCORE | &quot;THUNDERCORE&quot; |
| THUNDERCORETESTNET | &quot;THUNDERCORETESTNET&quot; |



