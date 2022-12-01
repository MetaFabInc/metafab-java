/*
 * MetaFab API
 *  Complete MetaFab API references and guides can be found at: https://trymetafab.com
 *
 * The version of the OpenAPI document: 1.3.0
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
import org.openapitools.client.model.CreateCollection200ResponseAllOfContract;

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
 * CreateCollection200ResponseAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-01T15:10:52.708628-08:00[America/Los_Angeles]")
public class CreateCollection200ResponseAllOf {
  public static final String SERIALIZED_NAME_CONTRACT = "contract";
  @SerializedName(SERIALIZED_NAME_CONTRACT)
  private CreateCollection200ResponseAllOfContract contract;

  public CreateCollection200ResponseAllOf() {
  }

  public CreateCollection200ResponseAllOf contract(CreateCollection200ResponseAllOfContract contract) {
    
    this.contract = contract;
    return this;
  }

   /**
   * Get contract
   * @return contract
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CreateCollection200ResponseAllOfContract getContract() {
    return contract;
  }


  public void setContract(CreateCollection200ResponseAllOfContract contract) {
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
    CreateCollection200ResponseAllOf createCollection200ResponseAllOf = (CreateCollection200ResponseAllOf) o;
    return Objects.equals(this.contract, createCollection200ResponseAllOf.contract);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contract);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCollection200ResponseAllOf {\n");
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
  * @throws IOException if the JSON Object is invalid with respect to CreateCollection200ResponseAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CreateCollection200ResponseAllOf.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateCollection200ResponseAllOf is not found in the empty JSON string", CreateCollection200ResponseAllOf.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateCollection200ResponseAllOf.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateCollection200ResponseAllOf` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `contract`
      if (jsonObj.get("contract") != null && !jsonObj.get("contract").isJsonNull()) {
        CreateCollection200ResponseAllOfContract.validateJsonObject(jsonObj.getAsJsonObject("contract"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateCollection200ResponseAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateCollection200ResponseAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateCollection200ResponseAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateCollection200ResponseAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateCollection200ResponseAllOf>() {
           @Override
           public void write(JsonWriter out, CreateCollection200ResponseAllOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateCollection200ResponseAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateCollection200ResponseAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateCollection200ResponseAllOf
  * @throws IOException if the JSON string is invalid with respect to CreateCollection200ResponseAllOf
  */
  public static CreateCollection200ResponseAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateCollection200ResponseAllOf.class);
  }

 /**
  * Convert an instance of CreateCollection200ResponseAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

