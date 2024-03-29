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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

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
 * BatchTransferCurrencyRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-19T17:38:27.237153-05:00[America/New_York]")
public class BatchTransferCurrencyRequest {
  public static final String SERIALIZED_NAME_ADDRESSES = "addresses";
  @SerializedName(SERIALIZED_NAME_ADDRESSES)
  private List<String> addresses = null;

  public static final String SERIALIZED_NAME_WALLET_IDS = "walletIds";
  @SerializedName(SERIALIZED_NAME_WALLET_IDS)
  private List<String> walletIds = null;

  public static final String SERIALIZED_NAME_AMOUNTS = "amounts";
  @SerializedName(SERIALIZED_NAME_AMOUNTS)
  private List<BigDecimal> amounts = new ArrayList<>();

  public static final String SERIALIZED_NAME_REFERENCES = "references";
  @SerializedName(SERIALIZED_NAME_REFERENCES)
  private List<BigDecimal> references = null;

  public BatchTransferCurrencyRequest() {
  }

  public BatchTransferCurrencyRequest addresses(List<String> addresses) {
    
    this.addresses = addresses;
    return this;
  }

  public BatchTransferCurrencyRequest addAddressesItem(String addressesItem) {
    if (this.addresses == null) {
      this.addresses = new ArrayList<>();
    }
    this.addresses.add(addressesItem);
    return this;
  }

   /**
   * An array of valid EVM based addresses to transfer currency to.
   * @return addresses
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of valid EVM based addresses to transfer currency to.")

  public List<String> getAddresses() {
    return addresses;
  }


  public void setAddresses(List<String> addresses) {
    this.addresses = addresses;
  }


  public BatchTransferCurrencyRequest walletIds(List<String> walletIds) {
    
    this.walletIds = walletIds;
    return this;
  }

  public BatchTransferCurrencyRequest addWalletIdsItem(String walletIdsItem) {
    if (this.walletIds == null) {
      this.walletIds = new ArrayList<>();
    }
    this.walletIds.add(walletIdsItem);
    return this;
  }

   /**
   * An array of wallet ids within the MetaFab ecosystem to transfer currency to.
   * @return walletIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of wallet ids within the MetaFab ecosystem to transfer currency to.")

  public List<String> getWalletIds() {
    return walletIds;
  }


  public void setWalletIds(List<String> walletIds) {
    this.walletIds = walletIds;
  }


  public BatchTransferCurrencyRequest amounts(List<BigDecimal> amounts) {
    
    this.amounts = amounts;
    return this;
  }

  public BatchTransferCurrencyRequest addAmountsItem(BigDecimal amountsItem) {
    this.amounts.add(amountsItem);
    return this;
  }

   /**
   * An array of currency amounts to transfer. Ordering corresponds to the ordering of provided &#x60;addresses&#x60; and/or &#x60;walletIds&#x60;. If both &#x60;addresses&#x60; and &#x60;walletIds&#x60; are provided, &#x60;addresses&#x60; are first in the order.
   * @return amounts
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "An array of currency amounts to transfer. Ordering corresponds to the ordering of provided `addresses` and/or `walletIds`. If both `addresses` and `walletIds` are provided, `addresses` are first in the order.")

  public List<BigDecimal> getAmounts() {
    return amounts;
  }


  public void setAmounts(List<BigDecimal> amounts) {
    this.amounts = amounts;
  }


  public BatchTransferCurrencyRequest references(List<BigDecimal> references) {
    
    this.references = references;
    return this;
  }

  public BatchTransferCurrencyRequest addReferencesItem(BigDecimal referencesItem) {
    if (this.references == null) {
      this.references = new ArrayList<>();
    }
    this.references.add(referencesItem);
    return this;
  }

   /**
   * An optional array of uint256 numbers to reference each transfer in the batch. Ordering corresponds to the ordering of provided &#x60;addresses&#x60; or &#x60;walletIds&#x60;. If both &#x60;addresses&#x60; and &#x60;walletIds&#x60; are provided, &#x60;addresses&#x60; are first in the order.
   * @return references
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An optional array of uint256 numbers to reference each transfer in the batch. Ordering corresponds to the ordering of provided `addresses` or `walletIds`. If both `addresses` and `walletIds` are provided, `addresses` are first in the order.")

  public List<BigDecimal> getReferences() {
    return references;
  }


  public void setReferences(List<BigDecimal> references) {
    this.references = references;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchTransferCurrencyRequest batchTransferCurrencyRequest = (BatchTransferCurrencyRequest) o;
    return Objects.equals(this.addresses, batchTransferCurrencyRequest.addresses) &&
        Objects.equals(this.walletIds, batchTransferCurrencyRequest.walletIds) &&
        Objects.equals(this.amounts, batchTransferCurrencyRequest.amounts) &&
        Objects.equals(this.references, batchTransferCurrencyRequest.references);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addresses, walletIds, amounts, references);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchTransferCurrencyRequest {\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    walletIds: ").append(toIndentedString(walletIds)).append("\n");
    sb.append("    amounts: ").append(toIndentedString(amounts)).append("\n");
    sb.append("    references: ").append(toIndentedString(references)).append("\n");
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
    openapiFields.add("addresses");
    openapiFields.add("walletIds");
    openapiFields.add("amounts");
    openapiFields.add("references");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("amounts");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BatchTransferCurrencyRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!BatchTransferCurrencyRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BatchTransferCurrencyRequest is not found in the empty JSON string", BatchTransferCurrencyRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!BatchTransferCurrencyRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BatchTransferCurrencyRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : BatchTransferCurrencyRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("addresses") != null && !jsonObj.get("addresses").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `addresses` to be an array in the JSON string but got `%s`", jsonObj.get("addresses").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("walletIds") != null && !jsonObj.get("walletIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `walletIds` to be an array in the JSON string but got `%s`", jsonObj.get("walletIds").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("amounts") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("amounts").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `amounts` to be an array in the JSON string but got `%s`", jsonObj.get("amounts").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("references") != null && !jsonObj.get("references").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `references` to be an array in the JSON string but got `%s`", jsonObj.get("references").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BatchTransferCurrencyRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BatchTransferCurrencyRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BatchTransferCurrencyRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BatchTransferCurrencyRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<BatchTransferCurrencyRequest>() {
           @Override
           public void write(JsonWriter out, BatchTransferCurrencyRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BatchTransferCurrencyRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BatchTransferCurrencyRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BatchTransferCurrencyRequest
  * @throws IOException if the JSON string is invalid with respect to BatchTransferCurrencyRequest
  */
  public static BatchTransferCurrencyRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BatchTransferCurrencyRequest.class);
  }

 /**
  * Convert an instance of BatchTransferCurrencyRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

