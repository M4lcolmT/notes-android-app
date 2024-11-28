package com.example.notesapp.features.data.data_source

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.notesapp.features.domain.model.Note

@Database(
    entities = [Note::class],
    version = 1,
    exportSchema = false
)

abstract class NoteDatabase: RoomDatabase() {

    abstract val noteDao: NoteDao

    companion object {
        const val DATABASE_NAME = "notes_db"
    }
}