package com.example.examenunidad_02

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.examenunidad_02.basedatos.UsuariosDB

class registroActivity : AppCompatActivity() {

    lateinit var nombre: EditText
    lateinit var correo: EditText
    lateinit var contrasena: EditText
    lateinit var recontrasena: EditText
    lateinit var btnRegistrar: Button
    lateinit var btnIngresar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)

        nombre = findViewById(R.id.etNombreRegistro)
        correo = findViewById(R.id.etCorreo)
        contrasena = findViewById(R.id.etContrasenaRegistro)
        recontrasena = findViewById(R.id.etRepetir)
        btnRegistrar = findViewById(R.id.btnRegistrarseRegistro)
        btnIngresar = findViewById(R.id.btnIngresarRegistro)

        btnRegistrar.setOnClickListener {
            registrar()
        }

        btnIngresar.setOnClickListener {
            regresar()
        }
    }

    fun registrar() {
        val nombreText = nombre.text.toString()
        val correoText = correo.text.toString()
        val contraText = contrasena.text.toString()
        val reContraText = recontrasena.text.toString()

        if (contraText == reContraText && nombreText.isNotEmpty() && correoText.isNotEmpty()) {
            val db = UsuariosDB(this)
            val usuario = Usuarios(0, nombreText, correoText, contraText)
            db.insertar(usuario)
            Toast.makeText(this, "Usuario registrado", Toast.LENGTH_SHORT).show()
            finish()
        } else {
            Toast.makeText(this, "Verifica los datos ingresados", Toast.LENGTH_SHORT).show()
        }
    }

    fun regresar() {
        finish()
    }
}
