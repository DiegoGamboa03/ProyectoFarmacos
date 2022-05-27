package com.example.pharmacy

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface PacientesDao {

    @Query("SELECT * from pacientes")
    fun getAll(): LiveData<List<Pacientes>>

    @Query("SELECT * from pacientes WHERE cedula = :ced And password = :pwd")
    fun get(ced: Int, pwd: String): LiveData<Pacientes>

    @Insert
    fun insertAll(vararg pacientes: Pacientes)

    @Update
    fun update(pacientes: Pacientes)
}