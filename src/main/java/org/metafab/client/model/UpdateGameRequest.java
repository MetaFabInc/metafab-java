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


package org.metafab.client.model;

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
import java.util.HashMap;
import java.util.Map;

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
 * UpdateGameRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-03T19:20:44.101799-07:00[America/Los_Angeles]")
public class UpdateGameRequest {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_CURRENT_PASSWORD = "currentPassword";
  @SerializedName(SERIALIZED_NAME_CURRENT_PASSWORD)
  private String currentPassword;

  public static final String SERIALIZED_NAME_NEW_PASSWORD = "newPassword";
  @SerializedName(SERIALIZED_NAME_NEW_PASSWORD)
  private String newPassword;

  public static final String SERIALIZED_NAME_RPCS = "rpcs";
  @SerializedName(SERIALIZED_NAME_RPCS)
  private Map<String, String> rpcs = null;

  public static final String SERIALIZED_NAME_RESET_PUBLISHED_KEY = "resetPublishedKey";
  @SerializedName(SERIALIZED_NAME_RESET_PUBLISHED_KEY)
  private Boolean resetPublishedKey;

  public static final String SERIALIZED_NAME_RESET_SECRET_KEY = "resetSecretKey";
  @SerializedName(SERIALIZED_NAME_RESET_SECRET_KEY)
  private Boolean resetSecretKey;

  public UpdateGameRequest() {
  }

  public UpdateGameRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * A new name. Replaces the game&#39;s current name.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A new name. Replaces the game's current name.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public UpdateGameRequest email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * A new email address. The game&#39;s old email will no longer be valid for account authentication. &#x60;currentPassword&#x60; must also be provided.
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A new email address. The game's old email will no longer be valid for account authentication. `currentPassword` must also be provided.")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public UpdateGameRequest currentPassword(String currentPassword) {
    
    this.currentPassword = currentPassword;
    return this;
  }

   /**
   * The game&#39;s current password. Must be provided if setting &#x60;newPassword&#x60; or &#x60;email&#x60;.
   * @return currentPassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The game's current password. Must be provided if setting `newPassword` or `email`.")

  public String getCurrentPassword() {
    return currentPassword;
  }


  public void setCurrentPassword(String currentPassword) {
    this.currentPassword = currentPassword;
  }


  public UpdateGameRequest newPassword(String newPassword) {
    
    this.newPassword = newPassword;
    return this;
  }

   /**
   * A new password. The game&#39;s old password will no longer be valid.
   * @return newPassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A new password. The game's old password will no longer be valid.")

  public String getNewPassword() {
    return newPassword;
  }


  public void setNewPassword(String newPassword) {
    this.newPassword = newPassword;
  }


  public UpdateGameRequest rpcs(Map<String, String> rpcs) {
    
    this.rpcs = rpcs;
    return this;
  }

  public UpdateGameRequest putRpcsItem(String key, String rpcsItem) {
    if (this.rpcs == null) {
      this.rpcs = new HashMap<>();
    }
    this.rpcs.put(key, rpcsItem);
    return this;
  }

   /**
   * Sets a custom RPC for your game to use instead of MetaFab&#39;s default RPCs for the chain(s) you specify.  Expects a JSON object containing key value pairs of supported &#x60;chain&#x60; -&gt; &#x60;rpc url&#x60;. Only the chain names provided as keys in the object will be explicitly overriden. To delete a custom RPC for your game, provide the chain name to delete as a key in the provided object and &#x60;null&#x60; as the value.  Set RPC example, &#x60;{ MATIC: &#39;https://polygon-rpc.com&#39; }&#x60; Delete RPC example, &#x60;{ MATIC: null }&#x60;
   * @return rpcs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://polygon-rpc.com", value = "Sets a custom RPC for your game to use instead of MetaFab's default RPCs for the chain(s) you specify.  Expects a JSON object containing key value pairs of supported `chain` -> `rpc url`. Only the chain names provided as keys in the object will be explicitly overriden. To delete a custom RPC for your game, provide the chain name to delete as a key in the provided object and `null` as the value.  Set RPC example, `{ MATIC: 'https://polygon-rpc.com' }` Delete RPC example, `{ MATIC: null }`")

  public Map<String, String> getRpcs() {
    return rpcs;
  }


  public void setRpcs(Map<String, String> rpcs) {
    this.rpcs = rpcs;
  }


  public UpdateGameRequest resetPublishedKey(Boolean resetPublishedKey) {
    
    this.resetPublishedKey = resetPublishedKey;
    return this;
  }

   /**
   * Revokes the game&#39;s previous published key and returns a new one if true.
   * @return resetPublishedKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Revokes the game's previous published key and returns a new one if true.")

  public Boolean getResetPublishedKey() {
    return resetPublishedKey;
  }


  public void setResetPublishedKey(Boolean resetPublishedKey) {
    this.resetPublishedKey = resetPublishedKey;
  }


  public UpdateGameRequest resetSecretKey(Boolean resetSecretKey) {
    
    this.resetSecretKey = resetSecretKey;
    return this;
  }

   /**
   * Revokes the game&#39;s previous secret key and returns a new on if true.
   * @return resetSecretKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Revokes the game's previous secret key and returns a new on if true.")

  public Boolean getResetSecretKey() {
    return resetSecretKey;
  }


  public void setResetSecretKey(Boolean resetSecretKey) {
    this.resetSecretKey = resetSecretKey;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateGameRequest updateGameRequest = (UpdateGameRequest) o;
    return Objects.equals(this.name, updateGameRequest.name) &&
        Objects.equals(this.email, updateGameRequest.email) &&
        Objects.equals(this.currentPassword, updateGameRequest.currentPassword) &&
        Objects.equals(this.newPassword, updateGameRequest.newPassword) &&
        Objects.equals(this.rpcs, updateGameRequest.rpcs) &&
        Objects.equals(this.resetPublishedKey, updateGameRequest.resetPublishedKey) &&
        Objects.equals(this.resetSecretKey, updateGameRequest.resetSecretKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, email, currentPassword, newPassword, rpcs, resetPublishedKey, resetSecretKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateGameRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    currentPassword: ").append(toIndentedString(currentPassword)).append("\n");
    sb.append("    newPassword: ").append(toIndentedString(newPassword)).append("\n");
    sb.append("    rpcs: ").append(toIndentedString(rpcs)).append("\n");
    sb.append("    resetPublishedKey: ").append(toIndentedString(resetPublishedKey)).append("\n");
    sb.append("    resetSecretKey: ").append(toIndentedString(resetSecretKey)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("email");
    openapiFields.add("currentPassword");
    openapiFields.add("newPassword");
    openapiFields.add("rpcs");
    openapiFields.add("resetPublishedKey");
    openapiFields.add("resetSecretKey");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UpdateGameRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (UpdateGameRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateGameRequest is not found in the empty JSON string", UpdateGameRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UpdateGameRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateGameRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("currentPassword") != null && !jsonObj.get("currentPassword").isJsonNull()) && !jsonObj.get("currentPassword").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currentPassword` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currentPassword").toString()));
      }
      if ((jsonObj.get("newPassword") != null && !jsonObj.get("newPassword").isJsonNull()) && !jsonObj.get("newPassword").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `newPassword` to be a primitive type in the JSON string but got `%s`", jsonObj.get("newPassword").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateGameRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateGameRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateGameRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateGameRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateGameRequest>() {
           @Override
           public void write(JsonWriter out, UpdateGameRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateGameRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateGameRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateGameRequest
  * @throws IOException if the JSON string is invalid with respect to UpdateGameRequest
  */
  public static UpdateGameRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateGameRequest.class);
  }

 /**
  * Convert an instance of UpdateGameRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

