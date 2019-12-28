package com.project.mobo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.project.mobo.chat.ChattingActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLogin.setOnClickListener {
            val intent: Intent = Intent(this, ChattingActivity::class.java)
            startActivity(intent)
            finish()
            /*
            val UserId_1 = edtUserId_1.text.toString()
            val UserId_2 = edtUserId_2.text.toString()
            if (UserId_1 == "" || UserId_2 == "") {
                edtUserId_1.requestFocus()
                edtUserId_2.requestFocus()
                Toast.makeText(this, "로그인 아이디를 대령하거라.", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            } else {
                val intent: Intent = Intent(this, ChattingActivity::class.java)
                intent.putExtra("UserId_1", edtUserId_1.text.toString())
                intent.putExtra("UserId_2", edtUserId_2.text.toString())
                startActivity(intent)
                finish()
            }
             */
        }
    }

}
