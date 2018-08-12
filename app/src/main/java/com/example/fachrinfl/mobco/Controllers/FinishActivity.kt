package com.example.fachrinfl.mobco.Controllers

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.fachrinfl.mobco.Models.CommunityCode
import com.example.fachrinfl.mobco.R
import com.example.fachrinfl.mobco.Utilities.COMMUNITY_CODE
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val community_code = intent.getParcelableExtra<CommunityCode>(COMMUNITY_CODE)
        tvSearchCommunity.text = "Looking for a ${community_code.community} ${community_code.skill} community near you..."
    }
}
