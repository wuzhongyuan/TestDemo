package com.wuzhongyuan.hotfixapplication.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.wuzhongyuan.hotfixapplication.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val findViewById = findViewById<Button>(R.id.btn)
        findViewById.setOnClickListener {
            //Toast.makeText(this@MainActivity, "修复bug真开心", Toast.LENGTH_SHORT).show()
            Toast.makeText(null, "修复bug真开心", Toast.LENGTH_SHORT).show()
        }

        val text = findViewById<TextView>(R.id.tv_text)
        val packageInfo = packageManager.getPackageInfo(packageName, 0)
        text.text = "versionName = ${packageInfo.versionName} versionCode = ${packageInfo.versionCode}"
    }
}