package com.scaler.imguram.ui.story

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import coil.Coil
import coil.load
import coil.request.ImageRequest
import com.scaler.imguram.databinding.PageItemStoryBinding
import com.scaler.libimgur.models.Image

class StoryPagerAdapter :
    ListAdapter<Image, StoryPagerAdapter.StoryPageViewHolder>(StoryDiffCallback()) {

    class StoryPageViewHolder(val binding: PageItemStoryBinding) : RecyclerView.ViewHolder(binding.root)

    class StoryDiffCallback : DiffUtil.ItemCallback<Image>() {
        override fun areItemsTheSame(oldItem: Image, newItem: Image) =
            oldItem == newItem

        @SuppressLint("DiffUtilEquals")
        override fun areContentsTheSame(oldItem: Image, newItem: Image) =
            oldItem === newItem

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StoryPageViewHolder {
        val inflater = parent.context.getSystemService(LayoutInflater::class.java)
        val binding = PageItemStoryBinding.inflate(inflater, parent, false)
        return StoryPageViewHolder(binding)
    }

    override fun onBindViewHolder(holder: StoryPageViewHolder, position: Int) {
        val image = getItem(position)
        val imgUrl = if (image?.isAlbum == true && image.imagesCount != 0) {
            image.images!![0].link!!
        } else {
            image.link
        }

        imgUrl?.let {
            holder.binding.storyImageView.load(imgUrl)
            holder.binding.imageUrlTextView.text = imgUrl
        }
        cacheNext(position, holder.binding.storyImageView)
    }

    private fun cacheNext(position: Int, imageView: ImageView) {
        val image = try { getItem(position + 1) } catch (e: Exception) { null }

        val imgUrl = if (image?.isAlbum == true && image.imagesCount != 0) {
            image.images!![0].link!!
        } else {
            image?.link
        }
        imgUrl?.let {
            val request = ImageRequest.Builder(imageView.context)
                .data(imgUrl)
                .build()
            Coil.imageLoader(imageView.context).enqueue(request)
        }

    }
}