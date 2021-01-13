package com.example.ui;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import static java.sql.Types.NULL;

public class DataBase extends SQLiteOpenHelper {

    public static final String DBName="CompanyDetails.db";
    public static final String TABLE_NAME = "CompanyTable";
    public static final String COL1="CompanyId";
    public static final String COL2="CompanyName";
    public static final String COL3="CompanyLocation";
    public static final String COL4="CompanyFoundedIn";



    public DataBase(Context context) {
        super(context, DBName, null ,1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table "+TABLE_NAME+"(CompanyId INTERGER PRIMARY KEY AUTOINCREMENT,CompanyName text)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
