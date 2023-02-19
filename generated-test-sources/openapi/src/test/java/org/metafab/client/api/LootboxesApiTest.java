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
import org.openapitools.client.model.CreateLootboxManager200Response;
import org.openapitools.client.model.CreateLootboxManagerRequest;
import org.openapitools.client.model.GetLootboxManagers200ResponseInner;
import org.openapitools.client.model.LootboxManagerLootbox;
import org.openapitools.client.model.SetLootboxManagerLootboxRequest;
import org.openapitools.client.model.TransactionModel;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LootboxesApi
 */
@Disabled
public class LootboxesApiTest {

    private final LootboxesApi api = new LootboxesApi();

    /**
     * Create lootbox manager
     *
     * Creates a new game lootbox manager and deploys a lootbox manager contract on behalf of the authenticating game&#39;s primary wallet. The deployed lootbox manager contract allows you to create lootbox behavior for existing items. For example, you can define item id(s) from one of your item collections as the requirement(s) to open a \&quot;lootbox\&quot;. The required item(s) would be burned from the interacting player&#39;s wallet and the player would receive item(s) from a weighted randomized set of possible items the lootbox can contain.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createLootboxManagerTest() throws ApiException {
        String xAuthorization = null;
        String xPassword = null;
        CreateLootboxManagerRequest createLootboxManagerRequest = null;
        CreateLootboxManager200Response response = api.createLootboxManager(xAuthorization, xPassword, createLootboxManagerRequest);
        // TODO: test validations
    }

    /**
     * Get lootbox manager lootbox
     *
     * Returns a lootbox manager lootbox object for the provided lootboxManagerLootboxId.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getLootboxManagerLootboxTest() throws ApiException {
        String lootboxManagerId = null;
        String lootboxManagerLootboxId = null;
        LootboxManagerLootbox response = api.getLootboxManagerLootbox(lootboxManagerId, lootboxManagerLootboxId);
        // TODO: test validations
    }

    /**
     * Get lootbox manager lootboxes
     *
     * Returns all lootbox manager lootboxes as an array of lootbox objects.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getLootboxManagerLootboxesTest() throws ApiException {
        String lootboxManagerId = null;
        List<LootboxManagerLootbox> response = api.getLootboxManagerLootboxes(lootboxManagerId);
        // TODO: test validations
    }

    /**
     * Get lootbox managers
     *
     * Returns an array of active lootbox managers for the game associated with the provided &#x60;X-Game-Key&#x60;.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getLootboxManagersTest() throws ApiException {
        String xGameKey = null;
        List<GetLootboxManagers200ResponseInner> response = api.getLootboxManagers(xGameKey);
        // TODO: test validations
    }

    /**
     * Open lootbox manager lootbox
     *
     * Opens a lootbox manager lootbox. The required input item(s) are burned from the wallet or player wallet opening the lootbox. The given output item(s) are given to the wallet or player wallet opening the lootbox.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void openLootboxManagerLootboxTest() throws ApiException {
        String lootboxManagerId = null;
        String lootboxManagerLootboxId = null;
        String xAuthorization = null;
        String xPassword = null;
        List<TransactionModel> response = api.openLootboxManagerLootbox(lootboxManagerId, lootboxManagerLootboxId, xAuthorization, xPassword);
        // TODO: test validations
    }

    /**
     * Remove lootbox manager lootbox
     *
     * Removes the provided lootbox by lootboxId from the provided lootbox manager. Removed lootboxes can no longer be used.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeLootboxManagerLootboxTest() throws ApiException {
        String lootboxManagerId = null;
        String lootboxManagerLootboxId = null;
        String xAuthorization = null;
        String xPassword = null;
        TransactionModel response = api.removeLootboxManagerLootbox(lootboxManagerId, lootboxManagerLootboxId, xAuthorization, xPassword);
        // TODO: test validations
    }

    /**
     * Set lootbox manager lootbox
     *
     * Sets a new lootbox manager lootbox or updates an existing one for the provided id. Lootboxes allow item(s) to be burned to receive a random set of possible item(s) based on probability weight.  Lootboxes can require any number of unique types of items and quantities to open a created lootbox type within the system. A common pattern with lootboxes is to create a lootbox item type within an item collection, and require it as the input item type.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void setLootboxManagerLootboxTest() throws ApiException {
        String lootboxManagerId = null;
        String xAuthorization = null;
        String xPassword = null;
        SetLootboxManagerLootboxRequest setLootboxManagerLootboxRequest = null;
        TransactionModel response = api.setLootboxManagerLootbox(lootboxManagerId, xAuthorization, xPassword, setLootboxManagerLootboxRequest);
        // TODO: test validations
    }

}