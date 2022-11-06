/*
 * MetaFab API
 *  Complete MetaFab API references and guides can be found at: https://trymetafab.com
 *
 * The version of the OpenAPI document: 1.1.43
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
 * SetCollectionApprovalRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-05T17:09:52.575349-07:00[America/Los_Angeles]")
public class SetCollectionApprovalRequest {
  public static final String SERIALIZED_NAME_APPROVED = "approved";
  @SerializedName(SERIALIZED_NAME_APPROVED)
  private Boolean approved;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_WALLET_ID = "walletId";
  @SerializedName(SERIALIZED_NAME_WALLET_ID)
  private List<String> walletId = null;

  public SetCollectionApprovalRequest() {
  }

  public SetCollectionApprovalRequest approved(Boolean approved) {
    
    this.approved = approved;
    return this;
  }

   /**
   * A true or false value approves or disapproves the provided address or address associated with the provided walletId.
   * @return approved
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A true or false value approves or disapproves the provided address or address associated with the provided walletId.")

  public Boolean getApproved() {
    return approved;
  }


  public void setApproved(Boolean approved) {
    this.approved = approved;
  }


  public SetCollectionApprovalRequest address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * A valid EVM based address to allow control over the authenticating game or player&#39;s wallet items for this collection.
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A valid EVM based address to allow control over the authenticating game or player's wallet items for this collection.")

  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public SetCollectionApprovalRequest walletId(List<String> walletId) {
    
    this.walletId = walletId;
    return this;
  }

  public SetCollectionApprovalRequest addWalletIdItem(String walletIdItem) {
    if (this.walletId == null) {
      this.walletId = new ArrayList<>();
    }
    this.walletId.add(walletIdItem);
    return this;
  }

   /**
   * A wallet id within the MetaFab ecosystem to allow control over the authenticating game or player&#39;s wallet items for this collection.
   * @return walletId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A wallet id within the MetaFab ecosystem to allow control over the authenticating game or player's wallet items for this collection.")

  public List<String> getWalletId() {
    return walletId;
  }


  public void setWalletId(List<String> walletId) {
    this.walletId = walletId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetCollectionApprovalRequest setCollectionApprovalRequest = (SetCollectionApprovalRequest) o;
    return Objects.equals(this.approved, setCollectionApprovalRequest.approved) &&
        Objects.equals(this.address, setCollectionApprovalRequest.address) &&
        Objects.equals(this.walletId, setCollectionApprovalRequest.walletId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(approved, address, walletId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetCollectionApprovalRequest {\n");
    sb.append("    approved: ").append(toIndentedString(approved)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    walletId: ").append(toIndentedString(walletId)).append("\n");
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
    openapiFields.add("approved");
    openapiFields.add("address");
    openapiFields.add("walletId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("approved");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SetCollectionApprovalRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SetCollectionApprovalRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SetCollectionApprovalRequest is not found in the empty JSON string", SetCollectionApprovalRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SetCollectionApprovalRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SetCollectionApprovalRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SetCollectionApprovalRequest.openapiRequiredFields) {
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
       if (!SetCollectionApprovalRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SetCollectionApprovalRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SetCollectionApprovalRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SetCollectionApprovalRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<SetCollectionApprovalRequest>() {
           @Override
           public void write(JsonWriter out, SetCollectionApprovalRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SetCollectionApprovalRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SetCollectionApprovalRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SetCollectionApprovalRequest
  * @throws IOException if the JSON string is invalid with respect to SetCollectionApprovalRequest
  */
  public static SetCollectionApprovalRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SetCollectionApprovalRequest.class);
  }

 /**
  * Convert an instance of SetCollectionApprovalRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

