/*
 * MetaFab API
 *  Complete MetaFab API references and guides can be found at: https://trymetafab.com
 *
 * The version of the OpenAPI document: 1.2
 * Contact: metafabproject@gmail.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.metafab.client.api;

import org.metafab.client.ApiException;
import org.openapitools.client.model.CreateExchange200Response;
import org.openapitools.client.model.CreateExchangeRequest;
import org.openapitools.client.model.ExchangeOffer;
import org.openapitools.client.model.GetExchanges200ResponseInner;
import org.openapitools.client.model.SetExchangeOfferRequest;
import org.openapitools.client.model.TransactionModel;
import org.openapitools.client.model.WithdrawFromExchangeRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ExchangesApi
 */
@Disabled
public class ExchangesApiTest {

    private final ExchangesApi api = new ExchangesApi();

    /**
     * Create exchange
     *
     * Creates a new game exchange and deploys a exchange contract on behalf of the authenticating game&#39;s primary wallet. The deployed exchange contract allows you to create fixed price rates for players to buy specific items from any item collection or ERC1155 contract. Additionally, an exchange allows you to create exchange offers for some set of item(s) to another set of item(s) or any mix of currency. Exchanges completely supports gasless player transactions.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createExchangeTest() throws ApiException {
        String xAuthorization = null;
        String xPassword = null;
        CreateExchangeRequest createExchangeRequest = null;
        CreateExchange200Response response = api.createExchange(xAuthorization, xPassword, createExchangeRequest);
        // TODO: test validations
    }

    /**
     * Get exchange offer
     *
     * Returns a exchange offer object for the provided exchangeOfferId.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getExchangeOfferTest() throws ApiException {
        String exchangeId = null;
        String exchangeOfferId = null;
        ExchangeOffer response = api.getExchangeOffer(exchangeId, exchangeOfferId);
        // TODO: test validations
    }

    /**
     * Get exchange offers
     *
     * Returns all exchange offers as an array of exchange offer objects.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getExchangeOffersTest() throws ApiException {
        String exchangeId = null;
        List<ExchangeOffer> response = api.getExchangeOffers(exchangeId);
        // TODO: test validations
    }

    /**
     * Get exchanges
     *
     * Returns an array of active exchanges for the game associated with the provided &#x60;X-Game-Key&#x60;.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getExchangesTest() throws ApiException {
        String xGameKey = null;
        List<GetExchanges200ResponseInner> response = api.getExchanges(xGameKey);
        // TODO: test validations
    }

    /**
     * Remove exchange offer
     *
     * Removes the provided offerId from the provided exchange. Removed offers can no longer be used.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeExchangeOfferTest() throws ApiException {
        String exchangeId = null;
        String exchangeOfferId = null;
        String xAuthorization = null;
        String xPassword = null;
        TransactionModel response = api.removeExchangeOffer(exchangeId, exchangeOfferId, xAuthorization, xPassword);
        // TODO: test validations
    }

    /**
     * Set exchange offer
     *
     * Sets a new exchange offer or updates an existing one for the provided id. Exchange offers allow currency to item, item to currency or item to item exchanges.  All request fields besides &#x60;id&#x60; are optional. Any optional fields omitted will not be used for the offer. This allows you to create many different combinations of offers. For example, you can create an offer that may require 3 unique item ids of specified quantities from a given item collection and gives the user 1 new unique item id in exchange.  Another example, you may want to make an exchange offer from one ERC20 token to another. This is also possible - simple set the input and output currency fields and leave the others blank.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void setExchangeOfferTest() throws ApiException {
        String exchangeId = null;
        String xAuthorization = null;
        String xPassword = null;
        SetExchangeOfferRequest setExchangeOfferRequest = null;
        TransactionModel response = api.setExchangeOffer(exchangeId, xAuthorization, xPassword, setExchangeOfferRequest);
        // TODO: test validations
    }

    /**
     * Use exchange offer
     *
     * Uses an exchange offer. The required (input) item(s) and/or currency are removed from the wallet or player wallet using the offer. The given (output) item(s) and/or currency are given to the wallet or player wallet using the offer.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void useExchangeOfferTest() throws ApiException {
        String exchangeId = null;
        String exchangeOfferId = null;
        String xAuthorization = null;
        String xPassword = null;
        TransactionModel response = api.useExchangeOffer(exchangeId, exchangeOfferId, xAuthorization, xPassword);
        // TODO: test validations
    }

    /**
     * Withdraw from exchange
     *
     * Withdraws native token, currency or items from a exchange. Whenever an exchange offer has input requirements, the native tokens, currencies or items for the requirements of that offer are deposited into the exchange contract when the offer is used. These can be withdrawn to any other address.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void withdrawFromExchangeTest() throws ApiException {
        String exchangeId = null;
        String xAuthorization = null;
        String xPassword = null;
        WithdrawFromExchangeRequest withdrawFromExchangeRequest = null;
        TransactionModel response = api.withdrawFromExchange(exchangeId, xAuthorization, xPassword, withdrawFromExchangeRequest);
        // TODO: test validations
    }

}