package com.yujin.loginlogictest_210819

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginBtn.setOnClickListener {

            val inputId = idEdt.text.toString()
            val inputPw = passwordEdt.text.toString()


            if (inputId == "admin" && inputPw == "qwer") {

                Toast.makeText(this, "관리자님 환영합니다.", Toast.LENGTH_SHORT).show()
            }
            else {
                
                Toast.makeText(this, "로그인에 실패했습니다.", Toast.LENGTH_SHORT).show()
            }


        }


    }
}