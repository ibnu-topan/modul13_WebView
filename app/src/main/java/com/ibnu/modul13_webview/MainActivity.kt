package com.ibnu.modul13_webview

package tenmb.kotlinandroid
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val message: String = "<html><body><h1>Welcome AndroidKotlin.com</h1></body></html>"
        val mimeType: String = "text/html"
        val utfType: String = "UTF-8"
        webview.loadData(message, mimeType, utfType)
    }
}