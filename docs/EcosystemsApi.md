# EcosystemsApi

All URIs are relative to *https://api.trymetafab.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**approveEcosystemGame**](EcosystemsApi.md#approveEcosystemGame) | **POST** /v1/ecosystems/{ecosystemId}/games | Approve ecosystem game |
| [**authEcosystem**](EcosystemsApi.md#authEcosystem) | **GET** /v1/ecosystems/auth | Authenticate ecosystem |
| [**authProfile**](EcosystemsApi.md#authProfile) | **GET** /v1/profiles/auth | Authenticate profile |
| [**authProfilePlayer**](EcosystemsApi.md#authProfilePlayer) | **GET** /v1/profiles/{profileId}/games/{gameId}/players/auth | Authenticate profile player |
| [**createEcosystem**](EcosystemsApi.md#createEcosystem) | **POST** /v1/ecosystems | Create ecosystem |
| [**createProfile**](EcosystemsApi.md#createProfile) | **POST** /v1/profiles | Create profile |
| [**createProfilePlayer**](EcosystemsApi.md#createProfilePlayer) | **POST** /v1/profiles/{profileId}/games/{gameId}/players | Create profile player |
| [**getEcosystem**](EcosystemsApi.md#getEcosystem) | **GET** /v1/ecosystems/{ecosystemId} | Get ecosystem |
| [**getEcosystemGame**](EcosystemsApi.md#getEcosystemGame) | **GET** /v1/ecosystems/{ecosystemId}/games/{gameId} | Get ecosystem game |
| [**getEcosystemGames**](EcosystemsApi.md#getEcosystemGames) | **GET** /v1/ecosystems/{ecosystemId}/games | Get ecosystem games |
| [**getProfileGame**](EcosystemsApi.md#getProfileGame) | **GET** /v1/profiles/{profileId}/games/{gameId} | Get profile game |
| [**getProfileGames**](EcosystemsApi.md#getProfileGames) | **GET** /v1/profiles/{profileId}/games | Get profile games |
| [**unapproveEcosystemGame**](EcosystemsApi.md#unapproveEcosystemGame) | **DELETE** /v1/ecosystems/{ecosystemId}/games/{gameId} | Unapprove ecosystem game |
| [**updateEcosystem**](EcosystemsApi.md#updateEcosystem) | **PATCH** /v1/ecosystems/{ecosystemId} | Update ecosystem |
| [**updateProfile**](EcosystemsApi.md#updateProfile) | **PATCH** /v1/profiles/{profileId} | Update profile |
| [**updateProfilePlayer**](EcosystemsApi.md#updateProfilePlayer) | **PATCH** /v1/profiles/{profileId}/games/{gameId}/players/{playerId} | Update profile player |


<a name="approveEcosystemGame"></a>
# **approveEcosystemGame**
> approveEcosystemGame(ecosystemId, xAuthorization, approveEcosystemGameRequest)

Approve ecosystem game

Approves a game for an ecosystem. By approving a game, it allows that game to integrate the ability for profile accounts from an ecosystem to login directly to the approved game and play. This also allows games to request access to assets held at the profile level for the game to frictionlessly interact with on behalf of the profile.

### Example
```java
// Import classes:
import org.metafab.client.ApiClient;
import org.metafab.client.ApiException;
import org.metafab.client.Configuration;
import org.metafab.client.models.*;
import org.metafab.client.api.EcosystemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.trymetafab.com");

    EcosystemsApi apiInstance = new EcosystemsApi(defaultClient);
    String ecosystemId = "ecosystemId_example"; // String | The ecosystem id of the authenticating ecosystem.
    String xAuthorization = "ecosystem_sk_02z4Mv3c85Ig0gNowY9Dq0N2kjb1xwzr27ArLE0669RrRI6dLf822iPO26K1p1FP"; // String | The `secretKey` of the authenticating ecosystem.
    ApproveEcosystemGameRequest approveEcosystemGameRequest = new ApproveEcosystemGameRequest(); // ApproveEcosystemGameRequest | 
    try {
      apiInstance.approveEcosystemGame(ecosystemId, xAuthorization, approveEcosystemGameRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling EcosystemsApi#approveEcosystemGame");
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
| **ecosystemId** | **String**| The ecosystem id of the authenticating ecosystem. | |
| **xAuthorization** | **String**| The &#x60;secretKey&#x60; of the authenticating ecosystem. | |
| **approveEcosystemGameRequest** | [**ApproveEcosystemGameRequest**](ApproveEcosystemGameRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Successfully approved the game for the ecosystem. |  -  |
| **400** | An API level error occurred. This is often due to problematic data being provided by you. |  -  |
| **401** | An authorization error occured. This is often due to incorrect tokens or keys being provided, or accessing a resource that the provided tokens or keys do not have access to. |  -  |

<a name="authEcosystem"></a>
# **authEcosystem**
> EcosystemModel authEcosystem()

Authenticate ecosystem

Returns an existing ecosystem object containing authorization keys when provided a valid email (in place of username) and password login using Basic Auth.

### Example
```java
// Import classes:
import org.metafab.client.ApiClient;
import org.metafab.client.ApiException;
import org.metafab.client.Configuration;
import org.metafab.client.auth.*;
import org.metafab.client.models.*;
import org.metafab.client.api.EcosystemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.trymetafab.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    EcosystemsApi apiInstance = new EcosystemsApi(defaultClient);
    try {
      EcosystemModel result = apiInstance.authEcosystem();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EcosystemsApi#authEcosystem");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**EcosystemModel**](EcosystemModel.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Succesfully authorized the request and retrieved an ecosystem object containing authorization keys and credentials. |  -  |
| **400** | An API level error occurred. This is often due to problematic data being provided by you. |  -  |
| **401** | An authorization error occured. This is often due to incorrect tokens or keys being provided, or accessing a resource that the provided tokens or keys do not have access to. |  -  |

<a name="authProfile"></a>
# **authProfile**
> AuthProfile200Response authProfile(xEcosystemKey)

Authenticate profile

Returns an existing profile object containing access token, wallet, and other details when provided a valid profile username and password login using Basic Auth.

### Example
```java
// Import classes:
import org.metafab.client.ApiClient;
import org.metafab.client.ApiException;
import org.metafab.client.Configuration;
import org.metafab.client.auth.*;
import org.metafab.client.models.*;
import org.metafab.client.api.EcosystemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.trymetafab.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    EcosystemsApi apiInstance = new EcosystemsApi(defaultClient);
    String xEcosystemKey = "ecosystem_pk_a5sFpDi8pQdnQgfCOBW29qR8YmwOhxVPz5iHoMgUEJLDdPXgwLuHqZf8ewo2GajZ"; // String | The `publishedKey` of a specific ecosystem. This can be shared or included in clients, websites, etc.
    try {
      AuthProfile200Response result = apiInstance.authProfile(xEcosystemKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EcosystemsApi#authProfile");
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
| **xEcosystemKey** | **String**| The &#x60;publishedKey&#x60; of a specific ecosystem. This can be shared or included in clients, websites, etc. | |

### Return type

[**AuthProfile200Response**](AuthProfile200Response.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Succesfully authorized the request and retrieved a profile object containing access token, wallet, and other details. |  -  |
| **400** | An API level error occurred. This is often due to problematic data being provided by you. |  -  |
| **401** | An authorization error occured. This is often due to incorrect tokens or keys being provided, or accessing a resource that the provided tokens or keys do not have access to. |  -  |

<a name="authProfilePlayer"></a>
# **authProfilePlayer**
> AuthPlayer200Response authProfilePlayer(profileId, gameId, xAuthorization, xWalletDecryptKey, xUsername)

Authenticate profile player

Returns an existing player object containing access token, wallet, wallet decrypt key, profile authorization and other details for a game when provided profile authentication and the player&#39;s username.

### Example
```java
// Import classes:
import org.metafab.client.ApiClient;
import org.metafab.client.ApiException;
import org.metafab.client.Configuration;
import org.metafab.client.models.*;
import org.metafab.client.api.EcosystemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.trymetafab.com");

    EcosystemsApi apiInstance = new EcosystemsApi(defaultClient);
    String profileId = "profileId_example"; // String | The profile id of the authenticating profile.
    String gameId = "gameId_example"; // String | Any game id within the MetaFab platform.
    String xAuthorization = "profile_at_02z4Mv3c85Ig0gNowY9Dq0N2kjb1xwzr27ArLE0669RrRI6dLf822iPO26K1p1FP"; // String | The `accessToken` of the authenticating profile.
    String xWalletDecryptKey = "AXNP8MKb+5SbBtHWrZu5KHh5/BomXY/dMRG/BDUn7a4="; // String | The `walletDecryptKey` of the authenticating profile. Required to decrypt and perform blockchain transactions with the profile wallet.
    String xUsername = "arkdev"; // String | The username of a player.
    try {
      AuthPlayer200Response result = apiInstance.authProfilePlayer(profileId, gameId, xAuthorization, xWalletDecryptKey, xUsername);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EcosystemsApi#authProfilePlayer");
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
| **profileId** | **String**| The profile id of the authenticating profile. | |
| **gameId** | **String**| Any game id within the MetaFab platform. | |
| **xAuthorization** | **String**| The &#x60;accessToken&#x60; of the authenticating profile. | |
| **xWalletDecryptKey** | **String**| The &#x60;walletDecryptKey&#x60; of the authenticating profile. Required to decrypt and perform blockchain transactions with the profile wallet. | |
| **xUsername** | **String**| The username of a player. | |

### Return type

[**AuthPlayer200Response**](AuthPlayer200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Succesfully authorized the request and retrieved a player object containing access token, wallet, profile authorization, and other details. |  -  |
| **400** | An API level error occurred. This is often due to problematic data being provided by you. |  -  |
| **401** | An authorization error occured. This is often due to incorrect tokens or keys being provided, or accessing a resource that the provided tokens or keys do not have access to. |  -  |

<a name="createEcosystem"></a>
# **createEcosystem**
> EcosystemModel createEcosystem(createEcosystemRequest)

Create ecosystem

Create a new ecosystem. An ecosystem is a parent entity that many profiles live under for a given ecosystem of games. Ecosystems allow your players to create one profile within your ecosystem that allows a single account and wallet to be used across all of the approved games in your ecosystem that they play.

### Example
```java
// Import classes:
import org.metafab.client.ApiClient;
import org.metafab.client.ApiException;
import org.metafab.client.Configuration;
import org.metafab.client.models.*;
import org.metafab.client.api.EcosystemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.trymetafab.com");

    EcosystemsApi apiInstance = new EcosystemsApi(defaultClient);
    CreateEcosystemRequest createEcosystemRequest = new CreateEcosystemRequest(); // CreateEcosystemRequest | 
    try {
      EcosystemModel result = apiInstance.createEcosystem(createEcosystemRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EcosystemsApi#createEcosystem");
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
| **createEcosystemRequest** | [**CreateEcosystemRequest**](CreateEcosystemRequest.md)|  | |

### Return type

[**EcosystemModel**](EcosystemModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully created a new ecosystem. Returns an ecosystem object. |  -  |
| **400** | An API level error occurred. This is often due to problematic data being provided by you. |  -  |
| **401** | An authorization error occured. This is often due to incorrect tokens or keys being provided, or accessing a resource that the provided tokens or keys do not have access to. |  -  |

<a name="createProfile"></a>
# **createProfile**
> AuthProfile200Response createProfile(xEcosystemKey, createProfileRequest)

Create profile

Create a new profile. Profiles are automatically associated with an internally managed wallet. Profiles can be thought of as a umbrella account that can be used to sign into and create player accounts across many games and have a singular asset store wallet at the profile level that can be used across all connected player accounts for games those player accounts are a part of.  Profiles are associated to a parent ecosystem of games. This allows an ecosystem to approve a permissioned set of games that can request authorized wallet permissions from profiles of players for their game.

### Example
```java
// Import classes:
import org.metafab.client.ApiClient;
import org.metafab.client.ApiException;
import org.metafab.client.Configuration;
import org.metafab.client.models.*;
import org.metafab.client.api.EcosystemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.trymetafab.com");

    EcosystemsApi apiInstance = new EcosystemsApi(defaultClient);
    String xEcosystemKey = "ecosystem_pk_a5sFpDi8pQdnQgfCOBW29qR8YmwOhxVPz5iHoMgUEJLDdPXgwLuHqZf8ewo2GajZ"; // String | The `publishedKey` of a specific ecosystem. This can be shared or included in clients, websites, etc.
    CreateProfileRequest createProfileRequest = new CreateProfileRequest(); // CreateProfileRequest | 
    try {
      AuthProfile200Response result = apiInstance.createProfile(xEcosystemKey, createProfileRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EcosystemsApi#createProfile");
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
| **xEcosystemKey** | **String**| The &#x60;publishedKey&#x60; of a specific ecosystem. This can be shared or included in clients, websites, etc. | |
| **createProfileRequest** | [**CreateProfileRequest**](CreateProfileRequest.md)|  | |

### Return type

[**AuthProfile200Response**](AuthProfile200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully created a new profile. Returns a profile object containing a wallet (used to interact with contracts, currencies, etc). |  -  |
| **400** | An API level error occurred. This is often due to problematic data being provided by you. |  -  |
| **401** | An authorization error occured. This is often due to incorrect tokens or keys being provided, or accessing a resource that the provided tokens or keys do not have access to. |  -  |

<a name="createProfilePlayer"></a>
# **createProfilePlayer**
> AuthPlayer200Response createProfilePlayer(profileId, gameId, xAuthorization, xWalletDecryptKey, createProfilePlayerRequest)

Create profile player

Creates a new player account for the provided game id linked to the authenticating profile. The created player account will default to using the parent profile&#39;s wallet for any transactions, wallet content balance checks and verifications, and more.

### Example
```java
// Import classes:
import org.metafab.client.ApiClient;
import org.metafab.client.ApiException;
import org.metafab.client.Configuration;
import org.metafab.client.models.*;
import org.metafab.client.api.EcosystemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.trymetafab.com");

    EcosystemsApi apiInstance = new EcosystemsApi(defaultClient);
    String profileId = "profileId_example"; // String | The profile id of the authenticating profile.
    String gameId = "gameId_example"; // String | Any game id within the MetaFab platform.
    String xAuthorization = "profile_at_02z4Mv3c85Ig0gNowY9Dq0N2kjb1xwzr27ArLE0669RrRI6dLf822iPO26K1p1FP"; // String | The `accessToken` of the authenticating profile.
    String xWalletDecryptKey = "AXNP8MKb+5SbBtHWrZu5KHh5/BomXY/dMRG/BDUn7a4="; // String | The `walletDecryptKey` of the authenticating profile. Required to decrypt and perform blockchain transactions with the profile wallet.
    CreateProfilePlayerRequest createProfilePlayerRequest = new CreateProfilePlayerRequest(); // CreateProfilePlayerRequest | 
    try {
      AuthPlayer200Response result = apiInstance.createProfilePlayer(profileId, gameId, xAuthorization, xWalletDecryptKey, createProfilePlayerRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EcosystemsApi#createProfilePlayer");
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
| **profileId** | **String**| The profile id of the authenticating profile. | |
| **gameId** | **String**| Any game id within the MetaFab platform. | |
| **xAuthorization** | **String**| The &#x60;accessToken&#x60; of the authenticating profile. | |
| **xWalletDecryptKey** | **String**| The &#x60;walletDecryptKey&#x60; of the authenticating profile. Required to decrypt and perform blockchain transactions with the profile wallet. | |
| **createProfilePlayerRequest** | [**CreateProfilePlayerRequest**](CreateProfilePlayerRequest.md)|  | |

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
| **200** | Successfully created a new player linked to the authenticating profile. Returns a player object. |  -  |
| **400** | An API level error occurred. This is often due to problematic data being provided by you. |  -  |
| **401** | An authorization error occured. This is often due to incorrect tokens or keys being provided, or accessing a resource that the provided tokens or keys do not have access to. |  -  |

<a name="getEcosystem"></a>
# **getEcosystem**
> PublicEcosystem getEcosystem(ecosystemId)

Get ecosystem

Returns a ecosystem object for the provided ecosystem id.

### Example
```java
// Import classes:
import org.metafab.client.ApiClient;
import org.metafab.client.ApiException;
import org.metafab.client.Configuration;
import org.metafab.client.models.*;
import org.metafab.client.api.EcosystemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.trymetafab.com");

    EcosystemsApi apiInstance = new EcosystemsApi(defaultClient);
    String ecosystemId = "ecosystemId_example"; // String | Any ecosystem id within the MetaFab platform.
    try {
      PublicEcosystem result = apiInstance.getEcosystem(ecosystemId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EcosystemsApi#getEcosystem");
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
| **ecosystemId** | **String**| Any ecosystem id within the MetaFab platform. | |

### Return type

[**PublicEcosystem**](PublicEcosystem.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved ecosystem. |  -  |
| **400** | An API level error occurred. This is often due to problematic data being provided by you. |  -  |

<a name="getEcosystemGame"></a>
# **getEcosystemGame**
> PublicGame getEcosystemGame(ecosystemId, gameId)

Get ecosystem game

Returns a game object for the provided game id that the ecosystem has approved.

### Example
```java
// Import classes:
import org.metafab.client.ApiClient;
import org.metafab.client.ApiException;
import org.metafab.client.Configuration;
import org.metafab.client.models.*;
import org.metafab.client.api.EcosystemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.trymetafab.com");

    EcosystemsApi apiInstance = new EcosystemsApi(defaultClient);
    String ecosystemId = "ecosystemId_example"; // String | Any ecosystem id within the MetaFab platform.
    String gameId = "gameId_example"; // String | Any game id within the MetaFab platform.
    try {
      PublicGame result = apiInstance.getEcosystemGame(ecosystemId, gameId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EcosystemsApi#getEcosystemGame");
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
| **ecosystemId** | **String**| Any ecosystem id within the MetaFab platform. | |
| **gameId** | **String**| Any game id within the MetaFab platform. | |

### Return type

[**PublicGame**](PublicGame.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved an approved game. |  -  |
| **400** | An API level error occurred. This is often due to problematic data being provided by you. |  -  |

<a name="getEcosystemGames"></a>
# **getEcosystemGames**
> List&lt;PublicGame&gt; getEcosystemGames(ecosystemId)

Get ecosystem games

Returns an array of games the ecosystem has approved.

### Example
```java
// Import classes:
import org.metafab.client.ApiClient;
import org.metafab.client.ApiException;
import org.metafab.client.Configuration;
import org.metafab.client.models.*;
import org.metafab.client.api.EcosystemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.trymetafab.com");

    EcosystemsApi apiInstance = new EcosystemsApi(defaultClient);
    String ecosystemId = "ecosystemId_example"; // String | Any ecosystem id within the MetaFab platform.
    try {
      List<PublicGame> result = apiInstance.getEcosystemGames(ecosystemId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EcosystemsApi#getEcosystemGames");
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
| **ecosystemId** | **String**| Any ecosystem id within the MetaFab platform. | |

### Return type

[**List&lt;PublicGame&gt;**](PublicGame.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved an array of approved games. |  -  |
| **400** | An API level error occurred. This is often due to problematic data being provided by you. |  -  |

<a name="getProfileGame"></a>
# **getProfileGame**
> GetProfileGames200ResponseInner getProfileGame(profileId, gameId, xAuthorization)

Get profile game

Returns a game this profile has connected player accounts for.

### Example
```java
// Import classes:
import org.metafab.client.ApiClient;
import org.metafab.client.ApiException;
import org.metafab.client.Configuration;
import org.metafab.client.models.*;
import org.metafab.client.api.EcosystemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.trymetafab.com");

    EcosystemsApi apiInstance = new EcosystemsApi(defaultClient);
    String profileId = "profileId_example"; // String | The profile id of the authenticating profile.
    String gameId = "gameId_example"; // String | Any game id within the MetaFab platform.
    String xAuthorization = "profile_at_02z4Mv3c85Ig0gNowY9Dq0N2kjb1xwzr27ArLE0669RrRI6dLf822iPO26K1p1FP"; // String | The `accessToken` of the authenticating profile.
    try {
      GetProfileGames200ResponseInner result = apiInstance.getProfileGame(profileId, gameId, xAuthorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EcosystemsApi#getProfileGame");
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
| **profileId** | **String**| The profile id of the authenticating profile. | |
| **gameId** | **String**| Any game id within the MetaFab platform. | |
| **xAuthorization** | **String**| The &#x60;accessToken&#x60; of the authenticating profile. | |

### Return type

[**GetProfileGames200ResponseInner**](GetProfileGames200ResponseInner.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved array of games this profile has connected player accounts for. |  -  |
| **400** | An API level error occurred. This is often due to problematic data being provided by you. |  -  |
| **401** | An authorization error occured. This is often due to incorrect tokens or keys being provided, or accessing a resource that the provided tokens or keys do not have access to. |  -  |

<a name="getProfileGames"></a>
# **getProfileGames**
> List&lt;GetProfileGames200ResponseInner&gt; getProfileGames(profileId, xAuthorization)

Get profile games

Returns an array of games the authorized profile has connected player accounts for.

### Example
```java
// Import classes:
import org.metafab.client.ApiClient;
import org.metafab.client.ApiException;
import org.metafab.client.Configuration;
import org.metafab.client.models.*;
import org.metafab.client.api.EcosystemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.trymetafab.com");

    EcosystemsApi apiInstance = new EcosystemsApi(defaultClient);
    String profileId = "profileId_example"; // String | The profile id of the authenticating profile.
    String xAuthorization = "profile_at_02z4Mv3c85Ig0gNowY9Dq0N2kjb1xwzr27ArLE0669RrRI6dLf822iPO26K1p1FP"; // String | The `accessToken` of the authenticating profile.
    try {
      List<GetProfileGames200ResponseInner> result = apiInstance.getProfileGames(profileId, xAuthorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EcosystemsApi#getProfileGames");
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
| **profileId** | **String**| The profile id of the authenticating profile. | |
| **xAuthorization** | **String**| The &#x60;accessToken&#x60; of the authenticating profile. | |

### Return type

[**List&lt;GetProfileGames200ResponseInner&gt;**](GetProfileGames200ResponseInner.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved array of games this profile has connected player accounts for. |  -  |
| **400** | An API level error occurred. This is often due to problematic data being provided by you. |  -  |
| **401** | An authorization error occured. This is often due to incorrect tokens or keys being provided, or accessing a resource that the provided tokens or keys do not have access to. |  -  |

<a name="unapproveEcosystemGame"></a>
# **unapproveEcosystemGame**
> unapproveEcosystemGame(ecosystemId, gameId, xAuthorization)

Unapprove ecosystem game

Unapproves a game for an ecosystem. The game will no longer be able to allow profiles from the ecosystem to login. All profile permissions approved for the game will also be revoked.

### Example
```java
// Import classes:
import org.metafab.client.ApiClient;
import org.metafab.client.ApiException;
import org.metafab.client.Configuration;
import org.metafab.client.models.*;
import org.metafab.client.api.EcosystemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.trymetafab.com");

    EcosystemsApi apiInstance = new EcosystemsApi(defaultClient);
    String ecosystemId = "ecosystemId_example"; // String | The ecosystem id of the authenticating ecosystem.
    String gameId = "gameId_example"; // String | Any game id within the MetaFab platform.
    String xAuthorization = "ecosystem_sk_02z4Mv3c85Ig0gNowY9Dq0N2kjb1xwzr27ArLE0669RrRI6dLf822iPO26K1p1FP"; // String | The `secretKey` of the authenticating ecosystem.
    try {
      apiInstance.unapproveEcosystemGame(ecosystemId, gameId, xAuthorization);
    } catch (ApiException e) {
      System.err.println("Exception when calling EcosystemsApi#unapproveEcosystemGame");
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
| **ecosystemId** | **String**| The ecosystem id of the authenticating ecosystem. | |
| **gameId** | **String**| Any game id within the MetaFab platform. | |
| **xAuthorization** | **String**| The &#x60;secretKey&#x60; of the authenticating ecosystem. | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Successfully approved the game for the ecosystem. |  -  |
| **400** | An API level error occurred. This is often due to problematic data being provided by you. |  -  |
| **401** | An authorization error occured. This is often due to incorrect tokens or keys being provided, or accessing a resource that the provided tokens or keys do not have access to. |  -  |

<a name="updateEcosystem"></a>
# **updateEcosystem**
> EcosystemModel updateEcosystem(ecosystemId, xAuthorization, updateEcosystemRequest)

Update ecosystem

Update various fields specific to an ecosystem. Such as changing its password, resetting its published or secret key, or updating its approved games.

### Example
```java
// Import classes:
import org.metafab.client.ApiClient;
import org.metafab.client.ApiException;
import org.metafab.client.Configuration;
import org.metafab.client.models.*;
import org.metafab.client.api.EcosystemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.trymetafab.com");

    EcosystemsApi apiInstance = new EcosystemsApi(defaultClient);
    String ecosystemId = "ecosystemId_example"; // String | The ecosystem id of the authenticating ecosystem.
    String xAuthorization = "ecosystem_sk_02z4Mv3c85Ig0gNowY9Dq0N2kjb1xwzr27ArLE0669RrRI6dLf822iPO26K1p1FP"; // String | The `secretKey` of the authenticating ecosystem.
    UpdateEcosystemRequest updateEcosystemRequest = new UpdateEcosystemRequest(); // UpdateEcosystemRequest | 
    try {
      EcosystemModel result = apiInstance.updateEcosystem(ecosystemId, xAuthorization, updateEcosystemRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EcosystemsApi#updateEcosystem");
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
| **ecosystemId** | **String**| The ecosystem id of the authenticating ecosystem. | |
| **xAuthorization** | **String**| The &#x60;secretKey&#x60; of the authenticating ecosystem. | |
| **updateEcosystemRequest** | [**UpdateEcosystemRequest**](UpdateEcosystemRequest.md)|  | |

### Return type

[**EcosystemModel**](EcosystemModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the updated ecosystem object. |  -  |
| **400** | An API level error occurred. This is often due to problematic data being provided by you. |  -  |
| **401** | An authorization error occured. This is often due to incorrect tokens or keys being provided, or accessing a resource that the provided tokens or keys do not have access to. |  -  |

<a name="updateProfile"></a>
# **updateProfile**
> ProfileModel updateProfile(profileId, xAuthorization, updateProfileRequest)

Update profile

Update various fields specific to a profile. Such as changing its password and resetting its access token.

### Example
```java
// Import classes:
import org.metafab.client.ApiClient;
import org.metafab.client.ApiException;
import org.metafab.client.Configuration;
import org.metafab.client.models.*;
import org.metafab.client.api.EcosystemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.trymetafab.com");

    EcosystemsApi apiInstance = new EcosystemsApi(defaultClient);
    String profileId = "profileId_example"; // String | The profile id of the authenticating profile.
    String xAuthorization = "profile_at_02z4Mv3c85Ig0gNowY9Dq0N2kjb1xwzr27ArLE0669RrRI6dLf822iPO26K1p1FP"; // String | The `accessToken` of the authenticating profile.
    UpdateProfileRequest updateProfileRequest = new UpdateProfileRequest(); // UpdateProfileRequest | 
    try {
      ProfileModel result = apiInstance.updateProfile(profileId, xAuthorization, updateProfileRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EcosystemsApi#updateProfile");
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
| **profileId** | **String**| The profile id of the authenticating profile. | |
| **xAuthorization** | **String**| The &#x60;accessToken&#x60; of the authenticating profile. | |
| **updateProfileRequest** | [**UpdateProfileRequest**](UpdateProfileRequest.md)|  | |

### Return type

[**ProfileModel**](ProfileModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the updated profile object. |  -  |
| **400** | An API level error occurred. This is often due to problematic data being provided by you. |  -  |
| **401** | An authorization error occured. This is often due to incorrect tokens or keys being provided, or accessing a resource that the provided tokens or keys do not have access to. |  -  |

<a name="updateProfilePlayer"></a>
# **updateProfilePlayer**
> UpdateProfilePlayer200Response updateProfilePlayer(profileId, gameId, playerId, xAuthorization, xWalletDecryptKey, updateProfilePlayerRequest)

Update profile player

Update various fields specific to a player. Such as changing its permissions.

### Example
```java
// Import classes:
import org.metafab.client.ApiClient;
import org.metafab.client.ApiException;
import org.metafab.client.Configuration;
import org.metafab.client.models.*;
import org.metafab.client.api.EcosystemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.trymetafab.com");

    EcosystemsApi apiInstance = new EcosystemsApi(defaultClient);
    String profileId = "profileId_example"; // String | The profile id of the authenticating profile.
    String gameId = "gameId_example"; // String | Any game id within the MetaFab platform.
    String playerId = "playerId_example"; // String | Any player id within the MetaFab platform.
    String xAuthorization = "profile_at_02z4Mv3c85Ig0gNowY9Dq0N2kjb1xwzr27ArLE0669RrRI6dLf822iPO26K1p1FP"; // String | The `accessToken` of the authenticating profile.
    String xWalletDecryptKey = "AXNP8MKb+5SbBtHWrZu5KHh5/BomXY/dMRG/BDUn7a4="; // String | The `walletDecryptKey` of the authenticating profile. Required to decrypt and perform blockchain transactions with the profile wallet.
    UpdateProfilePlayerRequest updateProfilePlayerRequest = new UpdateProfilePlayerRequest(); // UpdateProfilePlayerRequest | 
    try {
      UpdateProfilePlayer200Response result = apiInstance.updateProfilePlayer(profileId, gameId, playerId, xAuthorization, xWalletDecryptKey, updateProfilePlayerRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EcosystemsApi#updateProfilePlayer");
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
| **profileId** | **String**| The profile id of the authenticating profile. | |
| **gameId** | **String**| Any game id within the MetaFab platform. | |
| **playerId** | **String**| Any player id within the MetaFab platform. | |
| **xAuthorization** | **String**| The &#x60;accessToken&#x60; of the authenticating profile. | |
| **xWalletDecryptKey** | **String**| The &#x60;walletDecryptKey&#x60; of the authenticating profile. Required to decrypt and perform blockchain transactions with the profile wallet. | |
| **updateProfilePlayerRequest** | [**UpdateProfilePlayerRequest**](UpdateProfilePlayerRequest.md)|  | |

### Return type

[**UpdateProfilePlayer200Response**](UpdateProfilePlayer200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully updated the player. Returns a player object. |  -  |
| **400** | An API level error occurred. This is often due to problematic data being provided by you. |  -  |
| **401** | An authorization error occured. This is often due to incorrect tokens or keys being provided, or accessing a resource that the provided tokens or keys do not have access to. |  -  |

