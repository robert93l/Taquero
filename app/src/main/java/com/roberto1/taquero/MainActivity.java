package com.roberto1.taquero;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private EditText Cliente, PrecioTacos, NumeroTacos;
    private TextView Total;
    private ImageButton Mas, Menos;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PrecioTacos = findViewById(R.id.etxtPrecioTacos);
        NumeroTacos = findViewById(R.id.tvNumeroTacos);
        Total = findViewById(R.id.tvTotal);
        }

    public void total()
            {
        try {
            Integer respuestaNumero = Integer.parseInt(PrecioTacos.getText().toString()) *  Integer.parseInt(NumeroTacos.getText().toString());
            Total.setText("$ "+respuestaNumero + "");

        }catch(Exception e){
            Toast.makeText(this, "Numeros no validos. Escribe dos numeros.",Toast.LENGTH_SHORT).show();
        }}

        public void menos(View view)
        {
        int numero = Integer.parseInt(NumeroTacos.getText().toString());
        if(numero>1){
            numero = numero - 1;
        }
        NumeroTacos.setText(String.valueOf(numero));
        total();
        }

        public void mas(View view)
        {
        int numero = Integer.parseInt(NumeroTacos.getText().toString());
        numero= numero + 1;
        NumeroTacos.setText(String.valueOf(numero));
        total();
        }

        public void igual(View view){
        total();
        }



}