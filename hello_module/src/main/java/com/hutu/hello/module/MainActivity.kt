package com.hutu.hello.module

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.wssg.module.test.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        print("123")
    }
}
