package com.scaler.libimgur.models;

@com.squareup.moshi.JsonClass(generateAdapter = true)
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010\rJ\t\u0010\u0013\u001a\u00020\bH\u00c6\u0003J4\u0010\u0014\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0003\u0010\u0007\u001a\u00020\bH\u00c6\u0001\u00a2\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0006H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001b"}, d2 = {"Lcom/scaler/libimgur/models/GalleryResponse;", "", "data", "", "Lcom/scaler/libimgur/models/Image;", "status", "", "success", "", "(Ljava/util/List;Ljava/lang/Integer;Z)V", "getData", "()Ljava/util/List;", "getStatus", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSuccess", "()Z", "component1", "component2", "component3", "copy", "(Ljava/util/List;Ljava/lang/Integer;Z)Lcom/scaler/libimgur/models/GalleryResponse;", "equals", "other", "hashCode", "toString", "", "libimgur"})
public final class GalleryResponse {
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.scaler.libimgur.models.Image> data = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer status = null;
    private final boolean success = false;
    
    public GalleryResponse(@com.squareup.moshi.Json(name = "data")
    @org.jetbrains.annotations.NotNull
    java.util.List<com.scaler.libimgur.models.Image> data, @com.squareup.moshi.Json(name = "status")
    @org.jetbrains.annotations.Nullable
    java.lang.Integer status, @com.squareup.moshi.Json(name = "success")
    boolean success) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.scaler.libimgur.models.Image> getData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getStatus() {
        return null;
    }
    
    public final boolean getSuccess() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.scaler.libimgur.models.Image> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component2() {
        return null;
    }
    
    public final boolean component3() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.scaler.libimgur.models.GalleryResponse copy(@com.squareup.moshi.Json(name = "data")
    @org.jetbrains.annotations.NotNull
    java.util.List<com.scaler.libimgur.models.Image> data, @com.squareup.moshi.Json(name = "status")
    @org.jetbrains.annotations.Nullable
    java.lang.Integer status, @com.squareup.moshi.Json(name = "success")
    boolean success) {
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