/*
 * MetaFab API
 *  Complete MetaFab API references and guides can be found at: https://trymetafab.com
 *
 * The version of the OpenAPI document: 1.1.4
 * Contact: metafabproject@gmail.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.metafab.client.api;

import org.metafab.client.ApiCallback;
import org.metafab.client.ApiClient;
import org.metafab.client.ApiException;
import org.metafab.client.ApiResponse;
import org.metafab.client.Configuration;
import org.metafab.client.Pair;
import org.metafab.client.ProgressRequestBody;
import org.metafab.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import java.math.BigDecimal;
import org.openapitools.client.model.TransactionModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class WalletsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public WalletsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public WalletsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for getWalletBalances
     * @param walletId Any wallet id within the MetaFab ecosystem. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully retrieved native token balances of the provided walletId&#39;s address for each chain supported by MetaFab. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> An API level error occurred. This is often due to problematic data being provided by you. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getWalletBalancesCall(String walletId, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/wallets/{walletId}/balances"
            .replaceAll("\\{" + "walletId" + "\\}", localVarApiClient.escapeString(walletId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getWalletBalancesValidateBeforeCall(String walletId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'walletId' is set
        if (walletId == null) {
            throw new ApiException("Missing the required parameter 'walletId' when calling getWalletBalances(Async)");
        }
        

        okhttp3.Call localVarCall = getWalletBalancesCall(walletId, _callback);
        return localVarCall;

    }

    /**
     * Get wallet balances
     * Returns the current native token balance for all chains supported by MetaFab for the provided walletId. This includes balances like Eth, Matic and other native tokens from chains MetaFab supports.
     * @param walletId Any wallet id within the MetaFab ecosystem. (required)
     * @return Map&lt;String, BigDecimal&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully retrieved native token balances of the provided walletId&#39;s address for each chain supported by MetaFab. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> An API level error occurred. This is often due to problematic data being provided by you. </td><td>  -  </td></tr>
     </table>
     */
    public Map<String, BigDecimal> getWalletBalances(String walletId) throws ApiException {
        ApiResponse<Map<String, BigDecimal>> localVarResp = getWalletBalancesWithHttpInfo(walletId);
        return localVarResp.getData();
    }

    /**
     * Get wallet balances
     * Returns the current native token balance for all chains supported by MetaFab for the provided walletId. This includes balances like Eth, Matic and other native tokens from chains MetaFab supports.
     * @param walletId Any wallet id within the MetaFab ecosystem. (required)
     * @return ApiResponse&lt;Map&lt;String, BigDecimal&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully retrieved native token balances of the provided walletId&#39;s address for each chain supported by MetaFab. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> An API level error occurred. This is often due to problematic data being provided by you. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Map<String, BigDecimal>> getWalletBalancesWithHttpInfo(String walletId) throws ApiException {
        okhttp3.Call localVarCall = getWalletBalancesValidateBeforeCall(walletId, null);
        Type localVarReturnType = new TypeToken<Map<String, BigDecimal>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get wallet balances (asynchronously)
     * Returns the current native token balance for all chains supported by MetaFab for the provided walletId. This includes balances like Eth, Matic and other native tokens from chains MetaFab supports.
     * @param walletId Any wallet id within the MetaFab ecosystem. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully retrieved native token balances of the provided walletId&#39;s address for each chain supported by MetaFab. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> An API level error occurred. This is often due to problematic data being provided by you. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getWalletBalancesAsync(String walletId, final ApiCallback<Map<String, BigDecimal>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getWalletBalancesValidateBeforeCall(walletId, _callback);
        Type localVarReturnType = new TypeToken<Map<String, BigDecimal>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getWalletTransactions
     * @param walletId Any wallet id within the MetaFab ecosystem. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully retrieved an array of transactions performed by the provided walletId. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> An API level error occurred. This is often due to problematic data being provided by you. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getWalletTransactionsCall(String walletId, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/wallets/{walletId}/transactions"
            .replaceAll("\\{" + "walletId" + "\\}", localVarApiClient.escapeString(walletId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getWalletTransactionsValidateBeforeCall(String walletId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'walletId' is set
        if (walletId == null) {
            throw new ApiException("Missing the required parameter 'walletId' when calling getWalletTransactions(Async)");
        }
        

        okhttp3.Call localVarCall = getWalletTransactionsCall(walletId, _callback);
        return localVarCall;

    }

    /**
     * Get wallet transactions
     * Returns an array of MetaFab initiated transactions performed by the provided walletId. Transactions returned are ordered chronologically from newest to oldest.
     * @param walletId Any wallet id within the MetaFab ecosystem. (required)
     * @return List&lt;TransactionModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully retrieved an array of transactions performed by the provided walletId. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> An API level error occurred. This is often due to problematic data being provided by you. </td><td>  -  </td></tr>
     </table>
     */
    public List<TransactionModel> getWalletTransactions(String walletId) throws ApiException {
        ApiResponse<List<TransactionModel>> localVarResp = getWalletTransactionsWithHttpInfo(walletId);
        return localVarResp.getData();
    }

    /**
     * Get wallet transactions
     * Returns an array of MetaFab initiated transactions performed by the provided walletId. Transactions returned are ordered chronologically from newest to oldest.
     * @param walletId Any wallet id within the MetaFab ecosystem. (required)
     * @return ApiResponse&lt;List&lt;TransactionModel&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully retrieved an array of transactions performed by the provided walletId. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> An API level error occurred. This is often due to problematic data being provided by you. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<TransactionModel>> getWalletTransactionsWithHttpInfo(String walletId) throws ApiException {
        okhttp3.Call localVarCall = getWalletTransactionsValidateBeforeCall(walletId, null);
        Type localVarReturnType = new TypeToken<List<TransactionModel>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get wallet transactions (asynchronously)
     * Returns an array of MetaFab initiated transactions performed by the provided walletId. Transactions returned are ordered chronologically from newest to oldest.
     * @param walletId Any wallet id within the MetaFab ecosystem. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully retrieved an array of transactions performed by the provided walletId. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> An API level error occurred. This is often due to problematic data being provided by you. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getWalletTransactionsAsync(String walletId, final ApiCallback<List<TransactionModel>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getWalletTransactionsValidateBeforeCall(walletId, _callback);
        Type localVarReturnType = new TypeToken<List<TransactionModel>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
