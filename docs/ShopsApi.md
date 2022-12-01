# ShopsApi

All URIs are relative to *https://api.trymetafab.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createShop**](ShopsApi.md#createShop) | **POST** /v1/shops | Create shop |
| [**getShopOffer**](ShopsApi.md#getShopOffer) | **GET** /v1/shops/{shopId}/items/{shopOfferId} | Get shop offer |
| [**getShopOffers**](ShopsApi.md#getShopOffers) | **GET** /v1/shops/{shopId}/offers | Get shop offers |
| [**getShops**](ShopsApi.md#getShops) | **GET** /v1/shops | Get shops |
| [**removeShopOffer**](ShopsApi.md#removeShopOffer) | **DELETE** /v1/shops/{shopId}/offers/{shopOfferId} | Remove shop offer |
| [**setShopOffer**](ShopsApi.md#setShopOffer) | **POST** /v1/shops/{shopId}/offers | Set shop offer |
| [**useShopOffer**](ShopsApi.md#useShopOffer) | **POST** /v1/shops/{shopId}/offers/{shopOfferId}/uses | Use shop offer |
| [**withdrawFromShop**](ShopsApi.md#withdrawFromShop) | **POST** /v1/shops/{shopId}/withdrawals | Withdraw from shop |


<a name="createShop"></a>
# **createShop**
> CreateShop200Response createShop(xAuthorization, xPassword, createShopRequest)

Create shop

Creates a new game shop and deploys a shop contract on behalf of the authenticating game&#39;s primary wallet. The deployed shop contract allows you to create fixed price rates for players to buy specific items from any item collection or ERC1155 contract. Additionally, a shop allows you to create shop offers for some set of item(s) to another set of item(s) or any mix of currency. Shops completely support gasless player transactions.

### Example
```java
// Import classes:
import org.metafab.client.ApiClient;
import org.metafab.client.ApiException;
import org.metafab.client.Configuration;
import org.metafab.client.models.*;
import org.metafab.client.api.ShopsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.trymetafab.com");

    ShopsApi apiInstance = new ShopsApi(defaultClient);
    String xAuthorization = "game_sk_02z4Mv3c85Ig0gNowY9Dq0N2kjb1xwzr27ArLE0669RrRI6dLf822iPO26K1p1FP"; // String | The `secretKey` of the authenticating game.
    String xPassword = "mySecurePassword"; // String | The password of the authenticating game. Required to decrypt and perform blockchain transactions with the game primary wallet.
    CreateShopRequest createShopRequest = new CreateShopRequest(); // CreateShopRequest | 
    try {
      CreateShop200Response result = apiInstance.createShop(xAuthorization, xPassword, createShopRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShopsApi#createShop");
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
| **createShopRequest** | [**CreateShopRequest**](CreateShopRequest.md)|  | |

### Return type

[**CreateShop200Response**](CreateShop200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully created a new shop and deployed its contract on the chain specified. Returns a shop object containing a contract property with the deployment transaction. |  -  |
| **400** | An API level error occurred. This is often due to problematic data being provided by you. |  -  |
| **401** | An authorization error occured. This is often due to incorrect tokens or keys being provided, or accessing a resource that the provided tokens or keys do not have access to. |  -  |

<a name="getShopOffer"></a>
# **getShopOffer**
> ShopOffer getShopOffer(shopId, shopOfferId)

Get shop offer

Returns a shop offer object for the provided shopOfferId.

### Example
```java
// Import classes:
import org.metafab.client.ApiClient;
import org.metafab.client.ApiException;
import org.metafab.client.Configuration;
import org.metafab.client.models.*;
import org.metafab.client.api.ShopsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.trymetafab.com");

    ShopsApi apiInstance = new ShopsApi(defaultClient);
    String shopId = "shopId_example"; // String | Any shop id within the MetaFab ecosystem.
    String shopOfferId = "shopOfferId_example"; // String | Any offer id for the shop. Zero, or a positive integer.
    try {
      ShopOffer result = apiInstance.getShopOffer(shopId, shopOfferId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShopsApi#getShopOffer");
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
| **shopId** | **String**| Any shop id within the MetaFab ecosystem. | |
| **shopOfferId** | **String**| Any offer id for the shop. Zero, or a positive integer. | |

### Return type

[**ShopOffer**](ShopOffer.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved shop offer. |  -  |
| **400** | An API level error occurred. This is often due to problematic data being provided by you. |  -  |

<a name="getShopOffers"></a>
# **getShopOffers**
> List&lt;ShopOffer&gt; getShopOffers(shopId)

Get shop offers

Returns all shop offers as an array of shop offer objects.

### Example
```java
// Import classes:
import org.metafab.client.ApiClient;
import org.metafab.client.ApiException;
import org.metafab.client.Configuration;
import org.metafab.client.models.*;
import org.metafab.client.api.ShopsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.trymetafab.com");

    ShopsApi apiInstance = new ShopsApi(defaultClient);
    String shopId = "shopId_example"; // String | Any shop id within the MetaFab ecosystem.
    try {
      List<ShopOffer> result = apiInstance.getShopOffers(shopId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShopsApi#getShopOffers");
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
| **shopId** | **String**| Any shop id within the MetaFab ecosystem. | |

### Return type

[**List&lt;ShopOffer&gt;**](ShopOffer.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved shop offers. |  -  |
| **400** | An API level error occurred. This is often due to problematic data being provided by you. |  -  |

<a name="getShops"></a>
# **getShops**
> List&lt;GetShops200ResponseInner&gt; getShops(xGameKey)

Get shops

Returns an array of active shops for the game associated with the provided &#x60;X-Game-Key&#x60;.

### Example
```java
// Import classes:
import org.metafab.client.ApiClient;
import org.metafab.client.ApiException;
import org.metafab.client.Configuration;
import org.metafab.client.models.*;
import org.metafab.client.api.ShopsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.trymetafab.com");

    ShopsApi apiInstance = new ShopsApi(defaultClient);
    String xGameKey = "game_pk_4SOqpDi8pQdnQgfCOBW29qR8YmwOhxVPz5iHoMgUEJLDdPXgwLuHqZf8ewo2GajZ"; // String | The `publishedKey` of a specific game. This can be shared or included in game clients, websites, etc.
    try {
      List<GetShops200ResponseInner> result = apiInstance.getShops(xGameKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShopsApi#getShops");
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

[**List&lt;GetShops200ResponseInner&gt;**](GetShops200ResponseInner.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved an array of shops for the game associated with the provided &#x60;X-Game-Key&#x60; |  -  |
| **400** | An API level error occurred. This is often due to problematic data being provided by you. |  -  |

<a name="removeShopOffer"></a>
# **removeShopOffer**
> TransactionModel removeShopOffer(shopId, shopOfferId, xAuthorization, xPassword)

Remove shop offer

Removes the provided offer by offerId from the provided shop. Removed offers can no longer be used.

### Example
```java
// Import classes:
import org.metafab.client.ApiClient;
import org.metafab.client.ApiException;
import org.metafab.client.Configuration;
import org.metafab.client.models.*;
import org.metafab.client.api.ShopsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.trymetafab.com");

    ShopsApi apiInstance = new ShopsApi(defaultClient);
    String shopId = "shopId_example"; // String | Any shop id within the MetaFab ecosystem.
    String shopOfferId = "shopOfferId_example"; // String | Any offer id for the shop. Zero, or a positive integer.
    String xAuthorization = "game_sk_02z4Mv3c85Ig0gNowY9Dq0N2kjb1xwzr27ArLE0669RrRI6dLf822iPO26K1p1FP"; // String | The `secretKey` of the authenticating game.
    String xPassword = "mySecurePassword"; // String | The password of the authenticating game. Required to decrypt and perform blockchain transactions with the game primary wallet.
    try {
      TransactionModel result = apiInstance.removeShopOffer(shopId, shopOfferId, xAuthorization, xPassword);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShopsApi#removeShopOffer");
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
| **shopId** | **String**| Any shop id within the MetaFab ecosystem. | |
| **shopOfferId** | **String**| Any offer id for the shop. Zero, or a positive integer. | |
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
| **200** | Successfully removed the provided offer from the provided shop. Returns a transaction object. |  -  |
| **400** | An API level error occurred. This is often due to problematic data being provided by you. |  -  |
| **401** | An authorization error occured. This is often due to incorrect tokens or keys being provided, or accessing a resource that the provided tokens or keys do not have access to. |  -  |

<a name="setShopOffer"></a>
# **setShopOffer**
> TransactionModel setShopOffer(shopId, xAuthorization, xPassword, setShopOfferRequest)

Set shop offer

Sets a new shop offer or updates an existing one for the provided id. Shop offers allow currency to item, item to currency or item to item exchanges.  All request fields besides &#x60;id&#x60; are optional. Any optional fields omitted will not be used for the offer. This allows you to create many different combinations of offers. For example, you can create an offer that may require 3 unique item ids of specified quantities from a given item collection and gives the user 1 new unique item id in exchange.  Another example, you may want to make a shop offer from one ERC20 token to another. This is also possible - simple set the input and output currency fields and leave the others blank.

### Example
```java
// Import classes:
import org.metafab.client.ApiClient;
import org.metafab.client.ApiException;
import org.metafab.client.Configuration;
import org.metafab.client.models.*;
import org.metafab.client.api.ShopsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.trymetafab.com");

    ShopsApi apiInstance = new ShopsApi(defaultClient);
    String shopId = "shopId_example"; // String | Any shop id within the MetaFab ecosystem.
    String xAuthorization = "game_sk_02z4Mv3c85Ig0gNowY9Dq0N2kjb1xwzr27ArLE0669RrRI6dLf822iPO26K1p1FP"; // String | The `secretKey` of the authenticating game.
    String xPassword = "mySecurePassword"; // String | The password of the authenticating game. Required to decrypt and perform blockchain transactions with the game primary wallet.
    SetShopOfferRequest setShopOfferRequest = new SetShopOfferRequest(); // SetShopOfferRequest | 
    try {
      TransactionModel result = apiInstance.setShopOffer(shopId, xAuthorization, xPassword, setShopOfferRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShopsApi#setShopOffer");
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
| **shopId** | **String**| Any shop id within the MetaFab ecosystem. | |
| **xAuthorization** | **String**| The &#x60;secretKey&#x60; of the authenticating game. | |
| **xPassword** | **String**| The password of the authenticating game. Required to decrypt and perform blockchain transactions with the game primary wallet. | |
| **setShopOfferRequest** | [**SetShopOfferRequest**](SetShopOfferRequest.md)|  | |

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
| **200** | Successfully created or updated a shop offer for the provided offer id. Returns a transaction object. |  -  |
| **400** | An API level error occurred. This is often due to problematic data being provided by you. |  -  |
| **401** | An authorization error occured. This is often due to incorrect tokens or keys being provided, or accessing a resource that the provided tokens or keys do not have access to. |  -  |

<a name="useShopOffer"></a>
# **useShopOffer**
> TransactionModel useShopOffer(shopId, shopOfferId, xAuthorization, xPassword)

Use shop offer

Uses a shop offer. The required (input) item(s) and/or currency are removed from the wallet or player wallet using the offer. The given (output) item(s) and/or currency are given to the wallet or player wallet using the offer.

### Example
```java
// Import classes:
import org.metafab.client.ApiClient;
import org.metafab.client.ApiException;
import org.metafab.client.Configuration;
import org.metafab.client.models.*;
import org.metafab.client.api.ShopsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.trymetafab.com");

    ShopsApi apiInstance = new ShopsApi(defaultClient);
    String shopId = "shopId_example"; // String | Any shop id within the MetaFab ecosystem.
    String shopOfferId = "shopOfferId_example"; // String | Any offer id for the shop. Zero, or a positive integer.
    String xAuthorization = "[\"game_sk_02z4Mv3c85Ig0gNowY9Dq0N2kjb1xwzr27ArLE0669RrRI6dLf822iPO26K1p1FP\",\"player_at_02z4Mv3c85Ig0gNowY9Dq0N2kjb1xwzr27ArLE0669RrRI6dLf822iPO26K1p1FP\"]"; // String | The `secretKey` of a specific game or the `accessToken` of a specific player.
    String xPassword = "mySecurePassword"; // String | The password of the authenticating game or player. Required to decrypt and perform blockchain transactions with the game or player primary wallet.
    try {
      TransactionModel result = apiInstance.useShopOffer(shopId, shopOfferId, xAuthorization, xPassword);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShopsApi#useShopOffer");
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
| **shopId** | **String**| Any shop id within the MetaFab ecosystem. | |
| **shopOfferId** | **String**| Any offer id for the shop. Zero, or a positive integer. | |
| **xAuthorization** | **String**| The &#x60;secretKey&#x60; of a specific game or the &#x60;accessToken&#x60; of a specific player. | |
| **xPassword** | **String**| The password of the authenticating game or player. Required to decrypt and perform blockchain transactions with the game or player primary wallet. | |

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
| **200** | Successfully used provided shop offer. Returns a transaction object. |  -  |
| **400** | An API level error occurred. This is often due to problematic data being provided by you. |  -  |
| **401** | An authorization error occured. This is often due to incorrect tokens or keys being provided, or accessing a resource that the provided tokens or keys do not have access to. |  -  |

<a name="withdrawFromShop"></a>
# **withdrawFromShop**
> TransactionModel withdrawFromShop(shopId, xAuthorization, xPassword, withdrawFromShopRequest)

Withdraw from shop

Withdraws native token, currency or items from a shop. Whenever a shop offer has input requirements, the native tokens, currencies or items for the requirements of that offer are deposited into the shop contract when the offer is used. These can be withdrawn to any other address.

### Example
```java
// Import classes:
import org.metafab.client.ApiClient;
import org.metafab.client.ApiException;
import org.metafab.client.Configuration;
import org.metafab.client.models.*;
import org.metafab.client.api.ShopsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.trymetafab.com");

    ShopsApi apiInstance = new ShopsApi(defaultClient);
    String shopId = "shopId_example"; // String | Any shop id within the MetaFab ecosystem.
    String xAuthorization = "game_sk_02z4Mv3c85Ig0gNowY9Dq0N2kjb1xwzr27ArLE0669RrRI6dLf822iPO26K1p1FP"; // String | The `secretKey` of the authenticating game.
    String xPassword = "mySecurePassword"; // String | The password of the authenticating game. Required to decrypt and perform blockchain transactions with the game primary wallet.
    WithdrawFromShopRequest withdrawFromShopRequest = new WithdrawFromShopRequest(); // WithdrawFromShopRequest | 
    try {
      TransactionModel result = apiInstance.withdrawFromShop(shopId, xAuthorization, xPassword, withdrawFromShopRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShopsApi#withdrawFromShop");
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
| **shopId** | **String**| Any shop id within the MetaFab ecosystem. | |
| **xAuthorization** | **String**| The &#x60;secretKey&#x60; of the authenticating game. | |
| **xPassword** | **String**| The password of the authenticating game. Required to decrypt and perform blockchain transactions with the game primary wallet. | |
| **withdrawFromShopRequest** | [**WithdrawFromShopRequest**](WithdrawFromShopRequest.md)|  | |

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
| **200** | Successfully performed a withdrawal to the provided wallet address or wallet address of the provided walletId. Returns a transaction object. |  -  |
| **400** | An API level error occurred. This is often due to problematic data being provided by you. |  -  |
| **401** | An authorization error occured. This is often due to incorrect tokens or keys being provided, or accessing a resource that the provided tokens or keys do not have access to. |  -  |

