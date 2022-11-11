package com.example.android.notes.database.room

import androidx.lifecycle.LiveData
import com.example.android.notes.database.DatabaseRepository
import com.example.android.notes.models.AppNote

class AppRoomRepository(private val appRoomDao: AppRoomDao):DatabaseRepository {

    override val allNotes: LiveData<List<AppNote>>
        get() = appRoomDao.getAllNotes()

    override suspend fun insert(note: AppNote, onSuccess: () -> Unit) {
        appRoomDao.insert(note)
    }

    override suspend fun delete(note: AppNote, onSuccess: () -> Unit) {
        appRoomDao.delete(note)
    }
}
