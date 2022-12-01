# LootboxesApi

All URIs are relative to *https://api.trymetafab.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createLootboxManager**](LootboxesApi.md#createLootboxManager) | **POST** /v1/lootboxManagers | Create lootbox manager |
| [**getLootboxManagerLootbox**](LootboxesApi.md#getLootboxManagerLootbox) | **GET** /v1/lootboxManagers/{lootboxManagerId}/lootboxes/{lootboxManagerLootboxId} | Get lootbox manager lootbox |
| [**getLootboxManagerLootboxes**](LootboxesApi.md#getLootboxManagerLootboxes) | **GET** /v1/lootboxManagers/{lootboxManagerId}/lootboxes | Get lootbox manager lootboxes |
| [**getLootboxManagers**](LootboxesApi.md#getLootboxManagers) | **GET** /v1/lootboxManagers | Get lootbox managers |
| [**openLootboxManagerLootbox**](LootboxesApi.md#openLootboxManagerLootbox) | **POST** /v1/lootboxManagers/{lootboxManagerId}/lootboxes/{lootboxManagerLootboxId}/opens | Open lootbox manager lootbox |
| [**removeLootboxManagerLootbox**](LootboxesApi.md#removeLootboxManagerLootbox) | **DELETE** /v1/lootboxManagers/{lootboxManagerId}/lootboxes/{lootboxManagerLootboxId} | Remove lootbox manager lootbox |
| [**setLootboxManagerLootbox**](LootboxesApi.md#setLootboxManagerLootbox) | **POST** /v1/lootboxManagers/{lootboxManagerId}/lootboxes | Set lootbox manager lootbox |


<a name="createLootboxManager"></a>
# **createLootboxManager**
> CreateLootboxManager200Response createLootboxManager(xAuthorization, xPassword, createLootboxManagerRequest)

Create lootbox manager

Creates a new game lootbox manager and deploys a lootbox manager contract on behalf of the authenticating game&#39;s primary wallet. The deployed lootbox manager contract allows you to create lootbox behavior for existing items. For example, you can define item id(s) from one of your item collections as the requirement(s) to open a \&quot;lootbox\&quot;. The required item(s) would be burned from the interacting player&#39;s wallet and the player would receive item(s) from a weighted randomized set of possible items the lootbox can contain.

### Example
```java
// Import classes:
import org.metafab.client.ApiClient;
import org.metafab.client.ApiException;
import org.metafab.client.Configuration;
import org.metafab.client.models.*;
import org.metafab.client.api.LootboxesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.trymetafab.com");

    LootboxesApi apiInstance = new LootboxesApi(defaultClient);
    String xAuthorization = "game_sk_02z4Mv3c85Ig0gNowY9Dq0N2kjb1xwzr27ArLE0669RrRI6dLf822iPO26K1p1FP"; // String | The `secretKey` of the authenticating game.
    String xPassword = "mySecurePassword"; // String | The password of the authenticating game. Required to decrypt and perform blockchain transactions with the game primary wallet.
    CreateLootboxManagerRequest createLootboxManagerRequest = new CreateLootboxManagerRequest(); // CreateLootboxManagerRequest | 
    try {
      CreateLootboxManager200Response result = apiInstance.createLootboxManager(xAuthorization, xPassword, createLootboxManagerRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LootboxesApi#createLootboxManager");
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
| **createLootboxManagerRequest** | [**CreateLootboxManagerRequest**](CreateLootboxManagerRequest.md)|  | |

### Return type

[**CreateLootboxManager200Response**](CreateLootboxManager200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully created a new lootbox manager and deployed its contract on the chain specified. Returns a lootbox manager object containing a contract property with the deployment transaction. |  -  |
| **400** | An API level error occurred. This is often due to problematic data being provided by you. |  -  |
| **401** | An authorization error occured. This is often due to incorrect tokens or keys being provided, or accessing a resource that the provided tokens or keys do not have access to. |  -  |

<a name="getLootboxManagerLootbox"></a>
# **getLootboxManagerLootbox**
> LootboxManagerLootbox getLootboxManagerLootbox(lootboxManagerId, lootboxManagerLootboxId)

Get lootbox manager lootbox

Returns a lootbox manager lootbox object for the provided lootboxManagerLootboxId.

### Example
```java
// Import classes:
import org.metafab.client.ApiClient;
import org.metafab.client.ApiException;
import org.metafab.client.Configuration;
import org.metafab.client.models.*;
import org.metafab.client.api.LootboxesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.trymetafab.com");

    LootboxesApi apiInstance = new LootboxesApi(defaultClient);
    String lootboxManagerId = "lootboxManagerId_example"; // String | Any lootbox manager id within the MetaFab ecosystem.
    String lootboxManagerLootboxId = "lootboxManagerLootboxId_example"; // String | Any lootbox manager lootbox id within the MetaFab ecosystem.
    try {
      LootboxManagerLootbox result = apiInstance.getLootboxManagerLootbox(lootboxManagerId, lootboxManagerLootboxId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LootboxesApi#getLootboxManagerLootbox");
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
| **lootboxManagerId** | **String**| Any lootbox manager id within the MetaFab ecosystem. | |
| **lootboxManagerLootboxId** | **String**| Any lootbox manager lootbox id within the MetaFab ecosystem. | |

### Return type

[**LootboxManagerLootbox**](LootboxManagerLootbox.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved lootbox manager lootbox. |  -  |
| **400** | An API level error occurred. This is often due to problematic data being provided by you. |  -  |

<a name="getLootboxManagerLootboxes"></a>
# **getLootboxManagerLootboxes**
> List&lt;LootboxManagerLootbox&gt; getLootboxManagerLootboxes(lootboxManagerId)

Get lootbox manager lootboxes

Returns all lootbox manager lootboxes as an array of lootbox objects.

### Example
```java
// Import classes:
import org.metafab.client.ApiClient;
import org.metafab.client.ApiException;
import org.metafab.client.Configuration;
import org.metafab.client.models.*;
import org.metafab.client.api.LootboxesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.trymetafab.com");

    LootboxesApi apiInstance = new LootboxesApi(defaultClient);
    String lootboxManagerId = "lootboxManagerId_example"; // String | Any lootbox manager id within the MetaFab ecosystem.
    try {
      List<LootboxManagerLootbox> result = apiInstance.getLootboxManagerLootboxes(lootboxManagerId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LootboxesApi#getLootboxManagerLootboxes");
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
| **lootboxManagerId** | **String**| Any lootbox manager id within the MetaFab ecosystem. | |

### Return type

[**List&lt;LootboxManagerLootbox&gt;**](LootboxManagerLootbox.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved lootbox manager lootboxes. |  -  |
| **400** | An API level error occurred. This is often due to problematic data being provided by you. |  -  |

<a name="getLootboxManagers"></a>
# **getLootboxManagers**
> List&lt;GetLootboxManagers200ResponseInner&gt; getLootboxManagers(xGameKey)

Get lootbox managers

Returns an array of active lootbox managers for the game associated with the provided &#x60;X-Game-Key&#x60;.

### Example
```java
// Import classes:
import org.metafab.client.ApiClient;
import org.metafab.client.ApiException;
import org.metafab.client.Configuration;
import org.metafab.client.models.*;
import org.metafab.client.api.LootboxesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.trymetafab.com");

    LootboxesApi apiInstance = new LootboxesApi(defaultClient);
    String xGameKey = "game_pk_4SOqpDi8pQdnQgfCOBW29qR8YmwOhxVPz5iHoMgUEJLDdPXgwLuHqZf8ewo2GajZ"; // String | The `publishedKey` of a specific game. This can be shared or included in game clients, websites, etc.
    try {
      List<GetLootboxManagers200ResponseInner> result = apiInstance.getLootboxManagers(xGameKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LootboxesApi#getLootboxManagers");
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

[**List&lt;GetLootboxManagers200ResponseInner&gt;**](GetLootboxManagers200ResponseInner.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved an array of lootbox managers for the game associated with the provided &#x60;X-Game-Key&#x60; |  -  |
| **400** | An API level error occurred. This is often due to problematic data being provided by you. |  -  |

<a name="openLootboxManagerLootbox"></a>
# **openLootboxManagerLootbox**
> List&lt;TransactionModel&gt; openLootboxManagerLootbox(lootboxManagerId, lootboxManagerLootboxId, xAuthorization, xPassword)

Open lootbox manager lootbox

Opens a lootbox manager lootbox. The required input item(s) are burned from the wallet or player wallet opening the lootbox. The given output item(s) are given to the wallet or player wallet opening the lootbox.

### Example
```java
// Import classes:
import org.metafab.client.ApiClient;
import org.metafab.client.ApiException;
import org.metafab.client.Configuration;
import org.metafab.client.models.*;
import org.metafab.client.api.LootboxesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.trymetafab.com");

    LootboxesApi apiInstance = new LootboxesApi(defaultClient);
    String lootboxManagerId = "lootboxManagerId_example"; // String | Any lootbox manager id within the MetaFab ecosystem.
    String lootboxManagerLootboxId = "lootboxManagerLootboxId_example"; // String | Any lootbox manager lootbox id within the MetaFab ecosystem.
    String xAuthorization = "[\"game_sk_02z4Mv3c85Ig0gNowY9Dq0N2kjb1xwzr27ArLE0669RrRI6dLf822iPO26K1p1FP\",\"player_at_02z4Mv3c85Ig0gNowY9Dq0N2kjb1xwzr27ArLE0669RrRI6dLf822iPO26K1p1FP\"]"; // String | The `secretKey` of a specific game or the `accessToken` of a specific player.
    String xPassword = "mySecurePassword"; // String | The password of the authenticating game or player. Required to decrypt and perform blockchain transactions with the game or player primary wallet.
    try {
      List<TransactionModel> result = apiInstance.openLootboxManagerLootbox(lootboxManagerId, lootboxManagerLootboxId, xAuthorization, xPassword);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LootboxesApi#openLootboxManagerLootbox");
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
| **lootboxManagerId** | **String**| Any lootbox manager id within the MetaFab ecosystem. | |
| **lootboxManagerLootboxId** | **String**| Any lootbox manager lootbox id within the MetaFab ecosystem. | |
| **xAuthorization** | **String**| The &#x60;secretKey&#x60; of a specific game or the &#x60;accessToken&#x60; of a specific player. | |
| **xPassword** | **String**| The password of the authenticating game or player. Required to decrypt and perform blockchain transactions with the game or player primary wallet. | |

### Return type

[**List&lt;TransactionModel&gt;**](TransactionModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully opened provided lootbox manager lootbox. Returns an array of transaction objects. The first transaction object being for the lootbox opening, the second for claiming its contents. |  -  |
| **400** | An API level error occurred. This is often due to problematic data being provided by you. |  -  |
| **401** | An authorization error occured. This is often due to incorrect tokens or keys being provided, or accessing a resource that the provided tokens or keys do not have access to. |  -  |

<a name="removeLootboxManagerLootbox"></a>
# **removeLootboxManagerLootbox**
> TransactionModel removeLootboxManagerLootbox(lootboxManagerId, lootboxManagerLootboxId, xAuthorization, xPassword)

Remove lootbox manager lootbox

Removes the provided lootbox by lootboxId from the provided lootbox manager. Removed lootboxes can no longer be used.

### Example
```java
// Import classes:
import org.metafab.client.ApiClient;
import org.metafab.client.ApiException;
import org.metafab.client.Configuration;
import org.metafab.client.models.*;
import org.metafab.client.api.LootboxesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.trymetafab.com");

    LootboxesApi apiInstance = new LootboxesApi(defaultClient);
    String lootboxManagerId = "lootboxManagerId_example"; // String | Any lootbox manager id within the MetaFab ecosystem.
    String lootboxManagerLootboxId = "lootboxManagerLootboxId_example"; // String | Any lootbox manager lootbox id within the MetaFab ecosystem.
    String xAuthorization = "game_sk_02z4Mv3c85Ig0gNowY9Dq0N2kjb1xwzr27ArLE0669RrRI6dLf822iPO26K1p1FP"; // String | The `secretKey` of the authenticating game.
    String xPassword = "mySecurePassword"; // String | The password of the authenticating game. Required to decrypt and perform blockchain transactions with the game primary wallet.
    try {
      TransactionModel result = apiInstance.removeLootboxManagerLootbox(lootboxManagerId, lootboxManagerLootboxId, xAuthorization, xPassword);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LootboxesApi#removeLootboxManagerLootbox");
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
| **lootboxManagerId** | **String**| Any lootbox manager id within the MetaFab ecosystem. | |
| **lootboxManagerLootboxId** | **String**| Any lootbox manager lootbox id within the MetaFab ecosystem. | |
| **xAuthorization** | **String**| The &#x60;secretKey&#x60; of the authenticating game. | |
| **xPassword** | **String**| The password of the authenticating game. Required to decrypt and perform blockchain transactions with the game primary wallet. | |

### Return type

[**TransactionModel**](TransactionModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully removed the provided lootbox from the provided lootbox manager. Returns a transaction object. |  -  |
| **400** | An API level error occurred. This is often due to problematic data being provided by you. |  -  |
| **401** | An authorization error occured. This is often due to incorrect tokens or keys being provided, or accessing a resource that the provided tokens or keys do not have access to. |  -  |

<a name="setLootboxManagerLootbox"></a>
# **setLootboxManagerLootbox**
> TransactionModel setLootboxManagerLootbox(lootboxManagerId, xAuthorization, xPassword, setLootboxManagerLootboxRequest)

Set lootbox manager lootbox

Sets a new lootbox manager lootbox or updates an existing one for the provided id. Lootboxes allow item(s) to be burned to receive a random set of possible item(s) based on probability weight.  Lootboxes can require any number of unique types of items and quantities to open a created lootbox type within the system. A common pattern with lootboxes is to create a lootbox item type within an item collection, and require it as the input item type.

### Example
```java
// Import classes:
import org.metafab.client.ApiClient;
import org.metafab.client.ApiException;
import org.metafab.client.Configuration;
import org.metafab.client.models.*;
import org.metafab.client.api.LootboxesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.trymetafab.com");

    LootboxesApi apiInstance = new LootboxesApi(defaultClient);
    String lootboxManagerId = "lootboxManagerId_example"; // String | Any lootbox manager id within the MetaFab ecosystem.
    String xAuthorization = "game_sk_02z4Mv3c85Ig0gNowY9Dq0N2kjb1xwzr27ArLE0669RrRI6dLf822iPO26K1p1FP"; // String | The `secretKey` of the authenticating game.
    String xPassword = "mySecurePassword"; // String | The password of the authenticating game. Required to decrypt and perform blockchain transactions with the game primary wallet.
    SetLootboxManagerLootboxRequest setLootboxManagerLootboxRequest = new SetLootboxManagerLootboxRequest(); // SetLootboxManagerLootboxRequest | 
    try {
      TransactionModel result = apiInstance.setLootboxManagerLootbox(lootboxManagerId, xAuthorization, xPassword, setLootboxManagerLootboxRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LootboxesApi#setLootboxManagerLootbox");
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
| **lootboxManagerId** | **String**| Any lootbox manager id within the MetaFab ecosystem. | |
| **xAuthorization** | **String**| The &#x60;secretKey&#x60; of the authenticating game. | |
| **xPassword** | **String**| The password of the authenticating game. Required to decrypt and perform blockchain transactions with the game primary wallet. | |
| **setLootboxManagerLootboxRequest** | [**SetLootboxManagerLootboxRequest**](SetLootboxManagerLootboxRequest.md)|  | |

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
| **200** | Successfully created or updated an lootbox manager lootbox for the provided lootbox id. Returns a transaction object. |  -  |
| **400** | An API level error occurred. This is often due to problematic data being provided by you. |  -  |
| **401** | An authorization error occured. This is often due to incorrect tokens or keys being provided, or accessing a resource that the provided tokens or keys do not have access to. |  -  |

