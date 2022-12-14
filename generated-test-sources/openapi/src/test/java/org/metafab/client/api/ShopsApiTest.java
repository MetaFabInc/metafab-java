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
import org.openapitools.client.model.CreateShop200Response;
import org.openapitools.client.model.CreateShopRequest;
import org.openapitools.client.model.GetShops200ResponseInner;
import org.openapitools.client.model.SetShopOfferRequest;
import org.openapitools.client.model.ShopOffer;
import org.openapitools.client.model.TransactionModel;
import org.openapitools.client.model.WithdrawFromShopRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ShopsApi
 */
@Disabled
public class ShopsApiTest {

    private final ShopsApi api = new ShopsApi();

    /**
     * Create shop
     *
     * Creates a new game shop and deploys a shop contract on behalf of the authenticating game&#39;s primary wallet. The deployed shop contract allows you to create fixed price rates for players to buy specific items from any item collection or ERC1155 contract. Additionally, a shop allows you to create shop offers for some set of item(s) to another set of item(s) or any mix of currency. Shops completely support gasless player transactions.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createShopTest() throws ApiException {
        String xAuthorization = null;
        String xPassword = null;
        CreateShopRequest createShopRequest = null;
        CreateShop200Response response = api.createShop(xAuthorization, xPassword, createShopRequest);
        // TODO: test validations
    }

    /**
     * Get shop offer
     *
     * Returns a shop offer object for the provided shopOfferId.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getShopOfferTest() throws ApiException {
        String shopId = null;
        String shopOfferId = null;
        ShopOffer response = api.getShopOffer(shopId, shopOfferId);
        // TODO: test validations
    }

    /**
     * Get shop offers
     *
     * Returns all shop offers as an array of shop offer objects.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getShopOffersTest() throws ApiException {
        String shopId = null;
        List<ShopOffer> response = api.getShopOffers(shopId);
        // TODO: test validations
    }

    /**
     * Get shops
     *
     * Returns an array of active shops for the game associated with the provided &#x60;X-Game-Key&#x60;.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getShopsTest() throws ApiException {
        String xGameKey = null;
        List<GetShops200ResponseInner> response = api.getShops(xGameKey);
        // TODO: test validations
    }

    /**
     * Remove shop offer
     *
     * Removes the provided offer by offerId from the provided shop. Removed offers can no longer be used.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeShopOfferTest() throws ApiException {
        String shopId = null;
        String shopOfferId = null;
        String xAuthorization = null;
        String xPassword = null;
        TransactionModel response = api.removeShopOffer(shopId, shopOfferId, xAuthorization, xPassword);
        // TODO: test validations
    }

    /**
     * Set shop offer
     *
     * Sets a new shop offer or updates an existing one for the provided id. Shop offers allow currency to item, item to currency or item to item exchanges.  All request fields besides &#x60;id&#x60; are optional. Any optional fields omitted will not be used for the offer. This allows you to create many different combinations of offers. For example, you can create an offer that may require 3 unique item ids of specified quantities from a given item collection and gives the user 1 new unique item id in exchange.  Another example, you may want to make a shop offer from one ERC20 token to another. This is also possible - simple set the input and output currency fields and leave the others blank.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void setShopOfferTest() throws ApiException {
        String shopId = null;
        String xAuthorization = null;
        String xPassword = null;
        SetShopOfferRequest setShopOfferRequest = null;
        TransactionModel response = api.setShopOffer(shopId, xAuthorization, xPassword, setShopOfferRequest);
        // TODO: test validations
    }

    /**
     * Use shop offer
     *
     * Uses a shop offer. The required (input) item(s) and/or currency are removed from the wallet or player wallet using the offer. The given (output) item(s) and/or currency are given to the wallet or player wallet using the offer.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void useShopOfferTest() throws ApiException {
        String shopId = null;
        String shopOfferId = null;
        String xAuthorization = null;
        String xPassword = null;
        TransactionModel response = api.useShopOffer(shopId, shopOfferId, xAuthorization, xPassword);
        // TODO: test validations
    }

    /**
     * Withdraw from shop
     *
     * Withdraws native token, currency or items from a shop. Whenever a shop offer has input requirements, the native tokens, currencies or items for the requirements of that offer are deposited into the shop contract when the offer is used. These can be withdrawn to any other address.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void withdrawFromShopTest() throws ApiException {
        String shopId = null;
        String xAuthorization = null;
        String xPassword = null;
        WithdrawFromShopRequest withdrawFromShopRequest = null;
        TransactionModel response = api.withdrawFromShop(shopId, xAuthorization, xPassword, withdrawFromShopRequest);
        // TODO: test validations
    }

}
