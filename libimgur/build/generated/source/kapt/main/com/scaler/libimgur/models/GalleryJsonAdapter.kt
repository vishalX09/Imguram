// Code generated by moshi-kotlin-codegen. Do not edit.
@file:Suppress("DEPRECATION", "unused", "UNUSED_PARAMETER", "ClassName", "REDUNDANT_PROJECTION",
    "RedundantExplicitType", "LocalVariableName", "RedundantVisibilityModifier",
    "PLATFORM_CLASS_MAPPED_TO_KOTLIN", "IMPLICIT_NOTHING_TYPE_ARGUMENT_IN_RETURN_POSITION")

package com.scaler.libimgur.models

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.JsonReader
import com.squareup.moshi.JsonWriter
import com.squareup.moshi.Moshi
import com.squareup.moshi.`internal`.Util
import java.lang.NullPointerException
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.emptySet
import kotlin.text.buildString

public class GalleryJsonAdapter(
  moshi: Moshi,
) : JsonAdapter<Gallery>() {
  private val options: JsonReader.Options = JsonReader.Options.of("description", "id", "name",
      "topPost")

  private val nullableStringAdapter: JsonAdapter<String?> = moshi.adapter(String::class.java,
      emptySet(), "description")

  private val nullableIntAdapter: JsonAdapter<Int?> = moshi.adapter(Int::class.javaObjectType,
      emptySet(), "id")

  private val imageAdapter: JsonAdapter<Image> = moshi.adapter(Image::class.java, emptySet(),
      "topPost")

  public override fun toString(): String = buildString(29) {
      append("GeneratedJsonAdapter(").append("Gallery").append(')') }

  public override fun fromJson(reader: JsonReader): Gallery {
    var description: String? = null
    var id: Int? = null
    var name: String? = null
    var topPost: Image? = null
    reader.beginObject()
    while (reader.hasNext()) {
      when (reader.selectName(options)) {
        0 -> description = nullableStringAdapter.fromJson(reader)
        1 -> id = nullableIntAdapter.fromJson(reader)
        2 -> name = nullableStringAdapter.fromJson(reader)
        3 -> topPost = imageAdapter.fromJson(reader) ?: throw Util.unexpectedNull("topPost",
            "topPost", reader)
        -1 -> {
          // Unknown name, skip it.
          reader.skipName()
          reader.skipValue()
        }
      }
    }
    reader.endObject()
    return Gallery(
        description = description,
        id = id,
        name = name,
        topPost = topPost ?: throw Util.missingProperty("topPost", "topPost", reader)
    )
  }

  public override fun toJson(writer: JsonWriter, value_: Gallery?): Unit {
    if (value_ == null) {
      throw NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.")
    }
    writer.beginObject()
    writer.name("description")
    nullableStringAdapter.toJson(writer, value_.description)
    writer.name("id")
    nullableIntAdapter.toJson(writer, value_.id)
    writer.name("name")
    nullableStringAdapter.toJson(writer, value_.name)
    writer.name("topPost")
    imageAdapter.toJson(writer, value_.topPost)
    writer.endObject()
  }
}
