package com.example.notesapp.features.presentation.notes

import com.example.notesapp.features.domain.model.Note
import com.example.notesapp.features.domain.util.NoteOrder

sealed class NotesEvent {
    data class Order(val noteOrder: NoteOrder): NotesEvent()
    data class DeleteNote(val note: Note): NotesEvent()
    data object RestoreNote: NotesEvent()
    data object ToggleOrderSection: NotesEvent()
}