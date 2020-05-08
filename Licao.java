  
package com.example.agendiario;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;


@Entity(tableName = "arts")



public class WorksArt {
     private int mId;
     private String mName;
     private String mLocation;
     private int mScore;
     private String mCreationDate;
      
     public void setName(String name) {
        mName = name.toUpperCase().trim();
    

    @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name = "artId")
    private int mId;

    @Nullable
    @ColumnInfo(name = "artName")
    private String mName;

    private String mCreotionDate;

    public Museum(@Nullable String name, String location , int score, String creationDate) {
        mName = name;
        mLocation = location;
        mScore = score;
        mCreationDate = creationDate;
    }

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getLocation() {
        return mlocation;
    }

    public void setLocation(String loation) {
        mLocation = location;
    }

    public int getScore() {
        return mScore;
    }

    public void setScore(int score) {
        mScore = score;
    }

    public String getCreationDate() {
        return mCreationDate;
    }

    public void setCreationDate(String creationDate) {
        mCreationDate = creationDate;
    }

    private int mScore;
    private String mCreationDate;

}
