package project.chris.news.adapter

import android.graphics.Bitmap
import android.webkit.WebChromeClient
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

@BindingAdapter("setImageFromUrl")
fun bindImageFromUrl(view: ImageView, url: String?) {
    if (!url.isNullOrEmpty()) {
        Glide.with(view.context).load(url).into(view)
    }
}

@BindingAdapter("loadNewsUrl")
fun loadNewsUrlToWebView(view: WebView, url: String?) {
    if (!url.isNullOrEmpty()) {
        view.webViewClient = WebViewClient()
        view.webChromeClient = WebChromeClient()

        view.loadUrl(url)
        view.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView?, request: WebResourceRequest?): Boolean {
                view?.loadUrl(url)
                return true
            }
        }

    }
}