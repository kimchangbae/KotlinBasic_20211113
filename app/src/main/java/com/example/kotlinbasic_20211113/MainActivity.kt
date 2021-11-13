package com.example.kotlinbasic_20211113

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLog.setOnClickListener {
            // 이 내부의 코드는, 로그 찍기 버튼을 누를 때 마다 실행됨.
            Log.d("메인화면","로그 출력")
            Log.e("메인화면","e 로 로그 찍기")


        }
    }
}