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
 * UpdatePlayer200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-19T17:38:27.237153-05:00[America/New_York]")
public class UpdatePlayer200Response {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_GAME_ID = "gameId";
  @SerializedName(SERIALIZED_NAME_GAME_ID)
  private String gameId;

  public static final String SERIALIZED_NAME_WALLET_ID = "walletId";
  @SerializedName(SERIALIZED_NAME_WALLET_ID)
  private String walletId;

  public static final String SERIALIZED_NAME_CONNECTED_WALLET_ID = "connectedWalletId";
  @SerializedName(SERIALIZED_NAME_CONNECTED_WALLET_ID)
  private String connectedWalletId;

  public static final String SERIALIZED_NAME_PROFILE_ID = "profileId";
  @SerializedName(SERIALIZED_NAME_PROFILE_ID)
  private String profileId;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public static final String SERIALIZED_NAME_ACCESS_TOKEN = "accessToken";
  @SerializedName(SERIALIZED_NAME_ACCESS_TOKEN)
  private String accessToken;

  public static final String SERIALIZED_NAME_PROFILE_PERMISSIONS = "profilePermissions";
  @SerializedName(SERIALIZED_NAME_PROFILE_PERMISSIONS)
  private Object profilePermissions;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private String updatedAt;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_WALLET_DECRYPT_KEY = "walletDecryptKey";
  @SerializedName(SERIALIZED_NAME_WALLET_DECRYPT_KEY)
  private String walletDecryptKey;

  public UpdatePlayer200Response() {
  }

  public UpdatePlayer200Response id(String id) {
    
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


  public UpdatePlayer200Response gameId(String gameId) {
    
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


  public UpdatePlayer200Response walletId(String walletId) {
    
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


  public UpdatePlayer200Response connectedWalletId(String connectedWalletId) {
    
    this.connectedWalletId = connectedWalletId;
    return this;
  }

   /**
   * This field has not had a description added.
   * @return connectedWalletId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This field has not had a description added.")

  public String getConnectedWalletId() {
    return connectedWalletId;
  }


  public void setConnectedWalletId(String connectedWalletId) {
    this.connectedWalletId = connectedWalletId;
  }


  public UpdatePlayer200Response profileId(String profileId) {
    
    this.profileId = profileId;
    return this;
  }

   /**
   * This field has not had a description added.
   * @return profileId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This field has not had a description added.")

  public String getProfileId() {
    return profileId;
  }


  public void setProfileId(String profileId) {
    this.profileId = profileId;
  }


  public UpdatePlayer200Response username(String username) {
    
    this.username = username;
    return this;
  }

   /**
   * This field has not had a description added.
   * @return username
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This field has not had a description added.")

  public String getUsername() {
    return username;
  }


  public void setUsername(String username) {
    this.username = username;
  }


  public UpdatePlayer200Response accessToken(String accessToken) {
    
    this.accessToken = accessToken;
    return this;
  }

   /**
   * This field has not had a description added.
   * @return accessToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This field has not had a description added.")

  public String getAccessToken() {
    return accessToken;
  }


  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }


  public UpdatePlayer200Response profilePermissions(Object profilePermissions) {
    
    this.profilePermissions = profilePermissions;
    return this;
  }

   /**
   * This field has not had a description added.
   * @return profilePermissions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This field has not had a description added.")

  public Object getProfilePermissions() {
    return profilePermissions;
  }


  public void setProfilePermissions(Object profilePermissions) {
    this.profilePermissions = profilePermissions;
  }


  public UpdatePlayer200Response updatedAt(String updatedAt) {
    
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


  public UpdatePlayer200Response createdAt(String createdAt) {
    
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


  public UpdatePlayer200Response walletDecryptKey(String walletDecryptKey) {
    
    this.walletDecryptKey = walletDecryptKey;
    return this;
  }

   /**
   * This field has not had a description added.
   * @return walletDecryptKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This field has not had a description added.")

  public String getWalletDecryptKey() {
    return walletDecryptKey;
  }


  public void setWalletDecryptKey(String walletDecryptKey) {
    this.walletDecryptKey = walletDecryptKey;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdatePlayer200Response updatePlayer200Response = (UpdatePlayer200Response) o;
    return Objects.equals(this.id, updatePlayer200Response.id) &&
        Objects.equals(this.gameId, updatePlayer200Response.gameId) &&
        Objects.equals(this.walletId, updatePlayer200Response.walletId) &&
        Objects.equals(this.connectedWalletId, updatePlayer200Response.connectedWalletId) &&
        Objects.equals(this.profileId, updatePlayer200Response.profileId) &&
        Objects.equals(this.username, updatePlayer200Response.username) &&
        Objects.equals(this.accessToken, updatePlayer200Response.accessToken) &&
        Objects.equals(this.profilePermissions, updatePlayer200Response.profilePermissions) &&
        Objects.equals(this.updatedAt, updatePlayer200Response.updatedAt) &&
        Objects.equals(this.createdAt, updatePlayer200Response.createdAt) &&
        Objects.equals(this.walletDecryptKey, updatePlayer200Response.walletDecryptKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, gameId, walletId, connectedWalletId, profileId, username, accessToken, profilePermissions, updatedAt, createdAt, walletDecryptKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePlayer200Response {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    gameId: ").append(toIndentedString(gameId)).append("\n");
    sb.append("    walletId: ").append(toIndentedString(walletId)).append("\n");
    sb.append("    connectedWalletId: ").append(toIndentedString(connectedWalletId)).append("\n");
    sb.append("    profileId: ").append(toIndentedString(profileId)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    profilePermissions: ").append(toIndentedString(profilePermissions)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    walletDecryptKey: ").append(toIndentedString(walletDecryptKey)).append("\n");
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
    openapiFields.add("walletId");
    openapiFields.add("connectedWalletId");
    openapiFields.add("profileId");
    openapiFields.add("username");
    openapiFields.add("accessToken");
    openapiFields.add("profilePermissions");
    openapiFields.add("updatedAt");
    openapiFields.add("createdAt");
    openapiFields.add("walletDecryptKey");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UpdatePlayer200Response
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UpdatePlayer200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdatePlayer200Response is not found in the empty JSON string", UpdatePlayer200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UpdatePlayer200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdatePlayer200Response` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("gameId") != null && !jsonObj.get("gameId").isJsonNull()) && !jsonObj.get("gameId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gameId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gameId").toString()));
      }
      if ((jsonObj.get("walletId") != null && !jsonObj.get("walletId").isJsonNull()) && !jsonObj.get("walletId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `walletId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("walletId").toString()));
      }
      if ((jsonObj.get("connectedWalletId") != null && !jsonObj.get("connectedWalletId").isJsonNull()) && !jsonObj.get("connectedWalletId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `connectedWalletId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("connectedWalletId").toString()));
      }
      if ((jsonObj.get("profileId") != null && !jsonObj.get("profileId").isJsonNull()) && !jsonObj.get("profileId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `profileId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("profileId").toString()));
      }
      if ((jsonObj.get("username") != null && !jsonObj.get("username").isJsonNull()) && !jsonObj.get("username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("username").toString()));
      }
      if ((jsonObj.get("accessToken") != null && !jsonObj.get("accessToken").isJsonNull()) && !jsonObj.get("accessToken").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accessToken` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accessToken").toString()));
      }
      if ((jsonObj.get("updatedAt") != null && !jsonObj.get("updatedAt").isJsonNull()) && !jsonObj.get("updatedAt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updatedAt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updatedAt").toString()));
      }
      if ((jsonObj.get("createdAt") != null && !jsonObj.get("createdAt").isJsonNull()) && !jsonObj.get("createdAt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createdAt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createdAt").toString()));
      }
      if ((jsonObj.get("walletDecryptKey") != null && !jsonObj.get("walletDecryptKey").isJsonNull()) && !jsonObj.get("walletDecryptKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `walletDecryptKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("walletDecryptKey").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdatePlayer200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdatePlayer200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdatePlayer200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdatePlayer200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdatePlayer200Response>() {
           @Override
           public void write(JsonWriter out, UpdatePlayer200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdatePlayer200Response read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdatePlayer200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdatePlayer200Response
  * @throws IOException if the JSON string is invalid with respect to UpdatePlayer200Response
  */
  public static UpdatePlayer200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdatePlayer200Response.class);
  }

 /**
  * Convert an instance of UpdatePlayer200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

