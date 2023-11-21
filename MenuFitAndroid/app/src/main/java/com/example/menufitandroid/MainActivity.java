package com.example.menufitandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private EditText nome;
    private EditText descricao;
    private EditText calorias;

    private FoodDao dao;
    private Food food = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nome = findViewById(R.id.editTextNome);
        descricao = findViewById(R.id.editDescricao);
        calorias = findViewById(R.id.editCalorias);
        dao = new FoodDao(this);

        Intent it = getIntent();
        if (it.hasExtra("food")) {
            food = (Food) it.getSerializableExtra("food");
            nome.setText(food.getNome());
            descricao.setText(food.getDescricao());
            calorias.setText(food.getCalorias());

        }
    }

    public void salvar(View view) {

        if (food == null) {

            Food food = new Food();
            food.setNome(nome.getText().toString());
            food.setDescricao(descricao.getText().toString());
            food.setCalorias(Integer.valueOf(calorias.getText().toString()));
            long id = dao.inserir(food);

            Toast.makeText(this, "Comida Cadastrada ! ", Toast.LENGTH_SHORT).show();
        }else{
            food.setNome(nome.getText().toString());
            food.setDescricao(descricao.getText().toString());
            food.setCalorias(Integer.valueOf(calorias.getText().toString()));
            dao.atualizar(food);
        }
    }


}