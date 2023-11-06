package com.example.notebook.feature_note.presentation.notes

import com.example.notebook.feature_note.domain.util.NoteOrder
import com.example.notebook.feature_note.domain.util.OrderType

data class NotesState(
    val notes: List<com.example.notebook.feature_note.domain.model.Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)
