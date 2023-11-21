package com.example.menufitandroid;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;
import java.util.List;

public class ListarComidas extends AppCompatActivity {

    private ListView listView;

    private FoodDao dao;

    private List<Food> foods;

    private List<Food> foodFiltrados = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_comidas);

        listView = findViewById(R.id.lista_food);
        dao = new FoodDao(this);
        foods = dao.obterTodos();
        foodFiltrados.addAll(foods);
        ArrayAdapter<Food> adaptador = new ArrayAdapter<Food>(this, android.R.layout.simple_list_item_1, foodFiltrados);
        listView.setAdapter(adaptador);

        registerForContextMenu(listView);

    }

    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_principal, menu);

        SearchView sv = (SearchView) menu.findItem(R.id.app_bar_search).getActionView();
        sv.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                procuraComida(s);
                return false;
            }
        });

        return super.onCreateOptionsMenu(menu);
    }
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo){
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater i = getMenuInflater();
        i.inflate(R.menu.menu_contexto, menu);
    }

    public void procuraComida(String nome) {
        foodFiltrados.clear();
        for (Food food : foods) {
            if (food.getNome().toLowerCase().contains(nome.toLowerCase())) {
                foodFiltrados.add(food);
            }
        }
        listView.invalidateViews();
    }
    public void excluir (MenuItem item){
        AdapterView.AdapterContextMenuInfo menuInfo =
                (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
       final Food foodExcluir = foodFiltrados.get(menuInfo.position);

        AlertDialog dialog = new AlertDialog.Builder(this)
                .setTitle("Atenção")
                .setMessage("Realmente deseja Excluir o Aluno?")
                .setNegativeButton("Não", null)
                .setPositiveButton("Sim", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        foodFiltrados.remove(foodExcluir);
                        foods.remove(foodExcluir);
                        dao.excluir(foodExcluir);
                        listView.invalidateViews();
                    }
                }).create();
        dialog.show();
    }

    public boolean cadastrar(MenuItem item) {
        Intent it = new Intent(this, MainActivity.class);
        startActivity(it);
        return true;
    }

    public void atualizar(MenuItem item){
        AdapterView.AdapterContextMenuInfo menuInfo =
                (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
        final Food foodAtualizar = foodFiltrados.get(menuInfo.position);
        Intent it = new Intent(this, MainActivity.class);
        it.putExtra("food",foodAtualizar);
        startActivity(it);
    }
    @Override
    public void onResume() {
        super.onResume();
        foods = dao.obterTodos();
        foodFiltrados.clear();
        foodFiltrados.addAll(foods);
        listView.invalidateViews();
    }

}