/*
 * MetaFab API
 *  Complete MetaFab API references and guides can be found at: https://trymetafab.com
 *
 * The version of the OpenAPI document: 1.1.43
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
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.metafab.client.JSON;

/**
 * ExchangeModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-05T17:09:52.575349-07:00[America/Los_Angeles]")
public class ExchangeModel {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_GAME_ID = "gameId";
  @SerializedName(SERIALIZED_NAME_GAME_ID)
  private String gameId;

  public static final String SERIALIZED_NAME_CONTRACT_ID = "contractId";
  @SerializedName(SERIALIZED_NAME_CONTRACT_ID)
  private String contractId;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private String updatedAt;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public ExchangeModel() {
  }

  public ExchangeModel id(String id) {
    
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


  public ExchangeModel gameId(String gameId) {
    
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


  public ExchangeModel contractId(String contractId) {
    
    this.contractId = contractId;
    return this;
  }

   /**
   * This field has not had a description added.
   * @return contractId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This field has not had a description added.")

  public String getContractId() {
    return contractId;
  }


  public void setContractId(String contractId) {
    this.contractId = contractId;
  }


  public ExchangeModel updatedAt(String updatedAt) {
    
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


  public ExchangeModel createdAt(String createdAt) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExchangeModel exchangeModel = (ExchangeModel) o;
    return Objects.equals(this.id, exchangeModel.id) &&
        Objects.equals(this.gameId, exchangeModel.gameId) &&
        Objects.equals(this.contractId, exchangeModel.contractId) &&
        Objects.equals(this.updatedAt, exchangeModel.updatedAt) &&
        Objects.equals(this.createdAt, exchangeModel.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, gameId, contractId, updatedAt, createdAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExchangeModel {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    gameId: ").append(toIndentedString(gameId)).append("\n");
    sb.append("    contractId: ").append(toIndentedString(contractId)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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
    openapiFields.add("contractId");
    openapiFields.add("updatedAt");
    openapiFields.add("createdAt");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ExchangeModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ExchangeModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ExchangeModel is not found in the empty JSON string", ExchangeModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ExchangeModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ExchangeModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("gameId") != null && !jsonObj.get("gameId").isJsonNull()) && !jsonObj.get("gameId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gameId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gameId").toString()));
      }
      if ((jsonObj.get("contractId") != null && !jsonObj.get("contractId").isJsonNull()) && !jsonObj.get("contractId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contractId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contractId").toString()));
      }
      if ((jsonObj.get("updatedAt") != null && !jsonObj.get("updatedAt").isJsonNull()) && !jsonObj.get("updatedAt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updatedAt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updatedAt").toString()));
      }
      if ((jsonObj.get("createdAt") != null && !jsonObj.get("createdAt").isJsonNull()) && !jsonObj.get("createdAt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createdAt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createdAt").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ExchangeModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ExchangeModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ExchangeModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ExchangeModel.class));

       return (TypeAdapter<T>) new TypeAdapter<ExchangeModel>() {
           @Override
           public void write(JsonWriter out, ExchangeModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ExchangeModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ExchangeModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ExchangeModel
  * @throws IOException if the JSON string is invalid with respect to ExchangeModel
  */
  public static ExchangeModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ExchangeModel.class);
  }

 /**
  * Convert an instance of ExchangeModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

