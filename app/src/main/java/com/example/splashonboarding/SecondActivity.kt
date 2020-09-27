package com.example.splashonboarding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val textview = findViewById<Button>(R.id.finishButton)

        textview.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                //Your code here
//                val intent = Intent(applicationContext, LogInActivity::class.java)
//                intent.putExtra(Constants.SELECT_ACTIVITY, "help")
//                startActivity(intent)
            }
        })
    }
}