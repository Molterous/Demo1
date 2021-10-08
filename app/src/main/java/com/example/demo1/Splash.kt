package com.example.demo1

import android.content.Intent
import android.graphics.Typeface
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowInsets
import android.view.WindowManager
import android.widget.TextView

class Splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        @Suppress("DEPRECATION")
        if( Build.VERSION.SDK_INT >= Build.VERSION_CODES.R )
            window.insetsController?.hide(WindowInsets.Type.statusBars())
        else{
            window.setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
            )
        }

        @Suppress("DEPRECATION")
        Handler().postDelayed(
            {
                startActivity(Intent(this@Splash, MainActivity::class.java) )
                finish()
            },
            2000
        )

        val typeface: Typeface = Typeface.createFromAsset(assets, "RobotoSlab-Bold.ttf")
        val appName = findViewById<TextView>(R.id.tv_app_name)
        appName.typeface = typeface


    }
}
