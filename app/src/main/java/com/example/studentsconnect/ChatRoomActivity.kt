package com.example.studentsconnect

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class ChatRoomActivity : AppCompatActivity() {
    private lateinit var webView:WebView
//    private  var url:String?
    override fun onCreate(savedInstanceState: Bundle?) {
        super.setTitle("Chat Room")
        super.onCreate(savedInstanceState)
//        val url:String ="https://tawk.to/chat/63331c8d54f06e12d89729e8/1gdvqf2og"
        setContentView(R.layout.activity_chat_room)
        webView = findViewById(R.id.chatWebView)
        webView.settings.setJavaScriptEnabled(true)
        webView.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView, url: String): Boolean {
                view.loadUrl(url)
                return true
            }
        }
        webView.loadUrl("https://tawk.to/chat/63331c8d54f06e12d89729e8/1gdvqf2og")
    }
}