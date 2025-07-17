package com.example.examenunidad_02.basedatos

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import com.example.examenunidad_02.Usuarios

class UsuariosDB(context: Context) {

    private val dbHelper = UsuarioDbHelper(context)
    private lateinit var db: SQLiteDatabase

    fun insertar(u: Usuarios): Long {
        db = dbHelper.writableDatabase
        val valores = ContentValues().apply {
            put("nombre", u.nombre)
            put("correo", u.correo)
            put("contrasena", u.contraseña)
        }
        return db.insert("usuarios", null, valores)
    }

    fun mostrar(): List<Usuarios> {
        db = dbHelper.readableDatabase
        val lista = mutableListOf<Usuarios>()
        val cursor = db.rawQuery("SELECT * FROM usuarios", null)
        if (cursor.moveToFirst()) {
            do {
                val id = cursor.getInt(0)
                val nombre = cursor.getString(1)
                val correo = cursor.getString(2)
                val contrasena = cursor.getString(3)
                lista.add(Usuarios(id, nombre, correo, contrasena))
            } while (cursor.moveToNext())
        }
        cursor.close()
        return lista
    }
}
