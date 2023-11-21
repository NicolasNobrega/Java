package com.example.menufitmobile.card;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.menufitmobile.R;
import com.example.menufitmobile.bd.DBHelper;
import com.example.menufitmobile.modal.CardItem;

import java.io.Serializable;

// AddCardActivity.java
public class AddCardActivity extends AppCompatActivity {
    private EditText editTextName;
    private EditText editTextDescription;
    private EditText editTextCalories;
    private EditText editTextImageUrl;
    private DBHelper dbHelper;

    private OnCardAddedListener onCardAddedListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_card);

        editTextName = findViewById(R.id.editTextName);
        editTextDescription = findViewById(R.id.editTextDescription);
        editTextCalories = findViewById(R.id.editTextCalories);
        editTextImageUrl = findViewById(R.id.editTextImageUrl);
        dbHelper = new DBHelper(this);

        Button btnSave = findViewById(R.id.btnSave);
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addCard();
            }
        });
    }
    public interface OnCardAddedListener {
        void onCardAdded();
    }

    public void setOnCardAddedListener(OnCardAddedListener listener) {
        this.onCardAddedListener = listener;
    }

    private void addCard() {
        // Obter os valores dos campos
        String name = editTextName.getText().toString().trim();
        String description = editTextDescription.getText().toString().trim();
        int calories = Integer.parseInt(editTextCalories.getText().toString().trim());
        String imageUrl = editTextImageUrl.getText().toString().trim();

        // Validar se os campos obrigatórios estão preenchidos
        if (TextUtils.isEmpty(name) || TextUtils.isEmpty(description) || TextUtils.isEmpty(imageUrl)) {
            Toast.makeText(this, "Preencha todos os campos obrigatórios", Toast.LENGTH_SHORT).show();
            return;
        }
        // Obter uma instância gravável do banco de dados
        SQLiteDatabase db = dbHelper.getWritableDatabase();

        // Criar um ContentValues para armazenar os valores a serem inseridos
        ContentValues values = new ContentValues();
        values.put(DBHelper.COLUMN_NAME, name);
        values.put(DBHelper.COLUMN_DESCRIPTION, description);
        values.put(DBHelper.COLUMN_CALORIES, calories);
        values.put(DBHelper.COLUMN_IMAGE_URL, imageUrl);

        // Criar um novo objeto CardItem
        CardItem newCard = new CardItem(name, description, calories, imageUrl);

        // Adicionar o novo card no banco de dados
        long newRowId = dbHelper.addCard(newCard);

        // Verificar se a inserção foi bem-sucedida
        if (newRowId != -1) {
            Toast.makeText(this, "Card adicionado com sucesso", Toast.LENGTH_SHORT).show();
            if (onCardAddedListener != null) {
                onCardAddedListener.onCardAdded();
            }

            // Notificar a atividade principal sobre a adição de um card
            notifyMainActivity();

            // Fechar o banco de dados
            db.close();


            // Após salvar no banco de dados, você pode encerrar a atividade
            finish();
        }else {
            Toast.makeText(this, "Erro ao adicionar card", Toast.LENGTH_SHORT).show();
        }
    }
    private void notifyMainActivity() {
        // Obter o listener da Intent e notificar a MainActivity se ele existir
        Serializable listener = getIntent().getSerializableExtra("listener");
        if (listener != null && listener instanceof AddCardActivity.OnCardAddedListener) {
            AddCardActivity.OnCardAddedListener onCardAddedListener = (AddCardActivity.OnCardAddedListener) listener;
            onCardAddedListener.onCardAdded();
        }
    }
}
