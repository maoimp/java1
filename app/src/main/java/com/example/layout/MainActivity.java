package com.example.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txt_nombre,txt_email,txt_domicilio;
    Button btn_guardar;
    Spinner cbxDeptos;
    RadioButton rbCompleto,rbMedio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_nombre = findViewById(R.id.txt_nombre);
        txt_email = findViewById(R.id.txt_email);
        txt_domicilio = findViewById(R.id.txt_domicilio);
        cbxDeptos = findViewById(R.id.cbx_depar);
        rbCompleto = findViewById(R.id.rbCompleto);
        rbMedio = findViewById(R.id.rbMedioTiempo);
        btn_guardar = findViewById(R.id.btn_guardar);

        btn_guardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txt_nombre.getText().toString().equals("") || txt_email.getText().toString().equals("")  ){
                    Toast.makeText(MainActivity.this,"Debe agregar su nombre y correo ", Toast.LENGTH_LONG).show();
                }else {
                  Intent intent = new Intent(MainActivity.this,GuardarActivity.class);
                    intent.putExtra("txt_nombre",txt_nombre.getText().toString());
                    intent.putExtra("txt_email",txt_email.getText().toString());
                    intent.putExtra("txt_domicilio",txt_domicilio.getText().toString());
                    intent.putExtra("cbxDeptos",cbxDeptos.getSelectedItem().toString());
                    String horario= "";

                    if (rbCompleto.isChecked()){
                        horario = "Tiempo completo";
                    }else{
                        horario = "Medio tiempo ";
                    }
                    intent.putExtra("Tiempo",horario);
                    startActivity(intent);
                }

            }
        });

    }
}