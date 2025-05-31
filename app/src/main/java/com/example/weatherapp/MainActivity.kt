package com.example.weatherapp  // Replace with your actual package name
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webView: WebView = findViewById(R.id.webview)

        webView.webViewClient = WebViewClient() // Keeps it inside the app
        webView.settings.javaScriptEnabled = true // Enable JS for React
        webView.settings.domStorageEnabled = true // Optional but useful

        // 👇 Replace this URL with your React frontend URL (your local IP if testing)
        webView.loadUrl("http://192.168.29.15:8080")
    }
}
