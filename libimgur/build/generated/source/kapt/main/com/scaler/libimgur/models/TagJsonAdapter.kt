// Code generated by moshi-kotlin-codegen. Do not edit.
@file:Suppress("DEPRECATION", "unused", "UNUSED_PARAMETER", "ClassName", "REDUNDANT_PROJECTION",
    "RedundantExplicitType", "LocalVariableName", "RedundantVisibilityModifier",
    "PLATFORM_CLASS_MAPPED_TO_KOTLIN", "IMPLICIT_NOTHING_TYPE_ARGUMENT_IN_RETURN_POSITION")

package com.scaler.libimgur.models

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.JsonReader
import com.squareup.moshi.JsonWriter
import com.squareup.moshi.Moshi
import com.squareup.moshi.Types
import java.lang.NullPointerException
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.emptySet
import kotlin.text.buildString

public class TagJsonAdapter(
  moshi: Moshi,
) : JsonAdapter<Tag>() {
  private val options: JsonReader.Options = JsonReader.Options.of("accent", "background_hash",
      "background_is_animated", "description", "display_name", "followers", "following",
      "is_promoted", "is_whitelisted", "items", "logo_destination_url", "logo_hash", "name",
      "thumbnail_hash", "thumbnail_is_animated", "total_items")

  private val nullableStringAdapter: JsonAdapter<String?> = moshi.adapter(String::class.java,
      emptySet(), "accent")

  private val nullableBooleanAdapter: JsonAdapter<Boolean?> =
      moshi.adapter(Boolean::class.javaObjectType, emptySet(), "backgroundIsAnimated")

  private val nullableIntAdapter: JsonAdapter<Int?> = moshi.adapter(Int::class.javaObjectType,
      emptySet(), "followers")

  private val nullableListOfImageAdapter: JsonAdapter<List<Image>?> =
      moshi.adapter(Types.newParameterizedType(List::class.java, Image::class.java), emptySet(),
      "items")

  private val nullableAnyAdapter: JsonAdapter<Any?> = moshi.adapter(Any::class.java, emptySet(),
      "logoDestinationUrl")

  public override fun toString(): String = buildString(25) {
      append("GeneratedJsonAdapter(").append("Tag").append(')') }

  public override fun fromJson(reader: JsonReader): Tag {
    var accent: String? = null
    var backgroundHash: String? = null
    var backgroundIsAnimated: Boolean? = null
    var description: String? = null
    var displayName: String? = null
    var followers: Int? = null
    var following: Boolean? = null
    var isPromoted: Boolean? = null
    var isWhitelisted: Boolean? = null
    var items: List<Image>? = null
    var logoDestinationUrl: Any? = null
    var logoHash: Any? = null
    var name: String? = null
    var thumbnailHash: Any? = null
    var thumbnailIsAnimated: Boolean? = null
    var totalItems: Int? = null
    reader.beginObject()
    while (reader.hasNext()) {
      when (reader.selectName(options)) {
        0 -> accent = nullableStringAdapter.fromJson(reader)
        1 -> backgroundHash = nullableStringAdapter.fromJson(reader)
        2 -> backgroundIsAnimated = nullableBooleanAdapter.fromJson(reader)
        3 -> description = nullableStringAdapter.fromJson(reader)
        4 -> displayName = nullableStringAdapter.fromJson(reader)
        5 -> followers = nullableIntAdapter.fromJson(reader)
        6 -> following = nullableBooleanAdapter.fromJson(reader)
        7 -> isPromoted = nullableBooleanAdapter.fromJson(reader)
        8 -> isWhitelisted = nullableBooleanAdapter.fromJson(reader)
        9 -> items = nullableListOfImageAdapter.fromJson(reader)
        10 -> logoDestinationUrl = nullableAnyAdapter.fromJson(reader)
        11 -> logoHash = nullableAnyAdapter.fromJson(reader)
        12 -> name = nullableStringAdapter.fromJson(reader)
        13 -> thumbnailHash = nullableAnyAdapter.fromJson(reader)
        14 -> thumbnailIsAnimated = nullableBooleanAdapter.fromJson(reader)
        15 -> totalItems = nullableIntAdapter.fromJson(reader)
        -1 -> {
          // Unknown name, skip it.
          reader.skipName()
          reader.skipValue()
        }
      }
    }
    reader.endObject()
    return Tag(
        accent = accent,
        backgroundHash = backgroundHash,
        backgroundIsAnimated = backgroundIsAnimated,
        description = description,
        displayName = displayName,
        followers = followers,
        following = following,
        isPromoted = isPromoted,
        isWhitelisted = isWhitelisted,
        items = items,
        logoDestinationUrl = logoDestinationUrl,
        logoHash = logoHash,
        name = name,
        thumbnailHash = thumbnailHash,
        thumbnailIsAnimated = thumbnailIsAnimated,
        totalItems = totalItems
    )
  }

  public override fun toJson(writer: JsonWriter, value_: Tag?): Unit {
    if (value_ == null) {
      throw NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.")
    }
    writer.beginObject()
    writer.name("accent")
    nullableStringAdapter.toJson(writer, value_.accent)
    writer.name("background_hash")
    nullableStringAdapter.toJson(writer, value_.backgroundHash)
    writer.name("background_is_animated")
    nullableBooleanAdapter.toJson(writer, value_.backgroundIsAnimated)
    writer.name("description")
    nullableStringAdapter.toJson(writer, value_.description)
    writer.name("display_name")
    nullableStringAdapter.toJson(writer, value_.displayName)
    writer.name("followers")
    nullableIntAdapter.toJson(writer, value_.followers)
    writer.name("following")
    nullableBooleanAdapter.toJson(writer, value_.following)
    writer.name("is_promoted")
    nullableBooleanAdapter.toJson(writer, value_.isPromoted)
    writer.name("is_whitelisted")
    nullableBooleanAdapter.toJson(writer, value_.isWhitelisted)
    writer.name("items")
    nullableListOfImageAdapter.toJson(writer, value_.items)
    writer.name("logo_destination_url")
    nullableAnyAdapter.toJson(writer, value_.logoDestinationUrl)
    writer.name("logo_hash")
    nullableAnyAdapter.toJson(writer, value_.logoHash)
    writer.name("name")
    nullableStringAdapter.toJson(writer, value_.name)
    writer.name("thumbnail_hash")
    nullableAnyAdapter.toJson(writer, value_.thumbnailHash)
    writer.name("thumbnail_is_animated")
    nullableBooleanAdapter.toJson(writer, value_.thumbnailIsAnimated)
    writer.name("total_items")
    nullableIntAdapter.toJson(writer, value_.totalItems)
    writer.endObject()
  }
}
