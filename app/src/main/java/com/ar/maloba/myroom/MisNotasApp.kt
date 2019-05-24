package com.ar.maloba.myroom

import android.app.Application
import android.arch.persistence.room.Room
import com.ar.maloba.myroom.database.TasksDatabase

class MisNotasApp: Application() {

    companion object {
        lateinit var database: TasksDatabase
    }

    override fun onCreate() {
        super.onCreate()
        MisNotasApp.database =  Room.databaseBuilder(this, TasksDatabase::class.java, "tasks-db").build()
    }
}