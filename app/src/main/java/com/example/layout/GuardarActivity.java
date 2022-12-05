package com.example.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class GuardarActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guardar);
        EditText txtNombre1 = findViewById(R.id.Tx_nombre);
        TextView textView = findViewById(R.id.txtView);

        String datos ="Email :"+ getIntent().getStringExtra("txt_email")+ "--- Direcccion:"+getIntent().getStringExtra("txt_domicilio")+getIntent().getStringExtra("cbxDeptos")+getIntent().getStringExtra("Tiempo");
        txtNombre1.setText(getIntent().getStringExtra("txt_nombre"));
        textView.setText(datos);

    }
}