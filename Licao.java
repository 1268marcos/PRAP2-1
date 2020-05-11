  
package com.example.agendiario;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;


@Entity(tableName = "arts")



public class WorksArt {
  
    @PrimaryKey(autoGenerate = true) 
     @NonNul
    @ColumnInfo(name = "artId")
    private int mId;

    @Nullable 
    @ColumnInfo(name = "artName")
    private String mName;
       
    @NonNull 
    @ColumnInfo(name= "Location")
    private String mLocation;
       
    @NonNull
    @ColumnInfo(name = "CreationDate")
    private String mCreotionDate;

    public Museum(@Nullable String name, String location , int score, String creationDate) {
        this.mName = name;
        this.mLocation = location;
        this.mScore = score;
        this.mCreationDate = creationDate;
    }

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        this.mId = id;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        this.mName = name;
    }

    public String getLocation() {
        return mlocation;
    }

    public void setLocation(String loation) {
        this.mLocation = location;
    }

    public int getScore() {
        return mScore;
    }

    public void setScore(int score) {
       this.mScore = score;
    }

    public String getCreationDate() {
        return mCreationDate;
    }

    public void setCreationDate(String creationDate) {
       this.mCreationDate = creationDate;
    }

}
