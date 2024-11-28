package com.example.notesapp.features.domain.use_case

import com.example.notesapp.features.domain.model.Note
import com.example.notesapp.features.domain.respository.NoteRepository

class DeleteNote(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(note: Note) {
        repository.deleteNote(note)
    }
}