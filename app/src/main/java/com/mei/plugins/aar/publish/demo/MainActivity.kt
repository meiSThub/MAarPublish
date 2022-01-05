package com.mei.plugins.aar.publish.demo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mei.plugins.aar.myhttpjava.MyHttp
import okhttp3.OkHttpClient

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val http = MyHttp()
        OkHttpClient()
    }
}