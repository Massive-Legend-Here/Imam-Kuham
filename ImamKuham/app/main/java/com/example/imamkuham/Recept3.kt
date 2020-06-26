package com.example.imamkuham

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_recept1.*

class Recept3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recept3)
        slika_grasak_recept.setClipToOutline(true)
    }

    fun koraci_click(view: View) {
        val koraci = findViewById<Button>(R.id.koraci)

        val intent = Intent(this, Koraci_recept3::class.java)
        startActivity(intent)

    }
}
