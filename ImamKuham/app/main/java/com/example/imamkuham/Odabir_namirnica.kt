package com.example.imamkuham

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class Odabir_namirnica : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_odabir_namirnica)
    }


    fun Float_click(view: View) {
        val boja = findViewById<FloatingActionButton>(R.id.floatingActionButton)
        boja.setBackgroundColor(getResources().getColor(R.color.Font));

        val intent = Intent(this, Izbor_recepta::class.java)
        startActivity(intent)

    }

    /*sve namirnice se spremaju unutar liste, te se provjerava ukoliko je ona već u listi, te ukoliko korisnik odznači
    * namirnicu ona se briše sa liste*/
    var lista_namirnica: MutableList<String> = ArrayList()
    fun dodavanje_namirnica(namirnica: String) {
        when {
            lista_namirnica.contains(namirnica) ->
                lista_namirnica.remove(namirnica)
            else -> lista_namirnica.add(namirnica)
        }
    }


    /*Privremeno rješenje dok bazu do kraja ne implementiram, i color state list*/
    var check1 = 1;
    var check2 = 1;
    var check3 = 1;
    var check4 = 1;
    var check5 = 1;
    var check6 = 1;
    var check7 = 1;
    var check8 = 1;
    var check9 = 1;
    var check10 = 1;
    var check11 = 1;
    var check12 = 1;
    var check13 = 1;
    var check14 = 1;
    var check16 = 1;
    var check17 = 1;
    var check18 = 1;
    var check19 = 1;
    var check20 = 1;
    var check21 = 1;
    var check22 = 1;
    var check23 = 1;
    var check24 = 1;
    var check25 = 1;
    var check26 = 1;
    var check27 = 1;
    var check28 = 1;
    var check29 = 1;
    var check30 = 1;
    var check31 = 1;

    fun Jaje_click(view: View) {
        val jaje = findViewById<CardView>(R.id.jaje)
        val Font_boja = findViewById<TextView>(R.id.text_jaje)

        if (check1 == 1) {
            jaje.setCardBackgroundColor(getResources().getColor(R.color.Font));
            Font_boja.setTextColor(getResources().getColor(R.color.colorPrimaryDark))
            check1 = 0;
        } else {
            jaje.setCardBackgroundColor(getResources().getColor(R.color.colorAccent));
            Font_boja.setTextColor(getResources().getColor(R.color.Font))
            check1 = 1;
        }
        dodavanje_namirnica("Jaje")

    }

    fun Kokosh_click(view: View) {
        val kartica = findViewById<CardView>(R.id.kokosh)
        val Font_boja = findViewById<TextView>(R.id.text_kokosh)

        if (check2 == 1) {
            kartica.setCardBackgroundColor(getResources().getColor(R.color.Font));
            Font_boja.setTextColor(getResources().getColor(R.color.colorPrimaryDark))
            check2 = 0;
        } else {
            kartica.setCardBackgroundColor(getResources().getColor(R.color.colorAccent));
            Font_boja.setTextColor(getResources().getColor(R.color.Font))
            check2 = 1;
        }
        dodavanje_namirnica("Piletina")

    }

    fun Krava_click(view: View) {
        val kartica = findViewById<CardView>(R.id.krava)
        val Font_boja = findViewById<TextView>(R.id.text_krava)
        if (check3 == 1) {
            kartica.setCardBackgroundColor(getResources().getColor(R.color.Font));
            Font_boja.setTextColor(getResources().getColor(R.color.colorPrimaryDark))
            check3 = 0;
        } else {
            kartica.setCardBackgroundColor(getResources().getColor(R.color.colorAccent));
            Font_boja.setTextColor(getResources().getColor(R.color.Font))
            check3 = 1;
        }
        dodavanje_namirnica("Govedina")
    }

    fun Cesnjak_click(view: View) {
        val kartica = findViewById<CardView>(R.id.cesnjak)
        val Font_boja = findViewById<TextView>(R.id.text_cesnjak)

        if (check4 == 1) {
            kartica.setCardBackgroundColor(getResources().getColor(R.color.Font));
            Font_boja.setTextColor(getResources().getColor(R.color.colorPrimaryDark))
            check4 = 0;
        } else {
            kartica.setCardBackgroundColor(getResources().getColor(R.color.colorAccent));
            Font_boja.setTextColor(getResources().getColor(R.color.Font))
            check4 = 1;
        }
        dodavanje_namirnica("Češnjak")
    }

    fun Dzem_click(view: View) {
        val kartica = findViewById<CardView>(R.id.dzem)
        val Font_boja = findViewById<TextView>(R.id.text_dzem)
        if (check5 == 1) {
            kartica.setCardBackgroundColor(getResources().getColor(R.color.Font));
            Font_boja.setTextColor(getResources().getColor(R.color.colorPrimaryDark))
            check5 = 0;
        } else {
            kartica.setCardBackgroundColor(getResources().getColor(R.color.colorAccent));
            Font_boja.setTextColor(getResources().getColor(R.color.Font))
            check5 = 1;
        }
        dodavanje_namirnica("Džem")
    }

    fun Grasak_click(view: View) {
        val kartica = findViewById<CardView>(R.id.grasak)
        val Font_boja = findViewById<TextView>(R.id.text_grasak)
        if (check6 == 1) {
            kartica.setCardBackgroundColor(getResources().getColor(R.color.Font));
            Font_boja.setTextColor(getResources().getColor(R.color.colorPrimaryDark))
            check6 = 0;
        } else {
            kartica.setCardBackgroundColor(getResources().getColor(R.color.colorAccent));
            Font_boja.setTextColor(getResources().getColor(R.color.Font))
            check6 = 1;
        }
        dodavanje_namirnica("Grašak")
    }

    fun Jogurt_click(view: View) {
        val kartica = findViewById<CardView>(R.id.jogurt)
        val Font_boja = findViewById<TextView>(R.id.text_jogurt)
        if (check7 == 1) {
            kartica.setCardBackgroundColor(getResources().getColor(R.color.Font));
            Font_boja.setTextColor(getResources().getColor(R.color.colorPrimaryDark))
            check7 = 0;
        } else {
            kartica.setCardBackgroundColor(getResources().getColor(R.color.colorAccent));
            Font_boja.setTextColor(getResources().getColor(R.color.Font))
            check7 = 1;
        }
        dodavanje_namirnica("Jogurt")
    }

    fun Kecap_click(view: View) {
        val kartica = findViewById<CardView>(R.id.kecap)
        val Font_boja = findViewById<TextView>(R.id.text_kecap)
        if (check8 == 1) {
            kartica.setCardBackgroundColor(getResources().getColor(R.color.Font));
            Font_boja.setTextColor(getResources().getColor(R.color.colorPrimaryDark))
            check8 = 0;
        } else {
            kartica.setCardBackgroundColor(getResources().getColor(R.color.colorAccent));
            Font_boja.setTextColor(getResources().getColor(R.color.Font))
            check8 = 1;
        }
        dodavanje_namirnica("Kečap")
    }

    fun Krastavac_click(view: View) {
        val kartica = findViewById<CardView>(R.id.krastavac)
        val Font_boja = findViewById<TextView>(R.id.text_krastavac)
        if (check9 == 1) {
            kartica.setCardBackgroundColor(getResources().getColor(R.color.Font));
            Font_boja.setTextColor(getResources().getColor(R.color.colorPrimaryDark))
            check9 = 0;
        } else {
            kartica.setCardBackgroundColor(getResources().getColor(R.color.colorAccent));
            Font_boja.setTextColor(getResources().getColor(R.color.Font))
            check9 = 1;
        }
        dodavanje_namirnica("Krastavac")
    }

    fun Kruh_click(view: View) {
        val kartica = findViewById<CardView>(R.id.kruh)
        val Font_boja = findViewById<TextView>(R.id.text_kruh)
        if (check10 == 1) {
            kartica.setCardBackgroundColor(getResources().getColor(R.color.Font));
            Font_boja.setTextColor(getResources().getColor(R.color.colorPrimaryDark))
            check10 = 0;
        } else {
            kartica.setCardBackgroundColor(getResources().getColor(R.color.colorAccent));
            Font_boja.setTextColor(getResources().getColor(R.color.Font))
            check10 = 1;
        }
        dodavanje_namirnica("Kruh")
    }

    fun Krumpir_click(view: View) {
        val kartica = findViewById<CardView>(R.id.krumpir)
        val Font_boja = findViewById<TextView>(R.id.text_krumpir)
        if (check11 == 1) {
            kartica.setCardBackgroundColor(getResources().getColor(R.color.Font));
            Font_boja.setTextColor(getResources().getColor(R.color.colorPrimaryDark))
            check11 = 0;
        } else {
            kartica.setCardBackgroundColor(getResources().getColor(R.color.colorAccent));
            Font_boja.setTextColor(getResources().getColor(R.color.Font))
            check11 = 1;
        }
        dodavanje_namirnica("Krumpir")
    }

    fun Luk_click(view: View) {
        val kartica = findViewById<CardView>(R.id.luk)
        val Font_boja = findViewById<TextView>(R.id.text_luk)
        if (check12 == 1) {
            kartica.setCardBackgroundColor(getResources().getColor(R.color.Font));
            Font_boja.setTextColor(getResources().getColor(R.color.colorPrimaryDark))
            check12 = 0;
        } else {
            kartica.setCardBackgroundColor(getResources().getColor(R.color.colorAccent));
            Font_boja.setTextColor(getResources().getColor(R.color.Font))
            check12 = 1;
        }
        dodavanje_namirnica("Luk")
    }

    fun Majoneza_click(view: View) {
        val kartica = findViewById<CardView>(R.id.majoneza)
        val Font_boja = findViewById<TextView>(R.id.text_majoneza)
        if (check13 == 1) {
            kartica.setCardBackgroundColor(getResources().getColor(R.color.Font));
            Font_boja.setTextColor(getResources().getColor(R.color.colorPrimaryDark))
            check13 = 0;
        } else {
            kartica.setCardBackgroundColor(getResources().getColor(R.color.colorAccent));
            Font_boja.setTextColor(getResources().getColor(R.color.Font))
            check13 = 1;
        }
        dodavanje_namirnica("Majoneza")
    }

    fun Maslac_click(view: View) {
        val kartica = findViewById<CardView>(R.id.maslac)
        val Font_boja = findViewById<TextView>(R.id.text_maslac)
        if (check14 == 1) {
            kartica.setCardBackgroundColor(getResources().getColor(R.color.Font));
            Font_boja.setTextColor(getResources().getColor(R.color.colorPrimaryDark))
            check14 = 0;
        } else {
            kartica.setCardBackgroundColor(getResources().getColor(R.color.colorAccent));
            Font_boja.setTextColor(getResources().getColor(R.color.Font))
            check14 = 1;
        }
        dodavanje_namirnica("Maslac")
    }

    fun Mlijeko_click(view: View) {
        val kartica = findViewById<CardView>(R.id.mlijeko)
        val Font_boja = findViewById<TextView>(R.id.text_mlijeko)
        if (check16 == 1) {
            kartica.setCardBackgroundColor(getResources().getColor(R.color.Font));
            Font_boja.setTextColor(getResources().getColor(R.color.colorPrimaryDark))
            check16 = 0;
        } else {
            kartica.setCardBackgroundColor(getResources().getColor(R.color.colorAccent));
            Font_boja.setTextColor(getResources().getColor(R.color.Font))
            check16 = 1;
        }
        dodavanje_namirnica("Mlijeko")
    }

    fun Mrkva_click(view: View) {
        val kartica = findViewById<CardView>(R.id.mrkva)
        val Font_boja = findViewById<TextView>(R.id.text_mrkva)
        if (check17 == 1) {
            kartica.setCardBackgroundColor(getResources().getColor(R.color.Font));
            Font_boja.setTextColor(getResources().getColor(R.color.colorPrimaryDark))
            check17 = 0;
        } else {
            kartica.setCardBackgroundColor(getResources().getColor(R.color.colorAccent));
            Font_boja.setTextColor(getResources().getColor(R.color.Font))
            check17 = 1;
        }
        dodavanje_namirnica("Mrkva")
    }

    fun Paprika_click(view: View) {
        val kartica = findViewById<CardView>(R.id.paprika)
        val Font_boja = findViewById<TextView>(R.id.text_paprika)
        if (check18 == 1) {
            kartica.setCardBackgroundColor(getResources().getColor(R.color.Font));
            Font_boja.setTextColor(getResources().getColor(R.color.colorPrimaryDark))
            check18 = 0;
        } else {
            kartica.setCardBackgroundColor(getResources().getColor(R.color.colorAccent));
            Font_boja.setTextColor(getResources().getColor(R.color.Font))
            check18 = 1;
        }
        dodavanje_namirnica("Paprika")
    }

    fun Pivo_click(view: View) {
        val kartica = findViewById<CardView>(R.id.pivo)
        val Font_boja = findViewById<TextView>(R.id.text_pivo)
        if (check19 == 1) {
            kartica.setCardBackgroundColor(getResources().getColor(R.color.Font));
            Font_boja.setTextColor(getResources().getColor(R.color.colorPrimaryDark))
            check19 = 0;
        } else {
            kartica.setCardBackgroundColor(getResources().getColor(R.color.colorAccent));
            Font_boja.setTextColor(getResources().getColor(R.color.Font))
            check19 = 1;
        }
        dodavanje_namirnica("Pivo")
    }

    fun Rajcica_click(view: View) {
        val kartica = findViewById<CardView>(R.id.rajcica)
        val Font_boja = findViewById<TextView>(R.id.text_rajcica)
        if (check20 == 1) {
            kartica.setCardBackgroundColor(getResources().getColor(R.color.Font));
            Font_boja.setTextColor(getResources().getColor(R.color.colorPrimaryDark))
            check20 = 0;
        } else {
            kartica.setCardBackgroundColor(getResources().getColor(R.color.colorAccent));
            Font_boja.setTextColor(getResources().getColor(R.color.Font))
            check20 = 1;
        }
        dodavanje_namirnica("Rajčica")
    }

    fun Riba_click(view: View) {
        val kartica = findViewById<CardView>(R.id.riba)
        val Font_boja = findViewById<TextView>(R.id.text_riba)
        if (check21 == 1) {
            kartica.setCardBackgroundColor(getResources().getColor(R.color.Font));
            Font_boja.setTextColor(getResources().getColor(R.color.colorPrimaryDark))
            check21 = 0;
        } else {
            kartica.setCardBackgroundColor(getResources().getColor(R.color.colorAccent));
            Font_boja.setTextColor(getResources().getColor(R.color.Font))
            check21 = 1;
        }
        dodavanje_namirnica("Riba")
    }

    fun Riza_click(view: View) {
        val kartica = findViewById<CardView>(R.id.riza)
        val Font_boja = findViewById<TextView>(R.id.text_riza)
        if (check22 == 1) {
            kartica.setCardBackgroundColor(getResources().getColor(R.color.Font));
            Font_boja.setTextColor(getResources().getColor(R.color.colorPrimaryDark))
            check22 = 0;
        } else {
            kartica.setCardBackgroundColor(getResources().getColor(R.color.colorAccent));
            Font_boja.setTextColor(getResources().getColor(R.color.Font))
            check22 = 1;
        }
        dodavanje_namirnica("Riža")
    }

    fun Salata_click(view: View) {
        val kartica = findViewById<CardView>(R.id.salata)
        val Font_boja = findViewById<TextView>(R.id.text_salata)
        if (check23 == 1) {
            kartica.setCardBackgroundColor(getResources().getColor(R.color.Font));
            Font_boja.setTextColor(getResources().getColor(R.color.colorPrimaryDark))
            check23 = 0;
        } else {
            kartica.setCardBackgroundColor(getResources().getColor(R.color.colorAccent));
            Font_boja.setTextColor(getResources().getColor(R.color.Font))
            check23 = 1;
        }
        dodavanje_namirnica("Salata")
    }

    fun Senf_click(view: View) {
        val kartica = findViewById<CardView>(R.id.senf)
        val Font_boja = findViewById<TextView>(R.id.text_senf)
        if (check24 == 1) {
            kartica.setCardBackgroundColor(getResources().getColor(R.color.Font));
            Font_boja.setTextColor(getResources().getColor(R.color.colorPrimaryDark))
            check24 = 0;
        } else {
            kartica.setCardBackgroundColor(getResources().getColor(R.color.colorAccent));
            Font_boja.setTextColor(getResources().getColor(R.color.Font))
            check24 = 1;
        }
        dodavanje_namirnica("Senf")
    }

    fun Sir_click(view: View) {
        val kartica = findViewById<CardView>(R.id.sir)
        val Font_boja = findViewById<TextView>(R.id.text_sir)
        if (check25 == 1) {
            kartica.setCardBackgroundColor(getResources().getColor(R.color.Font));
            Font_boja.setTextColor(getResources().getColor(R.color.colorPrimaryDark))
            check25 = 0;
        } else {
            kartica.setCardBackgroundColor(getResources().getColor(R.color.colorAccent));
            Font_boja.setTextColor(getResources().getColor(R.color.Font))
            check25 = 1;
        }
        dodavanje_namirnica("Sir")
    }

    fun Spek_click(view: View) {
        val kartica = findViewById<CardView>(R.id.spek)
        val Font_boja = findViewById<TextView>(R.id.text_spek)
        if (check26 == 1) {
            kartica.setCardBackgroundColor(getResources().getColor(R.color.Font));
            Font_boja.setTextColor(getResources().getColor(R.color.colorPrimaryDark))
            check26 = 0;
        } else {
            kartica.setCardBackgroundColor(getResources().getColor(R.color.colorAccent));
            Font_boja.setTextColor(getResources().getColor(R.color.Font))
            check26 = 1;
        }
        dodavanje_namirnica("Slanina")
    }

    fun Svinja_click(view: View) {
        val kartica = findViewById<CardView>(R.id.svinja)
        val Font_boja = findViewById<TextView>(R.id.text_svinja)
        if (check27 == 1) {
            kartica.setCardBackgroundColor(getResources().getColor(R.color.Font));
            Font_boja.setTextColor(getResources().getColor(R.color.colorPrimaryDark))
            check27 = 0;
        } else {
            kartica.setCardBackgroundColor(getResources().getColor(R.color.colorAccent));
            Font_boja.setTextColor(getResources().getColor(R.color.Font))
            check27 = 1;
        }
        dodavanje_namirnica("Svinjetina")
    }

    fun Tjestenina_click(view: View) {
        val kartica = findViewById<CardView>(R.id.tjestenina)
        val Font_boja = findViewById<TextView>(R.id.text_tjestenina)
        if (check28 == 1) {
            kartica.setCardBackgroundColor(getResources().getColor(R.color.Font));
            Font_boja.setTextColor(getResources().getColor(R.color.colorPrimaryDark))
            check28 = 0;
        } else {
            kartica.setCardBackgroundColor(getResources().getColor(R.color.colorAccent));
            Font_boja.setTextColor(getResources().getColor(R.color.Font))
            check28 = 1;
        }
        dodavanje_namirnica("Tjestenina")
    }

    fun Ulje_click(view: View) {
        val kartica = findViewById<CardView>(R.id.ulje)
        val Font_boja = findViewById<TextView>(R.id.text_ulje)
        if (check29 == 1) {
            kartica.setCardBackgroundColor(getResources().getColor(R.color.Font));
            Font_boja.setTextColor(getResources().getColor(R.color.colorPrimaryDark))
            check29 = 0;
        } else {
            kartica.setCardBackgroundColor(getResources().getColor(R.color.colorAccent));
            Font_boja.setTextColor(getResources().getColor(R.color.Font))
            check29 = 1;
        }
        dodavanje_namirnica("Ulje")
    }

    fun Vino_click(view: View) {
        val kartica = findViewById<CardView>(R.id.vino)
        val Font_boja = findViewById<TextView>(R.id.text_vino)
        if (check30 == 1) {
            kartica.setCardBackgroundColor(getResources().getColor(R.color.Font));
            Font_boja.setTextColor(getResources().getColor(R.color.colorPrimaryDark))
            check30 = 0;
        } else {
            kartica.setCardBackgroundColor(getResources().getColor(R.color.colorAccent));
            Font_boja.setTextColor(getResources().getColor(R.color.Font))
            check30 = 1;
        }
        dodavanje_namirnica("Vino")
    }

    fun Vrhnje_click(view: View) {
        val kartica = findViewById<CardView>(R.id.vrhnje)
        val Font_boja = findViewById<TextView>(R.id.text_vrhnje)
        if (check31 == 1) {
            kartica.setCardBackgroundColor(getResources().getColor(R.color.Font));
            Font_boja.setTextColor(getResources().getColor(R.color.colorPrimaryDark))
            check31 = 0;
        } else {
            kartica.setCardBackgroundColor(getResources().getColor(R.color.colorAccent));
            Font_boja.setTextColor(getResources().getColor(R.color.Font))
            check31 = 1;
        }
        dodavanje_namirnica("Vrhnje")
    }
}