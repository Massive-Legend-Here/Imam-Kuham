package com.example.imamkuham

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import kotlinx.android.synthetic.main.activity_omiljeni.*

class Omiljeni : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_omiljeni)
        slika_grasak.setClipToOutline(true)
        slika_varivo.setClipToOutline(true)
        slika_snicle.setClipToOutline(true)
    }

    fun recept1_click(view: View) {
        val recept = findViewById<CardView>(R.id.recept1)

        val intent = Intent(this, Recept1::class.java)
        startActivity(intent)

    }

    fun recept2_click(view: View) {
        val recept = findViewById<CardView>(R.id.recept2)

        val intent = Intent(this, Recept2::class.java)
        startActivity(intent)

    }

    fun recept3_click(view: View) {
        val recept = findViewById<CardView>(R.id.recept3)

        val intent = Intent(this, Recept3::class.java)
        startActivity(intent)

    }
}
