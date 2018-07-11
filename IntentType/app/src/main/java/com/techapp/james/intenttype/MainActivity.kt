package com.techapp.james.intenttype

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.techapp.james.intenttype.shareIntent.Main2Activity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        shareBtn.setOnClickListener {
            var i = Intent(this, Main2Activity::class.java)
            startActivity(i)//explict intent
        }

    }
}
