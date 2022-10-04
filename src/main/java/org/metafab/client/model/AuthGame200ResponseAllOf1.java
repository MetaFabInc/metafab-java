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
import org.metafab.client.model.WalletModel;

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
 * AuthGame200ResponseAllOf1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-03T19:20:44.101799-07:00[America/Los_Angeles]")
public class AuthGame200ResponseAllOf1 {
  public static final String SERIALIZED_NAME_FUNDING_WALLET = "fundingWallet";
  @SerializedName(SERIALIZED_NAME_FUNDING_WALLET)
  private WalletModel fundingWallet;

  public AuthGame200ResponseAllOf1() {
  }

  public AuthGame200ResponseAllOf1 fundingWallet(WalletModel fundingWallet) {
    
    this.fundingWallet = fundingWallet;
    return this;
  }

   /**
   * Get fundingWallet
   * @return fundingWallet
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public WalletModel getFundingWallet() {
    return fundingWallet;
  }


  public void setFundingWallet(WalletModel fundingWallet) {
    this.fundingWallet = fundingWallet;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthGame200ResponseAllOf1 authGame200ResponseAllOf1 = (AuthGame200ResponseAllOf1) o;
    return Objects.equals(this.fundingWallet, authGame200ResponseAllOf1.fundingWallet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fundingWallet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthGame200ResponseAllOf1 {\n");
    sb.append("    fundingWallet: ").append(toIndentedString(fundingWallet)).append("\n");
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
    openapiFields.add("fundingWallet");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AuthGame200ResponseAllOf1
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AuthGame200ResponseAllOf1.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AuthGame200ResponseAllOf1 is not found in the empty JSON string", AuthGame200ResponseAllOf1.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AuthGame200ResponseAllOf1.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AuthGame200ResponseAllOf1` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `fundingWallet`
      if (jsonObj.get("fundingWallet") != null && !jsonObj.get("fundingWallet").isJsonNull()) {
        WalletModel.validateJsonObject(jsonObj.getAsJsonObject("fundingWallet"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AuthGame200ResponseAllOf1.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AuthGame200ResponseAllOf1' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AuthGame200ResponseAllOf1> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AuthGame200ResponseAllOf1.class));

       return (TypeAdapter<T>) new TypeAdapter<AuthGame200ResponseAllOf1>() {
           @Override
           public void write(JsonWriter out, AuthGame200ResponseAllOf1 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AuthGame200ResponseAllOf1 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AuthGame200ResponseAllOf1 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AuthGame200ResponseAllOf1
  * @throws IOException if the JSON string is invalid with respect to AuthGame200ResponseAllOf1
  */
  public static AuthGame200ResponseAllOf1 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AuthGame200ResponseAllOf1.class);
  }

 /**
  * Convert an instance of AuthGame200ResponseAllOf1 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

