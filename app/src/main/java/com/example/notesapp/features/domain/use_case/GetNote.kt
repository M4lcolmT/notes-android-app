package com.example.notesapp.features.domain.use_case

import com.example.notesapp.features.domain.model.Note
import com.example.notesapp.features.domain.respository.NoteRepository

class GetNote (
    private val repository: NoteRepository
) {

    suspend operator fun invoke(id: Int): Note? {
        return repository.getNoteById(id)
    }
}