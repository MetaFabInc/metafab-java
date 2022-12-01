# metafab-java

MetaFab API
- API version: 1.3.0
  - Build date: 2022-12-01T15:10:52.708628-08:00[America/Los_Angeles]

 Complete MetaFab API references and guides can be found at: https://trymetafab.com

  For more information, please visit [https://trymetafab.com](https://trymetafab.com)

*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>org.metafab</groupId>
  <artifactId>metafab-java</artifactId>
  <version>1.3.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'metafab-java' jar has been published to maven central.
    mavenLocal()       // Needed if the 'metafab-java' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "org.metafab:metafab-java:1.3.0"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/metafab-java-1.3.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import org.metafab.client.ApiClient;
import org.metafab.client.ApiException;
import org.metafab.client.Configuration;
import org.metafab.client.models.*;
import org.metafab.client.api.ContractsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.trymetafab.com");

    ContractsApi apiInstance = new ContractsApi(defaultClient);
    String xAuthorization = "game_sk_02z4Mv3c85Ig0gNowY9Dq0N2kjb1xwzr27ArLE0669RrRI6dLf822iPO26K1p1FP"; // String | The `secretKey` of the authenticating game.
    CreateContractRequest createContractRequest = new CreateContractRequest(); // CreateContractRequest | 
    try {
      ContractModel result = apiInstance.createContract(xAuthorization, createContractRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractsApi#createContract");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.trymetafab.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ContractsApi* | [**createContract**](docs/ContractsApi.md#createContract) | **POST** /v1/contracts | Create custom contract
*ContractsApi* | [**getContracts**](docs/ContractsApi.md#getContracts) | **GET** /v1/contracts | Get contracts
*ContractsApi* | [**readContract**](docs/ContractsApi.md#readContract) | **GET** /v1/contracts/{contractId}/reads | Read contract data
*ContractsApi* | [**writeContract**](docs/ContractsApi.md#writeContract) | **POST** /v1/contracts/{contractId}/writes | Write contract data
*CurrenciesApi* | [**batchTransferCurrency**](docs/CurrenciesApi.md#batchTransferCurrency) | **POST** /v1/currencies/{currencyId}/batchTransfers | Batch transfer currency
*CurrenciesApi* | [**burnCurrency**](docs/CurrenciesApi.md#burnCurrency) | **POST** /v1/currencies/{currencyId}/burns | Burn currency
*CurrenciesApi* | [**createCurrency**](docs/CurrenciesApi.md#createCurrency) | **POST** /v1/currencies | Create currency
*CurrenciesApi* | [**getCurrencies**](docs/CurrenciesApi.md#getCurrencies) | **GET** /v1/currencies | Get currencies
*CurrenciesApi* | [**getCurrencyBalance**](docs/CurrenciesApi.md#getCurrencyBalance) | **GET** /v1/currencies/{currencyId}/balances | Get currency balance
*CurrenciesApi* | [**getCurrencyFees**](docs/CurrenciesApi.md#getCurrencyFees) | **GET** /v1/currencies/{currencyId}/fees | Get currency fees
*CurrenciesApi* | [**getCurrencyRole**](docs/CurrenciesApi.md#getCurrencyRole) | **GET** /v1/currencies/{currencyId}/roles | Get currency role
*CurrenciesApi* | [**grantCurrencyRole**](docs/CurrenciesApi.md#grantCurrencyRole) | **POST** /v1/currencies/{currencyId}/roles | Grant currency role
*CurrenciesApi* | [**mintCurrency**](docs/CurrenciesApi.md#mintCurrency) | **POST** /v1/currencies/{currencyId}/mints | Mint currency
*CurrenciesApi* | [**revokeCurrencyRole**](docs/CurrenciesApi.md#revokeCurrencyRole) | **DELETE** /v1/currencies/{currencyId}/roles | Revoke currency role
*CurrenciesApi* | [**setCurrencyFees**](docs/CurrenciesApi.md#setCurrencyFees) | **POST** /v1/currencies/{currencyId}/fees | Set currency fees
*CurrenciesApi* | [**transferCurrency**](docs/CurrenciesApi.md#transferCurrency) | **POST** /v1/currencies/{currencyId}/transfers | Transfer currency
*GamesApi* | [**authGame**](docs/GamesApi.md#authGame) | **GET** /v1/games/auth | Authenticate game
*GamesApi* | [**createGame**](docs/GamesApi.md#createGame) | **POST** /v1/games | Create game
*GamesApi* | [**getGame**](docs/GamesApi.md#getGame) | **GET** /v1/games/{gameId} | Get game
*GamesApi* | [**updateGame**](docs/GamesApi.md#updateGame) | **PATCH** /v1/games/{gameId} | Update game
*ItemsApi* | [**batchMintCollectionItems**](docs/ItemsApi.md#batchMintCollectionItems) | **POST** /v1/collections/{collectionId}/batchMints | Batch mint collection items
*ItemsApi* | [**batchTransferCollectionItems**](docs/ItemsApi.md#batchTransferCollectionItems) | **POST** /v1/collections/{collectionId}/batchTransfers | Batch transfer collection items
*ItemsApi* | [**burnCollectionItem**](docs/ItemsApi.md#burnCollectionItem) | **POST** /v1/collections/{collectionId}/items/{collectionItemId}/burns | Burn collection item
*ItemsApi* | [**createCollection**](docs/ItemsApi.md#createCollection) | **POST** /v1/collections | Create collection
*ItemsApi* | [**createCollectionItem**](docs/ItemsApi.md#createCollectionItem) | **POST** /v1/collections/{collectionId}/items | Create collection item
*ItemsApi* | [**getCollectionApproval**](docs/ItemsApi.md#getCollectionApproval) | **GET** /v1/collections/{collectionId}/approvals | Get collection approval
*ItemsApi* | [**getCollectionItem**](docs/ItemsApi.md#getCollectionItem) | **GET** /v1/collections/{collectionId}/items/{collectionItemId} | Get collection item
*ItemsApi* | [**getCollectionItemBalance**](docs/ItemsApi.md#getCollectionItemBalance) | **GET** /v1/collections/{collectionId}/items/{collectionItemId}/balances | Get collection item balance
*ItemsApi* | [**getCollectionItemBalances**](docs/ItemsApi.md#getCollectionItemBalances) | **GET** /v1/collections/{collectionId}/balances | Get collection item balances
*ItemsApi* | [**getCollectionItemSupplies**](docs/ItemsApi.md#getCollectionItemSupplies) | **GET** /v1/collections/{collectionId}/supplies | Get collection item supplies
*ItemsApi* | [**getCollectionItemSupply**](docs/ItemsApi.md#getCollectionItemSupply) | **GET** /v1/collections/{collectionId}/items/{collectionItemId}/supplies | Get collection item supply
*ItemsApi* | [**getCollectionItemTimelock**](docs/ItemsApi.md#getCollectionItemTimelock) | **GET** /v1/collections/{collectionId}/items/{collectionItemId}/timelocks | Get collection item timelock
*ItemsApi* | [**getCollectionItems**](docs/ItemsApi.md#getCollectionItems) | **GET** /v1/collections/{collectionId}/items | Get collection items
*ItemsApi* | [**getCollectionRole**](docs/ItemsApi.md#getCollectionRole) | **GET** /v1/collections/{collectionId}/roles | Get collection role
*ItemsApi* | [**getCollections**](docs/ItemsApi.md#getCollections) | **GET** /v1/collections | Get collections
*ItemsApi* | [**grantCollectionRole**](docs/ItemsApi.md#grantCollectionRole) | **POST** /v1/collections/{collectionId}/roles | Grant collection role
*ItemsApi* | [**mintCollectionItem**](docs/ItemsApi.md#mintCollectionItem) | **POST** /v1/collections/{collectionId}/items/{collectionItemId}/mints | Mint collection item
*ItemsApi* | [**revokeCollectionRole**](docs/ItemsApi.md#revokeCollectionRole) | **DELETE** /v1/collections/{collectionId}/roles | Revoke collection role
*ItemsApi* | [**setCollectionApproval**](docs/ItemsApi.md#setCollectionApproval) | **POST** /v1/collections/{collectionId}/approvals | Set collection approval
*ItemsApi* | [**setCollectionItemTimelock**](docs/ItemsApi.md#setCollectionItemTimelock) | **POST** /v1/collections/{collectionId}/items/{collectionItemId}/timelocks | Set collection item timelock
*ItemsApi* | [**transferCollectionItem**](docs/ItemsApi.md#transferCollectionItem) | **POST** /v1/collections/{collectionId}/items/{collectionItemId}/transfers | Transfer collection item
*LootboxesApi* | [**createLootboxManager**](docs/LootboxesApi.md#createLootboxManager) | **POST** /v1/lootboxManagers | Create lootbox manager
*LootboxesApi* | [**getLootboxManagerLootbox**](docs/LootboxesApi.md#getLootboxManagerLootbox) | **GET** /v1/lootboxManagers/{lootboxManagerId}/lootboxes/{lootboxManagerLootboxId} | Get lootbox manager lootbox
*LootboxesApi* | [**getLootboxManagerLootboxes**](docs/LootboxesApi.md#getLootboxManagerLootboxes) | **GET** /v1/lootboxManagers/{lootboxManagerId}/lootboxes | Get lootbox manager lootboxes
*LootboxesApi* | [**getLootboxManagers**](docs/LootboxesApi.md#getLootboxManagers) | **GET** /v1/lootboxManagers | Get lootbox managers
*LootboxesApi* | [**openLootboxManagerLootbox**](docs/LootboxesApi.md#openLootboxManagerLootbox) | **POST** /v1/lootboxManagers/{lootboxManagerId}/lootboxes/{lootboxManagerLootboxId}/opens | Open lootbox manager lootbox
*LootboxesApi* | [**removeLootboxManagerLootbox**](docs/LootboxesApi.md#removeLootboxManagerLootbox) | **DELETE** /v1/lootboxManagers/{lootboxManagerId}/lootboxes/{lootboxManagerLootboxId} | Remove lootbox manager lootbox
*LootboxesApi* | [**setLootboxManagerLootbox**](docs/LootboxesApi.md#setLootboxManagerLootbox) | **POST** /v1/lootboxManagers/{lootboxManagerId}/lootboxes | Set lootbox manager lootbox
*PlayersApi* | [**authPlayer**](docs/PlayersApi.md#authPlayer) | **GET** /v1/players/auth | Authenticate player
*PlayersApi* | [**createPlayer**](docs/PlayersApi.md#createPlayer) | **POST** /v1/players | Create player
*PlayersApi* | [**getPlayer**](docs/PlayersApi.md#getPlayer) | **GET** /v1/players/{playerId} | Get player
*PlayersApi* | [**getPlayerData**](docs/PlayersApi.md#getPlayerData) | **GET** /v1/players/{playerId}/data | Get player data
*PlayersApi* | [**getPlayers**](docs/PlayersApi.md#getPlayers) | **GET** /v1/players | Get players
*PlayersApi* | [**setPlayerData**](docs/PlayersApi.md#setPlayerData) | **POST** /v1/players/{playerId}/data | Set player data
*PlayersApi* | [**updatePlayer**](docs/PlayersApi.md#updatePlayer) | **PATCH** /v1/players/{playerId} | Update player
*ShopsApi* | [**createShop**](docs/ShopsApi.md#createShop) | **POST** /v1/shops | Create shop
*ShopsApi* | [**getShopOffer**](docs/ShopsApi.md#getShopOffer) | **GET** /v1/shops/{shopId}/items/{shopOfferId} | Get shop offer
*ShopsApi* | [**getShopOffers**](docs/ShopsApi.md#getShopOffers) | **GET** /v1/shops/{shopId}/offers | Get shop offers
*ShopsApi* | [**getShops**](docs/ShopsApi.md#getShops) | **GET** /v1/shops | Get shops
*ShopsApi* | [**removeShopOffer**](docs/ShopsApi.md#removeShopOffer) | **DELETE** /v1/shops/{shopId}/offers/{shopOfferId} | Remove shop offer
*ShopsApi* | [**setShopOffer**](docs/ShopsApi.md#setShopOffer) | **POST** /v1/shops/{shopId}/offers | Set shop offer
*ShopsApi* | [**useShopOffer**](docs/ShopsApi.md#useShopOffer) | **POST** /v1/shops/{shopId}/offers/{shopOfferId}/uses | Use shop offer
*ShopsApi* | [**withdrawFromShop**](docs/ShopsApi.md#withdrawFromShop) | **POST** /v1/shops/{shopId}/withdrawals | Withdraw from shop
*TransactionsApi* | [**getTransaction**](docs/TransactionsApi.md#getTransaction) | **GET** /v1/transactions/{transactionId} | Get transaction
*WalletsApi* | [**getWalletBalances**](docs/WalletsApi.md#getWalletBalances) | **GET** /v1/wallets/{walletId}/balances | Get wallet balances
*WalletsApi* | [**getWalletTransactions**](docs/WalletsApi.md#getWalletTransactions) | **GET** /v1/wallets/{walletId}/transactions | Get wallet transactions


## Documentation for Models

 - [AuthGame200Response](docs/AuthGame200Response.md)
 - [AuthGame200ResponseAllOf](docs/AuthGame200ResponseAllOf.md)
 - [AuthGame200ResponseAllOf1](docs/AuthGame200ResponseAllOf1.md)
 - [AuthPlayer200Response](docs/AuthPlayer200Response.md)
 - [BatchMintCollectionItemsRequest](docs/BatchMintCollectionItemsRequest.md)
 - [BatchTransferCollectionItemsRequest](docs/BatchTransferCollectionItemsRequest.md)
 - [BatchTransferCurrencyRequest](docs/BatchTransferCurrencyRequest.md)
 - [BurnCollectionItemRequest](docs/BurnCollectionItemRequest.md)
 - [BurnCurrencyRequest](docs/BurnCurrencyRequest.md)
 - [CollectionModel](docs/CollectionModel.md)
 - [ContractModel](docs/ContractModel.md)
 - [CreateCollection200Response](docs/CreateCollection200Response.md)
 - [CreateCollection200ResponseAllOf](docs/CreateCollection200ResponseAllOf.md)
 - [CreateCollection200ResponseAllOfContract](docs/CreateCollection200ResponseAllOfContract.md)
 - [CreateCollection200ResponseAllOfContractAllOf](docs/CreateCollection200ResponseAllOfContractAllOf.md)
 - [CreateCollectionItemRequest](docs/CreateCollectionItemRequest.md)
 - [CreateCollectionItemRequestAttributesInner](docs/CreateCollectionItemRequestAttributesInner.md)
 - [CreateCollectionRequest](docs/CreateCollectionRequest.md)
 - [CreateContractRequest](docs/CreateContractRequest.md)
 - [CreateCurrency200Response](docs/CreateCurrency200Response.md)
 - [CreateCurrencyRequest](docs/CreateCurrencyRequest.md)
 - [CreateGameRequest](docs/CreateGameRequest.md)
 - [CreateLootboxManager200Response](docs/CreateLootboxManager200Response.md)
 - [CreateLootboxManagerRequest](docs/CreateLootboxManagerRequest.md)
 - [CreatePlayerRequest](docs/CreatePlayerRequest.md)
 - [CreateShop200Response](docs/CreateShop200Response.md)
 - [CreateShopRequest](docs/CreateShopRequest.md)
 - [CurrencyModel](docs/CurrencyModel.md)
 - [GameModel](docs/GameModel.md)
 - [GetCollections200ResponseInner](docs/GetCollections200ResponseInner.md)
 - [GetCollections200ResponseInnerAllOf](docs/GetCollections200ResponseInnerAllOf.md)
 - [GetCurrencies200ResponseInner](docs/GetCurrencies200ResponseInner.md)
 - [GetCurrencyFees200Response](docs/GetCurrencyFees200Response.md)
 - [GetLootboxManagers200ResponseInner](docs/GetLootboxManagers200ResponseInner.md)
 - [GetPlayerData200Response](docs/GetPlayerData200Response.md)
 - [GetShops200ResponseInner](docs/GetShops200ResponseInner.md)
 - [GrantCollectionRoleRequest](docs/GrantCollectionRoleRequest.md)
 - [GrantCurrencyRoleRequest](docs/GrantCurrencyRoleRequest.md)
 - [LootboxManagerLootbox](docs/LootboxManagerLootbox.md)
 - [LootboxManagerModel](docs/LootboxManagerModel.md)
 - [MintCollectionItemRequest](docs/MintCollectionItemRequest.md)
 - [MintCurrencyRequest](docs/MintCurrencyRequest.md)
 - [PlayerModel](docs/PlayerModel.md)
 - [PublicGame](docs/PublicGame.md)
 - [PublicPlayer](docs/PublicPlayer.md)
 - [PublicPlayerWallet](docs/PublicPlayerWallet.md)
 - [RevokeCollectionRoleRequest](docs/RevokeCollectionRoleRequest.md)
 - [SetCollectionApprovalRequest](docs/SetCollectionApprovalRequest.md)
 - [SetCollectionItemTimelockRequest](docs/SetCollectionItemTimelockRequest.md)
 - [SetCurrencyFeesRequest](docs/SetCurrencyFeesRequest.md)
 - [SetLootboxManagerLootboxRequest](docs/SetLootboxManagerLootboxRequest.md)
 - [SetPlayerDataRequest](docs/SetPlayerDataRequest.md)
 - [SetShopOfferRequest](docs/SetShopOfferRequest.md)
 - [ShopModel](docs/ShopModel.md)
 - [ShopOffer](docs/ShopOffer.md)
 - [TransactionModel](docs/TransactionModel.md)
 - [TransferCollectionItemRequest](docs/TransferCollectionItemRequest.md)
 - [TransferCurrencyRequest](docs/TransferCurrencyRequest.md)
 - [UpdateGameRequest](docs/UpdateGameRequest.md)
 - [UpdatePlayerRequest](docs/UpdatePlayerRequest.md)
 - [WalletModel](docs/WalletModel.md)
 - [WithdrawFromShopRequest](docs/WithdrawFromShopRequest.md)
 - [WriteContractRequest](docs/WriteContractRequest.md)
 - [WriteContractRequestArgsInner](docs/WriteContractRequestArgsInner.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### basicAuth

- **Type**: HTTP basic authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

metafabproject@gmail.com

