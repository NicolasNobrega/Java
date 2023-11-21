package com.example.menufitmobile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.menufitmobile.bd.DBHelper;
import com.example.menufitmobile.card.AddCardActivity;
import com.example.menufitmobile.card.CardAdapter;
import com.example.menufitmobile.modal.CardItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<CardItem> cardList;
    private CardAdapter cardAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        cardList = new ArrayList<>();
        cardAdapter = new CardAdapter(cardList, this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(cardAdapter);

        ImageButton btnAdd = findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Abrir a atividade de adição
                Intent intent = new Intent(MainActivity.this, AddCardActivity.class);
                intent.putExtra("listener", new AddCardActivity.OnCardAddedListener() {
                    @Override
                    public void onCardAdded() {
                        // Atualizar a RecyclerView após adicionar um card
                        loadCardsFromDatabase(); // Método fictício, substitua pelo método real
                    }
                }.toString());
                startActivity(intent);
            }
        });

        // Carregar cards inicialmente
        loadCardsFromDatabase();
    }    @Override
    protected void onResume() {
        super.onResume();
        // Atualizar a RecyclerView quando a MainActivity é retomada (após a adição de um card)
        loadCardsFromDatabase();
    }

    private void loadCardsFromDatabase() {
        // Limpar a lista existente
        cardList.clear();

        // Carregar cards do banco de dados
        DBHelper dbHelper = new DBHelper(this);
        List<CardItem> newCardList = dbHelper.getAllCards();

        // Adicionar os novos cards à lista
        cardList.addAll(newCardList);

        // Notificar o adapter sobre a mudança nos dados
        cardAdapter.notifyDataSetChanged();
    }
}