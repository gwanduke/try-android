package com.gwanduke.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

// 앱의 한 스크린을 Activity 라 한다.
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}