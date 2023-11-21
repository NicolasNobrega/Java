package com.example.menufitandroid;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Conexao extends SQLiteOpenHelper {
    private static final String name = "banco.db";
    private static final int versiom = 1;
    public Conexao (Context context) {
        super(context, name, null, versiom);
    }
    @Override
    public void onCreate(SQLiteDatabase db){
        db.execSQL("create table food(id integer primary key autoincrement," +
                "nome varchar(50), descricao varchar(250), calorias long)");

    }
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1){

    }
}
