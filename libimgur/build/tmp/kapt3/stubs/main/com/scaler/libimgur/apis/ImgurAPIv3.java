package com.scaler.libimgur.apis;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J-\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0001\u0010\f\u001a\u00020\rH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lcom/scaler/libimgur/apis/ImgurAPIv3;", "", "getGallery", "Lretrofit2/Response;", "Lcom/scaler/libimgur/models/GalleryResponse;", "section", "Lcom/scaler/libimgur/params/Section;", "albumPreviews", "", "(Lcom/scaler/libimgur/params/Section;Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTagGallery", "Lcom/scaler/libimgur/models/TagResponse;", "tag", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTags", "Lcom/scaler/libimgur/models/TagsResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "libimgur"})
public abstract interface ImgurAPIv3 {
    
    @retrofit2.http.GET(value = "gallery/{section}")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getGallery(@retrofit2.http.Path(value = "section")
    @org.jetbrains.annotations.NotNull
    com.scaler.libimgur.params.Section section, @retrofit2.http.Query(value = "album_previews")
    @org.jetbrains.annotations.Nullable
    java.lang.Boolean albumPreviews, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.scaler.libimgur.models.GalleryResponse>> $completion);
    
    @retrofit2.http.GET(value = "tags")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getTags(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.scaler.libimgur.models.TagsResponse>> $completion);
    
    @retrofit2.http.GET(value = "gallery/t/{tag}")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getTagGallery(@retrofit2.http.Path(value = "tag")
    @org.jetbrains.annotations.NotNull
    java.lang.String tag, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.scaler.libimgur.models.TagResponse>> $completion);
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
    }
}