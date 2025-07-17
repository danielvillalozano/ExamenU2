package com.example.examenunidad_02.basedatos

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class UsuarioDbHelper(context: Context) : SQLiteOpenHelper(
    context,
    DATABASE_NAME, null,
    DATABASE_VERSION
) {

    override fun onCreate(db: SQLiteDatabase) {
        db.execSQL(DefineTabla.SQL_CREATE_ENTRIES)
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        db.execSQL(DefineTabla.SQL_DELETE_ENTRIES)
        onCreate(db)
    }

    companion object {
        const val DATABASE_NAME = "usuarios.db"
        const val DATABASE_VERSION = 1
    }
}
