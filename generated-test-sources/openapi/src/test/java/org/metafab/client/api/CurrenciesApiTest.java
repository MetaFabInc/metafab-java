/*
 * MetaFab API
 *  Complete MetaFab API references and guides can be found at: https://trymetafab.com
 *
 * The version of the OpenAPI document: 1.3.0
 * Contact: metafabproject@gmail.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.metafab.client.api;

import org.metafab.client.ApiException;
import org.openapitools.client.model.BatchTransferCurrencyRequest;
import java.math.BigDecimal;
import org.openapitools.client.model.BurnCurrencyRequest;
import org.openapitools.client.model.CreateCurrency200Response;
import org.openapitools.client.model.CreateCurrencyRequest;
import org.openapitools.client.model.GetCurrencies200ResponseInner;
import org.openapitools.client.model.GetCurrencyFees200Response;
import org.openapitools.client.model.GrantCurrencyRoleRequest;
import org.openapitools.client.model.MintCurrencyRequest;
import org.openapitools.client.model.RevokeCollectionRoleRequest;
import org.openapitools.client.model.SetCurrencyFeesRequest;
import org.openapitools.client.model.TransactionModel;
import org.openapitools.client.model.TransferCurrencyRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CurrenciesApi
 */
@Disabled
public class CurrenciesApiTest {

    private final CurrenciesApi api = new CurrenciesApi();

    /**
     * Batch transfer currency
     *
     * Transfers multiple amounts of currency to multiple provided wallet addresses or wallet addresses associated with the provided walletIds. You may also provide a combination of addresses and walletIds in one request, the proper receipients will be automatically determined, with &#x60;addresses&#x60; getting &#x60;amounts&#x60; order priority first.  Optional references may be included for the transfer. References are useful for identifying transfers intended to pay for items, trades, services and more.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void batchTransferCurrencyTest() throws ApiException {
        String currencyId = null;
        String xAuthorization = null;
        String xPassword = null;
        BatchTransferCurrencyRequest batchTransferCurrencyRequest = null;
        TransactionModel response = api.batchTransferCurrency(currencyId, xAuthorization, xPassword, batchTransferCurrencyRequest);
        // TODO: test validations
    }

    /**
     * Burn currency
     *
     * Removes (burns) the provided amount of currency from the authenticating game or players wallet. The currency amount is permanently removed from the circulating supply of the currency.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void burnCurrencyTest() throws ApiException {
        String currencyId = null;
        String xAuthorization = null;
        String xPassword = null;
        BurnCurrencyRequest burnCurrencyRequest = null;
        TransactionModel response = api.burnCurrency(currencyId, xAuthorization, xPassword, burnCurrencyRequest);
        // TODO: test validations
    }

    /**
     * Create currency
     *
     * Creates a new game currency and deploys an ERC20 token contract on behalf of the authenticating game&#39;s primary wallet. The deployed ERC20 contract is preconfigured to fully support bridging across blockchains, batched transfers and gasless transactions on any supported blockchain as well as full support for gasless transactions from player managed wallets.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createCurrencyTest() throws ApiException {
        String xAuthorization = null;
        String xPassword = null;
        CreateCurrencyRequest createCurrencyRequest = null;
        CreateCurrency200Response response = api.createCurrency(xAuthorization, xPassword, createCurrencyRequest);
        // TODO: test validations
    }

    /**
     * Get currencies
     *
     * Returns an array of active currencies for the game associated with the provided &#x60;X-Game-Key&#x60;.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCurrenciesTest() throws ApiException {
        String xGameKey = null;
        List<GetCurrencies200ResponseInner> response = api.getCurrencies(xGameKey);
        // TODO: test validations
    }

    /**
     * Get currency balance
     *
     * Returns the current currency balance of the provided wallet address or or the wallet address associated with the provided walletId.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCurrencyBalanceTest() throws ApiException {
        String currencyId = null;
        String address = null;
        String walletId = null;
        BigDecimal response = api.getCurrencyBalance(currencyId, address, walletId);
        // TODO: test validations
    }

    /**
     * Get currency fees
     *
     * Returns the current fee recipient address and fees of the currency for the provided currencyId. Fees are only applicable for gasless transactions performed by default by players.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCurrencyFeesTest() throws ApiException {
        String currencyId = null;
        GetCurrencyFees200Response response = api.getCurrencyFees(currencyId);
        // TODO: test validations
    }

    /**
     * Get currency role
     *
     * Returns a boolean (true/false) representing if the provided role for this currency has been granted to the provided address or address associated with the provided walletId.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCurrencyRoleTest() throws ApiException {
        String currencyId = null;
        String role = null;
        String address = null;
        String walletId = null;
        Boolean response = api.getCurrencyRole(currencyId, role, address, walletId);
        // TODO: test validations
    }

    /**
     * Grant currency role
     *
     * Grants the provided role for the currency to the provided address or address associated with the provided walletId. Granted roles give different types of authority on behalf of the currency for specific players, addresses, or contracts to perform different types of permissioned currency operations.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void grantCurrencyRoleTest() throws ApiException {
        String currencyId = null;
        String xAuthorization = null;
        String xPassword = null;
        GrantCurrencyRoleRequest grantCurrencyRoleRequest = null;
        TransactionModel response = api.grantCurrencyRole(currencyId, xAuthorization, xPassword, grantCurrencyRoleRequest);
        // TODO: test validations
    }

    /**
     * Mint currency
     *
     * Creates (mints) the provided amount of currency to the provided wallet address or wallet address associated with the provided walletId.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void mintCurrencyTest() throws ApiException {
        String currencyId = null;
        String xAuthorization = null;
        String xPassword = null;
        MintCurrencyRequest mintCurrencyRequest = null;
        TransactionModel response = api.mintCurrency(currencyId, xAuthorization, xPassword, mintCurrencyRequest);
        // TODO: test validations
    }

    /**
     * Revoke currency role
     *
     * Revokes the provided role for the currency to the provided address or address associated with the provided walletId.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void revokeCurrencyRoleTest() throws ApiException {
        String currencyId = null;
        String xAuthorization = null;
        String xPassword = null;
        RevokeCollectionRoleRequest revokeCollectionRoleRequest = null;
        TransactionModel response = api.revokeCurrencyRole(currencyId, xAuthorization, xPassword, revokeCollectionRoleRequest);
        // TODO: test validations
    }

    /**
     * Set currency fees
     *
     * Sets the recipient address, basis points, fixed amount and cap amount for a currency&#39;s fees.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void setCurrencyFeesTest() throws ApiException {
        String currencyId = null;
        String xAuthorization = null;
        String xPassword = null;
        SetCurrencyFeesRequest setCurrencyFeesRequest = null;
        TransactionModel response = api.setCurrencyFees(currencyId, xAuthorization, xPassword, setCurrencyFeesRequest);
        // TODO: test validations
    }

    /**
     * Transfer currency
     *
     * Transfers an amount of currency to the provided wallet address or wallet address associated with the provided walletId. If you want to transfer to multiple wallets with different amounts and optional references in one API request, please see the Batch transfer currency documentation.  An optional reference may be included for the transfer. References are useful for identifying transfers intended to pay for items, trades, services and more.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void transferCurrencyTest() throws ApiException {
        String currencyId = null;
        String xAuthorization = null;
        String xPassword = null;
        TransferCurrencyRequest transferCurrencyRequest = null;
        TransactionModel response = api.transferCurrency(currencyId, xAuthorization, xPassword, transferCurrencyRequest);
        // TODO: test validations
    }

}
