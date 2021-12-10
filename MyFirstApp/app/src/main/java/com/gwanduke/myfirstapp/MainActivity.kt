// 이 파일의 내용이 이 패키지에 속함을 명시
package com.gwanduke.myfirstapp

// 다음 패키지에 있는 내용을 사용할 수 있음
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}