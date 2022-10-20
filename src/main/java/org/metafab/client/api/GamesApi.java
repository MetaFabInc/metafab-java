/*
 * MetaFab API
 *  Complete MetaFab API references and guides can be found at: https://trymetafab.com
 *
 * The version of the OpenAPI document: 1.1.0
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


import org.openapitools.client.model.AuthGame200Response;
import org.openapitools.client.model.CreateGameRequest;
import org.openapitools.client.model.GameModel;
import org.openapitools.client.model.UpdateGameRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class GamesApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public GamesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public GamesApi(ApiClient apiClient) {
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
     * Build call for authGame
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Succesfully authorized the request and retrieved a game object containing authorization keys and credentials. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> An API level error occurred. This is often due to problematic data being provided by you. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> An authorization error occured. This is often due to incorrect tokens or keys being provided, or accessing a resource that the provided tokens or keys do not have access to. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call authGameCall(final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/v1/games";

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

        String[] localVarAuthNames = new String[] { "basicAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call authGameValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = authGameCall(_callback);
        return localVarCall;

    }

    /**
     * Authenticate game
     * Returns an existing game object containing authorization keys and credentials when provided a valid email (in place of username) and password login using Basic Auth.
     * @return AuthGame200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Succesfully authorized the request and retrieved a game object containing authorization keys and credentials. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> An API level error occurred. This is often due to problematic data being provided by you. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> An authorization error occured. This is often due to incorrect tokens or keys being provided, or accessing a resource that the provided tokens or keys do not have access to. </td><td>  -  </td></tr>
     </table>
     */
    public AuthGame200Response authGame() throws ApiException {
        ApiResponse<AuthGame200Response> localVarResp = authGameWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * Authenticate game
     * Returns an existing game object containing authorization keys and credentials when provided a valid email (in place of username) and password login using Basic Auth.
     * @return ApiResponse&lt;AuthGame200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Succesfully authorized the request and retrieved a game object containing authorization keys and credentials. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> An API level error occurred. This is often due to problematic data being provided by you. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> An authorization error occured. This is often due to incorrect tokens or keys being provided, or accessing a resource that the provided tokens or keys do not have access to. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AuthGame200Response> authGameWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = authGameValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<AuthGame200Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Authenticate game (asynchronously)
     * Returns an existing game object containing authorization keys and credentials when provided a valid email (in place of username) and password login using Basic Auth.
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Succesfully authorized the request and retrieved a game object containing authorization keys and credentials. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> An API level error occurred. This is often due to problematic data being provided by you. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> An authorization error occured. This is often due to incorrect tokens or keys being provided, or accessing a resource that the provided tokens or keys do not have access to. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call authGameAsync(final ApiCallback<AuthGame200Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = authGameValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<AuthGame200Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for createGame
     * @param createGameRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully created a new game. Returns a game object containing a wallet and fundingWallet property, respectively representing the games primary wallet address (used to deploy &amp; interact with contract) and funding wallet address (used to cover gasless transaction fees). </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> An API level error occurred. This is often due to problematic data being provided by you. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> An authorization error occured. This is often due to incorrect tokens or keys being provided, or accessing a resource that the provided tokens or keys do not have access to. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createGameCall(CreateGameRequest createGameRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = createGameRequest;

        // create path and map variables
        String localVarPath = "/v1/games";

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
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createGameValidateBeforeCall(CreateGameRequest createGameRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'createGameRequest' is set
        if (createGameRequest == null) {
            throw new ApiException("Missing the required parameter 'createGameRequest' when calling createGame(Async)");
        }
        

        okhttp3.Call localVarCall = createGameCall(createGameRequest, _callback);
        return localVarCall;

    }

    /**
     * Create game
     * Create a new game. A game is the root entity required for all API interactions. Contracts, currencies, items and more are deployed by games, player accounts are created and registered to games, etc.  To use any of MetaFab&#39;s services, you must first create a game through this endpoint.  **Game creation is limited during our closed beta. Please contact ArkDev#4501 on Discord to be a part of our beta.**
     * @param createGameRequest  (required)
     * @return AuthGame200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully created a new game. Returns a game object containing a wallet and fundingWallet property, respectively representing the games primary wallet address (used to deploy &amp; interact with contract) and funding wallet address (used to cover gasless transaction fees). </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> An API level error occurred. This is often due to problematic data being provided by you. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> An authorization error occured. This is often due to incorrect tokens or keys being provided, or accessing a resource that the provided tokens or keys do not have access to. </td><td>  -  </td></tr>
     </table>
     */
    public AuthGame200Response createGame(CreateGameRequest createGameRequest) throws ApiException {
        ApiResponse<AuthGame200Response> localVarResp = createGameWithHttpInfo(createGameRequest);
        return localVarResp.getData();
    }

    /**
     * Create game
     * Create a new game. A game is the root entity required for all API interactions. Contracts, currencies, items and more are deployed by games, player accounts are created and registered to games, etc.  To use any of MetaFab&#39;s services, you must first create a game through this endpoint.  **Game creation is limited during our closed beta. Please contact ArkDev#4501 on Discord to be a part of our beta.**
     * @param createGameRequest  (required)
     * @return ApiResponse&lt;AuthGame200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully created a new game. Returns a game object containing a wallet and fundingWallet property, respectively representing the games primary wallet address (used to deploy &amp; interact with contract) and funding wallet address (used to cover gasless transaction fees). </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> An API level error occurred. This is often due to problematic data being provided by you. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> An authorization error occured. This is often due to incorrect tokens or keys being provided, or accessing a resource that the provided tokens or keys do not have access to. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AuthGame200Response> createGameWithHttpInfo(CreateGameRequest createGameRequest) throws ApiException {
        okhttp3.Call localVarCall = createGameValidateBeforeCall(createGameRequest, null);
        Type localVarReturnType = new TypeToken<AuthGame200Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create game (asynchronously)
     * Create a new game. A game is the root entity required for all API interactions. Contracts, currencies, items and more are deployed by games, player accounts are created and registered to games, etc.  To use any of MetaFab&#39;s services, you must first create a game through this endpoint.  **Game creation is limited during our closed beta. Please contact ArkDev#4501 on Discord to be a part of our beta.**
     * @param createGameRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully created a new game. Returns a game object containing a wallet and fundingWallet property, respectively representing the games primary wallet address (used to deploy &amp; interact with contract) and funding wallet address (used to cover gasless transaction fees). </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> An API level error occurred. This is often due to problematic data being provided by you. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> An authorization error occured. This is often due to incorrect tokens or keys being provided, or accessing a resource that the provided tokens or keys do not have access to. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createGameAsync(CreateGameRequest createGameRequest, final ApiCallback<AuthGame200Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = createGameValidateBeforeCall(createGameRequest, _callback);
        Type localVarReturnType = new TypeToken<AuthGame200Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateGame
     * @param gameId Any game id within the MetaFab ecosystem. (required)
     * @param xAuthorization The &#x60;secretKey&#x60; of the authenticating game. (required)
     * @param updateGameRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns the updated game object. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> An API level error occurred. This is often due to problematic data being provided by you. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> An authorization error occured. This is often due to incorrect tokens or keys being provided, or accessing a resource that the provided tokens or keys do not have access to. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateGameCall(String gameId, String xAuthorization, UpdateGameRequest updateGameRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = updateGameRequest;

        // create path and map variables
        String localVarPath = "/v1/games/{gameId}"
            .replaceAll("\\{" + "gameId" + "\\}", localVarApiClient.escapeString(gameId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (xAuthorization != null) {
            localVarHeaderParams.put("X-Authorization", localVarApiClient.parameterToString(xAuthorization));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call updateGameValidateBeforeCall(String gameId, String xAuthorization, UpdateGameRequest updateGameRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'gameId' is set
        if (gameId == null) {
            throw new ApiException("Missing the required parameter 'gameId' when calling updateGame(Async)");
        }
        
        // verify the required parameter 'xAuthorization' is set
        if (xAuthorization == null) {
            throw new ApiException("Missing the required parameter 'xAuthorization' when calling updateGame(Async)");
        }
        
        // verify the required parameter 'updateGameRequest' is set
        if (updateGameRequest == null) {
            throw new ApiException("Missing the required parameter 'updateGameRequest' when calling updateGame(Async)");
        }
        

        okhttp3.Call localVarCall = updateGameCall(gameId, xAuthorization, updateGameRequest, _callback);
        return localVarCall;

    }

    /**
     * Update game
     * Update various fields specific to a game. Such as changing its password, resetting its published or secret key, or updating its RPCs.
     * @param gameId Any game id within the MetaFab ecosystem. (required)
     * @param xAuthorization The &#x60;secretKey&#x60; of the authenticating game. (required)
     * @param updateGameRequest  (required)
     * @return GameModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns the updated game object. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> An API level error occurred. This is often due to problematic data being provided by you. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> An authorization error occured. This is often due to incorrect tokens or keys being provided, or accessing a resource that the provided tokens or keys do not have access to. </td><td>  -  </td></tr>
     </table>
     */
    public GameModel updateGame(String gameId, String xAuthorization, UpdateGameRequest updateGameRequest) throws ApiException {
        ApiResponse<GameModel> localVarResp = updateGameWithHttpInfo(gameId, xAuthorization, updateGameRequest);
        return localVarResp.getData();
    }

    /**
     * Update game
     * Update various fields specific to a game. Such as changing its password, resetting its published or secret key, or updating its RPCs.
     * @param gameId Any game id within the MetaFab ecosystem. (required)
     * @param xAuthorization The &#x60;secretKey&#x60; of the authenticating game. (required)
     * @param updateGameRequest  (required)
     * @return ApiResponse&lt;GameModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns the updated game object. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> An API level error occurred. This is often due to problematic data being provided by you. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> An authorization error occured. This is often due to incorrect tokens or keys being provided, or accessing a resource that the provided tokens or keys do not have access to. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<GameModel> updateGameWithHttpInfo(String gameId, String xAuthorization, UpdateGameRequest updateGameRequest) throws ApiException {
        okhttp3.Call localVarCall = updateGameValidateBeforeCall(gameId, xAuthorization, updateGameRequest, null);
        Type localVarReturnType = new TypeToken<GameModel>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update game (asynchronously)
     * Update various fields specific to a game. Such as changing its password, resetting its published or secret key, or updating its RPCs.
     * @param gameId Any game id within the MetaFab ecosystem. (required)
     * @param xAuthorization The &#x60;secretKey&#x60; of the authenticating game. (required)
     * @param updateGameRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns the updated game object. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> An API level error occurred. This is often due to problematic data being provided by you. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> An authorization error occured. This is often due to incorrect tokens or keys being provided, or accessing a resource that the provided tokens or keys do not have access to. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateGameAsync(String gameId, String xAuthorization, UpdateGameRequest updateGameRequest, final ApiCallback<GameModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateGameValidateBeforeCall(gameId, xAuthorization, updateGameRequest, _callback);
        Type localVarReturnType = new TypeToken<GameModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
