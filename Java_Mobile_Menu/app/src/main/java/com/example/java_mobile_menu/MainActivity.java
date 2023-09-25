package com.example.java_mobile_menu;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_aplicacao, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.item_abrir) {
            new AlertDialog.Builder(MainActivity.this)
                .setTitle("Selecionou o Abrir")
                .show();
        } else if (item.getItemId() == R.id.item_novo) {
            new AlertDialog.Builder(MainActivity.this)
                    .setTitle("Selecionou o Novo")
                    .show();
        }else if (item.getItemId() == R.id.item_salvar) {
            new AlertDialog.Builder(MainActivity.this)
                    .setTitle("Selecionou o Salvar")
                    .show();
        }
        return super.onOptionsItemSelected(item);
    }
}
