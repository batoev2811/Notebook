package com.example.notebook.feature_note.presentation.notes

import android.provider.ContactsContract.CommonDataKinds.Note
import com.example.notebook.feature_note.domain.util.NoteOrder

sealed class NotesEvent {
    data class Order(val noteOrder: NoteOrder): NotesEvent()
    data class DeleteNote(val note: Note): NotesEvent()
    object RestoreNote: NotesEvent()
    object ToggleOrderSection: NotesEvent()
}
