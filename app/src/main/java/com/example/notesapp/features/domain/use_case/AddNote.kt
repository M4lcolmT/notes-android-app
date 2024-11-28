package com.example.notesapp.features.domain.use_case

import com.example.notesapp.features.domain.model.InvalidNoteException
import com.example.notesapp.features.domain.model.Note
import com.example.notesapp.features.domain.respository.NoteRepository

class AddNote(
    private val repository: NoteRepository
) {

    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note) {
        if(note.title.isBlank()) {
            throw InvalidNoteException("The title of the note can't be empty!")
        }
        if(note.content.isBlank()) {
            throw InvalidNoteException("The content of the note can't be empty!")
        }
        repository.insertNote(note)
    }
}