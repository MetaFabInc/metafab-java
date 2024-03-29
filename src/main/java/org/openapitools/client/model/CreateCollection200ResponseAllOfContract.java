/*
 * MetaFab API
 * Complete MetaFab API references and guides can be found at: https://trymetafab.com
 *
 * The version of the OpenAPI document: 1.5.1
 * Contact: metafabproject@gmail.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.TransactionModel;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.metafab.client.JSON;

/**
 * CreateCollection200ResponseAllOfContract
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-19T17:38:27.237153-05:00[America/New_York]")
public class CreateCollection200ResponseAllOfContract {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_GAME_ID = "gameId";
  @SerializedName(SERIALIZED_NAME_GAME_ID)
  private String gameId;

  public static final String SERIALIZED_NAME_CHAIN = "chain";
  @SerializedName(SERIALIZED_NAME_CHAIN)
  private String chain;

  public static final String SERIALIZED_NAME_ABI = "abi";
  @SerializedName(SERIALIZED_NAME_ABI)
  private Object abi;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_FORWARDER_ADDRESS = "forwarderAddress";
  @SerializedName(SERIALIZED_NAME_FORWARDER_ADDRESS)
  private String forwarderAddress;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private String updatedAt;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_TRANSACTIONS = "transactions";
  @SerializedName(SERIALIZED_NAME_TRANSACTIONS)
  private List<TransactionModel> transactions = null;

  public CreateCollection200ResponseAllOfContract() {
  }

  public CreateCollection200ResponseAllOfContract id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * This field has not had a description added.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This field has not had a description added.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public CreateCollection200ResponseAllOfContract gameId(String gameId) {
    
    this.gameId = gameId;
    return this;
  }

   /**
   * This field has not had a description added.
   * @return gameId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This field has not had a description added.")

  public String getGameId() {
    return gameId;
  }


  public void setGameId(String gameId) {
    this.gameId = gameId;
  }


  public CreateCollection200ResponseAllOfContract chain(String chain) {
    
    this.chain = chain;
    return this;
  }

   /**
   * This field has not had a description added.
   * @return chain
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This field has not had a description added.")

  public String getChain() {
    return chain;
  }


  public void setChain(String chain) {
    this.chain = chain;
  }


  public CreateCollection200ResponseAllOfContract abi(Object abi) {
    
    this.abi = abi;
    return this;
  }

   /**
   * This field has not had a description added.
   * @return abi
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This field has not had a description added.")

  public Object getAbi() {
    return abi;
  }


  public void setAbi(Object abi) {
    this.abi = abi;
  }


  public CreateCollection200ResponseAllOfContract type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * This field has not had a description added.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This field has not had a description added.")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public CreateCollection200ResponseAllOfContract address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * This field has not had a description added.
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This field has not had a description added.")

  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public CreateCollection200ResponseAllOfContract forwarderAddress(String forwarderAddress) {
    
    this.forwarderAddress = forwarderAddress;
    return this;
  }

   /**
   * This field has not had a description added.
   * @return forwarderAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This field has not had a description added.")

  public String getForwarderAddress() {
    return forwarderAddress;
  }


  public void setForwarderAddress(String forwarderAddress) {
    this.forwarderAddress = forwarderAddress;
  }


  public CreateCollection200ResponseAllOfContract updatedAt(String updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * This field has not had a description added.
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This field has not had a description added.")

  public String getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }


  public CreateCollection200ResponseAllOfContract createdAt(String createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * This field has not had a description added.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This field has not had a description added.")

  public String getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public CreateCollection200ResponseAllOfContract transactions(List<TransactionModel> transactions) {
    
    this.transactions = transactions;
    return this;
  }

  public CreateCollection200ResponseAllOfContract addTransactionsItem(TransactionModel transactionsItem) {
    if (this.transactions == null) {
      this.transactions = new ArrayList<>();
    }
    this.transactions.add(transactionsItem);
    return this;
  }

   /**
   * Get transactions
   * @return transactions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<TransactionModel> getTransactions() {
    return transactions;
  }


  public void setTransactions(List<TransactionModel> transactions) {
    this.transactions = transactions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateCollection200ResponseAllOfContract createCollection200ResponseAllOfContract = (CreateCollection200ResponseAllOfContract) o;
    return Objects.equals(this.id, createCollection200ResponseAllOfContract.id) &&
        Objects.equals(this.gameId, createCollection200ResponseAllOfContract.gameId) &&
        Objects.equals(this.chain, createCollection200ResponseAllOfContract.chain) &&
        Objects.equals(this.abi, createCollection200ResponseAllOfContract.abi) &&
        Objects.equals(this.type, createCollection200ResponseAllOfContract.type) &&
        Objects.equals(this.address, createCollection200ResponseAllOfContract.address) &&
        Objects.equals(this.forwarderAddress, createCollection200ResponseAllOfContract.forwarderAddress) &&
        Objects.equals(this.updatedAt, createCollection200ResponseAllOfContract.updatedAt) &&
        Objects.equals(this.createdAt, createCollection200ResponseAllOfContract.createdAt) &&
        Objects.equals(this.transactions, createCollection200ResponseAllOfContract.transactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, gameId, chain, abi, type, address, forwarderAddress, updatedAt, createdAt, transactions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCollection200ResponseAllOfContract {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    gameId: ").append(toIndentedString(gameId)).append("\n");
    sb.append("    chain: ").append(toIndentedString(chain)).append("\n");
    sb.append("    abi: ").append(toIndentedString(abi)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    forwarderAddress: ").append(toIndentedString(forwarderAddress)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    transactions: ").append(toIndentedString(transactions)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("id");
    openapiFields.add("gameId");
    openapiFields.add("chain");
    openapiFields.add("abi");
    openapiFields.add("type");
    openapiFields.add("address");
    openapiFields.add("forwarderAddress");
    openapiFields.add("updatedAt");
    openapiFields.add("createdAt");
    openapiFields.add("transactions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateCollection200ResponseAllOfContract
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CreateCollection200ResponseAllOfContract.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateCollection200ResponseAllOfContract is not found in the empty JSON string", CreateCollection200ResponseAllOfContract.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateCollection200ResponseAllOfContract.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateCollection200ResponseAllOfContract` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("gameId") != null && !jsonObj.get("gameId").isJsonNull()) && !jsonObj.get("gameId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gameId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gameId").toString()));
      }
      if ((jsonObj.get("chain") != null && !jsonObj.get("chain").isJsonNull()) && !jsonObj.get("chain").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `chain` to be a primitive type in the JSON string but got `%s`", jsonObj.get("chain").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("address") != null && !jsonObj.get("address").isJsonNull()) && !jsonObj.get("address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address").toString()));
      }
      if ((jsonObj.get("forwarderAddress") != null && !jsonObj.get("forwarderAddress").isJsonNull()) && !jsonObj.get("forwarderAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `forwarderAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("forwarderAddress").toString()));
      }
      if ((jsonObj.get("updatedAt") != null && !jsonObj.get("updatedAt").isJsonNull()) && !jsonObj.get("updatedAt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updatedAt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updatedAt").toString()));
      }
      if ((jsonObj.get("createdAt") != null && !jsonObj.get("createdAt").isJsonNull()) && !jsonObj.get("createdAt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createdAt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createdAt").toString()));
      }
      if (jsonObj.get("transactions") != null && !jsonObj.get("transactions").isJsonNull()) {
        JsonArray jsonArraytransactions = jsonObj.getAsJsonArray("transactions");
        if (jsonArraytransactions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("transactions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `transactions` to be an array in the JSON string but got `%s`", jsonObj.get("transactions").toString()));
          }

          // validate the optional field `transactions` (array)
          for (int i = 0; i < jsonArraytransactions.size(); i++) {
            TransactionModel.validateJsonObject(jsonArraytransactions.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateCollection200ResponseAllOfContract.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateCollection200ResponseAllOfContract' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateCollection200ResponseAllOfContract> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateCollection200ResponseAllOfContract.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateCollection200ResponseAllOfContract>() {
           @Override
           public void write(JsonWriter out, CreateCollection200ResponseAllOfContract value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateCollection200ResponseAllOfContract read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateCollection200ResponseAllOfContract given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateCollection200ResponseAllOfContract
  * @throws IOException if the JSON string is invalid with respect to CreateCollection200ResponseAllOfContract
  */
  public static CreateCollection200ResponseAllOfContract fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateCollection200ResponseAllOfContract.class);
  }

 /**
  * Convert an instance of CreateCollection200ResponseAllOfContract to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

