package com.example.menufitmobile.bd;
import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.menufitmobile.modal.CardItem;

import java.util.ArrayList;
import java.util.List;

public class DBHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "menu_db";
    private static final int DATABASE_VERSION = 1;

    // Tabela de cards
    public static final String TABLE_CARDS = "cards";
    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_DESCRIPTION = "description";
    public static final String COLUMN_CALORIES = "calories";
    public static final String COLUMN_IMAGE_URL = "image_url";

    private static final String CREATE_TABLE_CARDS =
            "CREATE TABLE " + TABLE_CARDS + "(" +
                    COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    COLUMN_NAME + " TEXT NOT NULL, " +
                    COLUMN_DESCRIPTION + " TEXT NOT NULL, " +
                    COLUMN_CALORIES + " INTEGER NOT NULL, " +
                    COLUMN_IMAGE_URL + " TEXT NOT NULL);";

    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE_CARDS);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Implemente a lógica de atualização do banco de dados aqui
    }

    // Método para inserir um novo card
    public long addCard(CardItem card) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COLUMN_NAME, card.getName());
        values.put(COLUMN_DESCRIPTION, card.getDescription());
        values.put(COLUMN_CALORIES, card.getCalories());
        values.put(COLUMN_IMAGE_URL, card.getImageURL());
        long newRowId = db.insert(TABLE_CARDS, null, values);
        db.close();
        return newRowId;
    }

    // Método para recuperar todos os cards do banco de dados
    public List<CardItem> getAllCards() {
        List<CardItem> cardList = new ArrayList<>();
        String selectQuery = "SELECT * FROM " + TABLE_CARDS;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        if (cursor.moveToFirst()) {
            do {
                @SuppressLint("Range") CardItem card = new CardItem(
                        cursor.getString(cursor.getColumnIndex(COLUMN_NAME)),
                        cursor.getString(cursor.getColumnIndex(COLUMN_DESCRIPTION)),
                        cursor.getInt(cursor.getColumnIndex(COLUMN_CALORIES)),
                        cursor.getString(cursor.getColumnIndex(COLUMN_IMAGE_URL))
                );
                cardList.add(card);
            } while (cursor.moveToNext());
        }

        cursor.close();
        db.close();
        return cardList;
    }
}
