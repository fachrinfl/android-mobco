package com.example.fachrinfl.mobco.Controllers

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.fachrinfl.mobco.Models.CommunityCode
import com.example.fachrinfl.mobco.R
import com.example.fachrinfl.mobco.Utilities.COMMUNITY_CODE
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    lateinit var community_code : CommunityCode

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        outState?.putParcelable(COMMUNITY_CODE, community_code)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        community_code = intent.getParcelableExtra(COMMUNITY_CODE)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        if (savedInstanceState != null) {
            community_code = savedInstanceState.getParcelable(COMMUNITY_CODE)
        }
    }

    fun onBeginnerButton (view: View) {
        btnIntermediate.isChecked = false
        btnAdvanced.isChecked = false
        community_code.skill = "beginner"
    }

    fun onIntermediateButton (view: View) {
        btnBeginner.isChecked = false
        btnAdvanced.isChecked = false
        community_code.skill = "intermediate"
    }

    fun onAdvancedButton (view: View) {
        btnBeginner.isChecked = false
        btnIntermediate.isChecked = false
        community_code.skill = "advanced"
    }

    fun skillNextClicked (view: View) {
        if (community_code.skill != "") {
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(COMMUNITY_CODE, community_code)
            startActivity(finishActivity)
        } else {
            Toast.makeText(this, getString(R.string.str_select_skill), Toast.LENGTH_SHORT).show();
        }
    }
}
