package com.example.studentsconnect

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
<<<<<<< HEAD

class StudyMaterialActivity : AppCompatActivity() {
=======
import android.webkit.WebView
import android.webkit.WebViewClient

class StudyMaterialActivity : AppCompatActivity() {
    private lateinit var wV:WebView
>>>>>>> 2161827 (1st commit)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.setTitle("Study Material")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_study_material)
<<<<<<< HEAD
=======
//        setContentView(R.layout.activity_chat_room)
        wV = findViewById(R.id.studyMaterialWebView)
        wV.settings.setJavaScriptEnabled(true)
        wV.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView, url: String): Boolean {
                view.loadUrl(url)
                return true
            }
        }
        wV.loadUrl("https://arkaprabhachowdhury.github.io/Chegg/main.html#course-materials")
>>>>>>> 2161827 (1st commit)
    }
}