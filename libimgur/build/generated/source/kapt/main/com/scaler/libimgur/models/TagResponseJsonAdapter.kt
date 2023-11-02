// Code generated by moshi-kotlin-codegen. Do not edit.
@file:Suppress("DEPRECATION", "unused", "UNUSED_PARAMETER", "ClassName", "REDUNDANT_PROJECTION",
    "RedundantExplicitType", "LocalVariableName", "RedundantVisibilityModifier",
    "PLATFORM_CLASS_MAPPED_TO_KOTLIN", "IMPLICIT_NOTHING_TYPE_ARGUMENT_IN_RETURN_POSITION")

package com.scaler.libimgur.models

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.JsonReader
import com.squareup.moshi.JsonWriter
import com.squareup.moshi.Moshi
import java.lang.NullPointerException
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.emptySet
import kotlin.text.buildString

public class TagResponseJsonAdapter(
  moshi: Moshi,
) : JsonAdapter<TagResponse>() {
  private val options: JsonReader.Options = JsonReader.Options.of("data", "status", "success")

  private val nullableTagAdapter: JsonAdapter<Tag?> = moshi.adapter(Tag::class.java, emptySet(),
      "data")

  private val nullableIntAdapter: JsonAdapter<Int?> = moshi.adapter(Int::class.javaObjectType,
      emptySet(), "status")

  private val nullableBooleanAdapter: JsonAdapter<Boolean?> =
      moshi.adapter(Boolean::class.javaObjectType, emptySet(), "success")

  public override fun toString(): String = buildString(33) {
      append("GeneratedJsonAdapter(").append("TagResponse").append(')') }

  public override fun fromJson(reader: JsonReader): TagResponse {
    var data_: Tag? = null
    var status: Int? = null
    var success: Boolean? = null
    reader.beginObject()
    while (reader.hasNext()) {
      when (reader.selectName(options)) {
        0 -> data_ = nullableTagAdapter.fromJson(reader)
        1 -> status = nullableIntAdapter.fromJson(reader)
        2 -> success = nullableBooleanAdapter.fromJson(reader)
        -1 -> {
          // Unknown name, skip it.
          reader.skipName()
          reader.skipValue()
        }
      }
    }
    reader.endObject()
    return TagResponse(
        `data` = data_,
        status = status,
        success = success
    )
  }

  public override fun toJson(writer: JsonWriter, value_: TagResponse?): Unit {
    if (value_ == null) {
      throw NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.")
    }
    writer.beginObject()
    writer.name("data")
    nullableTagAdapter.toJson(writer, value_.`data`)
    writer.name("status")
    nullableIntAdapter.toJson(writer, value_.status)
    writer.name("success")
    nullableBooleanAdapter.toJson(writer, value_.success)
    writer.endObject()
  }
}
