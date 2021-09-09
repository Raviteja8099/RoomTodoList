package com.example.roomtodolist;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class WordViewModel extends AndroidViewModel {
    private WordRepository mRepository;
    private final LiveData<List<Word>> mAllWords;
    public WordViewModel(@NonNull Application application) {
        super(application);
        this.mRepository=new WordRepository(application);
        this.mAllWords= mRepository.getwordAll();
    }

    public void insert(Word word) {
        mRepository.insert(word);
    }

    public LiveData<List<Word>> getAllWords() {
        return mRepository.getwordAll();
    }
}
