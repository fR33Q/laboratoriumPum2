package com.example.damian.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button przycisk_zmiana = findViewById(R.id.przycisk_zmiana);
    }

    public void click_zmiana_miejsca(View view)
    {
        TextView miasto = findViewById(R.id.miasto);
        EditText podaj_nazwe = findViewById(R.id.podaj_nazwe);
        miasto.setText(podaj_nazwe.getText().toString());

    }

}
