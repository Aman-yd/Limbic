package com.example.ui;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import static java.sql.Types.NULL;

public class DataBase extends SQLiteOpenHelper {

    public static final String DBName="CompanyDetails.db";
    public static final String CompanyId="Limtec";
    public static final String CompanyName="Limbic Technologies";
    public static final String CompanyLocation="Bhopal";
    public static final String CompanyFoundedIn="Jan 2019";
    public static final String CompanyFounder="Abhi";
    public static final String CompanyCoFounder="Archee";



    public DataBase(Context context) {
        super(context, DBName, null ,1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
