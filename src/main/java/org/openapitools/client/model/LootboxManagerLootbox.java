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
 * LootboxManagerLootbox
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-01T15:10:52.708628-08:00[America/Los_Angeles]")
public class LootboxManagerLootbox {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_INPUT_COLLECTION = "inputCollection";
  @SerializedName(SERIALIZED_NAME_INPUT_COLLECTION)
  private String inputCollection;

  public static final String SERIALIZED_NAME_INPUT_COLLECTION_ITEM_IDS = "inputCollectionItemIds";
  @SerializedName(SERIALIZED_NAME_INPUT_COLLECTION_ITEM_IDS)
  private List<Integer> inputCollectionItemIds = null;

  public static final String SERIALIZED_NAME_INPUT_COLLECTION_ITEM_AMOUNTS = "inputCollectionItemAmounts";
  @SerializedName(SERIALIZED_NAME_INPUT_COLLECTION_ITEM_AMOUNTS)
  private List<Integer> inputCollectionItemAmounts = null;

  public static final String SERIALIZED_NAME_OUTPUT_COLLECTION = "outputCollection";
  @SerializedName(SERIALIZED_NAME_OUTPUT_COLLECTION)
  private String outputCollection;

  public static final String SERIALIZED_NAME_OUTPUT_COLLECTION_ITEM_IDS = "outputCollectionItemIds";
  @SerializedName(SERIALIZED_NAME_OUTPUT_COLLECTION_ITEM_IDS)
  private List<Integer> outputCollectionItemIds = null;

  public static final String SERIALIZED_NAME_OUTPUT_COLLECTION_ITEM_AMOUNTS = "outputCollectionItemAmounts";
  @SerializedName(SERIALIZED_NAME_OUTPUT_COLLECTION_ITEM_AMOUNTS)
  private List<Integer> outputCollectionItemAmounts = null;

  public static final String SERIALIZED_NAME_OUTPUT_COLLECTION_ITEM_WEIGHTS = "outputCollectionItemWeights";
  @SerializedName(SERIALIZED_NAME_OUTPUT_COLLECTION_ITEM_WEIGHTS)
  private List<Integer> outputCollectionItemWeights = null;

  public static final String SERIALIZED_NAME_OUTPUT_TOTAL_ITEMS = "outputTotalItems";
  @SerializedName(SERIALIZED_NAME_OUTPUT_TOTAL_ITEMS)
  private Integer outputTotalItems;

  public static final String SERIALIZED_NAME_LAST_UPDATED_AT = "lastUpdatedAt";
  @SerializedName(SERIALIZED_NAME_LAST_UPDATED_AT)
  private Integer lastUpdatedAt;

  public LootboxManagerLootbox() {
  }

  public LootboxManagerLootbox id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * The id of this lootbox.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of this lootbox.")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public LootboxManagerLootbox inputCollection(String inputCollection) {
    
    this.inputCollection = inputCollection;
    return this;
  }

   /**
   * The address of the ERC1155 or MetaFab game items contract for input items required by this lootbox.
   * @return inputCollection
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The address of the ERC1155 or MetaFab game items contract for input items required by this lootbox.")

  public String getInputCollection() {
    return inputCollection;
  }


  public void setInputCollection(String inputCollection) {
    this.inputCollection = inputCollection;
  }


  public LootboxManagerLootbox inputCollectionItemIds(List<Integer> inputCollectionItemIds) {
    
    this.inputCollectionItemIds = inputCollectionItemIds;
    return this;
  }

  public LootboxManagerLootbox addInputCollectionItemIdsItem(Integer inputCollectionItemIdsItem) {
    if (this.inputCollectionItemIds == null) {
      this.inputCollectionItemIds = new ArrayList<>();
    }
    this.inputCollectionItemIds.add(inputCollectionItemIdsItem);
    return this;
  }

   /**
   * An array of item ids from the input collection that are required for this lootbox.
   * @return inputCollectionItemIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of item ids from the input collection that are required for this lootbox.")

  public List<Integer> getInputCollectionItemIds() {
    return inputCollectionItemIds;
  }


  public void setInputCollectionItemIds(List<Integer> inputCollectionItemIds) {
    this.inputCollectionItemIds = inputCollectionItemIds;
  }


  public LootboxManagerLootbox inputCollectionItemAmounts(List<Integer> inputCollectionItemAmounts) {
    
    this.inputCollectionItemAmounts = inputCollectionItemAmounts;
    return this;
  }

  public LootboxManagerLootbox addInputCollectionItemAmountsItem(Integer inputCollectionItemAmountsItem) {
    if (this.inputCollectionItemAmounts == null) {
      this.inputCollectionItemAmounts = new ArrayList<>();
    }
    this.inputCollectionItemAmounts.add(inputCollectionItemAmountsItem);
    return this;
  }

   /**
   * An array of amounts for each item id for the input collection that are required to open this lootbox.
   * @return inputCollectionItemAmounts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of amounts for each item id for the input collection that are required to open this lootbox.")

  public List<Integer> getInputCollectionItemAmounts() {
    return inputCollectionItemAmounts;
  }


  public void setInputCollectionItemAmounts(List<Integer> inputCollectionItemAmounts) {
    this.inputCollectionItemAmounts = inputCollectionItemAmounts;
  }


  public LootboxManagerLootbox outputCollection(String outputCollection) {
    
    this.outputCollection = outputCollection;
    return this;
  }

   /**
   * The address of the ERC1155 of MetaFab game items contract for possible output items given by this lootbox.
   * @return outputCollection
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The address of the ERC1155 of MetaFab game items contract for possible output items given by this lootbox.")

  public String getOutputCollection() {
    return outputCollection;
  }


  public void setOutputCollection(String outputCollection) {
    this.outputCollection = outputCollection;
  }


  public LootboxManagerLootbox outputCollectionItemIds(List<Integer> outputCollectionItemIds) {
    
    this.outputCollectionItemIds = outputCollectionItemIds;
    return this;
  }

  public LootboxManagerLootbox addOutputCollectionItemIdsItem(Integer outputCollectionItemIdsItem) {
    if (this.outputCollectionItemIds == null) {
      this.outputCollectionItemIds = new ArrayList<>();
    }
    this.outputCollectionItemIds.add(outputCollectionItemIdsItem);
    return this;
  }

   /**
   * An array of item ids from the output collection that are possibly given by this lootbox.
   * @return outputCollectionItemIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of item ids from the output collection that are possibly given by this lootbox.")

  public List<Integer> getOutputCollectionItemIds() {
    return outputCollectionItemIds;
  }


  public void setOutputCollectionItemIds(List<Integer> outputCollectionItemIds) {
    this.outputCollectionItemIds = outputCollectionItemIds;
  }


  public LootboxManagerLootbox outputCollectionItemAmounts(List<Integer> outputCollectionItemAmounts) {
    
    this.outputCollectionItemAmounts = outputCollectionItemAmounts;
    return this;
  }

  public LootboxManagerLootbox addOutputCollectionItemAmountsItem(Integer outputCollectionItemAmountsItem) {
    if (this.outputCollectionItemAmounts == null) {
      this.outputCollectionItemAmounts = new ArrayList<>();
    }
    this.outputCollectionItemAmounts.add(outputCollectionItemAmountsItem);
    return this;
  }

   /**
   * An array of amounts for each item id for the output collection that are possibly given by this lootbox.
   * @return outputCollectionItemAmounts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of amounts for each item id for the output collection that are possibly given by this lootbox.")

  public List<Integer> getOutputCollectionItemAmounts() {
    return outputCollectionItemAmounts;
  }


  public void setOutputCollectionItemAmounts(List<Integer> outputCollectionItemAmounts) {
    this.outputCollectionItemAmounts = outputCollectionItemAmounts;
  }


  public LootboxManagerLootbox outputCollectionItemWeights(List<Integer> outputCollectionItemWeights) {
    
    this.outputCollectionItemWeights = outputCollectionItemWeights;
    return this;
  }

  public LootboxManagerLootbox addOutputCollectionItemWeightsItem(Integer outputCollectionItemWeightsItem) {
    if (this.outputCollectionItemWeights == null) {
      this.outputCollectionItemWeights = new ArrayList<>();
    }
    this.outputCollectionItemWeights.add(outputCollectionItemWeightsItem);
    return this;
  }

   /**
   * An array of weights for each item id for the output collection that are possibly given by this lootbox.
   * @return outputCollectionItemWeights
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of weights for each item id for the output collection that are possibly given by this lootbox.")

  public List<Integer> getOutputCollectionItemWeights() {
    return outputCollectionItemWeights;
  }


  public void setOutputCollectionItemWeights(List<Integer> outputCollectionItemWeights) {
    this.outputCollectionItemWeights = outputCollectionItemWeights;
  }


  public LootboxManagerLootbox outputTotalItems(Integer outputTotalItems) {
    
    this.outputTotalItems = outputTotalItems;
    return this;
  }

   /**
   * The number of items randomly selected when this lootbox is opened.
   * @return outputTotalItems
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of items randomly selected when this lootbox is opened.")

  public Integer getOutputTotalItems() {
    return outputTotalItems;
  }


  public void setOutputTotalItems(Integer outputTotalItems) {
    this.outputTotalItems = outputTotalItems;
  }


  public LootboxManagerLootbox lastUpdatedAt(Integer lastUpdatedAt) {
    
    this.lastUpdatedAt = lastUpdatedAt;
    return this;
  }

   /**
   * A unix timestamp in seconds that represents the last time this offer was set or updated.
   * @return lastUpdatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A unix timestamp in seconds that represents the last time this offer was set or updated.")

  public Integer getLastUpdatedAt() {
    return lastUpdatedAt;
  }


  public void setLastUpdatedAt(Integer lastUpdatedAt) {
    this.lastUpdatedAt = lastUpdatedAt;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LootboxManagerLootbox lootboxManagerLootbox = (LootboxManagerLootbox) o;
    return Objects.equals(this.id, lootboxManagerLootbox.id) &&
        Objects.equals(this.inputCollection, lootboxManagerLootbox.inputCollection) &&
        Objects.equals(this.inputCollectionItemIds, lootboxManagerLootbox.inputCollectionItemIds) &&
        Objects.equals(this.inputCollectionItemAmounts, lootboxManagerLootbox.inputCollectionItemAmounts) &&
        Objects.equals(this.outputCollection, lootboxManagerLootbox.outputCollection) &&
        Objects.equals(this.outputCollectionItemIds, lootboxManagerLootbox.outputCollectionItemIds) &&
        Objects.equals(this.outputCollectionItemAmounts, lootboxManagerLootbox.outputCollectionItemAmounts) &&
        Objects.equals(this.outputCollectionItemWeights, lootboxManagerLootbox.outputCollectionItemWeights) &&
        Objects.equals(this.outputTotalItems, lootboxManagerLootbox.outputTotalItems) &&
        Objects.equals(this.lastUpdatedAt, lootboxManagerLootbox.lastUpdatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, inputCollection, inputCollectionItemIds, inputCollectionItemAmounts, outputCollection, outputCollectionItemIds, outputCollectionItemAmounts, outputCollectionItemWeights, outputTotalItems, lastUpdatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LootboxManagerLootbox {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    inputCollection: ").append(toIndentedString(inputCollection)).append("\n");
    sb.append("    inputCollectionItemIds: ").append(toIndentedString(inputCollectionItemIds)).append("\n");
    sb.append("    inputCollectionItemAmounts: ").append(toIndentedString(inputCollectionItemAmounts)).append("\n");
    sb.append("    outputCollection: ").append(toIndentedString(outputCollection)).append("\n");
    sb.append("    outputCollectionItemIds: ").append(toIndentedString(outputCollectionItemIds)).append("\n");
    sb.append("    outputCollectionItemAmounts: ").append(toIndentedString(outputCollectionItemAmounts)).append("\n");
    sb.append("    outputCollectionItemWeights: ").append(toIndentedString(outputCollectionItemWeights)).append("\n");
    sb.append("    outputTotalItems: ").append(toIndentedString(outputTotalItems)).append("\n");
    sb.append("    lastUpdatedAt: ").append(toIndentedString(lastUpdatedAt)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("inputCollection");
    openapiFields.add("inputCollectionItemIds");
    openapiFields.add("inputCollectionItemAmounts");
    openapiFields.add("outputCollection");
    openapiFields.add("outputCollectionItemIds");
    openapiFields.add("outputCollectionItemAmounts");
    openapiFields.add("outputCollectionItemWeights");
    openapiFields.add("outputTotalItems");
    openapiFields.add("lastUpdatedAt");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to LootboxManagerLootbox
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (LootboxManagerLootbox.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in LootboxManagerLootbox is not found in the empty JSON string", LootboxManagerLootbox.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!LootboxManagerLootbox.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LootboxManagerLootbox` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("inputCollection") != null && !jsonObj.get("inputCollection").isJsonNull()) && !jsonObj.get("inputCollection").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `inputCollection` to be a primitive type in the JSON string but got `%s`", jsonObj.get("inputCollection").toString()));
      }
      // ensure the json data is an array
      if ((jsonObj.get("inputCollectionItemIds") != null && !jsonObj.get("inputCollectionItemIds").isJsonNull()) && !jsonObj.get("inputCollectionItemIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `inputCollectionItemIds` to be an array in the JSON string but got `%s`", jsonObj.get("inputCollectionItemIds").toString()));
      }
      // ensure the json data is an array
      if ((jsonObj.get("inputCollectionItemAmounts") != null && !jsonObj.get("inputCollectionItemAmounts").isJsonNull()) && !jsonObj.get("inputCollectionItemAmounts").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `inputCollectionItemAmounts` to be an array in the JSON string but got `%s`", jsonObj.get("inputCollectionItemAmounts").toString()));
      }
      if ((jsonObj.get("outputCollection") != null && !jsonObj.get("outputCollection").isJsonNull()) && !jsonObj.get("outputCollection").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `outputCollection` to be a primitive type in the JSON string but got `%s`", jsonObj.get("outputCollection").toString()));
      }
      // ensure the json data is an array
      if ((jsonObj.get("outputCollectionItemIds") != null && !jsonObj.get("outputCollectionItemIds").isJsonNull()) && !jsonObj.get("outputCollectionItemIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `outputCollectionItemIds` to be an array in the JSON string but got `%s`", jsonObj.get("outputCollectionItemIds").toString()));
      }
      // ensure the json data is an array
      if ((jsonObj.get("outputCollectionItemAmounts") != null && !jsonObj.get("outputCollectionItemAmounts").isJsonNull()) && !jsonObj.get("outputCollectionItemAmounts").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `outputCollectionItemAmounts` to be an array in the JSON string but got `%s`", jsonObj.get("outputCollectionItemAmounts").toString()));
      }
      // ensure the json data is an array
      if ((jsonObj.get("outputCollectionItemWeights") != null && !jsonObj.get("outputCollectionItemWeights").isJsonNull()) && !jsonObj.get("outputCollectionItemWeights").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `outputCollectionItemWeights` to be an array in the JSON string but got `%s`", jsonObj.get("outputCollectionItemWeights").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LootboxManagerLootbox.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LootboxManagerLootbox' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LootboxManagerLootbox> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LootboxManagerLootbox.class));

       return (TypeAdapter<T>) new TypeAdapter<LootboxManagerLootbox>() {
           @Override
           public void write(JsonWriter out, LootboxManagerLootbox value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LootboxManagerLootbox read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LootboxManagerLootbox given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LootboxManagerLootbox
  * @throws IOException if the JSON string is invalid with respect to LootboxManagerLootbox
  */
  public static LootboxManagerLootbox fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LootboxManagerLootbox.class);
  }

 /**
  * Convert an instance of LootboxManagerLootbox to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

