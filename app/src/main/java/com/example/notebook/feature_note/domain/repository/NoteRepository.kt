package com.example.notebook.feature_note.domain.repository

import android.provider.ContactsContract
import com.example.notebook.feature_note.domain.model.Note
import kotlinx.coroutines.flow.Flow

interface NoteRepository {

    fun getNotes() : Flow<List<Note>>

    suspend fun getNoteById(id: Int): Note?

    suspend fun insertNote(note: Note)

    suspend fun  deleteNote(note: ContactsContract.CommonDataKinds.Note)
}