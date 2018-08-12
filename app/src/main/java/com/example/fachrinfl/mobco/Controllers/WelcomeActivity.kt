package com.example.fachrinfl.mobco.Controllers

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.fachrinfl.mobco.R
import kotlinx.android.synthetic.main.activity_welcome.*

class WelcomeActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        btnStarted.setOnClickListener{
            val communityIntent = Intent(this, CommunityActivity::class.java)
            startActivity(communityIntent)
        }
    }
}
