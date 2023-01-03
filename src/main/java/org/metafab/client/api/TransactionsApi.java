/*
 * MetaFab API
 *  Complete MetaFab API references and guides can be found at: https://trymetafab.com
 *
 * The version of the OpenAPI document: 1.4.1
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


import org.openapitools.client.model.TransactionModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class TransactionsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public TransactionsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TransactionsApi(ApiClient apiClient) {
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
     * Build call for getTransaction
     * @param transactionId Any transaction id within the MetaFab ecosystem. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully retrieved a transaction object for the provided transactionId. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> An API level error occurred. This is often due to problematic data being provided by you. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getTransactionCall(String transactionId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/v1/transactions/{transactionId}"
            .replaceAll("\\{" + "transactionId" + "\\}", localVarApiClient.escapeString(transactionId.toString()));

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
    private okhttp3.Call getTransactionValidateBeforeCall(String transactionId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'transactionId' is set
        if (transactionId == null) {
            throw new ApiException("Missing the required parameter 'transactionId' when calling getTransaction(Async)");
        }
        

        okhttp3.Call localVarCall = getTransactionCall(transactionId, _callback);
        return localVarCall;

    }

    /**
     * Get transaction
     * Returns an executed transaction object for the provided transactionId. Transactions are created by MetaFab when interacting with contracts, currencies, items and other MetaFab resources.
     * @param transactionId Any transaction id within the MetaFab ecosystem. (required)
     * @return TransactionModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully retrieved a transaction object for the provided transactionId. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> An API level error occurred. This is often due to problematic data being provided by you. </td><td>  -  </td></tr>
     </table>
     */
    public TransactionModel getTransaction(String transactionId) throws ApiException {
        ApiResponse<TransactionModel> localVarResp = getTransactionWithHttpInfo(transactionId);
        return localVarResp.getData();
    }

    /**
     * Get transaction
     * Returns an executed transaction object for the provided transactionId. Transactions are created by MetaFab when interacting with contracts, currencies, items and other MetaFab resources.
     * @param transactionId Any transaction id within the MetaFab ecosystem. (required)
     * @return ApiResponse&lt;TransactionModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully retrieved a transaction object for the provided transactionId. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> An API level error occurred. This is often due to problematic data being provided by you. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<TransactionModel> getTransactionWithHttpInfo(String transactionId) throws ApiException {
        okhttp3.Call localVarCall = getTransactionValidateBeforeCall(transactionId, null);
        Type localVarReturnType = new TypeToken<TransactionModel>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get transaction (asynchronously)
     * Returns an executed transaction object for the provided transactionId. Transactions are created by MetaFab when interacting with contracts, currencies, items and other MetaFab resources.
     * @param transactionId Any transaction id within the MetaFab ecosystem. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully retrieved a transaction object for the provided transactionId. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> An API level error occurred. This is often due to problematic data being provided by you. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getTransactionAsync(String transactionId, final ApiCallback<TransactionModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = getTransactionValidateBeforeCall(transactionId, _callback);
        Type localVarReturnType = new TypeToken<TransactionModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
