package com.scaler.libimgur.models;

@com.squareup.moshi.JsonClass(generateAdapter = true)
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b3\b\u0087\b\u0018\u00002\u00020\u0001B\u00cb\u0001\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0001\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\u0017J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fH\u00c6\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u0010\u00103\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001cJ\u0010\u00104\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0002\u0010!J\u000b\u00105\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u00106\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001cJ\u000b\u00107\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u00109\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0002\u0010!J\u0010\u0010:\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001cJ\u0010\u0010;\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001cJ\u0010\u0010<\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001cJ\u00d4\u0001\u0010=\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00062\u0010\b\u0003\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00012\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00012\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00012\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\nH\u00c6\u0001\u00a2\u0006\u0002\u0010>J\u0013\u0010?\u001a\u00020\u00062\b\u0010@\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010A\u001a\u00020\nH\u00d6\u0001J\t\u0010B\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0015\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\n\n\u0002\u0010\"\u001a\u0004\b \u0010!R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b#\u0010\u001cR\u0015\u0010\f\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\f\u0010\u001cR\u0015\u0010\r\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\r\u0010\u001cR\u0019\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\'R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\'R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0019R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\'R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b+\u0010\u001cR\u0015\u0010\u0016\u001a\u0004\u0018\u00010\n\u00a2\u0006\n\n\u0002\u0010\"\u001a\u0004\b,\u0010!\u00a8\u0006C"}, d2 = {"Lcom/scaler/libimgur/models/Tag;", "", "accent", "", "backgroundHash", "backgroundIsAnimated", "", "description", "displayName", "followers", "", "following", "isPromoted", "isWhitelisted", "items", "", "Lcom/scaler/libimgur/models/Image;", "logoDestinationUrl", "logoHash", "name", "thumbnailHash", "thumbnailIsAnimated", "totalItems", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Boolean;Ljava/lang/Integer;)V", "getAccent", "()Ljava/lang/String;", "getBackgroundHash", "getBackgroundIsAnimated", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getDescription", "getDisplayName", "getFollowers", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getFollowing", "getItems", "()Ljava/util/List;", "getLogoDestinationUrl", "()Ljava/lang/Object;", "getLogoHash", "getName", "getThumbnailHash", "getThumbnailIsAnimated", "getTotalItems", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Boolean;Ljava/lang/Integer;)Lcom/scaler/libimgur/models/Tag;", "equals", "other", "hashCode", "toString", "libimgur"})
public final class Tag {
    @org.jetbrains.annotations.Nullable
    private final java.lang.String accent = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String backgroundHash = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Boolean backgroundIsAnimated = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String description = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String displayName = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer followers = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Boolean following = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Boolean isPromoted = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Boolean isWhitelisted = null;
    @org.jetbrains.annotations.Nullable
    private final java.util.List<com.scaler.libimgur.models.Image> items = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Object logoDestinationUrl = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Object logoHash = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String name = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Object thumbnailHash = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Boolean thumbnailIsAnimated = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer totalItems = null;
    
    public Tag(@com.squareup.moshi.Json(name = "accent")
    @org.jetbrains.annotations.Nullable
    java.lang.String accent, @com.squareup.moshi.Json(name = "background_hash")
    @org.jetbrains.annotations.Nullable
    java.lang.String backgroundHash, @com.squareup.moshi.Json(name = "background_is_animated")
    @org.jetbrains.annotations.Nullable
    java.lang.Boolean backgroundIsAnimated, @com.squareup.moshi.Json(name = "description")
    @org.jetbrains.annotations.Nullable
    java.lang.String description, @com.squareup.moshi.Json(name = "display_name")
    @org.jetbrains.annotations.Nullable
    java.lang.String displayName, @com.squareup.moshi.Json(name = "followers")
    @org.jetbrains.annotations.Nullable
    java.lang.Integer followers, @com.squareup.moshi.Json(name = "following")
    @org.jetbrains.annotations.Nullable
    java.lang.Boolean following, @com.squareup.moshi.Json(name = "is_promoted")
    @org.jetbrains.annotations.Nullable
    java.lang.Boolean isPromoted, @com.squareup.moshi.Json(name = "is_whitelisted")
    @org.jetbrains.annotations.Nullable
    java.lang.Boolean isWhitelisted, @com.squareup.moshi.Json(name = "items")
    @org.jetbrains.annotations.Nullable
    java.util.List<com.scaler.libimgur.models.Image> items, @com.squareup.moshi.Json(name = "logo_destination_url")
    @org.jetbrains.annotations.Nullable
    java.lang.Object logoDestinationUrl, @com.squareup.moshi.Json(name = "logo_hash")
    @org.jetbrains.annotations.Nullable
    java.lang.Object logoHash, @com.squareup.moshi.Json(name = "name")
    @org.jetbrains.annotations.Nullable
    java.lang.String name, @com.squareup.moshi.Json(name = "thumbnail_hash")
    @org.jetbrains.annotations.Nullable
    java.lang.Object thumbnailHash, @com.squareup.moshi.Json(name = "thumbnail_is_animated")
    @org.jetbrains.annotations.Nullable
    java.lang.Boolean thumbnailIsAnimated, @com.squareup.moshi.Json(name = "total_items")
    @org.jetbrains.annotations.Nullable
    java.lang.Integer totalItems) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getAccent() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getBackgroundHash() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getBackgroundIsAnimated() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getDisplayName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getFollowers() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getFollowing() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean isPromoted() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean isWhitelisted() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.scaler.libimgur.models.Image> getItems() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getLogoDestinationUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getLogoHash() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getThumbnailHash() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getThumbnailIsAnimated() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getTotalItems() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.scaler.libimgur.models.Image> component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.scaler.libimgur.models.Tag copy(@com.squareup.moshi.Json(name = "accent")
    @org.jetbrains.annotations.Nullable
    java.lang.String accent, @com.squareup.moshi.Json(name = "background_hash")
    @org.jetbrains.annotations.Nullable
    java.lang.String backgroundHash, @com.squareup.moshi.Json(name = "background_is_animated")
    @org.jetbrains.annotations.Nullable
    java.lang.Boolean backgroundIsAnimated, @com.squareup.moshi.Json(name = "description")
    @org.jetbrains.annotations.Nullable
    java.lang.String description, @com.squareup.moshi.Json(name = "display_name")
    @org.jetbrains.annotations.Nullable
    java.lang.String displayName, @com.squareup.moshi.Json(name = "followers")
    @org.jetbrains.annotations.Nullable
    java.lang.Integer followers, @com.squareup.moshi.Json(name = "following")
    @org.jetbrains.annotations.Nullable
    java.lang.Boolean following, @com.squareup.moshi.Json(name = "is_promoted")
    @org.jetbrains.annotations.Nullable
    java.lang.Boolean isPromoted, @com.squareup.moshi.Json(name = "is_whitelisted")
    @org.jetbrains.annotations.Nullable
    java.lang.Boolean isWhitelisted, @com.squareup.moshi.Json(name = "items")
    @org.jetbrains.annotations.Nullable
    java.util.List<com.scaler.libimgur.models.Image> items, @com.squareup.moshi.Json(name = "logo_destination_url")
    @org.jetbrains.annotations.Nullable
    java.lang.Object logoDestinationUrl, @com.squareup.moshi.Json(name = "logo_hash")
    @org.jetbrains.annotations.Nullable
    java.lang.Object logoHash, @com.squareup.moshi.Json(name = "name")
    @org.jetbrains.annotations.Nullable
    java.lang.String name, @com.squareup.moshi.Json(name = "thumbnail_hash")
    @org.jetbrains.annotations.Nullable
    java.lang.Object thumbnailHash, @com.squareup.moshi.Json(name = "thumbnail_is_animated")
    @org.jetbrains.annotations.Nullable
    java.lang.Boolean thumbnailIsAnimated, @com.squareup.moshi.Json(name = "total_items")
    @org.jetbrains.annotations.Nullable
    java.lang.Integer totalItems) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return null;
    }
}