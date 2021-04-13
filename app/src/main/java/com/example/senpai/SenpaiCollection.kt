package com.example.senpai

import android.provider.ContactsContract

class SenpaiCollection {
    fun createSenpaiCollection():List<DataSenpai>{
        val senpai=listOf<DataSenpai>(
            DataSenpai("Nanami Mami","Kanojo Okarishimasu",R.drawable.mami),
            DataSenpai("Chizuru Mizuhara", "Kanojo Okarishimasu",R.drawable.mizuhara),
            DataSenpai("Sakurasawa Sumi","Kanojo Okarishimasu",R.drawable.sumi),
            DataSenpai("Sarashina Ruka", "Kanojo Okarishimasu",R.drawable.ruka),
            DataSenpai("Zenin Maki","Jujutsu Kaisen",R.drawable.maki),
            DataSenpai("Sakurajima Mai","Fukashigi no Carte",R.drawable.mai),
            DataSenpai("Kugisaki Nobara","Jujutsu Kaisen",R.drawable.nobara),
            DataSenpai("ZeroTwo","Darling in the franxx",R.drawable.zerotwo),
            DataSenpai("Imagawa Yumiko","Kakegurui",R.drawable.yumeko),
            DataSenpai("Subakuno Temari","Naruto Shippuden",R.drawable.temari)

        )
      return senpai.shuffled()
    }
}