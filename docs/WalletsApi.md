# WalletsApi

All URIs are relative to *https://api.trymetafab.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getWalletBalances**](WalletsApi.md#getWalletBalances) | **GET** /v1/wallets/{walletId}/balances | Get wallet balances |
| [**getWalletTransactions**](WalletsApi.md#getWalletTransactions) | **GET** /v1/wallets/{walletId}/transactions | Get wallet transactions |


<a name="getWalletBalances"></a>
# **getWalletBalances**
> Map&lt;String, BigDecimal&gt; getWalletBalances(walletId)

Get wallet balances

Returns the current native token balance for all chains supported by MetaFab for the provided walletId. This includes balances like Eth, Matic and other native tokens from chains MetaFab supports.

### Example
```java
// Import classes:
import org.metafab.client.ApiClient;
import org.metafab.client.ApiException;
import org.metafab.client.Configuration;
import org.metafab.client.models.*;
import org.metafab.client.api.WalletsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.trymetafab.com");

    WalletsApi apiInstance = new WalletsApi(defaultClient);
    String walletId = "walletId_example"; // String | Any wallet id within the MetaFab ecosystem.
    try {
      Map<String, BigDecimal> result = apiInstance.getWalletBalances(walletId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WalletsApi#getWalletBalances");
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
| **walletId** | **String**| Any wallet id within the MetaFab ecosystem. | |

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
| **200** | Successfully retrieved native token balances of the provided walletId&#39;s address for each chain supported by MetaFab. |  -  |
| **400** | An API level error occurred. This is often due to problematic data being provided by you. |  -  |

<a name="getWalletTransactions"></a>
# **getWalletTransactions**
> List&lt;TransactionModel&gt; getWalletTransactions(walletId)

Get wallet transactions

Returns an array of MetaFab initiated transactions performed by the provided walletId. Transactions returned are ordered chronologically from newest to oldest.

### Example
```java
// Import classes:
import org.metafab.client.ApiClient;
import org.metafab.client.ApiException;
import org.metafab.client.Configuration;
import org.metafab.client.models.*;
import org.metafab.client.api.WalletsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.trymetafab.com");

    WalletsApi apiInstance = new WalletsApi(defaultClient);
    String walletId = "walletId_example"; // String | Any wallet id within the MetaFab ecosystem.
    try {
      List<TransactionModel> result = apiInstance.getWalletTransactions(walletId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WalletsApi#getWalletTransactions");
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
| **walletId** | **String**| Any wallet id within the MetaFab ecosystem. | |

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
| **200** | Successfully retrieved an array of transactions performed by the provided walletId. |  -  |
| **400** | An API level error occurred. This is often due to problematic data being provided by you. |  -  |

