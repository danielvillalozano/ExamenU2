package com.example.examenunidad_02

import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var nombre: EditText
    lateinit var contrasena: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nombre = findViewById(R.id.etNombre)
        contrasena = findViewById(R.id.etContrasena)
    }

    fun registrar() {
        // Aquí se colocará la lógica para ir a RegistroActivity
    }

    fun ingresar() {
        // Aquí se colocará la lógica para acceder a la lista de usuarios
    }

    fun cerrar() {
        finish()
    }
}
