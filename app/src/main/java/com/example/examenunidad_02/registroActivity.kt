package com.example.examenunidad_02

import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class registroActivity : AppCompatActivity() {

    lateinit var nombre: EditText
    lateinit var correo: EditText
    lateinit var contrasena: EditText
    lateinit var recontrasena: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)

        nombre = findViewById(R.id.etNombreRegistro)
        correo = findViewById(R.id.etCorreo)
        contrasena = findViewById(R.id.etContrasenaRegistro)
        recontrasena = findViewById(R.id.etRepetir)
    }

    fun registrar() {
        // Aquí va la lógica de registrar al usuario en la BD
    }

    fun regresar() {
        finish()
    }
}
