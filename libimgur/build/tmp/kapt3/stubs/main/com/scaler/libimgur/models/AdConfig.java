package com.scaler.libimgur.models;

@com.squareup.moshi.JsonClass(generateAdapter = true)
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u000e\b\u0001\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u000e\b\u0001\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003\u00a2\u0006\u0002\u0010\nJ\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u00c6\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u0003H\u00c6\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000fJ\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u0003H\u00c6\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u00c6\u0003JZ\u0010\u0018\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u000e\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00032\u000e\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u0005H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f\u00a8\u0006\u001f"}, d2 = {"Lcom/scaler/libimgur/models/AdConfig;", "", "highRiskFlags", "", "safeFlags", "", "showsAds", "", "unsafeFlags", "wallUnsafeFlags", "(Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;)V", "getHighRiskFlags", "()Ljava/util/List;", "getSafeFlags", "getShowsAds", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getUnsafeFlags", "getWallUnsafeFlags", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;)Lcom/scaler/libimgur/models/AdConfig;", "equals", "other", "hashCode", "", "toString", "libimgur"})
public final class AdConfig {
    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.Object> highRiskFlags = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.String> safeFlags = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Boolean showsAds = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.String> unsafeFlags = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.Object> wallUnsafeFlags = null;
    
    public AdConfig(@com.squareup.moshi.Json(name = "highRiskFlags")
    @org.jetbrains.annotations.NotNull
    java.util.List<? extends java.lang.Object> highRiskFlags, @com.squareup.moshi.Json(name = "safeFlags")
    @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> safeFlags, @com.squareup.moshi.Json(name = "showsAds")
    @org.jetbrains.annotations.Nullable
    java.lang.Boolean showsAds, @com.squareup.moshi.Json(name = "unsafeFlags")
    @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> unsafeFlags, @com.squareup.moshi.Json(name = "wallUnsafeFlags")
    @org.jetbrains.annotations.NotNull
    java.util.List<? extends java.lang.Object> wallUnsafeFlags) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.Object> getHighRiskFlags() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> getSafeFlags() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getShowsAds() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> getUnsafeFlags() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.Object> getWallUnsafeFlags() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.Object> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.Object> component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.scaler.libimgur.models.AdConfig copy(@com.squareup.moshi.Json(name = "highRiskFlags")
    @org.jetbrains.annotations.NotNull
    java.util.List<? extends java.lang.Object> highRiskFlags, @com.squareup.moshi.Json(name = "safeFlags")
    @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> safeFlags, @com.squareup.moshi.Json(name = "showsAds")
    @org.jetbrains.annotations.Nullable
    java.lang.Boolean showsAds, @com.squareup.moshi.Json(name = "unsafeFlags")
    @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> unsafeFlags, @com.squareup.moshi.Json(name = "wallUnsafeFlags")
    @org.jetbrains.annotations.NotNull
    java.util.List<? extends java.lang.Object> wallUnsafeFlags) {
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