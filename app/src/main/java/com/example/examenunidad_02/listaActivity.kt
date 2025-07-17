package com.example.examenunidad_02

import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class listaActivity : AppCompatActivity() {

    lateinit var lst: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista)

        lst = findViewById(R.id.lvUsuarios)
    }

    fun regresar() {
        finish()
    }
}
