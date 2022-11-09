/*
 * MetaFab API
 *  Complete MetaFab API references and guides can be found at: https://trymetafab.com
 *
 * The version of the OpenAPI document: 1.2.1
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
 * GetPlayerData200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-09T15:25:12.758221-08:00[America/Los_Angeles]")
public class GetPlayerData200Response {
  public static final String SERIALIZED_NAME_PROTECTED_DATA = "protectedData";
  @SerializedName(SERIALIZED_NAME_PROTECTED_DATA)
  private Object protectedData;

  public static final String SERIALIZED_NAME_PUBLIC_DATA = "publicData";
  @SerializedName(SERIALIZED_NAME_PUBLIC_DATA)
  private Object publicData;

  public GetPlayerData200Response() {
  }

  public GetPlayerData200Response protectedData(Object protectedData) {
    
    this.protectedData = protectedData;
    return this;
  }

   /**
   * Get protectedData
   * @return protectedData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getProtectedData() {
    return protectedData;
  }


  public void setProtectedData(Object protectedData) {
    this.protectedData = protectedData;
  }


  public GetPlayerData200Response publicData(Object publicData) {
    
    this.publicData = publicData;
    return this;
  }

   /**
   * Get publicData
   * @return publicData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getPublicData() {
    return publicData;
  }


  public void setPublicData(Object publicData) {
    this.publicData = publicData;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetPlayerData200Response getPlayerData200Response = (GetPlayerData200Response) o;
    return Objects.equals(this.protectedData, getPlayerData200Response.protectedData) &&
        Objects.equals(this.publicData, getPlayerData200Response.publicData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(protectedData, publicData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPlayerData200Response {\n");
    sb.append("    protectedData: ").append(toIndentedString(protectedData)).append("\n");
    sb.append("    publicData: ").append(toIndentedString(publicData)).append("\n");
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
    openapiFields.add("protectedData");
    openapiFields.add("publicData");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetPlayerData200Response
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GetPlayerData200Response.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetPlayerData200Response is not found in the empty JSON string", GetPlayerData200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetPlayerData200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetPlayerData200Response` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetPlayerData200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetPlayerData200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetPlayerData200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetPlayerData200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<GetPlayerData200Response>() {
           @Override
           public void write(JsonWriter out, GetPlayerData200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetPlayerData200Response read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetPlayerData200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetPlayerData200Response
  * @throws IOException if the JSON string is invalid with respect to GetPlayerData200Response
  */
  public static GetPlayerData200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetPlayerData200Response.class);
  }

 /**
  * Convert an instance of GetPlayerData200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
