package com.example.notesapp.features.presentation.notes

import com.example.notesapp.features.domain.model.Note
import com.example.notesapp.features.domain.util.NoteOrder
import com.example.notesapp.features.domain.util.OrderType

data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)
