package com.example.a64929.mynote;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

public class MyDatabaseHelper extends SQLiteOpenHelper {

    public static String CREATE_BOOK;

    private Context myContent;

    public MyDatabaseHelper(Context context, String name,String table, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
        myContent=context;
        CREATE_BOOK="CREATE TABLE "+table
                + " ( id  integer PRIMARY KEY Autoincrement ,"
                + "title text ,"
                + "time integer ,"
                + "context text )";
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(CREATE_BOOK);

        Toast.makeText(myContent, R.string.database_finish, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
