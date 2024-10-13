package com.example.praktik910

import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    var nomorNow = 0;
    lateinit var tampilNomor: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        tampilNomor = findViewById<TextView>(R.id.nomor)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    fun bTam1(view: View) {
        nomorNow += 1
        tampilNomor.setText(nomorNow.toString())
    }
    fun bTam2(view: View) {
        nomorNow += 2
        tampilNomor.setText(nomorNow.toString())
    }
    fun bTam5(view: View) {
        nomorNow += 5
        tampilNomor.setText(nomorNow.toString())
    }


    fun bKur1(view: View) {
        if(nomorNow<=1){
            Toast.makeText(applicationContext,"Angka kurang dari sama dengan 1", Toast.LENGTH_LONG).show()
        }
        else{
            nomorNow-=1
            tampilNomor.setText(nomorNow.toString())
        }
    }
    fun bKur2(view: View) {
        if(nomorNow<=2){
            Toast.makeText(applicationContext,"Angka kurang dari sama dengan 2", Toast.LENGTH_LONG).show()
        }
        else{
            nomorNow-=2
            tampilNomor.setText(nomorNow.toString())
        }

    }
    fun bKur5(view: View) {
        if(nomorNow<=5){
            Toast.makeText(applicationContext,"Angka kurang dari sama dengan 5", Toast.LENGTH_LONG).show()
        }
        else{
            nomorNow-=5
            tampilNomor.setText(nomorNow.toString())
        }
    }
    fun bReset(view: View) {
        nomorNow = 0
        tampilNomor.setText(nomorNow.toString())
        Toast.makeText(applicationContext,"reset", Toast.LENGTH_SHORT).show()
    }


}