# ItemsApi

All URIs are relative to *https://api.trymetafab.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**batchMintCollectionItems**](ItemsApi.md#batchMintCollectionItems) | **POST** /v1/collections/{collectionId}/batchMints | Batch mint collection items |
| [**batchTransferCollectionItems**](ItemsApi.md#batchTransferCollectionItems) | **POST** /v1/collections/{collectionId}/batchTransfers | Batch transfer collection items |
| [**burnCollectionItem**](ItemsApi.md#burnCollectionItem) | **POST** /v1/collections/{collectionId}/items/{collectionItemId}/burns | Burn collection item |
| [**createCollection**](ItemsApi.md#createCollection) | **POST** /v1/collections | Create collection |
| [**createCollectionItem**](ItemsApi.md#createCollectionItem) | **POST** /v1/collections/{collectionId}/items | Create collection item |
| [**getCollectionApproval**](ItemsApi.md#getCollectionApproval) | **GET** /v1/collections/{collectionId}/approvals | Get collection approval |
| [**getCollectionItem**](ItemsApi.md#getCollectionItem) | **GET** /v1/collections/{collectionId}/items/{collectionItemId} | Get collection item |
| [**getCollectionItemBalance**](ItemsApi.md#getCollectionItemBalance) | **GET** /v1/collections/{collectionId}/items/{collectionItemId}/balances | Get collection item balance |
| [**getCollectionItemBalances**](ItemsApi.md#getCollectionItemBalances) | **GET** /v1/collections/{collectionId}/balances | Get collection item balances |
| [**getCollectionItemSupplies**](ItemsApi.md#getCollectionItemSupplies) | **GET** /v1/collections/{collectionId}/supplies | Get collection item supplies |
| [**getCollectionItemSupply**](ItemsApi.md#getCollectionItemSupply) | **GET** /v1/collections/{collectionId}/items/{collectionItemId}/supplies | Get collection item supply |
| [**getCollectionItemTimelock**](ItemsApi.md#getCollectionItemTimelock) | **GET** /v1/collections/{collectionId}/items/{collectionItemId}/timelocks | Get collection item timelock |
| [**getCollectionItems**](ItemsApi.md#getCollectionItems) | **GET** /v1/collections/{collectionId}/items | Get collection items |
| [**getCollectionRole**](ItemsApi.md#getCollectionRole) | **GET** /v1/collections/{collectionId}/roles | Get collection role |
| [**getCollections**](ItemsApi.md#getCollections) | **GET** /v1/collections | Get collections |
| [**grantCollectionRole**](ItemsApi.md#grantCollectionRole) | **POST** /v1/collections/{collectionId}/roles | Grant collection role |
| [**mintCollectionItem**](ItemsApi.md#mintCollectionItem) | **POST** /v1/collections/{collectionId}/items/{collectionItemId}/mints | Mint collection item |
| [**revokeCollectionRole**](ItemsApi.md#revokeCollectionRole) | **DELETE** /v1/collections/{collectionId}/roles | Revoke collection role |
| [**setCollectionApproval**](ItemsApi.md#setCollectionApproval) | **POST** /v1/collections/{collectionId}/approvals | Set collection approval |
| [**setCollectionItemTimelock**](ItemsApi.md#setCollectionItemTimelock) | **POST** /v1/collections/{collectionId}/items/{collectionItemId}/timelocks | Set collection item timelock |
| [**transferCollectionItem**](ItemsApi.md#transferCollectionItem) | **POST** /v1/collections/{collectionId}/items/{collectionItemId}/transfers | Transfer collection item |


<a name="batchMintCollectionItems"></a>
# **batchMintCollectionItems**
> TransactionModel batchMintCollectionItems(collectionId, xAuthorization, xPassword, batchMintCollectionItemsRequest)

Batch mint collection items

Creates (mints) the provided itemIds of the specified quantities to the provided wallet address or wallet address associated with the provided walletId.

### Example
```java
// Import classes:
import org.metafab.client.ApiClient;
import org.metafab.client.ApiException;
import org.metafab.client.Configuration;
import org.metafab.client.models.*;
import org.metafab.client.api.ItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.trymetafab.com");

    ItemsApi apiInstance = new ItemsApi(defaultClient);
    String collectionId = "collectionId_example"; // String | Any collection id within the MetaFab ecosystem.
    String xAuthorization = "game_sk_02z4Mv3c85Ig0gNowY9Dq0N2kjb1xwzr27ArLE0669RrRI6dLf822iPO26K1p1FP"; // String | The `secretKey` of the authenticating game.
    String xPassword = "mySecurePassword"; // String | The password of the authenticating game. Required to decrypt and perform blockchain transactions with the game primary wallet.
    BatchMintCollectionItemsRequest batchMintCollectionItemsRequest = new BatchMintCollectionItemsRequest(); // BatchMintCollectionItemsRequest | 
    try {
      TransactionModel result = apiInstance.batchMintCollectionItems(collectionId, xAuthorization, xPassword, batchMintCollectionItemsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#batchMintCollectionItems");
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
| **collectionId** | **String**| Any collection id within the MetaFab ecosystem. | |
| **xAuthorization** | **String**| The &#x60;secretKey&#x60; of the authenticating game. | |
| **xPassword** | **String**| The password of the authenticating game. Required to decrypt and perform blockchain transactions with the game primary wallet. | |
| **batchMintCollectionItemsRequest** | [**BatchMintCollectionItemsRequest**](BatchMintCollectionItemsRequest.md)|  | |

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
| **200** | Successfully created (minted) the provided items of the provided quantities to the provided wallet address or wallet address of the provided walletId. Returns a transaction object. |  -  |
| **400** | An API level error occurred. This is often due to problematic data being provided by you. |  -  |
| **401** | An authorization error occured. This is often due to incorrect tokens or keys being provided, or accessing a resource that the provided tokens or keys do not have access to. |  -  |

<a name="batchTransferCollectionItems"></a>
# **batchTransferCollectionItems**
> TransactionModel batchTransferCollectionItems(collectionId, xAuthorization, xPassword, batchTransferCollectionItemsRequest)

Batch transfer collection items

Transfers one or multiple items of specified quantities to the provided wallet addresses or wallet addresses associated with the provided walletIds. You may also provide a combination of addresses and walletIds in one request.

### Example
```java
// Import classes:
import org.metafab.client.ApiClient;
import org.metafab.client.ApiException;
import org.metafab.client.Configuration;
import org.metafab.client.models.*;
import org.metafab.client.api.ItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.trymetafab.com");

    ItemsApi apiInstance = new ItemsApi(defaultClient);
    String collectionId = "collectionId_example"; // String | Any collection id within the MetaFab ecosystem.
    String xAuthorization = "[\"game_sk_02z4Mv3c85Ig0gNowY9Dq0N2kjb1xwzr27ArLE0669RrRI6dLf822iPO26K1p1FP\",\"player_at_02z4Mv3c85Ig0gNowY9Dq0N2kjb1xwzr27ArLE0669RrRI6dLf822iPO26K1p1FP\"]"; // String | The `secretKey` of a specific game or the `accessToken` of a specific player.
    String xPassword = "mySecurePassword"; // String | The password of the authenticating game or player. Required to decrypt and perform blockchain transactions with the game or player primary wallet.
    BatchTransferCollectionItemsRequest batchTransferCollectionItemsRequest = new BatchTransferCollectionItemsRequest(); // BatchTransferCollectionItemsRequest | 
    try {
      TransactionModel result = apiInstance.batchTransferCollectionItems(collectionId, xAuthorization, xPassword, batchTransferCollectionItemsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#batchTransferCollectionItems");
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
| **collectionId** | **String**| Any collection id within the MetaFab ecosystem. | |
| **xAuthorization** | **String**| The &#x60;secretKey&#x60; of a specific game or the &#x60;accessToken&#x60; of a specific player. | |
| **xPassword** | **String**| The password of the authenticating game or player. Required to decrypt and perform blockchain transactions with the game or player primary wallet. | |
| **batchTransferCollectionItemsRequest** | [**BatchTransferCollectionItemsRequest**](BatchTransferCollectionItemsRequest.md)|  | |

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
| **200** | Successfully transferred the itemIds of the provided quantities to each of the provided wallet addresses and/or wallet addresses of the provided walletIds. Returns a transaction object. |  -  |
| **400** | An API level error occurred. This is often due to problematic data being provided by you. |  -  |
| **401** | An authorization error occured. This is often due to incorrect tokens or keys being provided, or accessing a resource that the provided tokens or keys do not have access to. |  -  |

<a name="burnCollectionItem"></a>
# **burnCollectionItem**
> TransactionModel burnCollectionItem(collectionId, collectionItemId, xAuthorization, xPassword, burnCollectionItemRequest)

Burn collection item

Removes (burns) the provided quantity of the collectionItemId from the authenticating game or players wallet. The quantity is permanently removed from the circulating supply of the item.

### Example
```java
// Import classes:
import org.metafab.client.ApiClient;
import org.metafab.client.ApiException;
import org.metafab.client.Configuration;
import org.metafab.client.models.*;
import org.metafab.client.api.ItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.trymetafab.com");

    ItemsApi apiInstance = new ItemsApi(defaultClient);
    String collectionId = "collectionId_example"; // String | Any collection id within the MetaFab ecosystem.
    BigDecimal collectionItemId = new BigDecimal(78); // BigDecimal | Any item id for the collection. Zero, or a positive integer.
    String xAuthorization = "[\"game_sk_02z4Mv3c85Ig0gNowY9Dq0N2kjb1xwzr27ArLE0669RrRI6dLf822iPO26K1p1FP\",\"player_at_02z4Mv3c85Ig0gNowY9Dq0N2kjb1xwzr27ArLE0669RrRI6dLf822iPO26K1p1FP\"]"; // String | The `secretKey` of a specific game or the `accessToken` of a specific player.
    String xPassword = "mySecurePassword"; // String | The password of the authenticating game or player. Required to decrypt and perform blockchain transactions with the game or player primary wallet.
    BurnCollectionItemRequest burnCollectionItemRequest = new BurnCollectionItemRequest(); // BurnCollectionItemRequest | 
    try {
      TransactionModel result = apiInstance.burnCollectionItem(collectionId, collectionItemId, xAuthorization, xPassword, burnCollectionItemRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#burnCollectionItem");
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
| **collectionId** | **String**| Any collection id within the MetaFab ecosystem. | |
| **collectionItemId** | **BigDecimal**| Any item id for the collection. Zero, or a positive integer. | |
| **xAuthorization** | **String**| The &#x60;secretKey&#x60; of a specific game or the &#x60;accessToken&#x60; of a specific player. | |
| **xPassword** | **String**| The password of the authenticating game or player. Required to decrypt and perform blockchain transactions with the game or player primary wallet. | |
| **burnCollectionItemRequest** | [**BurnCollectionItemRequest**](BurnCollectionItemRequest.md)|  | |

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
| **200** | Successfully removed (burned) the quantity of the collectionItemId from the authenticating game or player&#39;s wallet. Returns a transaction object. |  -  |
| **400** | An API level error occurred. This is often due to problematic data being provided by you. |  -  |
| **401** | An authorization error occured. This is often due to incorrect tokens or keys being provided, or accessing a resource that the provided tokens or keys do not have access to. |  -  |

<a name="createCollection"></a>
# **createCollection**
> CreateCollection200Response createCollection(xAuthorization, xPassword, createCollectionRequest)

Create collection

Creates a new game item collection and deploys an extended functionality ERC1155 contract on behalf of the authenticating game&#39;s primary wallet. The deployed ERC1155 contract is preconfigured to fully support creating unique item types, item transfer timelocks, custom metadata per item, gasless transactions from player managed wallets, and much more.

### Example
```java
// Import classes:
import org.metafab.client.ApiClient;
import org.metafab.client.ApiException;
import org.metafab.client.Configuration;
import org.metafab.client.models.*;
import org.metafab.client.api.ItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.trymetafab.com");

    ItemsApi apiInstance = new ItemsApi(defaultClient);
    String xAuthorization = "game_sk_02z4Mv3c85Ig0gNowY9Dq0N2kjb1xwzr27ArLE0669RrRI6dLf822iPO26K1p1FP"; // String | The `secretKey` of the authenticating game.
    String xPassword = "mySecurePassword"; // String | The password of the authenticating game. Required to decrypt and perform blockchain transactions with the game primary wallet.
    CreateCollectionRequest createCollectionRequest = new CreateCollectionRequest(); // CreateCollectionRequest | 
    try {
      CreateCollection200Response result = apiInstance.createCollection(xAuthorization, xPassword, createCollectionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#createCollection");
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
| **xPassword** | **String**| The password of the authenticating game. Required to decrypt and perform blockchain transactions with the game primary wallet. | |
| **createCollectionRequest** | [**CreateCollectionRequest**](CreateCollectionRequest.md)|  | |

### Return type

[**CreateCollection200Response**](CreateCollection200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully created a new item collection and deployed its associated ERC1155 contract on the chain specified. Returns a collection object containing a contract property with the deployment transaction. |  -  |
| **400** | An API level error occurred. This is often due to problematic data being provided by you. |  -  |
| **401** | An authorization error occured. This is often due to incorrect tokens or keys being provided, or accessing a resource that the provided tokens or keys do not have access to. |  -  |

<a name="createCollectionItem"></a>
# **createCollectionItem**
> TransactionModel createCollectionItem(collectionId, xAuthorization, xPassword, createCollectionItemRequest)

Create collection item

Creates a new item type. Item type creation associates all of the relevant item data to a specific itemId. Such as item name, image, description, attributes, any arbitrary data such as 2D or 3D model resolver URLs, and more. It is recommended, but not required, that you create a new item type through this endpoint before minting any quantity of the related itemId.  Any itemId provided will have its existing item type overriden if it already exists.  Item type data is uploaded to, and resolved through IPFS for decentralized persistence.

### Example
```java
// Import classes:
import org.metafab.client.ApiClient;
import org.metafab.client.ApiException;
import org.metafab.client.Configuration;
import org.metafab.client.models.*;
import org.metafab.client.api.ItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.trymetafab.com");

    ItemsApi apiInstance = new ItemsApi(defaultClient);
    String collectionId = "collectionId_example"; // String | Any collection id within the MetaFab ecosystem.
    String xAuthorization = "game_sk_02z4Mv3c85Ig0gNowY9Dq0N2kjb1xwzr27ArLE0669RrRI6dLf822iPO26K1p1FP"; // String | The `secretKey` of the authenticating game.
    String xPassword = "mySecurePassword"; // String | The password of the authenticating game. Required to decrypt and perform blockchain transactions with the game primary wallet.
    CreateCollectionItemRequest createCollectionItemRequest = new CreateCollectionItemRequest(); // CreateCollectionItemRequest | 
    try {
      TransactionModel result = apiInstance.createCollectionItem(collectionId, xAuthorization, xPassword, createCollectionItemRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#createCollectionItem");
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
| **collectionId** | **String**| Any collection id within the MetaFab ecosystem. | |
| **xAuthorization** | **String**| The &#x60;secretKey&#x60; of the authenticating game. | |
| **xPassword** | **String**| The password of the authenticating game. Required to decrypt and perform blockchain transactions with the game primary wallet. | |
| **createCollectionItemRequest** | [**CreateCollectionItemRequest**](CreateCollectionItemRequest.md)|  | |

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
| **200** | Successfully created a new item type and assigned it to the provided item &#x60;id&#x60;. Returns a transaction object. |  -  |
| **400** | An API level error occurred. This is often due to problematic data being provided by you. |  -  |
| **401** | An authorization error occured. This is often due to incorrect tokens or keys being provided, or accessing a resource that the provided tokens or keys do not have access to. |  -  |

<a name="getCollectionApproval"></a>
# **getCollectionApproval**
> Boolean getCollectionApproval(collectionId, operatorAddress, address, walletId)

Get collection approval

Returns a boolean (true/false) representing if the provided operatorAddress has approval to transfer and burn items from the current collection owned by the address or address associated with the provided walletId.

### Example
```java
// Import classes:
import org.metafab.client.ApiClient;
import org.metafab.client.ApiException;
import org.metafab.client.Configuration;
import org.metafab.client.models.*;
import org.metafab.client.api.ItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.trymetafab.com");

    ItemsApi apiInstance = new ItemsApi(defaultClient);
    String collectionId = "collectionId_example"; // String | Any collection id within the MetaFab ecosystem.
    String operatorAddress = "0x39cb70F972E0EE920088AeF97Dbe5c6251a9c25D"; // String | A valid EVM based address. For example, `0x39cb70F972E0EE920088AeF97Dbe5c6251a9c25D`.
    String address = "0x39cb70F972E0EE920088AeF97Dbe5c6251a9c25D"; // String | A valid EVM based address. For example, `0x39cb70F972E0EE920088AeF97Dbe5c6251a9c25D`.
    String walletId = "walletId_example"; // String | Any wallet id within the MetaFab ecosystem.
    try {
      Boolean result = apiInstance.getCollectionApproval(collectionId, operatorAddress, address, walletId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#getCollectionApproval");
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
| **collectionId** | **String**| Any collection id within the MetaFab ecosystem. | |
| **operatorAddress** | **String**| A valid EVM based address. For example, &#x60;0x39cb70F972E0EE920088AeF97Dbe5c6251a9c25D&#x60;. | |
| **address** | **String**| A valid EVM based address. For example, &#x60;0x39cb70F972E0EE920088AeF97Dbe5c6251a9c25D&#x60;. | [optional] |
| **walletId** | **String**| Any wallet id within the MetaFab ecosystem. | [optional] |

### Return type

**Boolean**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved the boolean value representing if the provided operatorAddress can transfer and burn owned items by the provided address or walletId. |  -  |
| **400** | An API level error occurred. This is often due to problematic data being provided by you. |  -  |

<a name="getCollectionItem"></a>
# **getCollectionItem**
> List&lt;Object&gt; getCollectionItem(collectionId, collectionItemId)

Get collection item

Returns a metadata object for the provided collectionItemId.

### Example
```java
// Import classes:
import org.metafab.client.ApiClient;
import org.metafab.client.ApiException;
import org.metafab.client.Configuration;
import org.metafab.client.models.*;
import org.metafab.client.api.ItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.trymetafab.com");

    ItemsApi apiInstance = new ItemsApi(defaultClient);
    String collectionId = "collectionId_example"; // String | Any collection id within the MetaFab ecosystem.
    BigDecimal collectionItemId = new BigDecimal(78); // BigDecimal | Any item id for the collection. Zero, or a positive integer.
    try {
      List<Object> result = apiInstance.getCollectionItem(collectionId, collectionItemId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#getCollectionItem");
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
| **collectionId** | **String**| Any collection id within the MetaFab ecosystem. | |
| **collectionItemId** | **BigDecimal**| Any item id for the collection. Zero, or a positive integer. | |

### Return type

**List&lt;Object&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved collection item metadata. |  -  |
| **400** | An API level error occurred. This is often due to problematic data being provided by you. |  -  |

<a name="getCollectionItemBalance"></a>
# **getCollectionItemBalance**
> BigDecimal getCollectionItemBalance(collectionId, collectionItemId, address, walletId)

Get collection item balance

Returns the current collection item balance of the provided collectionItemId for the provided wallet address or the wallet address associated with the provided walletId.

### Example
```java
// Import classes:
import org.metafab.client.ApiClient;
import org.metafab.client.ApiException;
import org.metafab.client.Configuration;
import org.metafab.client.models.*;
import org.metafab.client.api.ItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.trymetafab.com");

    ItemsApi apiInstance = new ItemsApi(defaultClient);
    String collectionId = "collectionId_example"; // String | Any collection id within the MetaFab ecosystem.
    BigDecimal collectionItemId = new BigDecimal(78); // BigDecimal | Any item id for the collection. Zero, or a positive integer.
    String address = "0x39cb70F972E0EE920088AeF97Dbe5c6251a9c25D"; // String | A valid EVM based address. For example, `0x39cb70F972E0EE920088AeF97Dbe5c6251a9c25D`.
    String walletId = "walletId_example"; // String | Any wallet id within the MetaFab ecosystem.
    try {
      BigDecimal result = apiInstance.getCollectionItemBalance(collectionId, collectionItemId, address, walletId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#getCollectionItemBalance");
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
| **collectionId** | **String**| Any collection id within the MetaFab ecosystem. | |
| **collectionItemId** | **BigDecimal**| Any item id for the collection. Zero, or a positive integer. | |
| **address** | **String**| A valid EVM based address. For example, &#x60;0x39cb70F972E0EE920088AeF97Dbe5c6251a9c25D&#x60;. | [optional] |
| **walletId** | **String**| Any wallet id within the MetaFab ecosystem. | [optional] |

### Return type

[**BigDecimal**](BigDecimal.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved collection item balance of the provided collectionItemId for address or walletId. Balance is returned as a string to handle uint256 numbers. |  -  |
| **400** | An API level error occurred. This is often due to problematic data being provided by you. |  -  |

<a name="getCollectionItemBalances"></a>
# **getCollectionItemBalances**
> Map&lt;String, BigDecimal&gt; getCollectionItemBalances(collectionId, address, walletId)

Get collection item balances

Returns the current collection item balances of all collection items for the provided wallet address or the wallet address associated with the provided walletId.

### Example
```java
// Import classes:
import org.metafab.client.ApiClient;
import org.metafab.client.ApiException;
import org.metafab.client.Configuration;
import org.metafab.client.models.*;
import org.metafab.client.api.ItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.trymetafab.com");

    ItemsApi apiInstance = new ItemsApi(defaultClient);
    String collectionId = "collectionId_example"; // String | Any collection id within the MetaFab ecosystem.
    String address = "0x39cb70F972E0EE920088AeF97Dbe5c6251a9c25D"; // String | A valid EVM based address. For example, `0x39cb70F972E0EE920088AeF97Dbe5c6251a9c25D`.
    String walletId = "walletId_example"; // String | Any wallet id within the MetaFab ecosystem.
    try {
      Map<String, BigDecimal> result = apiInstance.getCollectionItemBalances(collectionId, address, walletId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#getCollectionItemBalances");
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
| **collectionId** | **String**| Any collection id within the MetaFab ecosystem. | |
| **address** | **String**| A valid EVM based address. For example, &#x60;0x39cb70F972E0EE920088AeF97Dbe5c6251a9c25D&#x60;. | [optional] |
| **walletId** | **String**| Any wallet id within the MetaFab ecosystem. | [optional] |

### Return type

[**Map&lt;String, BigDecimal&gt;**](BigDecimal.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved currency balances of all collection items owned by the provided address or walletId. Balances are returned as a an object, mapping key value pairs as itemId -&gt; balance (string to handle uint256 numbers). |  -  |
| **400** | An API level error occurred. This is often due to problematic data being provided by you. |  -  |

<a name="getCollectionItemSupplies"></a>
# **getCollectionItemSupplies**
> Map&lt;String, BigDecimal&gt; getCollectionItemSupplies(collectionId)

Get collection item supplies

Returns the currency circulating supply of all collection items.

### Example
```java
// Import classes:
import org.metafab.client.ApiClient;
import org.metafab.client.ApiException;
import org.metafab.client.Configuration;
import org.metafab.client.models.*;
import org.metafab.client.api.ItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.trymetafab.com");

    ItemsApi apiInstance = new ItemsApi(defaultClient);
    String collectionId = "collectionId_example"; // String | Any collection id within the MetaFab ecosystem.
    try {
      Map<String, BigDecimal> result = apiInstance.getCollectionItemSupplies(collectionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#getCollectionItemSupplies");
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
| **collectionId** | **String**| Any collection id within the MetaFab ecosystem. | |

### Return type

[**Map&lt;String, BigDecimal&gt;**](BigDecimal.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved the circulating supply of all collection items. Supplies are returned as a an object, mapping key value pairs as itemId -&gt; balance (string to handle uint256 numbers). |  -  |
| **400** | An API level error occurred. This is often due to problematic data being provided by you. |  -  |

<a name="getCollectionItemSupply"></a>
# **getCollectionItemSupply**
> BigDecimal getCollectionItemSupply(collectionId, collectionItemId, address, walletId)

Get collection item supply

Returns the current circulating supply of the provided collectionItemId.

### Example
```java
// Import classes:
import org.metafab.client.ApiClient;
import org.metafab.client.ApiException;
import org.metafab.client.Configuration;
import org.metafab.client.models.*;
import org.metafab.client.api.ItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.trymetafab.com");

    ItemsApi apiInstance = new ItemsApi(defaultClient);
    String collectionId = "collectionId_example"; // String | Any collection id within the MetaFab ecosystem.
    BigDecimal collectionItemId = new BigDecimal(78); // BigDecimal | Any item id for the collection. Zero, or a positive integer.
    String address = "0x39cb70F972E0EE920088AeF97Dbe5c6251a9c25D"; // String | A valid EVM based address. For example, `0x39cb70F972E0EE920088AeF97Dbe5c6251a9c25D`.
    String walletId = "walletId_example"; // String | Any wallet id within the MetaFab ecosystem.
    try {
      BigDecimal result = apiInstance.getCollectionItemSupply(collectionId, collectionItemId, address, walletId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#getCollectionItemSupply");
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
| **collectionId** | **String**| Any collection id within the MetaFab ecosystem. | |
| **collectionItemId** | **BigDecimal**| Any item id for the collection. Zero, or a positive integer. | |
| **address** | **String**| A valid EVM based address. For example, &#x60;0x39cb70F972E0EE920088AeF97Dbe5c6251a9c25D&#x60;. | [optional] |
| **walletId** | **String**| Any wallet id within the MetaFab ecosystem. | [optional] |

### Return type

[**BigDecimal**](BigDecimal.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved collection item supply. Supply is returned as a string to handle uint256 numbers. |  -  |
| **400** | An API level error occurred. This is often due to problematic data being provided by you. |  -  |

<a name="getCollectionItemTimelock"></a>
# **getCollectionItemTimelock**
> BigDecimal getCollectionItemTimelock(collectionId, collectionItemId)

Get collection item timelock

Returns a timestamp (in seconds) for when the provided collectionItemId&#39;s transfer timelock expires. A value of 0 means the provided collectionItemId does not have a timelock set. Timelocks prevent items of a specific collectionItemId from being transferred until the set timelock timestamp has been surpassed.

### Example
```java
// Import classes:
import org.metafab.client.ApiClient;
import org.metafab.client.ApiException;
import org.metafab.client.Configuration;
import org.metafab.client.models.*;
import org.metafab.client.api.ItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.trymetafab.com");

    ItemsApi apiInstance = new ItemsApi(defaultClient);
    String collectionId = "collectionId_example"; // String | Any collection id within the MetaFab ecosystem.
    BigDecimal collectionItemId = new BigDecimal(78); // BigDecimal | Any item id for the collection. Zero, or a positive integer.
    try {
      BigDecimal result = apiInstance.getCollectionItemTimelock(collectionId, collectionItemId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#getCollectionItemTimelock");
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
| **collectionId** | **String**| Any collection id within the MetaFab ecosystem. | |
| **collectionItemId** | **BigDecimal**| Any item id for the collection. Zero, or a positive integer. | |

### Return type

[**BigDecimal**](BigDecimal.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved the collectionItemId&#39;s timelock. The timelock is returned as a unix timestamp in seconds. A return value of 0 means the collectionItemId does not have a timelock set. |  -  |
| **400** | An API level error occurred. This is often due to problematic data being provided by you. |  -  |

<a name="getCollectionItems"></a>
# **getCollectionItems**
> List&lt;Object&gt; getCollectionItems(collectionId)

Get collection items

Returns all collection items as an array of metadata objects.  Please note that ONLY items that have had at least 1 quantity minted will be returned. If you&#39;ve created an item that has not been minted yet, it will not be returned in the array response.

### Example
```java
// Import classes:
import org.metafab.client.ApiClient;
import org.metafab.client.ApiException;
import org.metafab.client.Configuration;
import org.metafab.client.models.*;
import org.metafab.client.api.ItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.trymetafab.com");

    ItemsApi apiInstance = new ItemsApi(defaultClient);
    String collectionId = "collectionId_example"; // String | Any collection id within the MetaFab ecosystem.
    try {
      List<Object> result = apiInstance.getCollectionItems(collectionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#getCollectionItems");
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
| **collectionId** | **String**| Any collection id within the MetaFab ecosystem. | |

### Return type

**List&lt;Object&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved collection items metadata. |  -  |
| **400** | An API level error occurred. This is often due to problematic data being provided by you. |  -  |

<a name="getCollectionRole"></a>
# **getCollectionRole**
> Boolean getCollectionRole(collectionId, role, address, walletId)

Get collection role

Returns a boolean (true/false) representing if the provided role for this collection has been granted to the provided address or address associated with the provided walletId.

### Example
```java
// Import classes:
import org.metafab.client.ApiClient;
import org.metafab.client.ApiException;
import org.metafab.client.Configuration;
import org.metafab.client.models.*;
import org.metafab.client.api.ItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.trymetafab.com");

    ItemsApi apiInstance = new ItemsApi(defaultClient);
    String collectionId = "collectionId_example"; // String | Any collection id within the MetaFab ecosystem.
    String role = "minter"; // String | A valid MetaFab role or bytes string representing a role, such as `0xc9eb32e43bf5ecbceacf00b32281dfc5d6d700a0db676ea26ccf938a385ac3b7`
    String address = "0x39cb70F972E0EE920088AeF97Dbe5c6251a9c25D"; // String | A valid EVM based address. For example, `0x39cb70F972E0EE920088AeF97Dbe5c6251a9c25D`.
    String walletId = "walletId_example"; // String | Any wallet id within the MetaFab ecosystem.
    try {
      Boolean result = apiInstance.getCollectionRole(collectionId, role, address, walletId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#getCollectionRole");
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
| **collectionId** | **String**| Any collection id within the MetaFab ecosystem. | |
| **role** | **String**| A valid MetaFab role or bytes string representing a role, such as &#x60;0xc9eb32e43bf5ecbceacf00b32281dfc5d6d700a0db676ea26ccf938a385ac3b7&#x60; | |
| **address** | **String**| A valid EVM based address. For example, &#x60;0x39cb70F972E0EE920088AeF97Dbe5c6251a9c25D&#x60;. | [optional] |
| **walletId** | **String**| Any wallet id within the MetaFab ecosystem. | [optional] |

### Return type

**Boolean**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved the boolean value representing if the provided role has been granted to the provided address or walletId. |  -  |
| **400** | An API level error occurred. This is often due to problematic data being provided by you. |  -  |

<a name="getCollections"></a>
# **getCollections**
> List&lt;GetCollections200ResponseInner&gt; getCollections(xGameKey)

Get collections

Returns an array of active item collections for the game associated with the provided &#x60;X-Game-Key&#x60;.

### Example
```java
// Import classes:
import org.metafab.client.ApiClient;
import org.metafab.client.ApiException;
import org.metafab.client.Configuration;
import org.metafab.client.models.*;
import org.metafab.client.api.ItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.trymetafab.com");

    ItemsApi apiInstance = new ItemsApi(defaultClient);
    String xGameKey = "game_pk_4SOqpDi8pQdnQgfCOBW29qR8YmwOhxVPz5iHoMgUEJLDdPXgwLuHqZf8ewo2GajZ"; // String | The `publishedKey` of a specific game. This can be shared or included in game clients, websites, etc.
    try {
      List<GetCollections200ResponseInner> result = apiInstance.getCollections(xGameKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#getCollections");
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

[**List&lt;GetCollections200ResponseInner&gt;**](GetCollections200ResponseInner.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved an array of item collections for the game associated with the provided &#x60;X-Game-Key&#x60; |  -  |
| **400** | An API level error occurred. This is often due to problematic data being provided by you. |  -  |

<a name="grantCollectionRole"></a>
# **grantCollectionRole**
> TransactionModel grantCollectionRole(collectionId, xAuthorization, xPassword, grantCollectionRoleRequest)

Grant collection role

Grants the provided role for the collection to the provided address or address associated with the provided walletId. Granted roles give different types of authority on behalf of the collection for specific players, addresses, or contracts to perform different types of permissioned collection operations.

### Example
```java
// Import classes:
import org.metafab.client.ApiClient;
import org.metafab.client.ApiException;
import org.metafab.client.Configuration;
import org.metafab.client.models.*;
import org.metafab.client.api.ItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.trymetafab.com");

    ItemsApi apiInstance = new ItemsApi(defaultClient);
    String collectionId = "collectionId_example"; // String | Any collection id within the MetaFab ecosystem.
    String xAuthorization = "[\"game_sk_02z4Mv3c85Ig0gNowY9Dq0N2kjb1xwzr27ArLE0669RrRI6dLf822iPO26K1p1FP\",\"player_at_02z4Mv3c85Ig0gNowY9Dq0N2kjb1xwzr27ArLE0669RrRI6dLf822iPO26K1p1FP\"]"; // String | The `secretKey` of a specific game or the `accessToken` of a specific player.
    String xPassword = "mySecurePassword"; // String | The password of the authenticating game or player. Required to decrypt and perform blockchain transactions with the game or player primary wallet.
    GrantCollectionRoleRequest grantCollectionRoleRequest = new GrantCollectionRoleRequest(); // GrantCollectionRoleRequest | 
    try {
      TransactionModel result = apiInstance.grantCollectionRole(collectionId, xAuthorization, xPassword, grantCollectionRoleRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#grantCollectionRole");
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
| **collectionId** | **String**| Any collection id within the MetaFab ecosystem. | |
| **xAuthorization** | **String**| The &#x60;secretKey&#x60; of a specific game or the &#x60;accessToken&#x60; of a specific player. | |
| **xPassword** | **String**| The password of the authenticating game or player. Required to decrypt and perform blockchain transactions with the game or player primary wallet. | |
| **grantCollectionRoleRequest** | [**GrantCollectionRoleRequest**](GrantCollectionRoleRequest.md)|  | |

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
| **200** | Successfully granted the provided role to the provided address or address associated with the provided walletId. |  -  |
| **400** | An API level error occurred. This is often due to problematic data being provided by you. |  -  |
| **401** | An authorization error occured. This is often due to incorrect tokens or keys being provided, or accessing a resource that the provided tokens or keys do not have access to. |  -  |

<a name="mintCollectionItem"></a>
# **mintCollectionItem**
> TransactionModel mintCollectionItem(collectionId, collectionItemId, xAuthorization, xPassword, mintCollectionItemRequest)

Mint collection item

Creates (mints) the specified quantity of the provided collectionItemId to the provided wallet address or wallet address associated with the provided walletId.

### Example
```java
// Import classes:
import org.metafab.client.ApiClient;
import org.metafab.client.ApiException;
import org.metafab.client.Configuration;
import org.metafab.client.models.*;
import org.metafab.client.api.ItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.trymetafab.com");

    ItemsApi apiInstance = new ItemsApi(defaultClient);
    String collectionId = "collectionId_example"; // String | Any collection id within the MetaFab ecosystem.
    BigDecimal collectionItemId = new BigDecimal(78); // BigDecimal | Any item id for the collection. Zero, or a positive integer.
    String xAuthorization = "game_sk_02z4Mv3c85Ig0gNowY9Dq0N2kjb1xwzr27ArLE0669RrRI6dLf822iPO26K1p1FP"; // String | The `secretKey` of the authenticating game.
    String xPassword = "mySecurePassword"; // String | The password of the authenticating game. Required to decrypt and perform blockchain transactions with the game primary wallet.
    MintCollectionItemRequest mintCollectionItemRequest = new MintCollectionItemRequest(); // MintCollectionItemRequest | 
    try {
      TransactionModel result = apiInstance.mintCollectionItem(collectionId, collectionItemId, xAuthorization, xPassword, mintCollectionItemRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#mintCollectionItem");
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
| **collectionId** | **String**| Any collection id within the MetaFab ecosystem. | |
| **collectionItemId** | **BigDecimal**| Any item id for the collection. Zero, or a positive integer. | |
| **xAuthorization** | **String**| The &#x60;secretKey&#x60; of the authenticating game. | |
| **xPassword** | **String**| The password of the authenticating game. Required to decrypt and perform blockchain transactions with the game primary wallet. | |
| **mintCollectionItemRequest** | [**MintCollectionItemRequest**](MintCollectionItemRequest.md)|  | |

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
| **200** | Successfully created (minted) the item(s) to the provided wallet address or wallet address of the provided walletId. Returns a transaction object. |  -  |
| **400** | An API level error occurred. This is often due to problematic data being provided by you. |  -  |
| **401** | An authorization error occured. This is often due to incorrect tokens or keys being provided, or accessing a resource that the provided tokens or keys do not have access to. |  -  |

<a name="revokeCollectionRole"></a>
# **revokeCollectionRole**
> TransactionModel revokeCollectionRole(collectionId, xAuthorization, xPassword, revokeCollectionRoleRequest)

Revoke collection role

Revokes the provided role for the collection to the provided address or address associated with the provided walletId.

### Example
```java
// Import classes:
import org.metafab.client.ApiClient;
import org.metafab.client.ApiException;
import org.metafab.client.Configuration;
import org.metafab.client.models.*;
import org.metafab.client.api.ItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.trymetafab.com");

    ItemsApi apiInstance = new ItemsApi(defaultClient);
    String collectionId = "collectionId_example"; // String | Any collection id within the MetaFab ecosystem.
    String xAuthorization = "[\"game_sk_02z4Mv3c85Ig0gNowY9Dq0N2kjb1xwzr27ArLE0669RrRI6dLf822iPO26K1p1FP\",\"player_at_02z4Mv3c85Ig0gNowY9Dq0N2kjb1xwzr27ArLE0669RrRI6dLf822iPO26K1p1FP\"]"; // String | The `secretKey` of a specific game or the `accessToken` of a specific player.
    String xPassword = "mySecurePassword"; // String | The password of the authenticating game or player. Required to decrypt and perform blockchain transactions with the game or player primary wallet.
    RevokeCollectionRoleRequest revokeCollectionRoleRequest = new RevokeCollectionRoleRequest(); // RevokeCollectionRoleRequest | 
    try {
      TransactionModel result = apiInstance.revokeCollectionRole(collectionId, xAuthorization, xPassword, revokeCollectionRoleRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#revokeCollectionRole");
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
| **collectionId** | **String**| Any collection id within the MetaFab ecosystem. | |
| **xAuthorization** | **String**| The &#x60;secretKey&#x60; of a specific game or the &#x60;accessToken&#x60; of a specific player. | |
| **xPassword** | **String**| The password of the authenticating game or player. Required to decrypt and perform blockchain transactions with the game or player primary wallet. | |
| **revokeCollectionRoleRequest** | [**RevokeCollectionRoleRequest**](RevokeCollectionRoleRequest.md)|  | |

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
| **200** | Successfully revoked the provided role from the provided address or address associated with the provided walletId. Returns a transaction object. |  -  |
| **400** | An API level error occurred. This is often due to problematic data being provided by you. |  -  |
| **401** | An authorization error occured. This is often due to incorrect tokens or keys being provided, or accessing a resource that the provided tokens or keys do not have access to. |  -  |

<a name="setCollectionApproval"></a>
# **setCollectionApproval**
> TransactionModel setCollectionApproval(collectionId, xAuthorization, xPassword, setCollectionApprovalRequest)

Set collection approval

Sets approval for the provided address or wallet address associated with the provided walletId to operate on behalf of the authenticating game or player&#39;s owned items for this collection. Setting an approved value of &#x60;true&#x60; allows the provided address or address associated with the provided walletId to transfer and burn items from this collection on behalf of the authenticated game or player&#39;s wallet address.

### Example
```java
// Import classes:
import org.metafab.client.ApiClient;
import org.metafab.client.ApiException;
import org.metafab.client.Configuration;
import org.metafab.client.models.*;
import org.metafab.client.api.ItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.trymetafab.com");

    ItemsApi apiInstance = new ItemsApi(defaultClient);
    String collectionId = "collectionId_example"; // String | Any collection id within the MetaFab ecosystem.
    String xAuthorization = "[\"game_sk_02z4Mv3c85Ig0gNowY9Dq0N2kjb1xwzr27ArLE0669RrRI6dLf822iPO26K1p1FP\",\"player_at_02z4Mv3c85Ig0gNowY9Dq0N2kjb1xwzr27ArLE0669RrRI6dLf822iPO26K1p1FP\"]"; // String | The `secretKey` of a specific game or the `accessToken` of a specific player.
    String xPassword = "mySecurePassword"; // String | The password of the authenticating game or player. Required to decrypt and perform blockchain transactions with the game or player primary wallet.
    SetCollectionApprovalRequest setCollectionApprovalRequest = new SetCollectionApprovalRequest(); // SetCollectionApprovalRequest | 
    try {
      TransactionModel result = apiInstance.setCollectionApproval(collectionId, xAuthorization, xPassword, setCollectionApprovalRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#setCollectionApproval");
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
| **collectionId** | **String**| Any collection id within the MetaFab ecosystem. | |
| **xAuthorization** | **String**| The &#x60;secretKey&#x60; of a specific game or the &#x60;accessToken&#x60; of a specific player. | |
| **xPassword** | **String**| The password of the authenticating game or player. Required to decrypt and perform blockchain transactions with the game or player primary wallet. | |
| **setCollectionApprovalRequest** | [**SetCollectionApprovalRequest**](SetCollectionApprovalRequest.md)|  | |

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
| **200** | Successfully set approval for the provided address or address associated with the provided walletId to transfer and burn items from this collection on behalf of the authenticated game or player&#39;s wallet. Returns a transaction object. |  -  |
| **400** | An API level error occurred. This is often due to problematic data being provided by you. |  -  |
| **401** | An authorization error occured. This is often due to incorrect tokens or keys being provided, or accessing a resource that the provided tokens or keys do not have access to. |  -  |

<a name="setCollectionItemTimelock"></a>
# **setCollectionItemTimelock**
> TransactionModel setCollectionItemTimelock(collectionId, collectionItemId, xAuthorization, xPassword, setCollectionItemTimelockRequest)

Set collection item timelock

Sets the item timelock for the provided collection itemId. The timelock is a unix timestamp (in seconds) that defines a period in time of when an item may be transferred by players. Until the timelock timestamp has passed, the itemId for the given timelock may not be transferred, sold, traded, etc. A timelock of 0 (default) means that there is no timelock set on the itemId and it can be freely transferred, traded, etc.

### Example
```java
// Import classes:
import org.metafab.client.ApiClient;
import org.metafab.client.ApiException;
import org.metafab.client.Configuration;
import org.metafab.client.models.*;
import org.metafab.client.api.ItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.trymetafab.com");

    ItemsApi apiInstance = new ItemsApi(defaultClient);
    String collectionId = "collectionId_example"; // String | Any collection id within the MetaFab ecosystem.
    BigDecimal collectionItemId = new BigDecimal(78); // BigDecimal | Any item id for the collection. Zero, or a positive integer.
    String xAuthorization = "game_sk_02z4Mv3c85Ig0gNowY9Dq0N2kjb1xwzr27ArLE0669RrRI6dLf822iPO26K1p1FP"; // String | The `secretKey` of the authenticating game.
    String xPassword = "mySecurePassword"; // String | The password of the authenticating game. Required to decrypt and perform blockchain transactions with the game primary wallet.
    SetCollectionItemTimelockRequest setCollectionItemTimelockRequest = new SetCollectionItemTimelockRequest(); // SetCollectionItemTimelockRequest | 
    try {
      TransactionModel result = apiInstance.setCollectionItemTimelock(collectionId, collectionItemId, xAuthorization, xPassword, setCollectionItemTimelockRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#setCollectionItemTimelock");
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
| **collectionId** | **String**| Any collection id within the MetaFab ecosystem. | |
| **collectionItemId** | **BigDecimal**| Any item id for the collection. Zero, or a positive integer. | |
| **xAuthorization** | **String**| The &#x60;secretKey&#x60; of the authenticating game. | |
| **xPassword** | **String**| The password of the authenticating game. Required to decrypt and perform blockchain transactions with the game primary wallet. | |
| **setCollectionItemTimelockRequest** | [**SetCollectionItemTimelockRequest**](SetCollectionItemTimelockRequest.md)|  | |

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
| **200** | Successfully set the provided timelock for the provided itemId. Returns a transaction object. |  -  |
| **400** | An API level error occurred. This is often due to problematic data being provided by you. |  -  |
| **401** | An authorization error occured. This is often due to incorrect tokens or keys being provided, or accessing a resource that the provided tokens or keys do not have access to. |  -  |

<a name="transferCollectionItem"></a>
# **transferCollectionItem**
> TransactionModel transferCollectionItem(collectionId, collectionItemId, xAuthorization, xPassword, transferCollectionItemRequest)

Transfer collection item

Transfers specified quantity of itemId to the provided wallet address or wallet address associated with the provided walletId.

### Example
```java
// Import classes:
import org.metafab.client.ApiClient;
import org.metafab.client.ApiException;
import org.metafab.client.Configuration;
import org.metafab.client.models.*;
import org.metafab.client.api.ItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.trymetafab.com");

    ItemsApi apiInstance = new ItemsApi(defaultClient);
    String collectionId = "collectionId_example"; // String | Any collection id within the MetaFab ecosystem.
    BigDecimal collectionItemId = new BigDecimal(78); // BigDecimal | Any item id for the collection. Zero, or a positive integer.
    String xAuthorization = "[\"game_sk_02z4Mv3c85Ig0gNowY9Dq0N2kjb1xwzr27ArLE0669RrRI6dLf822iPO26K1p1FP\",\"player_at_02z4Mv3c85Ig0gNowY9Dq0N2kjb1xwzr27ArLE0669RrRI6dLf822iPO26K1p1FP\"]"; // String | The `secretKey` of a specific game or the `accessToken` of a specific player.
    String xPassword = "mySecurePassword"; // String | The password of the authenticating game or player. Required to decrypt and perform blockchain transactions with the game or player primary wallet.
    TransferCollectionItemRequest transferCollectionItemRequest = new TransferCollectionItemRequest(); // TransferCollectionItemRequest | 
    try {
      TransactionModel result = apiInstance.transferCollectionItem(collectionId, collectionItemId, xAuthorization, xPassword, transferCollectionItemRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#transferCollectionItem");
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
| **collectionId** | **String**| Any collection id within the MetaFab ecosystem. | |
| **collectionItemId** | **BigDecimal**| Any item id for the collection. Zero, or a positive integer. | |
| **xAuthorization** | **String**| The &#x60;secretKey&#x60; of a specific game or the &#x60;accessToken&#x60; of a specific player. | |
| **xPassword** | **String**| The password of the authenticating game or player. Required to decrypt and perform blockchain transactions with the game or player primary wallet. | |
| **transferCollectionItemRequest** | [**TransferCollectionItemRequest**](TransferCollectionItemRequest.md)|  | |

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
| **200** | Successfully transferred the provided quantity of the collectionItemId to the provided wallet address or wallet address of the provided walletId. Returns a transaction object. |  -  |
| **400** | An API level error occurred. This is often due to problematic data being provided by you. |  -  |
| **401** | An authorization error occured. This is often due to incorrect tokens or keys being provided, or accessing a resource that the provided tokens or keys do not have access to. |  -  |

