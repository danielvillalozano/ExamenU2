package com.example.examenunidad_02.basedatos

import android.provider.BaseColumns

object DefineTabla {
    object Usuarios : BaseColumns {
        const val TABLE_NAME = "usuarios"
        const val COLUMN_ID = "id"
        const val COLUMN_NOMBRE = "nombre"
        const val COLUMN_CORREO = "correo"
        const val COLUMN_CONTRASENA = "contrasena"
    }

    const val SQL_CREATE_ENTRIES =
        "CREATE TABLE ${Usuarios.TABLE_NAME} (" +
                "${Usuarios.COLUMN_ID} INTEGER PRIMARY KEY AUTOINCREMENT," +
                "${Usuarios.COLUMN_NOMBRE} TEXT," +
                "${Usuarios.COLUMN_CORREO} TEXT," +
                "${Usuarios.COLUMN_CONTRASENA} TEXT)"

    const val SQL_DELETE_ENTRIES = "DROP TABLE IF EXISTS ${Usuarios.TABLE_NAME}"
}
