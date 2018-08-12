package com.example.fachrinfl.mobco.Controllers

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.fachrinfl.mobco.Models.CommunityCode
import com.example.fachrinfl.mobco.Utilities.COMMUNITY_CODE
import com.example.fachrinfl.mobco.R
import kotlinx.android.synthetic.main.activity_community.*

class CommunityActivity : BaseActivity() {

    var community_code = CommunityCode("", "")


    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        outState?.putParcelable(COMMUNITY_CODE, community_code)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_community)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        if (savedInstanceState != null) {
            community_code = savedInstanceState.getParcelable(COMMUNITY_CODE)
        }
    }

    fun onJavaButton (view: View) {
        btnKotlin.isChecked = false
        btnFlutter.isChecked = false
        community_code.community = "java"
    }

    fun onKotlinButton (view: View) {
        btnJava.isChecked = false
        btnFlutter.isChecked = false
        community_code.community = "kotlin"
    }

    fun onFlutterButton (view: View) {
        btnJava.isChecked = false
        btnKotlin.isChecked = false
        community_code.community = "flutter"
    }

    fun communityNextClicked (view: View) {
        if (community_code.community != "") {
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(COMMUNITY_CODE, community_code)
            startActivity(skillActivity)
        } else {
            Toast.makeText(this, getString(R.string.str_choose_development), Toast.LENGTH_SHORT).show();
        }
    }
}
