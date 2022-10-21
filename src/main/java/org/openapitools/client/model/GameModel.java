/*
 * MetaFab API
 *  Complete MetaFab API references and guides can be found at: https://trymetafab.com
 *
 * The version of the OpenAPI document: 1.1.3
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
 * GameModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-20T22:12:42.272790-07:00[America/Los_Angeles]")
public class GameModel {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_WALLET_ID = "walletId";
  @SerializedName(SERIALIZED_NAME_WALLET_ID)
  private String walletId;

  public static final String SERIALIZED_NAME_FUNDING_WALLET_ID = "fundingWalletId";
  @SerializedName(SERIALIZED_NAME_FUNDING_WALLET_ID)
  private String fundingWalletId;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_RPCS = "rpcs";
  @SerializedName(SERIALIZED_NAME_RPCS)
  private Object rpcs;

  public static final String SERIALIZED_NAME_PUBLISHED_KEY = "publishedKey";
  @SerializedName(SERIALIZED_NAME_PUBLISHED_KEY)
  private String publishedKey;

  public static final String SERIALIZED_NAME_SECRET_KEY = "secretKey";
  @SerializedName(SERIALIZED_NAME_SECRET_KEY)
  private String secretKey;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private String updatedAt;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public GameModel() {
  }

  public GameModel id(String id) {
    
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


  public GameModel walletId(String walletId) {
    
    this.walletId = walletId;
    return this;
  }

   /**
   * This field has not had a description added.
   * @return walletId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This field has not had a description added.")

  public String getWalletId() {
    return walletId;
  }


  public void setWalletId(String walletId) {
    this.walletId = walletId;
  }


  public GameModel fundingWalletId(String fundingWalletId) {
    
    this.fundingWalletId = fundingWalletId;
    return this;
  }

   /**
   * This field has not had a description added.
   * @return fundingWalletId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This field has not had a description added.")

  public String getFundingWalletId() {
    return fundingWalletId;
  }


  public void setFundingWalletId(String fundingWalletId) {
    this.fundingWalletId = fundingWalletId;
  }


  public GameModel email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * This field has not had a description added.
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This field has not had a description added.")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public GameModel name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * This field has not had a description added.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This field has not had a description added.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public GameModel rpcs(Object rpcs) {
    
    this.rpcs = rpcs;
    return this;
  }

   /**
   * This field has not had a description added.
   * @return rpcs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This field has not had a description added.")

  public Object getRpcs() {
    return rpcs;
  }


  public void setRpcs(Object rpcs) {
    this.rpcs = rpcs;
  }


  public GameModel publishedKey(String publishedKey) {
    
    this.publishedKey = publishedKey;
    return this;
  }

   /**
   * This field has not had a description added.
   * @return publishedKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This field has not had a description added.")

  public String getPublishedKey() {
    return publishedKey;
  }


  public void setPublishedKey(String publishedKey) {
    this.publishedKey = publishedKey;
  }


  public GameModel secretKey(String secretKey) {
    
    this.secretKey = secretKey;
    return this;
  }

   /**
   * This field has not had a description added.
   * @return secretKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This field has not had a description added.")

  public String getSecretKey() {
    return secretKey;
  }


  public void setSecretKey(String secretKey) {
    this.secretKey = secretKey;
  }


  public GameModel updatedAt(String updatedAt) {
    
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


  public GameModel createdAt(String createdAt) {
    
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
    GameModel gameModel = (GameModel) o;
    return Objects.equals(this.id, gameModel.id) &&
        Objects.equals(this.walletId, gameModel.walletId) &&
        Objects.equals(this.fundingWalletId, gameModel.fundingWalletId) &&
        Objects.equals(this.email, gameModel.email) &&
        Objects.equals(this.name, gameModel.name) &&
        Objects.equals(this.rpcs, gameModel.rpcs) &&
        Objects.equals(this.publishedKey, gameModel.publishedKey) &&
        Objects.equals(this.secretKey, gameModel.secretKey) &&
        Objects.equals(this.updatedAt, gameModel.updatedAt) &&
        Objects.equals(this.createdAt, gameModel.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, walletId, fundingWalletId, email, name, rpcs, publishedKey, secretKey, updatedAt, createdAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GameModel {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    walletId: ").append(toIndentedString(walletId)).append("\n");
    sb.append("    fundingWalletId: ").append(toIndentedString(fundingWalletId)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rpcs: ").append(toIndentedString(rpcs)).append("\n");
    sb.append("    publishedKey: ").append(toIndentedString(publishedKey)).append("\n");
    sb.append("    secretKey: ").append(toIndentedString(secretKey)).append("\n");
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
    openapiFields.add("walletId");
    openapiFields.add("fundingWalletId");
    openapiFields.add("email");
    openapiFields.add("name");
    openapiFields.add("rpcs");
    openapiFields.add("publishedKey");
    openapiFields.add("secretKey");
    openapiFields.add("updatedAt");
    openapiFields.add("createdAt");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GameModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GameModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GameModel is not found in the empty JSON string", GameModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GameModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GameModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("walletId") != null && !jsonObj.get("walletId").isJsonNull()) && !jsonObj.get("walletId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `walletId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("walletId").toString()));
      }
      if ((jsonObj.get("fundingWalletId") != null && !jsonObj.get("fundingWalletId").isJsonNull()) && !jsonObj.get("fundingWalletId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fundingWalletId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fundingWalletId").toString()));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("publishedKey") != null && !jsonObj.get("publishedKey").isJsonNull()) && !jsonObj.get("publishedKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `publishedKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("publishedKey").toString()));
      }
      if ((jsonObj.get("secretKey") != null && !jsonObj.get("secretKey").isJsonNull()) && !jsonObj.get("secretKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `secretKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("secretKey").toString()));
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
       if (!GameModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GameModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GameModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GameModel.class));

       return (TypeAdapter<T>) new TypeAdapter<GameModel>() {
           @Override
           public void write(JsonWriter out, GameModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GameModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GameModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GameModel
  * @throws IOException if the JSON string is invalid with respect to GameModel
  */
  public static GameModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GameModel.class);
  }

 /**
  * Convert an instance of GameModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

