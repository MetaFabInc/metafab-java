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
 * TransferCurrencyRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-03T19:19:54.263665-07:00[America/Los_Angeles]")
public class TransferCurrencyRequest {
  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_WALLET_ID = "walletId";
  @SerializedName(SERIALIZED_NAME_WALLET_ID)
  private String walletId;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private BigDecimal amount;

  public static final String SERIALIZED_NAME_REFERENCE = "reference";
  @SerializedName(SERIALIZED_NAME_REFERENCE)
  private BigDecimal reference;

  public TransferCurrencyRequest() {
  }

  public TransferCurrencyRequest address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * A valid EVM based address to transfer currency to. For example, &#x60;0x39cb70F972E0EE920088AeF97Dbe5c6251a9c25D&#x60;.
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A valid EVM based address to transfer currency to. For example, `0x39cb70F972E0EE920088AeF97Dbe5c6251a9c25D`.")

  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public TransferCurrencyRequest walletId(String walletId) {
    
    this.walletId = walletId;
    return this;
  }

   /**
   * Any wallet id within the MetaFab ecosystem to transfer currency to.
   * @return walletId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Any wallet id within the MetaFab ecosystem to transfer currency to.")

  public String getWalletId() {
    return walletId;
  }


  public void setWalletId(String walletId) {
    this.walletId = walletId;
  }


  public TransferCurrencyRequest amount(BigDecimal amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * The amount of currency to transfer.
   * @return amount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "133.7", required = true, value = "The amount of currency to transfer.")

  public BigDecimal getAmount() {
    return amount;
  }


  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }


  public TransferCurrencyRequest reference(BigDecimal reference) {
    
    this.reference = reference;
    return this;
  }

   /**
   * An optional uint256 number to reference the transfer. Commonly used to identify transfers intended to pay for game items or services.
   * @return reference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1242", value = "An optional uint256 number to reference the transfer. Commonly used to identify transfers intended to pay for game items or services.")

  public BigDecimal getReference() {
    return reference;
  }


  public void setReference(BigDecimal reference) {
    this.reference = reference;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferCurrencyRequest transferCurrencyRequest = (TransferCurrencyRequest) o;
    return Objects.equals(this.address, transferCurrencyRequest.address) &&
        Objects.equals(this.walletId, transferCurrencyRequest.walletId) &&
        Objects.equals(this.amount, transferCurrencyRequest.amount) &&
        Objects.equals(this.reference, transferCurrencyRequest.reference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, walletId, amount, reference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferCurrencyRequest {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    walletId: ").append(toIndentedString(walletId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
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
    openapiFields.add("walletId");
    openapiFields.add("amount");
    openapiFields.add("reference");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("amount");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TransferCurrencyRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TransferCurrencyRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TransferCurrencyRequest is not found in the empty JSON string", TransferCurrencyRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TransferCurrencyRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TransferCurrencyRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TransferCurrencyRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("address") != null && !jsonObj.get("address").isJsonNull()) && !jsonObj.get("address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address").toString()));
      }
      if ((jsonObj.get("walletId") != null && !jsonObj.get("walletId").isJsonNull()) && !jsonObj.get("walletId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `walletId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("walletId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TransferCurrencyRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TransferCurrencyRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TransferCurrencyRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TransferCurrencyRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<TransferCurrencyRequest>() {
           @Override
           public void write(JsonWriter out, TransferCurrencyRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TransferCurrencyRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TransferCurrencyRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TransferCurrencyRequest
  * @throws IOException if the JSON string is invalid with respect to TransferCurrencyRequest
  */
  public static TransferCurrencyRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TransferCurrencyRequest.class);
  }

 /**
  * Convert an instance of TransferCurrencyRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

