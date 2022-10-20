/*
 * MetaFab API
 *  Complete MetaFab API references and guides can be found at: https://trymetafab.com
 *
 * The version of the OpenAPI document: 1.1.0
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
 * UpdatePlayerRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-20T16:29:18.271895-07:00[America/Los_Angeles]")
public class UpdatePlayerRequest {
  public static final String SERIALIZED_NAME_CURRENT_PASSWORD = "currentPassword";
  @SerializedName(SERIALIZED_NAME_CURRENT_PASSWORD)
  private String currentPassword;

  public static final String SERIALIZED_NAME_NEW_PASSWORD = "newPassword";
  @SerializedName(SERIALIZED_NAME_NEW_PASSWORD)
  private String newPassword;

  public static final String SERIALIZED_NAME_RESET_ACCESS_TOKEN = "resetAccessToken";
  @SerializedName(SERIALIZED_NAME_RESET_ACCESS_TOKEN)
  private Boolean resetAccessToken;

  public UpdatePlayerRequest() {
  }

  public UpdatePlayerRequest currentPassword(String currentPassword) {
    
    this.currentPassword = currentPassword;
    return this;
  }

   /**
   * The player&#39;s current password. Must be provided if setting &#x60;newPassword&#x60;.
   * @return currentPassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The player's current password. Must be provided if setting `newPassword`.")

  public String getCurrentPassword() {
    return currentPassword;
  }


  public void setCurrentPassword(String currentPassword) {
    this.currentPassword = currentPassword;
  }


  public UpdatePlayerRequest newPassword(String newPassword) {
    
    this.newPassword = newPassword;
    return this;
  }

   /**
   * A new password. The player&#39;s old password will no longer be valid.
   * @return newPassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A new password. The player's old password will no longer be valid.")

  public String getNewPassword() {
    return newPassword;
  }


  public void setNewPassword(String newPassword) {
    this.newPassword = newPassword;
  }


  public UpdatePlayerRequest resetAccessToken(Boolean resetAccessToken) {
    
    this.resetAccessToken = resetAccessToken;
    return this;
  }

   /**
   * Revokes the player&#39;s previous access token and returns a new one if true.
   * @return resetAccessToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Revokes the player's previous access token and returns a new one if true.")

  public Boolean getResetAccessToken() {
    return resetAccessToken;
  }


  public void setResetAccessToken(Boolean resetAccessToken) {
    this.resetAccessToken = resetAccessToken;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdatePlayerRequest updatePlayerRequest = (UpdatePlayerRequest) o;
    return Objects.equals(this.currentPassword, updatePlayerRequest.currentPassword) &&
        Objects.equals(this.newPassword, updatePlayerRequest.newPassword) &&
        Objects.equals(this.resetAccessToken, updatePlayerRequest.resetAccessToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentPassword, newPassword, resetAccessToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePlayerRequest {\n");
    sb.append("    currentPassword: ").append(toIndentedString(currentPassword)).append("\n");
    sb.append("    newPassword: ").append(toIndentedString(newPassword)).append("\n");
    sb.append("    resetAccessToken: ").append(toIndentedString(resetAccessToken)).append("\n");
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
    openapiFields.add("currentPassword");
    openapiFields.add("newPassword");
    openapiFields.add("resetAccessToken");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UpdatePlayerRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (UpdatePlayerRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdatePlayerRequest is not found in the empty JSON string", UpdatePlayerRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UpdatePlayerRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdatePlayerRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
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
       if (!UpdatePlayerRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdatePlayerRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdatePlayerRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdatePlayerRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdatePlayerRequest>() {
           @Override
           public void write(JsonWriter out, UpdatePlayerRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdatePlayerRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdatePlayerRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdatePlayerRequest
  * @throws IOException if the JSON string is invalid with respect to UpdatePlayerRequest
  */
  public static UpdatePlayerRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdatePlayerRequest.class);
  }

 /**
  * Convert an instance of UpdatePlayerRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

