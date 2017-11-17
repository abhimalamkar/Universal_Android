package com.abhijeetmalamkar.universal_android_example

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.abhijeetmalamkar.universal_android.*;

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);

        LogDebug.d("das")
    }
}
