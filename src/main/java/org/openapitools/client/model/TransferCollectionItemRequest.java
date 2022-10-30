/*
 * MetaFab API
 *  Complete MetaFab API references and guides can be found at: https://trymetafab.com
 *
 * The version of the OpenAPI document: 1.1.4
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
 * TransferCollectionItemRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-30T14:29:33.858390-07:00[America/Los_Angeles]")
public class TransferCollectionItemRequest {
  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_WALLET_ID = "walletId";
  @SerializedName(SERIALIZED_NAME_WALLET_ID)
  private List<String> walletId = null;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private BigDecimal quantity;

  public TransferCollectionItemRequest() {
  }

  public TransferCollectionItemRequest address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * A valid EVM based addresses to transfer items to.
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A valid EVM based addresses to transfer items to.")

  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public TransferCollectionItemRequest walletId(List<String> walletId) {
    
    this.walletId = walletId;
    return this;
  }

  public TransferCollectionItemRequest addWalletIdItem(String walletIdItem) {
    if (this.walletId == null) {
      this.walletId = new ArrayList<>();
    }
    this.walletId.add(walletIdItem);
    return this;
  }

   /**
   * A wallet id within the MetaFab ecosystem to transfer items to.
   * @return walletId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A wallet id within the MetaFab ecosystem to transfer items to.")

  public List<String> getWalletId() {
    return walletId;
  }


  public void setWalletId(List<String> walletId) {
    this.walletId = walletId;
  }


  public TransferCollectionItemRequest quantity(BigDecimal quantity) {
    
    this.quantity = quantity;
    return this;
  }

   /**
   * The quantity of the collectionItemId to transfer.
   * @return quantity
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The quantity of the collectionItemId to transfer.")

  public BigDecimal getQuantity() {
    return quantity;
  }


  public void setQuantity(BigDecimal quantity) {
    this.quantity = quantity;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferCollectionItemRequest transferCollectionItemRequest = (TransferCollectionItemRequest) o;
    return Objects.equals(this.address, transferCollectionItemRequest.address) &&
        Objects.equals(this.walletId, transferCollectionItemRequest.walletId) &&
        Objects.equals(this.quantity, transferCollectionItemRequest.quantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, walletId, quantity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferCollectionItemRequest {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    walletId: ").append(toIndentedString(walletId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
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
    openapiFields.add("quantity");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("quantity");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TransferCollectionItemRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TransferCollectionItemRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TransferCollectionItemRequest is not found in the empty JSON string", TransferCollectionItemRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TransferCollectionItemRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TransferCollectionItemRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TransferCollectionItemRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("address") != null && !jsonObj.get("address").isJsonNull()) && !jsonObj.get("address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address").toString()));
      }
      // ensure the json data is an array
      if ((jsonObj.get("walletId") != null && !jsonObj.get("walletId").isJsonNull()) && !jsonObj.get("walletId").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `walletId` to be an array in the JSON string but got `%s`", jsonObj.get("walletId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TransferCollectionItemRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TransferCollectionItemRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TransferCollectionItemRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TransferCollectionItemRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<TransferCollectionItemRequest>() {
           @Override
           public void write(JsonWriter out, TransferCollectionItemRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TransferCollectionItemRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TransferCollectionItemRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TransferCollectionItemRequest
  * @throws IOException if the JSON string is invalid with respect to TransferCollectionItemRequest
  */
  public static TransferCollectionItemRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TransferCollectionItemRequest.class);
  }

 /**
  * Convert an instance of TransferCollectionItemRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

