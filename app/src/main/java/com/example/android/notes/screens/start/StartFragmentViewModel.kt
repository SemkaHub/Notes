package com.example.android.notes.screens.start

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.android.notes.database.room.AppRoomDatabase
import com.example.android.notes.database.room.AppRoomRepository
import com.example.android.notes.utilits.REPOSITORY
import com.example.android.notes.utilits.TYPE_ROOM

class StartFragmentViewModel(application: Application) : AndroidViewModel(application) {

    private val mContext = application

    fun initDatabase(type: String, onSuccess: () -> Unit) {
        when (type) {
            TYPE_ROOM -> {
                val dao = AppRoomDatabase.getInstance(mContext).getAppRoomDao()
                REPOSITORY = AppRoomRepository(dao)
                onSuccess()
            }
        }
    }

}
