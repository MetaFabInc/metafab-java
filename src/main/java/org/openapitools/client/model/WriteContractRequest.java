/*
 * MetaFab API
 *  Complete MetaFab API references and guides can be found at: https://trymetafab.com
 *
 * The version of the OpenAPI document: 1.3.0
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
import org.openapitools.client.model.WriteContractRequestArgsInner;

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
 * WriteContractRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-01T15:10:52.708628-08:00[America/Los_Angeles]")
public class WriteContractRequest {
  public static final String SERIALIZED_NAME_FUNC = "func";
  @SerializedName(SERIALIZED_NAME_FUNC)
  private String func;

  public static final String SERIALIZED_NAME_ARGS = "args";
  @SerializedName(SERIALIZED_NAME_ARGS)
  private List<WriteContractRequestArgsInner> args = null;

  public WriteContractRequest() {
  }

  public WriteContractRequest func(String func) {
    
    this.func = func;
    return this;
  }

   /**
   * A contract function name. This can be any valid function from the the ABI of the contract you are interacting with. For example, &#x60;mint&#x60;.
   * @return func
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A contract function name. This can be any valid function from the the ABI of the contract you are interacting with. For example, `mint`.")

  public String getFunc() {
    return func;
  }


  public void setFunc(String func) {
    this.func = func;
  }


  public WriteContractRequest args(List<WriteContractRequestArgsInner> args) {
    
    this.args = args;
    return this;
  }

  public WriteContractRequest addArgsItem(WriteContractRequestArgsInner argsItem) {
    if (this.args == null) {
      this.args = new ArrayList<>();
    }
    this.args.add(argsItem);
    return this;
  }

   /**
   * An array of args. This is optional and only necessary if the function being invoked requires arguments per the contract ABI. For example, &#x60;[123, \&quot;Hello\&quot;, false]&#x60;.
   * @return args
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of args. This is optional and only necessary if the function being invoked requires arguments per the contract ABI. For example, `[123, \"Hello\", false]`.")

  public List<WriteContractRequestArgsInner> getArgs() {
    return args;
  }


  public void setArgs(List<WriteContractRequestArgsInner> args) {
    this.args = args;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WriteContractRequest writeContractRequest = (WriteContractRequest) o;
    return Objects.equals(this.func, writeContractRequest.func) &&
        Objects.equals(this.args, writeContractRequest.args);
  }

  @Override
  public int hashCode() {
    return Objects.hash(func, args);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WriteContractRequest {\n");
    sb.append("    func: ").append(toIndentedString(func)).append("\n");
    sb.append("    args: ").append(toIndentedString(args)).append("\n");
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
    openapiFields.add("func");
    openapiFields.add("args");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("func");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WriteContractRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (WriteContractRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in WriteContractRequest is not found in the empty JSON string", WriteContractRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!WriteContractRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WriteContractRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WriteContractRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("func") != null && !jsonObj.get("func").isJsonNull()) && !jsonObj.get("func").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `func` to be a primitive type in the JSON string but got `%s`", jsonObj.get("func").toString()));
      }
      JsonArray jsonArrayargs = jsonObj.getAsJsonArray("args");
      if (jsonArrayargs != null) {
        // ensure the json data is an array
        if (!jsonObj.get("args").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `args` to be an array in the JSON string but got `%s`", jsonObj.get("args").toString()));
        }

        // validate the optional field `args` (array)
        for (int i = 0; i < jsonArrayargs.size(); i++) {
          WriteContractRequestArgsInner.validateJsonObject(jsonArrayargs.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WriteContractRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WriteContractRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WriteContractRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WriteContractRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<WriteContractRequest>() {
           @Override
           public void write(JsonWriter out, WriteContractRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WriteContractRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WriteContractRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WriteContractRequest
  * @throws IOException if the JSON string is invalid with respect to WriteContractRequest
  */
  public static WriteContractRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WriteContractRequest.class);
  }

 /**
  * Convert an instance of WriteContractRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

