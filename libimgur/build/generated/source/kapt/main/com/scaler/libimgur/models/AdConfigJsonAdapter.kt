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
import com.squareup.moshi.`internal`.Util
import java.lang.NullPointerException
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.emptySet
import kotlin.text.buildString

public class AdConfigJsonAdapter(
  moshi: Moshi,
) : JsonAdapter<AdConfig>() {
  private val options: JsonReader.Options = JsonReader.Options.of("highRiskFlags", "safeFlags",
      "showsAds", "unsafeFlags", "wallUnsafeFlags")

  private val listOfAnyAdapter: JsonAdapter<List<Any>> =
      moshi.adapter(Types.newParameterizedType(List::class.java, Any::class.java), emptySet(),
      "highRiskFlags")

  private val listOfStringAdapter: JsonAdapter<List<String>> =
      moshi.adapter(Types.newParameterizedType(List::class.java, String::class.java), emptySet(),
      "safeFlags")

  private val nullableBooleanAdapter: JsonAdapter<Boolean?> =
      moshi.adapter(Boolean::class.javaObjectType, emptySet(), "showsAds")

  public override fun toString(): String = buildString(30) {
      append("GeneratedJsonAdapter(").append("AdConfig").append(')') }

  public override fun fromJson(reader: JsonReader): AdConfig {
    var highRiskFlags: List<Any>? = null
    var safeFlags: List<String>? = null
    var showsAds: Boolean? = null
    var unsafeFlags: List<String>? = null
    var wallUnsafeFlags: List<Any>? = null
    reader.beginObject()
    while (reader.hasNext()) {
      when (reader.selectName(options)) {
        0 -> highRiskFlags = listOfAnyAdapter.fromJson(reader) ?:
            throw Util.unexpectedNull("highRiskFlags", "highRiskFlags", reader)
        1 -> safeFlags = listOfStringAdapter.fromJson(reader) ?:
            throw Util.unexpectedNull("safeFlags", "safeFlags", reader)
        2 -> showsAds = nullableBooleanAdapter.fromJson(reader)
        3 -> unsafeFlags = listOfStringAdapter.fromJson(reader) ?:
            throw Util.unexpectedNull("unsafeFlags", "unsafeFlags", reader)
        4 -> wallUnsafeFlags = listOfAnyAdapter.fromJson(reader) ?:
            throw Util.unexpectedNull("wallUnsafeFlags", "wallUnsafeFlags", reader)
        -1 -> {
          // Unknown name, skip it.
          reader.skipName()
          reader.skipValue()
        }
      }
    }
    reader.endObject()
    return AdConfig(
        highRiskFlags = highRiskFlags ?: throw Util.missingProperty("highRiskFlags",
            "highRiskFlags", reader),
        safeFlags = safeFlags ?: throw Util.missingProperty("safeFlags", "safeFlags", reader),
        showsAds = showsAds,
        unsafeFlags = unsafeFlags ?: throw Util.missingProperty("unsafeFlags", "unsafeFlags",
            reader),
        wallUnsafeFlags = wallUnsafeFlags ?: throw Util.missingProperty("wallUnsafeFlags",
            "wallUnsafeFlags", reader)
    )
  }

  public override fun toJson(writer: JsonWriter, value_: AdConfig?): Unit {
    if (value_ == null) {
      throw NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.")
    }
    writer.beginObject()
    writer.name("highRiskFlags")
    listOfAnyAdapter.toJson(writer, value_.highRiskFlags)
    writer.name("safeFlags")
    listOfStringAdapter.toJson(writer, value_.safeFlags)
    writer.name("showsAds")
    nullableBooleanAdapter.toJson(writer, value_.showsAds)
    writer.name("unsafeFlags")
    listOfStringAdapter.toJson(writer, value_.unsafeFlags)
    writer.name("wallUnsafeFlags")
    listOfAnyAdapter.toJson(writer, value_.wallUnsafeFlags)
    writer.endObject()
  }
}