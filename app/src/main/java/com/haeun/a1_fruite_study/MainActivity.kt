package com.haeun.a1_fruite_study

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.lifecycle.findViewTreeViewModelStoreOwner

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1. 사진을 클릭했을 때 메세지 띄우기 by Toast
        val image1 = findViewById<ImageView>(R.id.fruit_image_1)
        image1.setOnClickListener {
            Toast.makeText(this, "1번 사진 클릭", Toast.LENGTH_LONG).show()

            // 2. 화면이 클릭되면 다른 화면으로 넘어감
            // 구글링 : "안드로이드 스튜디오 화면전환 kotlin"
            var intent = Intent(this, Fruit1Activity::class.java)
            startActivity(intent)
        }

    }




}