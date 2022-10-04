/*
 * MetaFab API
 *  Complete MetaFab API references and guides can be found at: https://trymetafab.com
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: metafabproject@gmail.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.metafab.client.api;

import org.metafab.client.ApiException;
import org.openapitools.client.model.AuthPlayer200Response;
import org.openapitools.client.model.CreatePlayerRequest;
import org.openapitools.client.model.PlayerModel;
import org.openapitools.client.model.UpdatePlayerRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PlayersApi
 */
@Disabled
public class PlayersApiTest {

    private final PlayersApi api = new PlayersApi();

    /**
     * Authenticate player
     *
     * Returns an existing player object containing access token, wallet, and other details for a game when provided a valid username and password login using Basic Auth.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void authPlayerTest() throws ApiException {
        String xGameKey = null;
        AuthPlayer200Response response = api.authPlayer(xGameKey);
        // TODO: test validations
    }

    /**
     * Create player
     *
     * Create a new player for a game. Players are automatically associated with an internally managed wallet.  Player access tokens can be used to directly interact with any MetaFab managed contracts, currencies, items collections, marketplaces and more. Player interactions are also gasless by default, completely removing all crypto friction for players to engage with your MetaFab supported games.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createPlayerTest() throws ApiException {
        String xGameKey = null;
        CreatePlayerRequest createPlayerRequest = null;
        AuthPlayer200Response response = api.createPlayer(xGameKey, createPlayerRequest);
        // TODO: test validations
    }

    /**
     * Update player
     *
     * Update various fields specific to a player. Such as changing its password and resetting its access token.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updatePlayerTest() throws ApiException {
        String playerId = null;
        String xAuthorization = null;
        UpdatePlayerRequest updatePlayerRequest = null;
        PlayerModel response = api.updatePlayer(playerId, xAuthorization, updatePlayerRequest);
        // TODO: test validations
    }

}