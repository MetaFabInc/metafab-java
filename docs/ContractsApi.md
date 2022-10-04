# ContractsApi

All URIs are relative to *https://api.trymetafab.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createContract**](ContractsApi.md#createContract) | **POST** /v1/contracts | Create custom contract |
| [**getContracts**](ContractsApi.md#getContracts) | **GET** /v1/contracts | Get contracts |
| [**readContract**](ContractsApi.md#readContract) | **GET** /v1/contracts/{contractId}/reads | Read contract data |
| [**writeContract**](ContractsApi.md#writeContract) | **POST** /v1/contracts/{contractId}/writes | Write contract data |


<a name="createContract"></a>
# **createContract**
> ContractModel createContract(xAuthorization, createContractRequest)

Create custom contract

Create a MetaFab custom contract entry from an existing contract address and contract abi. This allows the game and players belonging to the authenticated game to interact with the contract&#39;s read and write functions through MetaFab&#39;s read and write contract endpoints.

### Example
```java
// Import classes:
import org.metafab.client.ApiClient;
import org.metafab.client.ApiException;
import org.metafab.client.Configuration;
import org.metafab.client.models.*;
import org.metafab.client.api.ContractsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.trymetafab.com");

    ContractsApi apiInstance = new ContractsApi(defaultClient);
    String xAuthorization = "game_sk_02z4Mv3c85Ig0gNowY9Dq0N2kjb1xwzr27ArLE0669RrRI6dLf822iPO26K1p1FP"; // String | The `secretKey` of the authenticating game.
    CreateContractRequest createContractRequest = new CreateContractRequest(); // CreateContractRequest | 
    try {
      ContractModel result = apiInstance.createContract(xAuthorization, createContractRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractsApi#createContract");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **xAuthorization** | **String**| The &#x60;secretKey&#x60; of the authenticating game. | |
| **createContractRequest** | [**CreateContractRequest**](CreateContractRequest.md)|  | |

### Return type

[**ContractModel**](ContractModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully created a MetaFab contract entry. Returns a contract object. |  -  |
| **400** | An API level error occurred. This is often due to problematic data being provided by you. |  -  |
| **401** | An authorization error occured. This is often due to incorrect tokens or keys being provided, or accessing a resource that the provided tokens or keys do not have access to. |  -  |

<a name="getContracts"></a>
# **getContracts**
> List&lt;ContractModel&gt; getContracts(xGameKey)

Get contracts

Returns an array of active contracts deployed by the game associated with the provided &#x60;X-Game-Key&#x60;.

### Example
```java
// Import classes:
import org.metafab.client.ApiClient;
import org.metafab.client.ApiException;
import org.metafab.client.Configuration;
import org.metafab.client.models.*;
import org.metafab.client.api.ContractsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.trymetafab.com");

    ContractsApi apiInstance = new ContractsApi(defaultClient);
    String xGameKey = "game_pk_4SOqpDi8pQdnQgfCOBW29qR8YmwOhxVPz5iHoMgUEJLDdPXgwLuHqZf8ewo2GajZ"; // String | The `publishedKey` of a specific game. This can be shared or included in game clients, websites, etc.
    try {
      List<ContractModel> result = apiInstance.getContracts(xGameKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractsApi#getContracts");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **xGameKey** | **String**| The &#x60;publishedKey&#x60; of a specific game. This can be shared or included in game clients, websites, etc. | |

### Return type

[**List&lt;ContractModel&gt;**](ContractModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved an array of contracts for the game associated with the provided &#x60;X-Game-Key&#x60;. |  -  |
| **400** | An API level error occurred. This is often due to problematic data being provided by you. |  -  |

<a name="readContract"></a>
# **readContract**
> Object readContract(contractId, func, args)

Read contract data

Oftentimes you&#39;ll want to query and retrieve some data from a contract. This is incredibly easy to do for any contract deployed through MetaFab.  Using this endpoint, you can get the data returned by any readable function listed in a contracts ABI. This could be things like querying the totalSupply of a currency contract, the number of owners of an items contract, and more.

### Example
```java
// Import classes:
import org.metafab.client.ApiClient;
import org.metafab.client.ApiException;
import org.metafab.client.Configuration;
import org.metafab.client.models.*;
import org.metafab.client.api.ContractsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.trymetafab.com");

    ContractsApi apiInstance = new ContractsApi(defaultClient);
    String contractId = "contractId_example"; // String | Any contract id within the MetaFab ecosystem.
    String func = "func_example"; // String | A contract function name. This can be any valid function from the the ABI of the contract you are interacting with. For example, `balanceOf`.
    String args = "123,\"Hello\",false"; // String | A comma seperated list of basic data type arguments. This is optional and only necessary if the function being invoked requires arguments per the contract ABI. For example, `123,\"Hello\",false`.
    try {
      Object result = apiInstance.readContract(contractId, func, args);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractsApi#readContract");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **contractId** | **String**| Any contract id within the MetaFab ecosystem. | |
| **func** | **String**| A contract function name. This can be any valid function from the the ABI of the contract you are interacting with. For example, &#x60;balanceOf&#x60;. | |
| **args** | **String**| A comma seperated list of basic data type arguments. This is optional and only necessary if the function being invoked requires arguments per the contract ABI. For example, &#x60;123,\&quot;Hello\&quot;,false&#x60;. | [optional] |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved value returned by contract function. |  -  |
| **400** | An API level error occurred. This is often due to problematic data being provided by you. |  -  |

<a name="writeContract"></a>
# **writeContract**
> TransactionModel writeContract(contractId, xAuthorization, xPassword, writeContractRequest)

Write contract data

MetaFab&#39;s convenience endpoints for contract interactions may not be flexible enough depending on your use case. For these situations, you can interact with contracts and create transactions directly.  Using this endpoint, you can execute a transaction for any writeable contract method as defined in the contract&#39;s ABI for the MetaFab contractId provided. Both Games and Player resources have authority to use this endpoint to execute transactions against any valid MetaFab contractId.  Additionally, MetaFab will automatically attempt to perform a gasless transaction for players interacting with a contract through this endpoint. Gasless transactions by players through this endpoint will only work if the target contract was deployed through MetaFab or supports MetaFab&#39;s ERC2771 trusted forwarder contract.

### Example
```java
// Import classes:
import org.metafab.client.ApiClient;
import org.metafab.client.ApiException;
import org.metafab.client.Configuration;
import org.metafab.client.models.*;
import org.metafab.client.api.ContractsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.trymetafab.com");

    ContractsApi apiInstance = new ContractsApi(defaultClient);
    String contractId = "contractId_example"; // String | Any contract id within the MetaFab ecosystem.
    String xAuthorization = "[\"game_sk_02z4Mv3c85Ig0gNowY9Dq0N2kjb1xwzr27ArLE0669RrRI6dLf822iPO26K1p1FP\",\"player_at_02z4Mv3c85Ig0gNowY9Dq0N2kjb1xwzr27ArLE0669RrRI6dLf822iPO26K1p1FP\"]"; // String | The `secretKey` of a specific game or the `accessToken` of a specific player.
    String xPassword = "mySecurePassword"; // String | The password of the authenticating game or player. Required to decrypt and perform blockchain transactions with the game or player primary wallet.
    WriteContractRequest writeContractRequest = new WriteContractRequest(); // WriteContractRequest | 
    try {
      TransactionModel result = apiInstance.writeContract(contractId, xAuthorization, xPassword, writeContractRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractsApi#writeContract");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **contractId** | **String**| Any contract id within the MetaFab ecosystem. | |
| **xAuthorization** | **String**| The &#x60;secretKey&#x60; of a specific game or the &#x60;accessToken&#x60; of a specific player. | |
| **xPassword** | **String**| The password of the authenticating game or player. Required to decrypt and perform blockchain transactions with the game or player primary wallet. | |
| **writeContractRequest** | [**WriteContractRequest**](WriteContractRequest.md)|  | |

### Return type

[**TransactionModel**](TransactionModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully executed and confirmed the transaction. Returns a transaction object. |  -  |
| **400** | An API level error occurred. This is often due to problematic data being provided by you. |  -  |
| **401** | An authorization error occured. This is often due to incorrect tokens or keys being provided, or accessing a resource that the provided tokens or keys do not have access to. |  -  |

