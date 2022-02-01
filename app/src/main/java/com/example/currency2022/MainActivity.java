package com.example.currency2022;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editTextDollars;
    EditText editTextEuros;
    Button buttonToDollars;
    Button buttonToEuros;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextDollars = findViewById((R.id.editTextDollars));
        editTextEuros = findViewById((R.id.editTextEuros));
        buttonToDollars = findViewById((R.id.buttonToDollars));
        buttonToEuros = findViewById((R.id.buttonToEuros));

        buttonToDollars.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Double euro = Double.parseDouble(editTextEuros.getText().toString());
                Double dollars = euro / 0.9;
                editTextDollars.setText(dollars.toString());
            }
        });

        buttonToEuros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strDollars = editTextDollars.getText().toString();
                Double dollars = Double.parseDouble(strDollars);
                Double euro = dollars * 0.9;
                editTextEuros.setText(euro.toString());
            }
        });

    }
}