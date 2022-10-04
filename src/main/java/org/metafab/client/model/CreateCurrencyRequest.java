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
import java.math.BigDecimal;

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
 * CreateCurrencyRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-03T19:33:13.700778-07:00[America/Los_Angeles]")
public class CreateCurrencyRequest {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SYMBOL = "symbol";
  @SerializedName(SERIALIZED_NAME_SYMBOL)
  private String symbol;

  public static final String SERIALIZED_NAME_SUPPLY_CAP = "supplyCap";
  @SerializedName(SERIALIZED_NAME_SUPPLY_CAP)
  private BigDecimal supplyCap;

  /**
   * The blockchain you want to deploy this currency on. Support for new blockchains are added over time.
   */
  @JsonAdapter(ChainEnum.Adapter.class)
  public enum ChainEnum {
    ETHEREUM("ETHEREUM"),
    
    GOERLI("GOERLI"),
    
    MATIC("MATIC"),
    
    MUMBAI("MUMBAI");

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

  public CreateCurrencyRequest() {
  }

  public CreateCurrencyRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of this currency. This can be anything, such as &#x60;Bright Gems&#x60;, &#x60;Gold&#x60;, etc.
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Bright Gems", required = true, value = "The name of this currency. This can be anything, such as `Bright Gems`, `Gold`, etc.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CreateCurrencyRequest symbol(String symbol) {
    
    this.symbol = symbol;
    return this;
  }

   /**
   * The shorthand symbol to represent this currency. This can be anything, such as &#x60;BGEM&#x60;, &#x60;GLD&#x60;, etc.
   * @return symbol
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "BGEM", required = true, value = "The shorthand symbol to represent this currency. This can be anything, such as `BGEM`, `GLD`, etc.")

  public String getSymbol() {
    return symbol;
  }


  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }


  public CreateCurrencyRequest supplyCap(BigDecimal supplyCap) {
    
    this.supplyCap = supplyCap;
    return this;
  }

   /**
   * The maximum amount of this currency that can ever exist. Use &#x60;0&#x60; if you do not want this currency to have a maximum supply.
   * @return supplyCap
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "15000.5", required = true, value = "The maximum amount of this currency that can ever exist. Use `0` if you do not want this currency to have a maximum supply.")

  public BigDecimal getSupplyCap() {
    return supplyCap;
  }


  public void setSupplyCap(BigDecimal supplyCap) {
    this.supplyCap = supplyCap;
  }


  public CreateCurrencyRequest chain(ChainEnum chain) {
    
    this.chain = chain;
    return this;
  }

   /**
   * The blockchain you want to deploy this currency on. Support for new blockchains are added over time.
   * @return chain
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "MATIC", required = true, value = "The blockchain you want to deploy this currency on. Support for new blockchains are added over time.")

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
    CreateCurrencyRequest createCurrencyRequest = (CreateCurrencyRequest) o;
    return Objects.equals(this.name, createCurrencyRequest.name) &&
        Objects.equals(this.symbol, createCurrencyRequest.symbol) &&
        Objects.equals(this.supplyCap, createCurrencyRequest.supplyCap) &&
        Objects.equals(this.chain, createCurrencyRequest.chain);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, symbol, supplyCap, chain);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCurrencyRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    supplyCap: ").append(toIndentedString(supplyCap)).append("\n");
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
    openapiFields.add("symbol");
    openapiFields.add("supplyCap");
    openapiFields.add("chain");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("symbol");
    openapiRequiredFields.add("supplyCap");
    openapiRequiredFields.add("chain");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateCurrencyRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CreateCurrencyRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateCurrencyRequest is not found in the empty JSON string", CreateCurrencyRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateCurrencyRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateCurrencyRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateCurrencyRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("symbol") != null && !jsonObj.get("symbol").isJsonNull()) && !jsonObj.get("symbol").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `symbol` to be a primitive type in the JSON string but got `%s`", jsonObj.get("symbol").toString()));
      }
      if ((jsonObj.get("chain") != null && !jsonObj.get("chain").isJsonNull()) && !jsonObj.get("chain").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `chain` to be a primitive type in the JSON string but got `%s`", jsonObj.get("chain").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateCurrencyRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateCurrencyRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateCurrencyRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateCurrencyRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateCurrencyRequest>() {
           @Override
           public void write(JsonWriter out, CreateCurrencyRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateCurrencyRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateCurrencyRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateCurrencyRequest
  * @throws IOException if the JSON string is invalid with respect to CreateCurrencyRequest
  */
  public static CreateCurrencyRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateCurrencyRequest.class);
  }

 /**
  * Convert an instance of CreateCurrencyRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

