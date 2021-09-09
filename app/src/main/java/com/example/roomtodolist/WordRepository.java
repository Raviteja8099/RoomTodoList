package com.example.roomtodolist;

import android.app.Application;

import androidx.lifecycle.LiveData;

import java.util.List;

public class WordRepository {

    private WordDao mwordDao;
    public LiveData<List<Word>> mallWords;

    public WordRepository(Application application) {
        WordRoomDataBase db=WordRoomDataBase.getDatabase(application);
        this.mwordDao = db.wordDao();
        this.mallWords = mwordDao.getAllWords();
    }

    public LiveData<List<Word>> getwordAll() {
        return mallWords;
    }
    public void insert(Word word){
        WordRoomDataBase.databaseWriteExecutor.execute(() -> {
            mwordDao.insert(word);
        });
    }
}
