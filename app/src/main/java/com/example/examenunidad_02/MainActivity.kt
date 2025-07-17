package com.example.examenunidad_02

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.examenunidad_02.basedatos.UsuariosDB

class MainActivity : AppCompatActivity() {

    lateinit var nombre: EditText
    lateinit var contrasena: EditText
    lateinit var btnIngresar: Button
    lateinit var btnRegistrarse: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nombre = findViewById(R.id.etNombre)
        contrasena = findViewById(R.id.etContrasena)
        btnIngresar = findViewById(R.id.btnIngresar)
        btnRegistrarse = findViewById(R.id.btnRegistrarse)

        btnRegistrarse.setOnClickListener {
            registrar()
        }

        btnIngresar.setOnClickListener {
            ingresar()
        }
    }

    fun registrar() {
        val intent = Intent(this, registroActivity::class.java)
        startActivity(intent)
    }

    fun ingresar() {
        val correoIngresado = nombre.text.toString()
        val passIngresada = contrasena.text.toString()
        val db = UsuariosDB(this)
        val lista = db.mostrar()
        val usuarioEncontrado = lista.any { it.correo == correoIngresado && it.contraseña == passIngresada }

        if (usuarioEncontrado) {
            val intent = Intent(this, listaActivity::class.java)
            startActivity(intent)
        } else {
            Toast.makeText(this, "Usuario o contraseña incorrectos", Toast.LENGTH_SHORT).show()
        }
    }

    fun cerrar() {
        finish()
    }
}
