# ExchangesApi

All URIs are relative to *https://api.trymetafab.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createExchange**](ExchangesApi.md#createExchange) | **POST** /v1/exchanges | Create exchange |
| [**getExchangeOffer**](ExchangesApi.md#getExchangeOffer) | **GET** /v1/exchanges/{exchangeId}/items/{exchangeOfferId} | Get exchange offer |
| [**getExchangeOffers**](ExchangesApi.md#getExchangeOffers) | **GET** /v1/exchanges/{exchangeId}/offers | Get exchange offers |
| [**getExchanges**](ExchangesApi.md#getExchanges) | **GET** /v1/exchanges | Get exchanges |
| [**removeExchangeOffer**](ExchangesApi.md#removeExchangeOffer) | **DELETE** /v1/exchanges/{exchangeId}/offers/{exchangeOfferId} | Remove exchange offer |
| [**setExchangeOffer**](ExchangesApi.md#setExchangeOffer) | **POST** /v1/exchanges/{exchangeId}/offers | Set exchange offer |
| [**useExchangeOffer**](ExchangesApi.md#useExchangeOffer) | **POST** /v1/exchanges/{exchangeId}/offers/{exchangeOfferId}/uses | Use exchange offer |
| [**withdrawFromExchange**](ExchangesApi.md#withdrawFromExchange) | **POST** /v1/exchanges/{exchangeId}/withdrawals | Withdraw from exchange |


<a name="createExchange"></a>
# **createExchange**
> CreateExchange200Response createExchange(xAuthorization, xPassword, createExchangeRequest)

Create exchange

Creates a new game exchange and deploys a exchange contract on behalf of the authenticating game&#39;s primary wallet. The deployed exchange contract allows you to create fixed price rates for players to buy specific items from any item collection or ERC1155 contract. Additionally, an exchange allows you to create exchange offers for some set of item(s) to another set of item(s) or any mix of currency. Exchanges completely supports gasless player transactions.

### Example
```java
// Import classes:
import org.metafab.client.ApiClient;
import org.metafab.client.ApiException;
import org.metafab.client.Configuration;
import org.metafab.client.models.*;
import org.metafab.client.api.ExchangesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.trymetafab.com");

    ExchangesApi apiInstance = new ExchangesApi(defaultClient);
    String xAuthorization = "game_sk_02z4Mv3c85Ig0gNowY9Dq0N2kjb1xwzr27ArLE0669RrRI6dLf822iPO26K1p1FP"; // String | The `secretKey` of the authenticating game.
    String xPassword = "mySecurePassword"; // String | The password of the authenticating game. Required to decrypt and perform blockchain transactions with the game primary wallet.
    CreateExchangeRequest createExchangeRequest = new CreateExchangeRequest(); // CreateExchangeRequest | 
    try {
      CreateExchange200Response result = apiInstance.createExchange(xAuthorization, xPassword, createExchangeRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExchangesApi#createExchange");
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
| **createExchangeRequest** | [**CreateExchangeRequest**](CreateExchangeRequest.md)|  | |

### Return type

[**CreateExchange200Response**](CreateExchange200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully created a new exchange and deployed its contract on the chain specified. Returns a exchange object containing a contract property with the deployment transaction. |  -  |
| **400** | An API level error occurred. This is often due to problematic data being provided by you. |  -  |
| **401** | An authorization error occured. This is often due to incorrect tokens or keys being provided, or accessing a resource that the provided tokens or keys do not have access to. |  -  |

<a name="getExchangeOffer"></a>
# **getExchangeOffer**
> ExchangeOffer getExchangeOffer(exchangeId, exchangeOfferId)

Get exchange offer

Returns a exchange offer object for the provided exchangeOfferId.

### Example
```java
// Import classes:
import org.metafab.client.ApiClient;
import org.metafab.client.ApiException;
import org.metafab.client.Configuration;
import org.metafab.client.models.*;
import org.metafab.client.api.ExchangesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.trymetafab.com");

    ExchangesApi apiInstance = new ExchangesApi(defaultClient);
    String exchangeId = "exchangeId_example"; // String | Any exchange id within the MetaFab ecosystem.
    String exchangeOfferId = "exchangeOfferId_example"; // String | Any offer id for the exchange. Zero, or a positive integer.
    try {
      ExchangeOffer result = apiInstance.getExchangeOffer(exchangeId, exchangeOfferId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExchangesApi#getExchangeOffer");
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
| **exchangeId** | **String**| Any exchange id within the MetaFab ecosystem. | |
| **exchangeOfferId** | **String**| Any offer id for the exchange. Zero, or a positive integer. | |

### Return type

[**ExchangeOffer**](ExchangeOffer.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved exchange offer. |  -  |
| **400** | An API level error occurred. This is often due to problematic data being provided by you. |  -  |

<a name="getExchangeOffers"></a>
# **getExchangeOffers**
> List&lt;ExchangeOffer&gt; getExchangeOffers(exchangeId)

Get exchange offers

Returns all exchange offers as an array of exchange offer objects.

### Example
```java
// Import classes:
import org.metafab.client.ApiClient;
import org.metafab.client.ApiException;
import org.metafab.client.Configuration;
import org.metafab.client.models.*;
import org.metafab.client.api.ExchangesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.trymetafab.com");

    ExchangesApi apiInstance = new ExchangesApi(defaultClient);
    String exchangeId = "exchangeId_example"; // String | Any exchange id within the MetaFab ecosystem.
    try {
      List<ExchangeOffer> result = apiInstance.getExchangeOffers(exchangeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExchangesApi#getExchangeOffers");
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
| **exchangeId** | **String**| Any exchange id within the MetaFab ecosystem. | |

### Return type

[**List&lt;ExchangeOffer&gt;**](ExchangeOffer.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved exchange offers. |  -  |
| **400** | An API level error occurred. This is often due to problematic data being provided by you. |  -  |

<a name="getExchanges"></a>
# **getExchanges**
> List&lt;GetExchanges200ResponseInner&gt; getExchanges(xGameKey)

Get exchanges

Returns an array of active exchanges for the game associated with the provided &#x60;X-Game-Key&#x60;.

### Example
```java
// Import classes:
import org.metafab.client.ApiClient;
import org.metafab.client.ApiException;
import org.metafab.client.Configuration;
import org.metafab.client.models.*;
import org.metafab.client.api.ExchangesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.trymetafab.com");

    ExchangesApi apiInstance = new ExchangesApi(defaultClient);
    String xGameKey = "game_pk_4SOqpDi8pQdnQgfCOBW29qR8YmwOhxVPz5iHoMgUEJLDdPXgwLuHqZf8ewo2GajZ"; // String | The `publishedKey` of a specific game. This can be shared or included in game clients, websites, etc.
    try {
      List<GetExchanges200ResponseInner> result = apiInstance.getExchanges(xGameKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExchangesApi#getExchanges");
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

[**List&lt;GetExchanges200ResponseInner&gt;**](GetExchanges200ResponseInner.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved an array of exchanges for the game associated with the provided &#x60;X-Game-Key&#x60; |  -  |
| **400** | An API level error occurred. This is often due to problematic data being provided by you. |  -  |

<a name="removeExchangeOffer"></a>
# **removeExchangeOffer**
> TransactionModel removeExchangeOffer(exchangeId, exchangeOfferId, xAuthorization, xPassword)

Remove exchange offer

Removes the provided offerId from the provided exchange. Removed offers can no longer be used.

### Example
```java
// Import classes:
import org.metafab.client.ApiClient;
import org.metafab.client.ApiException;
import org.metafab.client.Configuration;
import org.metafab.client.models.*;
import org.metafab.client.api.ExchangesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.trymetafab.com");

    ExchangesApi apiInstance = new ExchangesApi(defaultClient);
    String exchangeId = "exchangeId_example"; // String | Any exchange id within the MetaFab ecosystem.
    String exchangeOfferId = "exchangeOfferId_example"; // String | Any offer id for the exchange. Zero, or a positive integer.
    String xAuthorization = "game_sk_02z4Mv3c85Ig0gNowY9Dq0N2kjb1xwzr27ArLE0669RrRI6dLf822iPO26K1p1FP"; // String | The `secretKey` of the authenticating game.
    String xPassword = "mySecurePassword"; // String | The password of the authenticating game. Required to decrypt and perform blockchain transactions with the game primary wallet.
    try {
      TransactionModel result = apiInstance.removeExchangeOffer(exchangeId, exchangeOfferId, xAuthorization, xPassword);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExchangesApi#removeExchangeOffer");
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
| **exchangeId** | **String**| Any exchange id within the MetaFab ecosystem. | |
| **exchangeOfferId** | **String**| Any offer id for the exchange. Zero, or a positive integer. | |
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
| **200** | Successfully removed the provided offer from the provided exchange. Returns a transaction object. |  -  |
| **400** | An API level error occurred. This is often due to problematic data being provided by you. |  -  |
| **401** | An authorization error occured. This is often due to incorrect tokens or keys being provided, or accessing a resource that the provided tokens or keys do not have access to. |  -  |

<a name="setExchangeOffer"></a>
# **setExchangeOffer**
> TransactionModel setExchangeOffer(exchangeId, xAuthorization, xPassword, setExchangeOfferRequest)

Set exchange offer

Sets a new exchange offer or updates an existing one for the provided id. Exchange offers allow currency to item, item to currency or item to item exchanges.  All request fields besides &#x60;id&#x60; are optional. Any optional fields omitted will not be used for the offer. This allows you to create many different combinations of offers. For example, you can create an offer that may require 3 unique item ids of specified quantities from a given item collection and gives the user 1 new unique item id in exchange.  Another example, you may want to make an exchange offer from one ERC20 token to another. This is also possible - simple set the input and output currency fields and leave the others blank.

### Example
```java
// Import classes:
import org.metafab.client.ApiClient;
import org.metafab.client.ApiException;
import org.metafab.client.Configuration;
import org.metafab.client.models.*;
import org.metafab.client.api.ExchangesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.trymetafab.com");

    ExchangesApi apiInstance = new ExchangesApi(defaultClient);
    String exchangeId = "exchangeId_example"; // String | Any exchange id within the MetaFab ecosystem.
    String xAuthorization = "game_sk_02z4Mv3c85Ig0gNowY9Dq0N2kjb1xwzr27ArLE0669RrRI6dLf822iPO26K1p1FP"; // String | The `secretKey` of the authenticating game.
    String xPassword = "mySecurePassword"; // String | The password of the authenticating game. Required to decrypt and perform blockchain transactions with the game primary wallet.
    SetExchangeOfferRequest setExchangeOfferRequest = new SetExchangeOfferRequest(); // SetExchangeOfferRequest | 
    try {
      TransactionModel result = apiInstance.setExchangeOffer(exchangeId, xAuthorization, xPassword, setExchangeOfferRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExchangesApi#setExchangeOffer");
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
| **exchangeId** | **String**| Any exchange id within the MetaFab ecosystem. | |
| **xAuthorization** | **String**| The &#x60;secretKey&#x60; of the authenticating game. | |
| **xPassword** | **String**| The password of the authenticating game. Required to decrypt and perform blockchain transactions with the game primary wallet. | |
| **setExchangeOfferRequest** | [**SetExchangeOfferRequest**](SetExchangeOfferRequest.md)|  | |

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
| **200** | Successfully created or updated an exchange offer for the provided offer id. Returns a transaction object. |  -  |
| **400** | An API level error occurred. This is often due to problematic data being provided by you. |  -  |
| **401** | An authorization error occured. This is often due to incorrect tokens or keys being provided, or accessing a resource that the provided tokens or keys do not have access to. |  -  |

<a name="useExchangeOffer"></a>
# **useExchangeOffer**
> TransactionModel useExchangeOffer(exchangeId, exchangeOfferId, xAuthorization, xPassword)

Use exchange offer

Uses an exchange offer. The required (input) item(s) and/or currency are removed from the wallet or player wallet using the offer. The given (output) item(s) and/or currency are given to the wallet or player wallet using the offer.

### Example
```java
// Import classes:
import org.metafab.client.ApiClient;
import org.metafab.client.ApiException;
import org.metafab.client.Configuration;
import org.metafab.client.models.*;
import org.metafab.client.api.ExchangesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.trymetafab.com");

    ExchangesApi apiInstance = new ExchangesApi(defaultClient);
    String exchangeId = "exchangeId_example"; // String | Any exchange id within the MetaFab ecosystem.
    String exchangeOfferId = "exchangeOfferId_example"; // String | Any offer id for the exchange. Zero, or a positive integer.
    String xAuthorization = "[\"game_sk_02z4Mv3c85Ig0gNowY9Dq0N2kjb1xwzr27ArLE0669RrRI6dLf822iPO26K1p1FP\",\"player_at_02z4Mv3c85Ig0gNowY9Dq0N2kjb1xwzr27ArLE0669RrRI6dLf822iPO26K1p1FP\"]"; // String | The `secretKey` of a specific game or the `accessToken` of a specific player.
    String xPassword = "mySecurePassword"; // String | The password of the authenticating game or player. Required to decrypt and perform blockchain transactions with the game or player primary wallet.
    try {
      TransactionModel result = apiInstance.useExchangeOffer(exchangeId, exchangeOfferId, xAuthorization, xPassword);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExchangesApi#useExchangeOffer");
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
| **exchangeId** | **String**| Any exchange id within the MetaFab ecosystem. | |
| **exchangeOfferId** | **String**| Any offer id for the exchange. Zero, or a positive integer. | |
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
| **200** | Successfully used provided exchange offer. Returns a transaction object. |  -  |
| **400** | An API level error occurred. This is often due to problematic data being provided by you. |  -  |
| **401** | An authorization error occured. This is often due to incorrect tokens or keys being provided, or accessing a resource that the provided tokens or keys do not have access to. |  -  |

<a name="withdrawFromExchange"></a>
# **withdrawFromExchange**
> TransactionModel withdrawFromExchange(exchangeId, xAuthorization, xPassword, withdrawFromExchangeRequest)

Withdraw from exchange

Withdraws native token, currency or items from a exchange. Whenever an exchange offer has input requirements, the native tokens, currencies or items for the requirements of that offer are deposited into the exchange contract when the offer is used. These can be withdrawn to any other address.

### Example
```java
// Import classes:
import org.metafab.client.ApiClient;
import org.metafab.client.ApiException;
import org.metafab.client.Configuration;
import org.metafab.client.models.*;
import org.metafab.client.api.ExchangesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.trymetafab.com");

    ExchangesApi apiInstance = new ExchangesApi(defaultClient);
    String exchangeId = "exchangeId_example"; // String | Any exchange id within the MetaFab ecosystem.
    String xAuthorization = "game_sk_02z4Mv3c85Ig0gNowY9Dq0N2kjb1xwzr27ArLE0669RrRI6dLf822iPO26K1p1FP"; // String | The `secretKey` of the authenticating game.
    String xPassword = "mySecurePassword"; // String | The password of the authenticating game. Required to decrypt and perform blockchain transactions with the game primary wallet.
    WithdrawFromExchangeRequest withdrawFromExchangeRequest = new WithdrawFromExchangeRequest(); // WithdrawFromExchangeRequest | 
    try {
      TransactionModel result = apiInstance.withdrawFromExchange(exchangeId, xAuthorization, xPassword, withdrawFromExchangeRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExchangesApi#withdrawFromExchange");
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
| **exchangeId** | **String**| Any exchange id within the MetaFab ecosystem. | |
| **xAuthorization** | **String**| The &#x60;secretKey&#x60; of the authenticating game. | |
| **xPassword** | **String**| The password of the authenticating game. Required to decrypt and perform blockchain transactions with the game primary wallet. | |
| **withdrawFromExchangeRequest** | [**WithdrawFromExchangeRequest**](WithdrawFromExchangeRequest.md)|  | |

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

