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
 * CreatePlayerRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-03T19:33:13.700778-07:00[America/Los_Angeles]")
public class CreatePlayerRequest {
  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public CreatePlayerRequest() {
  }

  public CreatePlayerRequest username(String username) {
    
    this.username = username;
    return this;
  }

   /**
   * The players username, used to authenticate the player and if desired represent them in game. Usernames are unique. There cannot be 2 users with the same username created for a game.
   * @return username
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The players username, used to authenticate the player and if desired represent them in game. Usernames are unique. There cannot be 2 users with the same username created for a game.")

  public String getUsername() {
    return username;
  }


  public void setUsername(String username) {
    this.username = username;
  }


  public CreatePlayerRequest password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * The password to authenticate as the player. Additionally, this password is used to encrypt/decrypt a player&#39;s primary wallet and must be provided anytime this player makes blockchain interactions through various endpoints.
   * @return password
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "aReallyStrongPassword123", required = true, value = "The password to authenticate as the player. Additionally, this password is used to encrypt/decrypt a player's primary wallet and must be provided anytime this player makes blockchain interactions through various endpoints.")

  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    this.password = password;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatePlayerRequest createPlayerRequest = (CreatePlayerRequest) o;
    return Objects.equals(this.username, createPlayerRequest.username) &&
        Objects.equals(this.password, createPlayerRequest.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, password);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatePlayerRequest {\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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
    openapiFields.add("username");
    openapiFields.add("password");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("username");
    openapiRequiredFields.add("password");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreatePlayerRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CreatePlayerRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreatePlayerRequest is not found in the empty JSON string", CreatePlayerRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreatePlayerRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreatePlayerRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreatePlayerRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("username") != null && !jsonObj.get("username").isJsonNull()) && !jsonObj.get("username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("username").toString()));
      }
      if ((jsonObj.get("password") != null && !jsonObj.get("password").isJsonNull()) && !jsonObj.get("password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("password").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreatePlayerRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreatePlayerRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreatePlayerRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreatePlayerRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreatePlayerRequest>() {
           @Override
           public void write(JsonWriter out, CreatePlayerRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreatePlayerRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreatePlayerRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreatePlayerRequest
  * @throws IOException if the JSON string is invalid with respect to CreatePlayerRequest
  */
  public static CreatePlayerRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreatePlayerRequest.class);
  }

 /**
  * Convert an instance of CreatePlayerRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

