package com.example.pharmacy

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName= "pacientes")
class Pacientes(
    var password:String,
    val nombre1:String,
    val nombre2:String,
    val apellido1:String,
    val apellido2:String,
    val edad: Short,
    var sexo:Char,
    var provincia:String,
    var ciudad:String,
    var fechaNac:String,
    var hospital:String,
    @PrimaryKey(autoGenerate = false)
    var cedula: String
) : Serializable