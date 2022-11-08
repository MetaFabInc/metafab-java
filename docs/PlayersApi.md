# PlayersApi

All URIs are relative to *https://api.trymetafab.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**authPlayer**](PlayersApi.md#authPlayer) | **GET** /v1/players/auth | Authenticate player |
| [**createPlayer**](PlayersApi.md#createPlayer) | **POST** /v1/players | Create player |
| [**getPlayer**](PlayersApi.md#getPlayer) | **GET** /v1/players/{playerId} | Get player |
| [**getPlayers**](PlayersApi.md#getPlayers) | **GET** /v1/players | Get players |
| [**updatePlayer**](PlayersApi.md#updatePlayer) | **PATCH** /v1/players/{playerId} | Update player |


<a name="authPlayer"></a>
# **authPlayer**
> AuthPlayer200Response authPlayer(xGameKey)

Authenticate player

Returns an existing player object containing access token, wallet, and other details for a game when provided a valid username and password login using Basic Auth.

### Example
```java
// Import classes:
import org.metafab.client.ApiClient;
import org.metafab.client.ApiException;
import org.metafab.client.Configuration;
import org.metafab.client.auth.*;
import org.metafab.client.models.*;
import org.metafab.client.api.PlayersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.trymetafab.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    PlayersApi apiInstance = new PlayersApi(defaultClient);
    String xGameKey = "game_pk_4SOqpDi8pQdnQgfCOBW29qR8YmwOhxVPz5iHoMgUEJLDdPXgwLuHqZf8ewo2GajZ"; // String | The `publishedKey` of a specific game. This can be shared or included in game clients, websites, etc.
    try {
      AuthPlayer200Response result = apiInstance.authPlayer(xGameKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlayersApi#authPlayer");
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

[**AuthPlayer200Response**](AuthPlayer200Response.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Succesfully authorized the request and retrieved a player object containing access token, wallet, and other details. |  -  |
| **400** | An API level error occurred. This is often due to problematic data being provided by you. |  -  |
| **401** | An authorization error occured. This is often due to incorrect tokens or keys being provided, or accessing a resource that the provided tokens or keys do not have access to. |  -  |

<a name="createPlayer"></a>
# **createPlayer**
> AuthPlayer200Response createPlayer(xGameKey, createPlayerRequest)

Create player

Create a new player for a game. Players are automatically associated with an internally managed wallet.  Player access tokens can be used to directly interact with any MetaFab managed contracts, currencies, items collections, marketplaces and more. Player interactions are also gasless by default, completely removing all crypto friction for players to engage with your MetaFab supported games.

### Example
```java
// Import classes:
import org.metafab.client.ApiClient;
import org.metafab.client.ApiException;
import org.metafab.client.Configuration;
import org.metafab.client.models.*;
import org.metafab.client.api.PlayersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.trymetafab.com");

    PlayersApi apiInstance = new PlayersApi(defaultClient);
    String xGameKey = "game_pk_4SOqpDi8pQdnQgfCOBW29qR8YmwOhxVPz5iHoMgUEJLDdPXgwLuHqZf8ewo2GajZ"; // String | The `publishedKey` of a specific game. This can be shared or included in game clients, websites, etc.
    CreatePlayerRequest createPlayerRequest = new CreatePlayerRequest(); // CreatePlayerRequest | 
    try {
      AuthPlayer200Response result = apiInstance.createPlayer(xGameKey, createPlayerRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlayersApi#createPlayer");
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
| **createPlayerRequest** | [**CreatePlayerRequest**](CreatePlayerRequest.md)|  | |

### Return type

[**AuthPlayer200Response**](AuthPlayer200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully created a new player. Returns a player object containing a wallet (used to interact with contracts, currencies, etc). |  -  |
| **400** | An API level error occurred. This is often due to problematic data being provided by you. |  -  |
| **401** | An authorization error occured. This is often due to incorrect tokens or keys being provided, or accessing a resource that the provided tokens or keys do not have access to. |  -  |

<a name="getPlayer"></a>
# **getPlayer**
> PublicPlayer getPlayer(playerId)

Get player

Returns a player object for the provided player id.

### Example
```java
// Import classes:
import org.metafab.client.ApiClient;
import org.metafab.client.ApiException;
import org.metafab.client.Configuration;
import org.metafab.client.models.*;
import org.metafab.client.api.PlayersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.trymetafab.com");

    PlayersApi apiInstance = new PlayersApi(defaultClient);
    String playerId = "playerId_example"; // String | Any player id within the MetaFab ecosystem.
    try {
      PublicPlayer result = apiInstance.getPlayer(playerId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlayersApi#getPlayer");
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
| **playerId** | **String**| Any player id within the MetaFab ecosystem. | |

### Return type

[**PublicPlayer**](PublicPlayer.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved player. |  -  |
| **400** | An API level error occurred. This is often due to problematic data being provided by you. |  -  |

<a name="getPlayers"></a>
# **getPlayers**
> List&lt;PublicPlayer&gt; getPlayers(xAuthorization)

Get players

Returns all players for the authenticated game as an array of player objects.

### Example
```java
// Import classes:
import org.metafab.client.ApiClient;
import org.metafab.client.ApiException;
import org.metafab.client.Configuration;
import org.metafab.client.models.*;
import org.metafab.client.api.PlayersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.trymetafab.com");

    PlayersApi apiInstance = new PlayersApi(defaultClient);
    String xAuthorization = "game_sk_02z4Mv3c85Ig0gNowY9Dq0N2kjb1xwzr27ArLE0669RrRI6dLf822iPO26K1p1FP"; // String | The `secretKey` of the authenticating game.
    try {
      List<PublicPlayer> result = apiInstance.getPlayers(xAuthorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlayersApi#getPlayers");
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

### Return type

[**List&lt;PublicPlayer&gt;**](PublicPlayer.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved players. |  -  |
| **401** | An authorization error occured. This is often due to incorrect tokens or keys being provided, or accessing a resource that the provided tokens or keys do not have access to. |  -  |

<a name="updatePlayer"></a>
# **updatePlayer**
> PlayerModel updatePlayer(playerId, xAuthorization, updatePlayerRequest)

Update player

Update various fields specific to a player. Such as changing its password and resetting its access token.

### Example
```java
// Import classes:
import org.metafab.client.ApiClient;
import org.metafab.client.ApiException;
import org.metafab.client.Configuration;
import org.metafab.client.models.*;
import org.metafab.client.api.PlayersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.trymetafab.com");

    PlayersApi apiInstance = new PlayersApi(defaultClient);
    String playerId = "playerId_example"; // String | Any player id within the MetaFab ecosystem.
    String xAuthorization = "player_at_02z4Mv3c85Ig0gNowY9Dq0N2kjb1xwzr27ArLE0669RrRI6dLf822iPO26K1p1FP"; // String | The `accessToken` of the authenticating player.
    UpdatePlayerRequest updatePlayerRequest = new UpdatePlayerRequest(); // UpdatePlayerRequest | 
    try {
      PlayerModel result = apiInstance.updatePlayer(playerId, xAuthorization, updatePlayerRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlayersApi#updatePlayer");
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
| **playerId** | **String**| Any player id within the MetaFab ecosystem. | |
| **xAuthorization** | **String**| The &#x60;accessToken&#x60; of the authenticating player. | |
| **updatePlayerRequest** | [**UpdatePlayerRequest**](UpdatePlayerRequest.md)|  | |

### Return type

[**PlayerModel**](PlayerModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the updated player object. |  -  |
| **400** | An API level error occurred. This is often due to problematic data being provided by you. |  -  |
| **401** | An authorization error occured. This is often due to incorrect tokens or keys being provided, or accessing a resource that the provided tokens or keys do not have access to. |  -  |

