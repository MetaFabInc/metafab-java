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
import java.util.ArrayList;
import java.util.List;
import org.metafab.client.model.TransactionModel;

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
 * CreateCurrency200ResponseAllOfContractAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-03T19:20:44.101799-07:00[America/Los_Angeles]")
public class CreateCurrency200ResponseAllOfContractAllOf {
  public static final String SERIALIZED_NAME_TRANSACTIONS = "transactions";
  @SerializedName(SERIALIZED_NAME_TRANSACTIONS)
  private List<TransactionModel> transactions = null;

  public CreateCurrency200ResponseAllOfContractAllOf() {
  }

  public CreateCurrency200ResponseAllOfContractAllOf transactions(List<TransactionModel> transactions) {
    
    this.transactions = transactions;
    return this;
  }

  public CreateCurrency200ResponseAllOfContractAllOf addTransactionsItem(TransactionModel transactionsItem) {
    if (this.transactions == null) {
      this.transactions = new ArrayList<>();
    }
    this.transactions.add(transactionsItem);
    return this;
  }

   /**
   * Get transactions
   * @return transactions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<TransactionModel> getTransactions() {
    return transactions;
  }


  public void setTransactions(List<TransactionModel> transactions) {
    this.transactions = transactions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateCurrency200ResponseAllOfContractAllOf createCurrency200ResponseAllOfContractAllOf = (CreateCurrency200ResponseAllOfContractAllOf) o;
    return Objects.equals(this.transactions, createCurrency200ResponseAllOfContractAllOf.transactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCurrency200ResponseAllOfContractAllOf {\n");
    sb.append("    transactions: ").append(toIndentedString(transactions)).append("\n");
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
    openapiFields.add("transactions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateCurrency200ResponseAllOfContractAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CreateCurrency200ResponseAllOfContractAllOf.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateCurrency200ResponseAllOfContractAllOf is not found in the empty JSON string", CreateCurrency200ResponseAllOfContractAllOf.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateCurrency200ResponseAllOfContractAllOf.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateCurrency200ResponseAllOfContractAllOf` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArraytransactions = jsonObj.getAsJsonArray("transactions");
      if (jsonArraytransactions != null) {
        // ensure the json data is an array
        if (!jsonObj.get("transactions").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `transactions` to be an array in the JSON string but got `%s`", jsonObj.get("transactions").toString()));
        }

        // validate the optional field `transactions` (array)
        for (int i = 0; i < jsonArraytransactions.size(); i++) {
          TransactionModel.validateJsonObject(jsonArraytransactions.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateCurrency200ResponseAllOfContractAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateCurrency200ResponseAllOfContractAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateCurrency200ResponseAllOfContractAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateCurrency200ResponseAllOfContractAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateCurrency200ResponseAllOfContractAllOf>() {
           @Override
           public void write(JsonWriter out, CreateCurrency200ResponseAllOfContractAllOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateCurrency200ResponseAllOfContractAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateCurrency200ResponseAllOfContractAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateCurrency200ResponseAllOfContractAllOf
  * @throws IOException if the JSON string is invalid with respect to CreateCurrency200ResponseAllOfContractAllOf
  */
  public static CreateCurrency200ResponseAllOfContractAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateCurrency200ResponseAllOfContractAllOf.class);
  }

 /**
  * Convert an instance of CreateCurrency200ResponseAllOfContractAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
