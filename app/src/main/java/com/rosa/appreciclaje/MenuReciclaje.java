package com.rosa.appreciclaje;

import static android.view.MenuInflater.*;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MenuReciclaje extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_reciclaje);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_reciclaya, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected( MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.item_1) {
            Toast.makeText(this, "metodo1", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.item_2) {
            Toast.makeText(this, "metodo2", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.item_3) {
            Toast.makeText(this, "metodo3", Toast.LENGTH_SHORT).show();

        }
        return super.onOptionsItemSelected(item);
    }
}