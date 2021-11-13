package com.example.kotlinbasic_20211113

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnToast.setOnClickListener {
            // 이 내부의 코드는, 토스트 띄우기 버튼을 누를 때 마다 실행됨.
            Toast.makeText(this, "토스트 출력", Toast.LENGTH_SHORT).show()
        }

        btnLog.setOnClickListener {
            // 이 내부의 코드는, 로그 찍기 버튼을 누를 때 마다 실행됨.
            Log.d("메인화면","로그 출력")
            Log.e("메인화면","e 로 로그 찍기")
        }

        btnOk.setOnClickListener {
            // 확인 버튼이 눌리면 실행할 일.
            // 1. edtContent 에 타이핑 해준 문구(text)가 무엇인가? -> 변수에 저장.

            val inputContent = edtContent.text.toString()
            Log.d("inputContent", inputContent)

            // 2. txtContent 에 변수를 저장해둔 문구 -> text 속성에 대입 (문구 변경)
            txtContents.text = inputContent
        }
    }
}