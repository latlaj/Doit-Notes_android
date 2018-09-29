package com.example.a64929.mynote;

import android.app.Application;

public class Data extends Application{
    @Override
    public void onCreate() {
        dbHelper=new MyDatabaseHelper(this,database_name,table,null,1);
        super.onCreate();
    }
    private  String database_name="Notes.db";

    private String table="notes";

    public String getTable() {
        return table;
    }

    private MyDatabaseHelper dbHelper;

    public MyDatabaseHelper getDbHelper() {
        return dbHelper;
    }
}
