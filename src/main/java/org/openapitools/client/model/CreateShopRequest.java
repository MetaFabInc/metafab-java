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
 * CreateShopRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-19T17:38:27.237153-05:00[America/New_York]")
public class CreateShopRequest {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  /**
   * The blockchain you want to deploy this shop on. Support for new blockchains are added over time.
   */
  @JsonAdapter(ChainEnum.Adapter.class)
  public enum ChainEnum {
    ARBITRUM("ARBITRUM"),
    
    ARBITRUMGOERLI("ARBITRUMGOERLI"),
    
    ARBITRUMNOVA("ARBITRUMNOVA"),
    
    AVALANCHE("AVALANCHE"),
    
    AVALANCHEFUJI("AVALANCHEFUJI"),
    
    ETHEREUM("ETHEREUM"),
    
    FANTOM("FANTOM"),
    
    FANTOMTEST("FANTOMTEST"),
    
    GOERLI("GOERLI"),
    
    MATIC("MATIC"),
    
    MATICMUMBAI("MATICMUMBAI"),
    
    THUNDERCORE("THUNDERCORE"),
    
    THUNDERCORETESTNET("THUNDERCORETESTNET");

    private String value;

    ChainEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ChainEnum fromValue(String value) {
      for (ChainEnum b : ChainEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ChainEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ChainEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ChainEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ChainEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CHAIN = "chain";
  @SerializedName(SERIALIZED_NAME_CHAIN)
  private ChainEnum chain;

  public CreateShopRequest() {
  }

  public CreateShopRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of this item collection. This can be anything, such as &#x60;Production - Game Shop&#x60;, &#x60;Testing - My Game Shop&#x60;, etc.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of this item collection. This can be anything, such as `Production - Game Shop`, `Testing - My Game Shop`, etc.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CreateShopRequest chain(ChainEnum chain) {
    
    this.chain = chain;
    return this;
  }

   /**
   * The blockchain you want to deploy this shop on. Support for new blockchains are added over time.
   * @return chain
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "SELECT ONE", required = true, value = "The blockchain you want to deploy this shop on. Support for new blockchains are added over time.")

  public ChainEnum getChain() {
    return chain;
  }


  public void setChain(ChainEnum chain) {
    this.chain = chain;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateShopRequest createShopRequest = (CreateShopRequest) o;
    return Objects.equals(this.name, createShopRequest.name) &&
        Objects.equals(this.chain, createShopRequest.chain);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, chain);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateShopRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    chain: ").append(toIndentedString(chain)).append("\n");
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
    openapiFields.add("chain");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("chain");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateShopRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CreateShopRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateShopRequest is not found in the empty JSON string", CreateShopRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateShopRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateShopRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateShopRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("chain").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `chain` to be a primitive type in the JSON string but got `%s`", jsonObj.get("chain").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateShopRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateShopRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateShopRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateShopRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateShopRequest>() {
           @Override
           public void write(JsonWriter out, CreateShopRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateShopRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateShopRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateShopRequest
  * @throws IOException if the JSON string is invalid with respect to CreateShopRequest
  */
  public static CreateShopRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateShopRequest.class);
  }

 /**
  * Convert an instance of CreateShopRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
