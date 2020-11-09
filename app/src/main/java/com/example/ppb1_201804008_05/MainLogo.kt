package com.example.ppb1_201804008_05

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainLogo : AppCompatActivity() {
    private lateinit var rvSekolah: RecyclerView
    private var list:ArrayList<Sekolah> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        rvSekolah = findViewById(R.id.rv_sekolah)
        rvSekolah.setHasFixedSize(true)
        list.addAll(DataSekolah.listData)
        showRecyclerViewListMode()

    }
    private fun showRecyclerViewListMode()
    {
        rvSekolah.layoutManager = LinearLayoutManager(this)
        val listSekolahAdapter = ListSekolahAdapter(list)
        rvSekolah.adapter = listSekolahAdapter
    }
}