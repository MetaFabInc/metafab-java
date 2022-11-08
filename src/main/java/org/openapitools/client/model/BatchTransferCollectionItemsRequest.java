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
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.metafab.client.JSON;

/**
 * BatchTransferCollectionItemsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-07T16:37:22.578727-08:00[America/Los_Angeles]")
public class BatchTransferCollectionItemsRequest {
  public static final String SERIALIZED_NAME_ADDRESSES = "addresses";
  @SerializedName(SERIALIZED_NAME_ADDRESSES)
  private List<String> addresses = null;

  public static final String SERIALIZED_NAME_WALLET_IDS = "walletIds";
  @SerializedName(SERIALIZED_NAME_WALLET_IDS)
  private List<String> walletIds = null;

  public static final String SERIALIZED_NAME_ITEM_IDS = "itemIds";
  @SerializedName(SERIALIZED_NAME_ITEM_IDS)
  private List<BigDecimal> itemIds = new ArrayList<>();

  public static final String SERIALIZED_NAME_QUANTITIES = "quantities";
  @SerializedName(SERIALIZED_NAME_QUANTITIES)
  private List<BigDecimal> quantities = new ArrayList<>();

  public BatchTransferCollectionItemsRequest() {
  }

  public BatchTransferCollectionItemsRequest addresses(List<String> addresses) {
    
    this.addresses = addresses;
    return this;
  }

  public BatchTransferCollectionItemsRequest addAddressesItem(String addressesItem) {
    if (this.addresses == null) {
      this.addresses = new ArrayList<>();
    }
    this.addresses.add(addressesItem);
    return this;
  }

   /**
   * An array of valid EVM based addresses to transfer items to.
   * @return addresses
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of valid EVM based addresses to transfer items to.")

  public List<String> getAddresses() {
    return addresses;
  }


  public void setAddresses(List<String> addresses) {
    this.addresses = addresses;
  }


  public BatchTransferCollectionItemsRequest walletIds(List<String> walletIds) {
    
    this.walletIds = walletIds;
    return this;
  }

  public BatchTransferCollectionItemsRequest addWalletIdsItem(String walletIdsItem) {
    if (this.walletIds == null) {
      this.walletIds = new ArrayList<>();
    }
    this.walletIds.add(walletIdsItem);
    return this;
  }

   /**
   * An array of wallet ids within the MetaFab ecosystem to transfer items to.
   * @return walletIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of wallet ids within the MetaFab ecosystem to transfer items to.")

  public List<String> getWalletIds() {
    return walletIds;
  }


  public void setWalletIds(List<String> walletIds) {
    this.walletIds = walletIds;
  }


  public BatchTransferCollectionItemsRequest itemIds(List<BigDecimal> itemIds) {
    
    this.itemIds = itemIds;
    return this;
  }

  public BatchTransferCollectionItemsRequest addItemIdsItem(BigDecimal itemIdsItem) {
    this.itemIds.add(itemIdsItem);
    return this;
  }

   /**
   * An array of unique itemIds to transfer. Each recipient will receive the same set of items provided.
   * @return itemIds
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "An array of unique itemIds to transfer. Each recipient will receive the same set of items provided.")

  public List<BigDecimal> getItemIds() {
    return itemIds;
  }


  public void setItemIds(List<BigDecimal> itemIds) {
    this.itemIds = itemIds;
  }


  public BatchTransferCollectionItemsRequest quantities(List<BigDecimal> quantities) {
    
    this.quantities = quantities;
    return this;
  }

  public BatchTransferCollectionItemsRequest addQuantitiesItem(BigDecimal quantitiesItem) {
    this.quantities.add(quantitiesItem);
    return this;
  }

   /**
   * The quantities of each unique itemId to transfer. Each recipient will receive the same quantities of items provided.
   * @return quantities
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The quantities of each unique itemId to transfer. Each recipient will receive the same quantities of items provided.")

  public List<BigDecimal> getQuantities() {
    return quantities;
  }


  public void setQuantities(List<BigDecimal> quantities) {
    this.quantities = quantities;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchTransferCollectionItemsRequest batchTransferCollectionItemsRequest = (BatchTransferCollectionItemsRequest) o;
    return Objects.equals(this.addresses, batchTransferCollectionItemsRequest.addresses) &&
        Objects.equals(this.walletIds, batchTransferCollectionItemsRequest.walletIds) &&
        Objects.equals(this.itemIds, batchTransferCollectionItemsRequest.itemIds) &&
        Objects.equals(this.quantities, batchTransferCollectionItemsRequest.quantities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addresses, walletIds, itemIds, quantities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchTransferCollectionItemsRequest {\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    walletIds: ").append(toIndentedString(walletIds)).append("\n");
    sb.append("    itemIds: ").append(toIndentedString(itemIds)).append("\n");
    sb.append("    quantities: ").append(toIndentedString(quantities)).append("\n");
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
    openapiFields.add("itemIds");
    openapiFields.add("quantities");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("itemIds");
    openapiRequiredFields.add("quantities");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BatchTransferCollectionItemsRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (BatchTransferCollectionItemsRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in BatchTransferCollectionItemsRequest is not found in the empty JSON string", BatchTransferCollectionItemsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!BatchTransferCollectionItemsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BatchTransferCollectionItemsRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : BatchTransferCollectionItemsRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if ((jsonObj.get("addresses") != null && !jsonObj.get("addresses").isJsonNull()) && !jsonObj.get("addresses").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `addresses` to be an array in the JSON string but got `%s`", jsonObj.get("addresses").toString()));
      }
      // ensure the json data is an array
      if ((jsonObj.get("walletIds") != null && !jsonObj.get("walletIds").isJsonNull()) && !jsonObj.get("walletIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `walletIds` to be an array in the JSON string but got `%s`", jsonObj.get("walletIds").toString()));
      }
      // ensure the json data is an array
      if ((jsonObj.get("itemIds") != null && !jsonObj.get("itemIds").isJsonNull()) && !jsonObj.get("itemIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `itemIds` to be an array in the JSON string but got `%s`", jsonObj.get("itemIds").toString()));
      }
      // ensure the json data is an array
      if ((jsonObj.get("quantities") != null && !jsonObj.get("quantities").isJsonNull()) && !jsonObj.get("quantities").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `quantities` to be an array in the JSON string but got `%s`", jsonObj.get("quantities").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BatchTransferCollectionItemsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BatchTransferCollectionItemsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BatchTransferCollectionItemsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BatchTransferCollectionItemsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<BatchTransferCollectionItemsRequest>() {
           @Override
           public void write(JsonWriter out, BatchTransferCollectionItemsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BatchTransferCollectionItemsRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BatchTransferCollectionItemsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BatchTransferCollectionItemsRequest
  * @throws IOException if the JSON string is invalid with respect to BatchTransferCollectionItemsRequest
  */
  public static BatchTransferCollectionItemsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BatchTransferCollectionItemsRequest.class);
  }

 /**
  * Convert an instance of BatchTransferCollectionItemsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

