package com.chris.mvvmnews.adapter

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

@BindingAdapter("setImageFromUrl")
fun bindImageFromUrl(view:ImageView, url:String?){
    if (!url.isNullOrEmpty()){
        Glide.with(view.context).load(url).into(view)
    }
}