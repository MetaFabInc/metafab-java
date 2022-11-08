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
 * GrantCollectionRoleRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-07T16:37:22.578727-08:00[America/Los_Angeles]")
public class GrantCollectionRoleRequest {
  public static final String SERIALIZED_NAME_ROLE = "role";
  @SerializedName(SERIALIZED_NAME_ROLE)
  private String role;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_WALLET_ID = "walletId";
  @SerializedName(SERIALIZED_NAME_WALLET_ID)
  private List<String> walletId = null;

  public GrantCollectionRoleRequest() {
  }

  public GrantCollectionRoleRequest role(String role) {
    
    this.role = role;
    return this;
  }

   /**
   * A valid MetaFab role or bytes string representing a role, such as &#x60;minter&#x60; or &#x60;0xc9eb32e43bf5ecbceacf00b32281dfc5d6d700a0db676ea26ccf938a385ac3b7&#x60;
   * @return role
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A valid MetaFab role or bytes string representing a role, such as `minter` or `0xc9eb32e43bf5ecbceacf00b32281dfc5d6d700a0db676ea26ccf938a385ac3b7`")

  public String getRole() {
    return role;
  }


  public void setRole(String role) {
    this.role = role;
  }


  public GrantCollectionRoleRequest address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * A valid EVM based address grant the role to.
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A valid EVM based address grant the role to.")

  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public GrantCollectionRoleRequest walletId(List<String> walletId) {
    
    this.walletId = walletId;
    return this;
  }

  public GrantCollectionRoleRequest addWalletIdItem(String walletIdItem) {
    if (this.walletId == null) {
      this.walletId = new ArrayList<>();
    }
    this.walletId.add(walletIdItem);
    return this;
  }

   /**
   * A wallet id within the MetaFab ecosystem to grant the role to.
   * @return walletId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A wallet id within the MetaFab ecosystem to grant the role to.")

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
    GrantCollectionRoleRequest grantCollectionRoleRequest = (GrantCollectionRoleRequest) o;
    return Objects.equals(this.role, grantCollectionRoleRequest.role) &&
        Objects.equals(this.address, grantCollectionRoleRequest.address) &&
        Objects.equals(this.walletId, grantCollectionRoleRequest.walletId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(role, address, walletId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GrantCollectionRoleRequest {\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
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
    openapiFields.add("role");
    openapiFields.add("address");
    openapiFields.add("walletId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("role");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GrantCollectionRoleRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GrantCollectionRoleRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GrantCollectionRoleRequest is not found in the empty JSON string", GrantCollectionRoleRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GrantCollectionRoleRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GrantCollectionRoleRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GrantCollectionRoleRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("role") != null && !jsonObj.get("role").isJsonNull()) && !jsonObj.get("role").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `role` to be a primitive type in the JSON string but got `%s`", jsonObj.get("role").toString()));
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
       if (!GrantCollectionRoleRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GrantCollectionRoleRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GrantCollectionRoleRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GrantCollectionRoleRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<GrantCollectionRoleRequest>() {
           @Override
           public void write(JsonWriter out, GrantCollectionRoleRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GrantCollectionRoleRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GrantCollectionRoleRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GrantCollectionRoleRequest
  * @throws IOException if the JSON string is invalid with respect to GrantCollectionRoleRequest
  */
  public static GrantCollectionRoleRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GrantCollectionRoleRequest.class);
  }

 /**
  * Convert an instance of GrantCollectionRoleRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

