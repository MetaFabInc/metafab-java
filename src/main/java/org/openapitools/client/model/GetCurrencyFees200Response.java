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
 * GetCurrencyFees200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-03T19:42:38.170633-07:00[America/Los_Angeles]")
public class GetCurrencyFees200Response {
  public static final String SERIALIZED_NAME_RECIPIENT_ADDRESS = "recipientAddress";
  @SerializedName(SERIALIZED_NAME_RECIPIENT_ADDRESS)
  private String recipientAddress;

  public static final String SERIALIZED_NAME_BASIS_POINTS = "basisPoints";
  @SerializedName(SERIALIZED_NAME_BASIS_POINTS)
  private BigDecimal basisPoints;

  public static final String SERIALIZED_NAME_FIXED_AMOUNT = "fixedAmount";
  @SerializedName(SERIALIZED_NAME_FIXED_AMOUNT)
  private BigDecimal fixedAmount;

  public static final String SERIALIZED_NAME_CAP_AMOUNT = "capAmount";
  @SerializedName(SERIALIZED_NAME_CAP_AMOUNT)
  private BigDecimal capAmount;

  public GetCurrencyFees200Response() {
  }

  public GetCurrencyFees200Response recipientAddress(String recipientAddress) {
    
    this.recipientAddress = recipientAddress;
    return this;
  }

   /**
   * The wallet address that fees from all applicable transactions are automatically sent to.
   * @return recipientAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The wallet address that fees from all applicable transactions are automatically sent to.")

  public String getRecipientAddress() {
    return recipientAddress;
  }


  public void setRecipientAddress(String recipientAddress) {
    this.recipientAddress = recipientAddress;
  }


  public GetCurrencyFees200Response basisPoints(BigDecimal basisPoints) {
    
    this.basisPoints = basisPoints;
    return this;
  }

   /**
   * The number of fee basis points. 100 basisPoints &#x3D; 1% fee of the total transaction amount deducted from the total received by the recipient.
   * @return basisPoints
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of fee basis points. 100 basisPoints = 1% fee of the total transaction amount deducted from the total received by the recipient.")

  public BigDecimal getBasisPoints() {
    return basisPoints;
  }


  public void setBasisPoints(BigDecimal basisPoints) {
    this.basisPoints = basisPoints;
  }


  public GetCurrencyFees200Response fixedAmount(BigDecimal fixedAmount) {
    
    this.fixedAmount = fixedAmount;
    return this;
  }

   /**
   * The fixed number of currency as a fee regardless of the total transaction amount. 10 &#x3D; 10 of the currency as a fee for any transaction, deducted from the total received by the recipient.
   * @return fixedAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The fixed number of currency as a fee regardless of the total transaction amount. 10 = 10 of the currency as a fee for any transaction, deducted from the total received by the recipient.")

  public BigDecimal getFixedAmount() {
    return fixedAmount;
  }


  public void setFixedAmount(BigDecimal fixedAmount) {
    this.fixedAmount = fixedAmount;
  }


  public GetCurrencyFees200Response capAmount(BigDecimal capAmount) {
    
    this.capAmount = capAmount;
    return this;
  }

   /**
   * The maximum combined fee between basisPoints and fixedAmount. If the total transaction fee is over this amount, the capAmount will be used as the transaction fee deducted from the total received by the recipient.
   * @return capAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The maximum combined fee between basisPoints and fixedAmount. If the total transaction fee is over this amount, the capAmount will be used as the transaction fee deducted from the total received by the recipient.")

  public BigDecimal getCapAmount() {
    return capAmount;
  }


  public void setCapAmount(BigDecimal capAmount) {
    this.capAmount = capAmount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCurrencyFees200Response getCurrencyFees200Response = (GetCurrencyFees200Response) o;
    return Objects.equals(this.recipientAddress, getCurrencyFees200Response.recipientAddress) &&
        Objects.equals(this.basisPoints, getCurrencyFees200Response.basisPoints) &&
        Objects.equals(this.fixedAmount, getCurrencyFees200Response.fixedAmount) &&
        Objects.equals(this.capAmount, getCurrencyFees200Response.capAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recipientAddress, basisPoints, fixedAmount, capAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCurrencyFees200Response {\n");
    sb.append("    recipientAddress: ").append(toIndentedString(recipientAddress)).append("\n");
    sb.append("    basisPoints: ").append(toIndentedString(basisPoints)).append("\n");
    sb.append("    fixedAmount: ").append(toIndentedString(fixedAmount)).append("\n");
    sb.append("    capAmount: ").append(toIndentedString(capAmount)).append("\n");
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
    openapiFields.add("recipientAddress");
    openapiFields.add("basisPoints");
    openapiFields.add("fixedAmount");
    openapiFields.add("capAmount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetCurrencyFees200Response
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GetCurrencyFees200Response.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetCurrencyFees200Response is not found in the empty JSON string", GetCurrencyFees200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetCurrencyFees200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetCurrencyFees200Response` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("recipientAddress") != null && !jsonObj.get("recipientAddress").isJsonNull()) && !jsonObj.get("recipientAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `recipientAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recipientAddress").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetCurrencyFees200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetCurrencyFees200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetCurrencyFees200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetCurrencyFees200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<GetCurrencyFees200Response>() {
           @Override
           public void write(JsonWriter out, GetCurrencyFees200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetCurrencyFees200Response read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetCurrencyFees200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetCurrencyFees200Response
  * @throws IOException if the JSON string is invalid with respect to GetCurrencyFees200Response
  */
  public static GetCurrencyFees200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetCurrencyFees200Response.class);
  }

 /**
  * Convert an instance of GetCurrencyFees200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

