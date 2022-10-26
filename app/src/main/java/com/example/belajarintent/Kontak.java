package com.example.belajarintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Kontak extends AppCompatActivity {
    public static String PENERIMA = "NAMA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kontak);
    }

    public void pageRubick(View view) {
        Intent page1 = new Intent(this, MainActivity.class);
        page1.putExtra(PENERIMA, "Rubick");
        startActivity(page1);
    }

    public void pageJuggernaut(View v) {
        Intent page1 = new Intent(this, MainActivity.class);
        page1.putExtra(PENERIMA, "Juggernaut");
        startActivity(page1);
    }

    public void pageShadowFiend(View v) {
        Intent page1 = new Intent(this, MainActivity.class);
        page1.putExtra(PENERIMA, "Shadow Fiend");
        startActivity(page1);
    }


}