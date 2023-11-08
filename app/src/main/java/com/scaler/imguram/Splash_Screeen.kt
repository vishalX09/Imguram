@file:Suppress("DEPRECATION")

package com.scaler.imguram

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.scaler.imguram.ui.home.HomeActivity

class Splash_Screeen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screeen)

        val iv_note= findViewById<ImageView>(R.id.ssIcon)
        iv_note.alpha = 0f
        iv_note.animate().setDuration(3500).alpha(1f).withEndAction(){
            val i = Intent(this ,HomeActivity::class.java)
            startActivity(i)
            overridePendingTransition(android.R.anim.fade_in , android.R.anim.fade_out)
            finish()
        }

    }
}