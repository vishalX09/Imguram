package com.scaler.imguram

import android.app.Application
import coil.Coil
import coil.ComponentRegistry
import coil.ImageLoader
import coil.ImageLoaderFactory


class ImguramApp : Application() {

    override fun onCreate() {
        super.onCreate()

        Coil.setImageLoader(object: ImageLoaderFactory{
            val imageLoaderBuilder = ImageLoader.Builder(this@ImguramApp)
                .components(fun ComponentRegistry.Builder.() {

                }).build()

            override fun newImageLoader() =  imageLoaderBuilder

        })
    }
}
