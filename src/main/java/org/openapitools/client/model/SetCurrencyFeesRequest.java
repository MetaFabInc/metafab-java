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
 * SetCurrencyFeesRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-19T17:38:27.237153-05:00[America/New_York]")
public class SetCurrencyFeesRequest {
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

  public SetCurrencyFeesRequest() {
  }

  public SetCurrencyFeesRequest recipientAddress(String recipientAddress) {
    
    this.recipientAddress = recipientAddress;
    return this;
  }

   /**
   * The recipient address of currency transaction fees.
   * @return recipientAddress
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The recipient address of currency transaction fees.")

  public String getRecipientAddress() {
    return recipientAddress;
  }


  public void setRecipientAddress(String recipientAddress) {
    this.recipientAddress = recipientAddress;
  }


  public SetCurrencyFeesRequest basisPoints(BigDecimal basisPoints) {
    
    this.basisPoints = basisPoints;
    return this;
  }

   /**
   * A percentage fee for every transaction represented in basis points. To set a 1.5% fee, you would use a value of 150. This value can be 0, denoting no percentage fees.
   * @return basisPoints
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A percentage fee for every transaction represented in basis points. To set a 1.5% fee, you would use a value of 150. This value can be 0, denoting no percentage fees.")

  public BigDecimal getBasisPoints() {
    return basisPoints;
  }


  public void setBasisPoints(BigDecimal basisPoints) {
    this.basisPoints = basisPoints;
  }


  public SetCurrencyFeesRequest fixedAmount(BigDecimal fixedAmount) {
    
    this.fixedAmount = fixedAmount;
    return this;
  }

   /**
   * A fixed fee for every transaction. A value of 0.5 would mean 0.5 of the currency of a transaction is always taken as a fee. This value can be 0, denoting no fixed fees.
   * @return fixedAmount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A fixed fee for every transaction. A value of 0.5 would mean 0.5 of the currency of a transaction is always taken as a fee. This value can be 0, denoting no fixed fees.")

  public BigDecimal getFixedAmount() {
    return fixedAmount;
  }


  public void setFixedAmount(BigDecimal fixedAmount) {
    this.fixedAmount = fixedAmount;
  }


  public SetCurrencyFeesRequest capAmount(BigDecimal capAmount) {
    
    this.capAmount = capAmount;
    return this;
  }

   /**
   * The maximum fee amount for any single transaction. The total fee of a transaction is calculated as the sum of the basis points (percentage) fee, and fixed fee. If a calculated fee is greater than this maximum fee value, the maximum fee will be used instead.
   * @return capAmount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The maximum fee amount for any single transaction. The total fee of a transaction is calculated as the sum of the basis points (percentage) fee, and fixed fee. If a calculated fee is greater than this maximum fee value, the maximum fee will be used instead.")

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
    SetCurrencyFeesRequest setCurrencyFeesRequest = (SetCurrencyFeesRequest) o;
    return Objects.equals(this.recipientAddress, setCurrencyFeesRequest.recipientAddress) &&
        Objects.equals(this.basisPoints, setCurrencyFeesRequest.basisPoints) &&
        Objects.equals(this.fixedAmount, setCurrencyFeesRequest.fixedAmount) &&
        Objects.equals(this.capAmount, setCurrencyFeesRequest.capAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recipientAddress, basisPoints, fixedAmount, capAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetCurrencyFeesRequest {\n");
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
    openapiRequiredFields.add("recipientAddress");
    openapiRequiredFields.add("basisPoints");
    openapiRequiredFields.add("fixedAmount");
    openapiRequiredFields.add("capAmount");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SetCurrencyFeesRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SetCurrencyFeesRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SetCurrencyFeesRequest is not found in the empty JSON string", SetCurrencyFeesRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SetCurrencyFeesRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SetCurrencyFeesRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SetCurrencyFeesRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("recipientAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `recipientAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recipientAddress").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SetCurrencyFeesRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SetCurrencyFeesRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SetCurrencyFeesRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SetCurrencyFeesRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<SetCurrencyFeesRequest>() {
           @Override
           public void write(JsonWriter out, SetCurrencyFeesRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SetCurrencyFeesRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SetCurrencyFeesRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SetCurrencyFeesRequest
  * @throws IOException if the JSON string is invalid with respect to SetCurrencyFeesRequest
  */
  public static SetCurrencyFeesRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SetCurrencyFeesRequest.class);
  }

 /**
  * Convert an instance of SetCurrencyFeesRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

