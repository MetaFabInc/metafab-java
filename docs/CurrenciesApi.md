# CurrenciesApi

All URIs are relative to *https://api.trymetafab.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**batchTransferCurrency**](CurrenciesApi.md#batchTransferCurrency) | **POST** /v1/currencies/{currencyId}/batchTransfers | Batch transfer currency |
| [**burnCurrency**](CurrenciesApi.md#burnCurrency) | **POST** /v1/currencies/{currencyId}/burns | Burn currency |
| [**createCurrency**](CurrenciesApi.md#createCurrency) | **POST** /v1/currencies | Create currency |
| [**getCurrencies**](CurrenciesApi.md#getCurrencies) | **GET** /v1/currencies | Get currencies |
| [**getCurrencyBalance**](CurrenciesApi.md#getCurrencyBalance) | **GET** /v1/currencies/{currencyId}/balances | Get currency balance |
| [**getCurrencyFees**](CurrenciesApi.md#getCurrencyFees) | **GET** /v1/currencies/{currencyId}/fees | Get currency fees |
| [**getCurrencyRole**](CurrenciesApi.md#getCurrencyRole) | **GET** /v1/currencies/{currencyId}/roles | Get currency role |
| [**grantCurrencyRole**](CurrenciesApi.md#grantCurrencyRole) | **POST** /v1/currencies/{currencyId}/roles | Grant currency role |
| [**mintCurrency**](CurrenciesApi.md#mintCurrency) | **POST** /v1/currencies/{currencyId}/mints | Mint currency |
| [**revokeCurrencyRole**](CurrenciesApi.md#revokeCurrencyRole) | **DELETE** /v1/currencies/{currencyId}/roles | Revoke currency role |
| [**setCurrencyFees**](CurrenciesApi.md#setCurrencyFees) | **POST** /v1/currencies/{currencyId}/fees | Set currency fees |
| [**transferCurrency**](CurrenciesApi.md#transferCurrency) | **POST** /v1/currencies/{currencyId}/transfers | Transfer currency |


<a name="batchTransferCurrency"></a>
# **batchTransferCurrency**
> TransactionModel batchTransferCurrency(currencyId, xAuthorization, xWalletDecryptKey, batchTransferCurrencyRequest)

Batch transfer currency

Transfers multiple amounts of currency to multiple provided wallet addresses or wallet addresses associated with the provided walletIds. You may also provide a combination of addresses and walletIds in one request, the proper receipients will be automatically determined, with &#x60;addresses&#x60; getting &#x60;amounts&#x60; order priority first.  Optional references may be included for the transfer. References are useful for identifying transfers intended to pay for items, trades, services and more.

### Example
```java
// Import classes:
import org.metafab.client.ApiClient;
import org.metafab.client.ApiException;
import org.metafab.client.Configuration;
import org.metafab.client.models.*;
import org.metafab.client.api.CurrenciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.trymetafab.com");

    CurrenciesApi apiInstance = new CurrenciesApi(defaultClient);
    String currencyId = "currencyId_example"; // String | Any currency id within the MetaFab platform.
    String xAuthorization = "[\"game_sk_02z4Mv3c85Ig0gNowY9Dq0N2kjb1xwzr27ArLE0669RrRI6dLf822iPO26K1p1FP\",\"player_at_02z4Mv3c85Ig0gNowY9Dq0N2kjb1xwzr27ArLE0669RrRI6dLf822iPO26K1p1FP\"]"; // String | The `secretKey` of a specific game or the `accessToken` of a specific player.
    String xWalletDecryptKey = "AXNP8MKb+5SbBtHWrZu5KHh5/BomXY/dMRG/BDUn7a4="; // String | The `walletDecryptKey` of the authenticating game or player. Required to decrypt and perform blockchain transactions with the game or player primary wallet.
    BatchTransferCurrencyRequest batchTransferCurrencyRequest = new BatchTransferCurrencyRequest(); // BatchTransferCurrencyRequest | 
    try {
      TransactionModel result = apiInstance.batchTransferCurrency(currencyId, xAuthorization, xWalletDecryptKey, batchTransferCurrencyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CurrenciesApi#batchTransferCurrency");
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
| **currencyId** | **String**| Any currency id within the MetaFab platform. | |
| **xAuthorization** | **String**| The &#x60;secretKey&#x60; of a specific game or the &#x60;accessToken&#x60; of a specific player. | |
| **xWalletDecryptKey** | **String**| The &#x60;walletDecryptKey&#x60; of the authenticating game or player. Required to decrypt and perform blockchain transactions with the game or player primary wallet. | |
| **batchTransferCurrencyRequest** | [**BatchTransferCurrencyRequest**](BatchTransferCurrencyRequest.md)|  | |

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
| **200** | Successfully transferred the currency amounts to the provided wallet addresses and/or wallet addresses of the provided walletIds. Returns a transaction object. |  -  |
| **400** | An API level error occurred. This is often due to problematic data being provided by you. |  -  |
| **401** | An authorization error occured. This is often due to incorrect tokens or keys being provided, or accessing a resource that the provided tokens or keys do not have access to. |  -  |

<a name="burnCurrency"></a>
# **burnCurrency**
> TransactionModel burnCurrency(currencyId, xAuthorization, xWalletDecryptKey, burnCurrencyRequest)

Burn currency

Removes (burns) the provided amount of currency from the authenticating game or players wallet. The currency amount is permanently removed from the circulating supply of the currency.

### Example
```java
// Import classes:
import org.metafab.client.ApiClient;
import org.metafab.client.ApiException;
import org.metafab.client.Configuration;
import org.metafab.client.models.*;
import org.metafab.client.api.CurrenciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.trymetafab.com");

    CurrenciesApi apiInstance = new CurrenciesApi(defaultClient);
    String currencyId = "currencyId_example"; // String | Any currency id within the MetaFab platform.
    String xAuthorization = "[\"game_sk_02z4Mv3c85Ig0gNowY9Dq0N2kjb1xwzr27ArLE0669RrRI6dLf822iPO26K1p1FP\",\"player_at_02z4Mv3c85Ig0gNowY9Dq0N2kjb1xwzr27ArLE0669RrRI6dLf822iPO26K1p1FP\"]"; // String | The `secretKey` of a specific game or the `accessToken` of a specific player.
    String xWalletDecryptKey = "AXNP8MKb+5SbBtHWrZu5KHh5/BomXY/dMRG/BDUn7a4="; // String | The `walletDecryptKey` of the authenticating game or player. Required to decrypt and perform blockchain transactions with the game or player primary wallet.
    BurnCurrencyRequest burnCurrencyRequest = new BurnCurrencyRequest(); // BurnCurrencyRequest | 
    try {
      TransactionModel result = apiInstance.burnCurrency(currencyId, xAuthorization, xWalletDecryptKey, burnCurrencyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CurrenciesApi#burnCurrency");
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
| **currencyId** | **String**| Any currency id within the MetaFab platform. | |
| **xAuthorization** | **String**| The &#x60;secretKey&#x60; of a specific game or the &#x60;accessToken&#x60; of a specific player. | |
| **xWalletDecryptKey** | **String**| The &#x60;walletDecryptKey&#x60; of the authenticating game or player. Required to decrypt and perform blockchain transactions with the game or player primary wallet. | |
| **burnCurrencyRequest** | [**BurnCurrencyRequest**](BurnCurrencyRequest.md)|  | |

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
| **200** | Successfully removed (burned) the currency amount from the authenticating game or player&#39;s wallet. Returns a transaction object. |  -  |
| **400** | An API level error occurred. This is often due to problematic data being provided by you. |  -  |
| **401** | An authorization error occured. This is often due to incorrect tokens or keys being provided, or accessing a resource that the provided tokens or keys do not have access to. |  -  |

<a name="createCurrency"></a>
# **createCurrency**
> CreateCurrency200Response createCurrency(xAuthorization, xWalletDecryptKey, createCurrencyRequest)

Create currency

Creates a new game currency and deploys an ERC20 token contract on behalf of the authenticating game&#39;s primary wallet. The deployed ERC20 contract is preconfigured to fully support bridging across blockchains, batched transfers and gasless transactions on any supported blockchain as well as full support for gasless transactions from player managed wallets.

### Example
```java
// Import classes:
import org.metafab.client.ApiClient;
import org.metafab.client.ApiException;
import org.metafab.client.Configuration;
import org.metafab.client.models.*;
import org.metafab.client.api.CurrenciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.trymetafab.com");

    CurrenciesApi apiInstance = new CurrenciesApi(defaultClient);
    String xAuthorization = "game_sk_02z4Mv3c85Ig0gNowY9Dq0N2kjb1xwzr27ArLE0669RrRI6dLf822iPO26K1p1FP"; // String | The `secretKey` of the authenticating game.
    String xWalletDecryptKey = "AXNP8MKb+5SbBtHWrZu5KHh5/BomXY/dMRG/BDUn7a4="; // String | The `walletDecryptKey` of the authenticating game. Required to decrypt and perform blockchain transactions with the game primary wallet.
    CreateCurrencyRequest createCurrencyRequest = new CreateCurrencyRequest(); // CreateCurrencyRequest | 
    try {
      CreateCurrency200Response result = apiInstance.createCurrency(xAuthorization, xWalletDecryptKey, createCurrencyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CurrenciesApi#createCurrency");
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
| **xWalletDecryptKey** | **String**| The &#x60;walletDecryptKey&#x60; of the authenticating game. Required to decrypt and perform blockchain transactions with the game primary wallet. | |
| **createCurrencyRequest** | [**CreateCurrencyRequest**](CreateCurrencyRequest.md)|  | |

### Return type

[**CreateCurrency200Response**](CreateCurrency200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully created a new currency and deployed its associated ERC20 token contract on the chain specified. Returns a currency object containing a contract property with the deployment transaction. |  -  |
| **400** | An API level error occurred. This is often due to problematic data being provided by you. |  -  |
| **401** | An authorization error occured. This is often due to incorrect tokens or keys being provided, or accessing a resource that the provided tokens or keys do not have access to. |  -  |

<a name="getCurrencies"></a>
# **getCurrencies**
> List&lt;GetCurrencies200ResponseInner&gt; getCurrencies(xGameKey)

Get currencies

Returns an array of active currencies for the game associated with the provided &#x60;X-Game-Key&#x60;.

### Example
```java
// Import classes:
import org.metafab.client.ApiClient;
import org.metafab.client.ApiException;
import org.metafab.client.Configuration;
import org.metafab.client.models.*;
import org.metafab.client.api.CurrenciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.trymetafab.com");

    CurrenciesApi apiInstance = new CurrenciesApi(defaultClient);
    String xGameKey = "game_pk_4SOqpDi8pQdnQgfCOBW29qR8YmwOhxVPz5iHoMgUEJLDdPXgwLuHqZf8ewo2GajZ"; // String | The `publishedKey` of a specific game. This can be shared or included in game clients, websites, etc.
    try {
      List<GetCurrencies200ResponseInner> result = apiInstance.getCurrencies(xGameKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CurrenciesApi#getCurrencies");
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

[**List&lt;GetCurrencies200ResponseInner&gt;**](GetCurrencies200ResponseInner.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved an array of currencies for the game associated with the provided &#x60;X-Game-Key&#x60; |  -  |
| **400** | An API level error occurred. This is often due to problematic data being provided by you. |  -  |

<a name="getCurrencyBalance"></a>
# **getCurrencyBalance**
> BigDecimal getCurrencyBalance(currencyId, address, walletId)

Get currency balance

Returns the current currency balance of the provided wallet address or or the wallet address associated with the provided walletId.

### Example
```java
// Import classes:
import org.metafab.client.ApiClient;
import org.metafab.client.ApiException;
import org.metafab.client.Configuration;
import org.metafab.client.models.*;
import org.metafab.client.api.CurrenciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.trymetafab.com");

    CurrenciesApi apiInstance = new CurrenciesApi(defaultClient);
    String currencyId = "currencyId_example"; // String | Any currency id within the MetaFab platform.
    String address = "0x39cb70F972E0EE920088AeF97Dbe5c6251a9c25D"; // String | A valid EVM based address. For example, `0x39cb70F972E0EE920088AeF97Dbe5c6251a9c25D`.
    String walletId = "walletId_example"; // String | Any wallet id within the MetaFab platform.
    try {
      BigDecimal result = apiInstance.getCurrencyBalance(currencyId, address, walletId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CurrenciesApi#getCurrencyBalance");
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
| **currencyId** | **String**| Any currency id within the MetaFab platform. | |
| **address** | **String**| A valid EVM based address. For example, &#x60;0x39cb70F972E0EE920088AeF97Dbe5c6251a9c25D&#x60;. | [optional] |
| **walletId** | **String**| Any wallet id within the MetaFab platform. | [optional] |

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
| **200** | Successfully retrieved currency balance for the provided address or walletId. Balance is returned as a string to handle uint256 numbers. |  -  |
| **400** | An API level error occurred. This is often due to problematic data being provided by you. |  -  |

<a name="getCurrencyFees"></a>
# **getCurrencyFees**
> GetCurrencyFees200Response getCurrencyFees(currencyId)

Get currency fees

Returns the current fee recipient address and fees of the currency for the provided currencyId. Fees are only applicable for gasless transactions performed by default by players.

### Example
```java
// Import classes:
import org.metafab.client.ApiClient;
import org.metafab.client.ApiException;
import org.metafab.client.Configuration;
import org.metafab.client.models.*;
import org.metafab.client.api.CurrenciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.trymetafab.com");

    CurrenciesApi apiInstance = new CurrenciesApi(defaultClient);
    String currencyId = "currencyId_example"; // String | Any currency id within the MetaFab platform.
    try {
      GetCurrencyFees200Response result = apiInstance.getCurrencyFees(currencyId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CurrenciesApi#getCurrencyFees");
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
| **currencyId** | **String**| Any currency id within the MetaFab platform. | |

### Return type

[**GetCurrencyFees200Response**](GetCurrencyFees200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved currency fees for the currency of the provided currencyId. |  -  |
| **400** | An API level error occurred. This is often due to problematic data being provided by you. |  -  |

<a name="getCurrencyRole"></a>
# **getCurrencyRole**
> Boolean getCurrencyRole(currencyId, role, address, walletId)

Get currency role

Returns a boolean (true/false) representing if the provided role for this currency has been granted to the provided address or address associated with the provided walletId.

### Example
```java
// Import classes:
import org.metafab.client.ApiClient;
import org.metafab.client.ApiException;
import org.metafab.client.Configuration;
import org.metafab.client.models.*;
import org.metafab.client.api.CurrenciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.trymetafab.com");

    CurrenciesApi apiInstance = new CurrenciesApi(defaultClient);
    String currencyId = "currencyId_example"; // String | Any currency id within the MetaFab platform.
    String role = "minter"; // String | A valid MetaFab role or bytes string representing a role, such as `0xc9eb32e43bf5ecbceacf00b32281dfc5d6d700a0db676ea26ccf938a385ac3b7`
    String address = "0x39cb70F972E0EE920088AeF97Dbe5c6251a9c25D"; // String | A valid EVM based address. For example, `0x39cb70F972E0EE920088AeF97Dbe5c6251a9c25D`.
    String walletId = "walletId_example"; // String | Any wallet id within the MetaFab platform.
    try {
      Boolean result = apiInstance.getCurrencyRole(currencyId, role, address, walletId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CurrenciesApi#getCurrencyRole");
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
| **currencyId** | **String**| Any currency id within the MetaFab platform. | |
| **role** | **String**| A valid MetaFab role or bytes string representing a role, such as &#x60;0xc9eb32e43bf5ecbceacf00b32281dfc5d6d700a0db676ea26ccf938a385ac3b7&#x60; | |
| **address** | **String**| A valid EVM based address. For example, &#x60;0x39cb70F972E0EE920088AeF97Dbe5c6251a9c25D&#x60;. | [optional] |
| **walletId** | **String**| Any wallet id within the MetaFab platform. | [optional] |

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

<a name="grantCurrencyRole"></a>
# **grantCurrencyRole**
> TransactionModel grantCurrencyRole(currencyId, xAuthorization, xWalletDecryptKey, grantCurrencyRoleRequest)

Grant currency role

Grants the provided role for the currency to the provided address or address associated with the provided walletId. Granted roles give different types of authority on behalf of the currency for specific players, addresses, or contracts to perform different types of permissioned currency operations.

### Example
```java
// Import classes:
import org.metafab.client.ApiClient;
import org.metafab.client.ApiException;
import org.metafab.client.Configuration;
import org.metafab.client.models.*;
import org.metafab.client.api.CurrenciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.trymetafab.com");

    CurrenciesApi apiInstance = new CurrenciesApi(defaultClient);
    String currencyId = "currencyId_example"; // String | Any currency id within the MetaFab platform.
    String xAuthorization = "[\"game_sk_02z4Mv3c85Ig0gNowY9Dq0N2kjb1xwzr27ArLE0669RrRI6dLf822iPO26K1p1FP\",\"player_at_02z4Mv3c85Ig0gNowY9Dq0N2kjb1xwzr27ArLE0669RrRI6dLf822iPO26K1p1FP\"]"; // String | The `secretKey` of a specific game or the `accessToken` of a specific player.
    String xWalletDecryptKey = "AXNP8MKb+5SbBtHWrZu5KHh5/BomXY/dMRG/BDUn7a4="; // String | The `walletDecryptKey` of the authenticating game or player. Required to decrypt and perform blockchain transactions with the game or player primary wallet.
    GrantCurrencyRoleRequest grantCurrencyRoleRequest = new GrantCurrencyRoleRequest(); // GrantCurrencyRoleRequest | 
    try {
      TransactionModel result = apiInstance.grantCurrencyRole(currencyId, xAuthorization, xWalletDecryptKey, grantCurrencyRoleRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CurrenciesApi#grantCurrencyRole");
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
| **currencyId** | **String**| Any currency id within the MetaFab platform. | |
| **xAuthorization** | **String**| The &#x60;secretKey&#x60; of a specific game or the &#x60;accessToken&#x60; of a specific player. | |
| **xWalletDecryptKey** | **String**| The &#x60;walletDecryptKey&#x60; of the authenticating game or player. Required to decrypt and perform blockchain transactions with the game or player primary wallet. | |
| **grantCurrencyRoleRequest** | [**GrantCurrencyRoleRequest**](GrantCurrencyRoleRequest.md)|  | |

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

<a name="mintCurrency"></a>
# **mintCurrency**
> TransactionModel mintCurrency(currencyId, xAuthorization, xWalletDecryptKey, mintCurrencyRequest)

Mint currency

Creates (mints) the provided amount of currency to the provided wallet address or wallet address associated with the provided walletId.

### Example
```java
// Import classes:
import org.metafab.client.ApiClient;
import org.metafab.client.ApiException;
import org.metafab.client.Configuration;
import org.metafab.client.models.*;
import org.metafab.client.api.CurrenciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.trymetafab.com");

    CurrenciesApi apiInstance = new CurrenciesApi(defaultClient);
    String currencyId = "currencyId_example"; // String | Any currency id within the MetaFab platform.
    String xAuthorization = "game_sk_02z4Mv3c85Ig0gNowY9Dq0N2kjb1xwzr27ArLE0669RrRI6dLf822iPO26K1p1FP"; // String | The `secretKey` of the authenticating game.
    String xWalletDecryptKey = "AXNP8MKb+5SbBtHWrZu5KHh5/BomXY/dMRG/BDUn7a4="; // String | The `walletDecryptKey` of the authenticating game. Required to decrypt and perform blockchain transactions with the game primary wallet.
    MintCurrencyRequest mintCurrencyRequest = new MintCurrencyRequest(); // MintCurrencyRequest | 
    try {
      TransactionModel result = apiInstance.mintCurrency(currencyId, xAuthorization, xWalletDecryptKey, mintCurrencyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CurrenciesApi#mintCurrency");
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
| **currencyId** | **String**| Any currency id within the MetaFab platform. | |
| **xAuthorization** | **String**| The &#x60;secretKey&#x60; of the authenticating game. | |
| **xWalletDecryptKey** | **String**| The &#x60;walletDecryptKey&#x60; of the authenticating game. Required to decrypt and perform blockchain transactions with the game primary wallet. | |
| **mintCurrencyRequest** | [**MintCurrencyRequest**](MintCurrencyRequest.md)|  | |

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
| **200** | Successfully created (minted) the currency amount to the provided wallet address or wallet address of the provided walletId. Returns a transaction object. |  -  |
| **400** | An API level error occurred. This is often due to problematic data being provided by you. |  -  |
| **401** | An authorization error occured. This is often due to incorrect tokens or keys being provided, or accessing a resource that the provided tokens or keys do not have access to. |  -  |

<a name="revokeCurrencyRole"></a>
# **revokeCurrencyRole**
> TransactionModel revokeCurrencyRole(currencyId, xAuthorization, xWalletDecryptKey, revokeCollectionRoleRequest)

Revoke currency role

Revokes the provided role for the currency to the provided address or address associated with the provided walletId.

### Example
```java
// Import classes:
import org.metafab.client.ApiClient;
import org.metafab.client.ApiException;
import org.metafab.client.Configuration;
import org.metafab.client.models.*;
import org.metafab.client.api.CurrenciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.trymetafab.com");

    CurrenciesApi apiInstance = new CurrenciesApi(defaultClient);
    String currencyId = "currencyId_example"; // String | Any currency id within the MetaFab platform.
    String xAuthorization = "[\"game_sk_02z4Mv3c85Ig0gNowY9Dq0N2kjb1xwzr27ArLE0669RrRI6dLf822iPO26K1p1FP\",\"player_at_02z4Mv3c85Ig0gNowY9Dq0N2kjb1xwzr27ArLE0669RrRI6dLf822iPO26K1p1FP\"]"; // String | The `secretKey` of a specific game or the `accessToken` of a specific player.
    String xWalletDecryptKey = "AXNP8MKb+5SbBtHWrZu5KHh5/BomXY/dMRG/BDUn7a4="; // String | The `walletDecryptKey` of the authenticating game or player. Required to decrypt and perform blockchain transactions with the game or player primary wallet.
    RevokeCollectionRoleRequest revokeCollectionRoleRequest = new RevokeCollectionRoleRequest(); // RevokeCollectionRoleRequest | 
    try {
      TransactionModel result = apiInstance.revokeCurrencyRole(currencyId, xAuthorization, xWalletDecryptKey, revokeCollectionRoleRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CurrenciesApi#revokeCurrencyRole");
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
| **currencyId** | **String**| Any currency id within the MetaFab platform. | |
| **xAuthorization** | **String**| The &#x60;secretKey&#x60; of a specific game or the &#x60;accessToken&#x60; of a specific player. | |
| **xWalletDecryptKey** | **String**| The &#x60;walletDecryptKey&#x60; of the authenticating game or player. Required to decrypt and perform blockchain transactions with the game or player primary wallet. | |
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

<a name="setCurrencyFees"></a>
# **setCurrencyFees**
> TransactionModel setCurrencyFees(currencyId, xAuthorization, xWalletDecryptKey, setCurrencyFeesRequest)

Set currency fees

Sets the recipient address, basis points, fixed amount and cap amount for a currency&#39;s fees.

### Example
```java
// Import classes:
import org.metafab.client.ApiClient;
import org.metafab.client.ApiException;
import org.metafab.client.Configuration;
import org.metafab.client.models.*;
import org.metafab.client.api.CurrenciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.trymetafab.com");

    CurrenciesApi apiInstance = new CurrenciesApi(defaultClient);
    String currencyId = "currencyId_example"; // String | Any currency id within the MetaFab platform.
    String xAuthorization = "game_sk_02z4Mv3c85Ig0gNowY9Dq0N2kjb1xwzr27ArLE0669RrRI6dLf822iPO26K1p1FP"; // String | The `secretKey` of the authenticating game.
    String xWalletDecryptKey = "AXNP8MKb+5SbBtHWrZu5KHh5/BomXY/dMRG/BDUn7a4="; // String | The `walletDecryptKey` of the authenticating game. Required to decrypt and perform blockchain transactions with the game primary wallet.
    SetCurrencyFeesRequest setCurrencyFeesRequest = new SetCurrencyFeesRequest(); // SetCurrencyFeesRequest | 
    try {
      TransactionModel result = apiInstance.setCurrencyFees(currencyId, xAuthorization, xWalletDecryptKey, setCurrencyFeesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CurrenciesApi#setCurrencyFees");
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
| **currencyId** | **String**| Any currency id within the MetaFab platform. | |
| **xAuthorization** | **String**| The &#x60;secretKey&#x60; of the authenticating game. | |
| **xWalletDecryptKey** | **String**| The &#x60;walletDecryptKey&#x60; of the authenticating game. Required to decrypt and perform blockchain transactions with the game primary wallet. | |
| **setCurrencyFeesRequest** | [**SetCurrencyFeesRequest**](SetCurrencyFeesRequest.md)|  | |

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
| **200** | Successfuly set the currency&#39;s fees. Returns a transaction object. |  -  |
| **400** | An API level error occurred. This is often due to problematic data being provided by you. |  -  |
| **401** | An authorization error occured. This is often due to incorrect tokens or keys being provided, or accessing a resource that the provided tokens or keys do not have access to. |  -  |

<a name="transferCurrency"></a>
# **transferCurrency**
> TransactionModel transferCurrency(currencyId, xAuthorization, xWalletDecryptKey, transferCurrencyRequest)

Transfer currency

Transfers an amount of currency to the provided wallet address or wallet address associated with the provided walletId. If you want to transfer to multiple wallets with different amounts and optional references in one API request, please see the Batch transfer currency documentation.  An optional reference may be included for the transfer. References are useful for identifying transfers intended to pay for items, trades, services and more.

### Example
```java
// Import classes:
import org.metafab.client.ApiClient;
import org.metafab.client.ApiException;
import org.metafab.client.Configuration;
import org.metafab.client.models.*;
import org.metafab.client.api.CurrenciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.trymetafab.com");

    CurrenciesApi apiInstance = new CurrenciesApi(defaultClient);
    String currencyId = "currencyId_example"; // String | Any currency id within the MetaFab platform.
    String xAuthorization = "[\"game_sk_02z4Mv3c85Ig0gNowY9Dq0N2kjb1xwzr27ArLE0669RrRI6dLf822iPO26K1p1FP\",\"player_at_02z4Mv3c85Ig0gNowY9Dq0N2kjb1xwzr27ArLE0669RrRI6dLf822iPO26K1p1FP\"]"; // String | The `secretKey` of a specific game or the `accessToken` of a specific player.
    String xWalletDecryptKey = "AXNP8MKb+5SbBtHWrZu5KHh5/BomXY/dMRG/BDUn7a4="; // String | The `walletDecryptKey` of the authenticating game or player. Required to decrypt and perform blockchain transactions with the game or player primary wallet.
    TransferCurrencyRequest transferCurrencyRequest = new TransferCurrencyRequest(); // TransferCurrencyRequest | 
    try {
      TransactionModel result = apiInstance.transferCurrency(currencyId, xAuthorization, xWalletDecryptKey, transferCurrencyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CurrenciesApi#transferCurrency");
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
| **currencyId** | **String**| Any currency id within the MetaFab platform. | |
| **xAuthorization** | **String**| The &#x60;secretKey&#x60; of a specific game or the &#x60;accessToken&#x60; of a specific player. | |
| **xWalletDecryptKey** | **String**| The &#x60;walletDecryptKey&#x60; of the authenticating game or player. Required to decrypt and perform blockchain transactions with the game or player primary wallet. | |
| **transferCurrencyRequest** | [**TransferCurrencyRequest**](TransferCurrencyRequest.md)|  | |

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
| **200** | Successfully transferred the currency amount to the provided wallet address or wallet address of the provided wallet Id. Returns a transaction object. |  -  |
| **400** | An API level error occurred. This is often due to problematic data being provided by you. |  -  |
| **401** | An authorization error occured. This is often due to incorrect tokens or keys being provided, or accessing a resource that the provided tokens or keys do not have access to. |  -  |

