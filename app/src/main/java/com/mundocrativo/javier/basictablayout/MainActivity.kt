package com.mundocrativo.javier.basictablayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mundocrativo.javier.basictablayout.ui.main.MainFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }
    }
}
