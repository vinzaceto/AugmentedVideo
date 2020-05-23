package com.vinzaceto.augmentedvideo

/**
 * NTT Data Italia S.p.A.
 * File created on 23/05/2020.
 *
 * @author Vincenzo Aceto - vincenzo.aceto@nttdata.com
 * @version 1.0
 */

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val handler = Handler()
        handler.postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, 3000)
    }
}
