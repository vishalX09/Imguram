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
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.emptySet
import kotlin.text.buildString

public class ImageJsonAdapter(
  moshi: Moshi,
) : JsonAdapter<Image>() {
  private val options: JsonReader.Options = JsonReader.Options.of("account_id", "account_url",
      "ad_config", "ad_type", "ad_url", "animated", "bandwidth", "comment_count", "cover",
      "cover_height", "cover_width", "datetime", "description", "downs", "edited", "favorite",
      "favorite_count", "gifv", "has_sound", "height", "hls", "id", "images", "images_count",
      "in_gallery", "in_most_viral", "include_album_ads", "is_ad", "is_album", "layout", "link",
      "looping", "mp4", "mp4_size", "nsfw", "points", "privacy", "processing", "score", "section",
      "size", "tags", "title", "topic", "topic_id", "type", "ups", "views", "vote", "width")

  private val nullableIntAdapter: JsonAdapter<Int?> = moshi.adapter(Int::class.javaObjectType,
      emptySet(), "accountId")

  private val nullableStringAdapter: JsonAdapter<String?> = moshi.adapter(String::class.java,
      emptySet(), "accountUrl")

  private val nullableAdConfigAdapter: JsonAdapter<AdConfig?> = moshi.adapter(AdConfig::class.java,
      emptySet(), "adConfig")

  private val nullableBooleanAdapter: JsonAdapter<Boolean?> =
      moshi.adapter(Boolean::class.javaObjectType, emptySet(), "animated")

  private val nullableLongAdapter: JsonAdapter<Long?> = moshi.adapter(Long::class.javaObjectType,
      emptySet(), "bandwidth")

  private val nullableAnyAdapter: JsonAdapter<Any?> = moshi.adapter(Any::class.java, emptySet(),
      "description")

  private val nullableListOfImageAdapter: JsonAdapter<List<Image>?> =
      moshi.adapter(Types.newParameterizedType(List::class.java, Image::class.java), emptySet(),
      "images")

  private val nullableProcessingAdapter: JsonAdapter<Image.Processing?> =
      moshi.adapter(Image.Processing::class.java, emptySet(), "processing")

  private val listOfTagAdapter: JsonAdapter<List<Tag>> =
      moshi.adapter(Types.newParameterizedType(List::class.java, Tag::class.java), emptySet(),
      "tags")

  public override fun toString(): String = buildString(27) {
      append("GeneratedJsonAdapter(").append("Image").append(')') }

  public override fun fromJson(reader: JsonReader): Image {
    var accountId: Int? = null
    var accountUrl: String? = null
    var adConfig: AdConfig? = null
    var adType: Int? = null
    var adUrl: String? = null
    var animated: Boolean? = null
    var bandwidth: Long? = null
    var commentCount: Int? = null
    var cover: String? = null
    var coverHeight: Int? = null
    var coverWidth: Int? = null
    var datetime: Int? = null
    var description: Any? = null
    var downs: Int? = null
    var edited: Int? = null
    var favorite: Boolean? = null
    var favoriteCount: Int? = null
    var gifv: String? = null
    var hasSound: Boolean? = null
    var height: Int? = null
    var hls: String? = null
    var id: String? = null
    var images: List<Image>? = null
    var imagesCount: Int? = null
    var inGallery: Boolean? = null
    var inMostViral: Boolean? = null
    var includeAlbumAds: Boolean? = null
    var isAd: Boolean? = null
    var isAlbum: Boolean? = null
    var layout: String? = null
    var link: String? = null
    var looping: Boolean? = null
    var mp4: String? = null
    var mp4Size: Int? = null
    var nsfw: Boolean? = null
    var points: Int? = null
    var privacy: String? = null
    var processing: Image.Processing? = null
    var score: Int? = null
    var section: String? = null
    var size: Int? = null
    var tags: List<Tag>? = null
    var title: String? = null
    var topic: Any? = null
    var topicId: Any? = null
    var type: String? = null
    var ups: Int? = null
    var views: Int? = null
    var vote: Any? = null
    var width: Int? = null
    reader.beginObject()
    while (reader.hasNext()) {
      when (reader.selectName(options)) {
        0 -> accountId = nullableIntAdapter.fromJson(reader)
        1 -> accountUrl = nullableStringAdapter.fromJson(reader)
        2 -> adConfig = nullableAdConfigAdapter.fromJson(reader)
        3 -> adType = nullableIntAdapter.fromJson(reader)
        4 -> adUrl = nullableStringAdapter.fromJson(reader)
        5 -> animated = nullableBooleanAdapter.fromJson(reader)
        6 -> bandwidth = nullableLongAdapter.fromJson(reader)
        7 -> commentCount = nullableIntAdapter.fromJson(reader)
        8 -> cover = nullableStringAdapter.fromJson(reader)
        9 -> coverHeight = nullableIntAdapter.fromJson(reader)
        10 -> coverWidth = nullableIntAdapter.fromJson(reader)
        11 -> datetime = nullableIntAdapter.fromJson(reader)
        12 -> description = nullableAnyAdapter.fromJson(reader)
        13 -> downs = nullableIntAdapter.fromJson(reader)
        14 -> edited = nullableIntAdapter.fromJson(reader)
        15 -> favorite = nullableBooleanAdapter.fromJson(reader)
        16 -> favoriteCount = nullableIntAdapter.fromJson(reader)
        17 -> gifv = nullableStringAdapter.fromJson(reader)
        18 -> hasSound = nullableBooleanAdapter.fromJson(reader)
        19 -> height = nullableIntAdapter.fromJson(reader)
        20 -> hls = nullableStringAdapter.fromJson(reader)
        21 -> id = nullableStringAdapter.fromJson(reader)
        22 -> images = nullableListOfImageAdapter.fromJson(reader)
        23 -> imagesCount = nullableIntAdapter.fromJson(reader)
        24 -> inGallery = nullableBooleanAdapter.fromJson(reader)
        25 -> inMostViral = nullableBooleanAdapter.fromJson(reader)
        26 -> includeAlbumAds = nullableBooleanAdapter.fromJson(reader)
        27 -> isAd = nullableBooleanAdapter.fromJson(reader)
        28 -> isAlbum = nullableBooleanAdapter.fromJson(reader)
        29 -> layout = nullableStringAdapter.fromJson(reader)
        30 -> link = nullableStringAdapter.fromJson(reader)
        31 -> looping = nullableBooleanAdapter.fromJson(reader)
        32 -> mp4 = nullableStringAdapter.fromJson(reader)
        33 -> mp4Size = nullableIntAdapter.fromJson(reader)
        34 -> nsfw = nullableBooleanAdapter.fromJson(reader)
        35 -> points = nullableIntAdapter.fromJson(reader)
        36 -> privacy = nullableStringAdapter.fromJson(reader)
        37 -> processing = nullableProcessingAdapter.fromJson(reader)
        38 -> score = nullableIntAdapter.fromJson(reader)
        39 -> section = nullableStringAdapter.fromJson(reader)
        40 -> size = nullableIntAdapter.fromJson(reader)
        41 -> tags = listOfTagAdapter.fromJson(reader) ?: throw Util.unexpectedNull("tags", "tags",
            reader)
        42 -> title = nullableStringAdapter.fromJson(reader)
        43 -> topic = nullableAnyAdapter.fromJson(reader)
        44 -> topicId = nullableAnyAdapter.fromJson(reader)
        45 -> type = nullableStringAdapter.fromJson(reader)
        46 -> ups = nullableIntAdapter.fromJson(reader)
        47 -> views = nullableIntAdapter.fromJson(reader)
        48 -> vote = nullableAnyAdapter.fromJson(reader)
        49 -> width = nullableIntAdapter.fromJson(reader)
        -1 -> {
          // Unknown name, skip it.
          reader.skipName()
          reader.skipValue()
        }
      }
    }
    reader.endObject()
    return Image(
        accountId = accountId,
        accountUrl = accountUrl,
        adConfig = adConfig,
        adType = adType,
        adUrl = adUrl,
        animated = animated,
        bandwidth = bandwidth,
        commentCount = commentCount,
        cover = cover,
        coverHeight = coverHeight,
        coverWidth = coverWidth,
        datetime = datetime,
        description = description,
        downs = downs,
        edited = edited,
        favorite = favorite,
        favoriteCount = favoriteCount,
        gifv = gifv,
        hasSound = hasSound,
        height = height,
        hls = hls,
        id = id,
        images = images,
        imagesCount = imagesCount,
        inGallery = inGallery,
        inMostViral = inMostViral,
        includeAlbumAds = includeAlbumAds,
        isAd = isAd,
        isAlbum = isAlbum,
        layout = layout,
        link = link,
        looping = looping,
        mp4 = mp4,
        mp4Size = mp4Size,
        nsfw = nsfw,
        points = points,
        privacy = privacy,
        processing = processing,
        score = score,
        section = section,
        size = size,
        tags = tags ?: throw Util.missingProperty("tags", "tags", reader),
        title = title,
        topic = topic,
        topicId = topicId,
        type = type,
        ups = ups,
        views = views,
        vote = vote,
        width = width
    )
  }

  public override fun toJson(writer: JsonWriter, value_: Image?): Unit {
    if (value_ == null) {
      throw NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.")
    }
    writer.beginObject()
    writer.name("account_id")
    nullableIntAdapter.toJson(writer, value_.accountId)
    writer.name("account_url")
    nullableStringAdapter.toJson(writer, value_.accountUrl)
    writer.name("ad_config")
    nullableAdConfigAdapter.toJson(writer, value_.adConfig)
    writer.name("ad_type")
    nullableIntAdapter.toJson(writer, value_.adType)
    writer.name("ad_url")
    nullableStringAdapter.toJson(writer, value_.adUrl)
    writer.name("animated")
    nullableBooleanAdapter.toJson(writer, value_.animated)
    writer.name("bandwidth")
    nullableLongAdapter.toJson(writer, value_.bandwidth)
    writer.name("comment_count")
    nullableIntAdapter.toJson(writer, value_.commentCount)
    writer.name("cover")
    nullableStringAdapter.toJson(writer, value_.cover)
    writer.name("cover_height")
    nullableIntAdapter.toJson(writer, value_.coverHeight)
    writer.name("cover_width")
    nullableIntAdapter.toJson(writer, value_.coverWidth)
    writer.name("datetime")
    nullableIntAdapter.toJson(writer, value_.datetime)
    writer.name("description")
    nullableAnyAdapter.toJson(writer, value_.description)
    writer.name("downs")
    nullableIntAdapter.toJson(writer, value_.downs)
    writer.name("edited")
    nullableIntAdapter.toJson(writer, value_.edited)
    writer.name("favorite")
    nullableBooleanAdapter.toJson(writer, value_.favorite)
    writer.name("favorite_count")
    nullableIntAdapter.toJson(writer, value_.favoriteCount)
    writer.name("gifv")
    nullableStringAdapter.toJson(writer, value_.gifv)
    writer.name("has_sound")
    nullableBooleanAdapter.toJson(writer, value_.hasSound)
    writer.name("height")
    nullableIntAdapter.toJson(writer, value_.height)
    writer.name("hls")
    nullableStringAdapter.toJson(writer, value_.hls)
    writer.name("id")
    nullableStringAdapter.toJson(writer, value_.id)
    writer.name("images")
    nullableListOfImageAdapter.toJson(writer, value_.images)
    writer.name("images_count")
    nullableIntAdapter.toJson(writer, value_.imagesCount)
    writer.name("in_gallery")
    nullableBooleanAdapter.toJson(writer, value_.inGallery)
    writer.name("in_most_viral")
    nullableBooleanAdapter.toJson(writer, value_.inMostViral)
    writer.name("include_album_ads")
    nullableBooleanAdapter.toJson(writer, value_.includeAlbumAds)
    writer.name("is_ad")
    nullableBooleanAdapter.toJson(writer, value_.isAd)
    writer.name("is_album")
    nullableBooleanAdapter.toJson(writer, value_.isAlbum)
    writer.name("layout")
    nullableStringAdapter.toJson(writer, value_.layout)
    writer.name("link")
    nullableStringAdapter.toJson(writer, value_.link)
    writer.name("looping")
    nullableBooleanAdapter.toJson(writer, value_.looping)
    writer.name("mp4")
    nullableStringAdapter.toJson(writer, value_.mp4)
    writer.name("mp4_size")
    nullableIntAdapter.toJson(writer, value_.mp4Size)
    writer.name("nsfw")
    nullableBooleanAdapter.toJson(writer, value_.nsfw)
    writer.name("points")
    nullableIntAdapter.toJson(writer, value_.points)
    writer.name("privacy")
    nullableStringAdapter.toJson(writer, value_.privacy)
    writer.name("processing")
    nullableProcessingAdapter.toJson(writer, value_.processing)
    writer.name("score")
    nullableIntAdapter.toJson(writer, value_.score)
    writer.name("section")
    nullableStringAdapter.toJson(writer, value_.section)
    writer.name("size")
    nullableIntAdapter.toJson(writer, value_.size)
    writer.name("tags")
    listOfTagAdapter.toJson(writer, value_.tags)
    writer.name("title")
    nullableStringAdapter.toJson(writer, value_.title)
    writer.name("topic")
    nullableAnyAdapter.toJson(writer, value_.topic)
    writer.name("topic_id")
    nullableAnyAdapter.toJson(writer, value_.topicId)
    writer.name("type")
    nullableStringAdapter.toJson(writer, value_.type)
    writer.name("ups")
    nullableIntAdapter.toJson(writer, value_.ups)
    writer.name("views")
    nullableIntAdapter.toJson(writer, value_.views)
    writer.name("vote")
    nullableAnyAdapter.toJson(writer, value_.vote)
    writer.name("width")
    nullableIntAdapter.toJson(writer, value_.width)
    writer.endObject()
  }
}
