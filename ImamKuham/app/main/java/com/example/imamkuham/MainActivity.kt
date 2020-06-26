package com.example.imamkuham

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun Postavke_click(view: View) {
        val intent = Intent(this, Postavke::class.java)
        startActivity(intent)

    }

    fun povijest_click(view: View) {
        val intent = Intent(this, Povijest::class.java)
        startActivity(intent)

    }

    fun Omiljeni_click(view: View) {
        val intent = Intent(this, Omiljeni::class.java)
        startActivity(intent)

    }

    fun Fridge_click(view: View) {
        val intent = Intent(this, Odabir_namirnica::class.java)
        startActivity(intent)

    }


}
