package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

//MainActivity : AppCompatActivity()의 상속을 받아야 실행된다.
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


}