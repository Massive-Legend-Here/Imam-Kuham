package com.example.imamkuham

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_koraci_recept2.*

class Koraci_recept2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_koraci_recept2)

        val text = listOf(
            R.string.recept2_korak_1,
            R.string.recept2_korak_2,
            R.string.recept2_korak_3

        )

        val adapter = ViewPagerAdapter(text)
        viewPager.adapter = adapter

        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            tab.text = "Korak ${position + 1}"
        }.attach()

    }
}
