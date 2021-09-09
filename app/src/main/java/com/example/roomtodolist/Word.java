package com.example.roomtodolist;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName="word_table")
public class Word {
    @PrimaryKey
    @NonNull
    @ColumnInfo(name="word")
    public String mword;

    public Word(@NonNull String mword) {
        this.mword = mword;
    }

    @NonNull
    public String getMword() {
        return mword;
    }
}
