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
 * CreateContractRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-03T19:20:44.101799-07:00[America/Los_Angeles]")
public class CreateContractRequest {
  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_ABI = "abi";
  @SerializedName(SERIALIZED_NAME_ABI)
  private String abi;

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

  public CreateContractRequest() {
  }

  public CreateContractRequest address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * The address of the existing contract.
   * @return address
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The address of the existing contract.")

  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public CreateContractRequest abi(String abi) {
    
    this.abi = abi;
    return this;
  }

   /**
   * JSON of the abi.
   * @return abi
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "JSON of the abi.")

  public String getAbi() {
    return abi;
  }


  public void setAbi(String abi) {
    this.abi = abi;
  }


  public CreateContractRequest chain(ChainEnum chain) {
    
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
    CreateContractRequest createContractRequest = (CreateContractRequest) o;
    return Objects.equals(this.address, createContractRequest.address) &&
        Objects.equals(this.abi, createContractRequest.abi) &&
        Objects.equals(this.chain, createContractRequest.chain);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, abi, chain);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateContractRequest {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    abi: ").append(toIndentedString(abi)).append("\n");
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
    openapiFields.add("address");
    openapiFields.add("abi");
    openapiFields.add("chain");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("address");
    openapiRequiredFields.add("abi");
    openapiRequiredFields.add("chain");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateContractRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CreateContractRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateContractRequest is not found in the empty JSON string", CreateContractRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateContractRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateContractRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateContractRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("address") != null && !jsonObj.get("address").isJsonNull()) && !jsonObj.get("address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address").toString()));
      }
      if ((jsonObj.get("abi") != null && !jsonObj.get("abi").isJsonNull()) && !jsonObj.get("abi").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `abi` to be a primitive type in the JSON string but got `%s`", jsonObj.get("abi").toString()));
      }
      if ((jsonObj.get("chain") != null && !jsonObj.get("chain").isJsonNull()) && !jsonObj.get("chain").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `chain` to be a primitive type in the JSON string but got `%s`", jsonObj.get("chain").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateContractRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateContractRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateContractRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateContractRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateContractRequest>() {
           @Override
           public void write(JsonWriter out, CreateContractRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateContractRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateContractRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateContractRequest
  * @throws IOException if the JSON string is invalid with respect to CreateContractRequest
  */
  public static CreateContractRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateContractRequest.class);
  }

 /**
  * Convert an instance of CreateContractRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

