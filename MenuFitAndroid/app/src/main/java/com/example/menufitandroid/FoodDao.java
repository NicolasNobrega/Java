package com.example.menufitandroid;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

public class FoodDao {
    private Conexao conexao;
    private SQLiteDatabase banco;

    public FoodDao(Context context) {
        conexao = new Conexao(context);
        banco = conexao.getWritableDatabase();

    }

    public Long inserir(Food food) {
        ContentValues values = new ContentValues();
        values.put("nome", food.getNome());
        values.put("descricao", food.getDescricao());
        values.put("calorias", food.getCalorias());
        return banco.insert("food", null, values);
    }

    public List<Food> obterTodos() {
        List<Food> foods = new ArrayList<>();
        Cursor cursor = banco.query("food", new String[]{"id", "nome", "descricao", "calorias"},
                null, null, null, null, null);

        while (cursor.moveToNext()) {
            Food food = new Food();
            food.setId(cursor.getInt(0));
            food.setNome(cursor.getString(1));
            food.setDescricao(cursor.getString(2));
            food.setCalorias(cursor.getInt(3));

            foods.add(food);
        }
        return foods;
    }

    public void excluir(Food food) {
        banco.delete("food", "id = ?", new String[]{food.getId().toString()});
    }

    public void atualizar(Food food) {
        ContentValues values = new ContentValues();
        values.put("nome", food.getNome());
        values.put("descricao", food.getDescricao());
        values.put("calorias", food.getCalorias());
        banco.update("food", values, "id = ?", new String[]{food.getId().toString()});
    }

}
