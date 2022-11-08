/*
 * MetaFab API
 *  Complete MetaFab API references and guides can be found at: https://trymetafab.com
 *
 * The version of the OpenAPI document: 1.2.0
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
import org.openapitools.client.model.CollectionModel;

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
 * GetCollections200ResponseInnerAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-07T16:37:22.578727-08:00[America/Los_Angeles]")
public class GetCollections200ResponseInnerAllOf {
  public static final String SERIALIZED_NAME_CONTRACT = "contract";
  @SerializedName(SERIALIZED_NAME_CONTRACT)
  private CollectionModel contract;

  public GetCollections200ResponseInnerAllOf() {
  }

  public GetCollections200ResponseInnerAllOf contract(CollectionModel contract) {
    
    this.contract = contract;
    return this;
  }

   /**
   * Get contract
   * @return contract
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CollectionModel getContract() {
    return contract;
  }


  public void setContract(CollectionModel contract) {
    this.contract = contract;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCollections200ResponseInnerAllOf getCollections200ResponseInnerAllOf = (GetCollections200ResponseInnerAllOf) o;
    return Objects.equals(this.contract, getCollections200ResponseInnerAllOf.contract);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contract);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCollections200ResponseInnerAllOf {\n");
    sb.append("    contract: ").append(toIndentedString(contract)).append("\n");
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
    openapiFields.add("contract");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetCollections200ResponseInnerAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GetCollections200ResponseInnerAllOf.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetCollections200ResponseInnerAllOf is not found in the empty JSON string", GetCollections200ResponseInnerAllOf.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetCollections200ResponseInnerAllOf.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetCollections200ResponseInnerAllOf` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `contract`
      if (jsonObj.get("contract") != null && !jsonObj.get("contract").isJsonNull()) {
        CollectionModel.validateJsonObject(jsonObj.getAsJsonObject("contract"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetCollections200ResponseInnerAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetCollections200ResponseInnerAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetCollections200ResponseInnerAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetCollections200ResponseInnerAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<GetCollections200ResponseInnerAllOf>() {
           @Override
           public void write(JsonWriter out, GetCollections200ResponseInnerAllOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetCollections200ResponseInnerAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetCollections200ResponseInnerAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetCollections200ResponseInnerAllOf
  * @throws IOException if the JSON string is invalid with respect to GetCollections200ResponseInnerAllOf
  */
  public static GetCollections200ResponseInnerAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetCollections200ResponseInnerAllOf.class);
  }

 /**
  * Convert an instance of GetCollections200ResponseInnerAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

