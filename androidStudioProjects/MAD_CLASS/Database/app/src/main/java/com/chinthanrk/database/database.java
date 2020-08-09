package com.chinthanrk.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class database extends SQLiteOpenHelper {


    public static String dbName = "studentDB";

    public database( Context context) {
        super(context,dbName,null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
     db.execSQL("create table student( name,usn primary key , phone)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
