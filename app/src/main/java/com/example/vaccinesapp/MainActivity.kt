package com.example.vaccinesapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //  adapter view
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(
            this,
            LinearLayoutManager.VERTICAL,
            false
        )

        //  data
        var vaccineList: ArrayList<VaccineModel> = java.util.ArrayList()
        val Vaccine1 = VaccineModel("Hepatitis B Vaccine", R.drawable.vaccine1)
        val Vaccine2 = VaccineModel("Tetanus Vaccine", R.drawable.vaccine4)
        val Vaccine3 = VaccineModel("Pneumococcal Vaccine", R.drawable.vaccine5)
        val Vaccine4 = VaccineModel("Rotavirus Vaccine", R.drawable.vaccine6)
        val Vaccine5 = VaccineModel("Measles Virus", R.drawable.vaccine7)
        val Vaccine6 = VaccineModel("Cholera  Virus", R.drawable.vaccine8)
        val Vaccine7 = VaccineModel("Covid-19 Virus", R.drawable.vaccine9)

        vaccineList.add(Vaccine1)
        vaccineList.add(Vaccine2)
        vaccineList.add(Vaccine3)
        vaccineList.add(Vaccine4)
        vaccineList.add(Vaccine5)
        vaccineList.add(Vaccine6)
        vaccineList.add(Vaccine7)

        //  adapter
        val adapter = VaccineAdapter(vaccineList)
        recyclerView.adapter = adapter

    }
}