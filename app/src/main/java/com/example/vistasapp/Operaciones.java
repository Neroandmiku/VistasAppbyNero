package com.example.vistasapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Operaciones extends AppCompatActivity {

    EditText etNro1, etNro2, etResultado;
    Button btnSumar, btnFactorial, btnDiv, btnPotencia, btnSeno, btnTangente, btnSalir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operaciones);

        // Escuchar los controles de la vista
        etNro1 = (EditText)findViewById(R.id.etNro1);
        etNro2 = (EditText)findViewById(R.id.etNro2);
        etResultado = (EditText)findViewById(R.id.etResultado);

        btnSumar = (Button)findViewById(R.id.btnSumar);
        btnDiv = (Button)findViewById(R.id.btnDiv);
        btnPotencia = (Button)findViewById(R.id.btnPotencia);
        btnFactorial = (Button)findViewById(R.id.btnFactorial);
        btnSeno = (Button)findViewById(R.id.btnSeno);
        btnTangente = (Button)findViewById(R.id.btnTangente);
        btnSalir = (Button)findViewById(R.id.btnSalir);

        // Proceso de evento
        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { Sumar(); }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { Dividir(); }
        });

        btnPotencia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { Potencia(); }
        });

        btnFactorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { Factorial(); }
        });

        btnSeno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { Seno(); }
        });

        btnTangente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { Tangente(); }
        });

        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void Sumar() {
        double nro = Double.valueOf(etNro1.getText().toString());
        double nro2 = Double.valueOf(etNro2.getText().toString());
        double suma = nro + nro2;
        etResultado.setText(String.valueOf(suma));
    }

    private void Dividir() {
        double nro = Double.valueOf(etNro1.getText().toString());
        double nro2 = Double.valueOf(etNro2.getText().toString());
        if (nro2 == 0){
            etResultado.setText("Error: Division entre 0");
        }else{
            double Division = nro / nro2;
            etResultado.setText(String.valueOf(Division));
        }
    }

    private void Tangente() {
        double nro = Double.valueOf(etNro1.getText().toString());
        double grados = Math.toRadians(nro);
        double tangente = Math.tan(grados);
        etResultado.setText(String.valueOf(tangente));
    }

    private void Seno() {
        double nro = Double.valueOf(etNro1.getText().toString());
        double grados = Math.toRadians(nro);
        double seno = Math.sin(grados);
        etResultado.setText(String.valueOf(seno));
    }

    private void Potencia() {
        double nro = Double.valueOf(etNro1.getText().toString());
        double nro2 = Double.valueOf(etNro2.getText().toString());
        double Pot = Math.pow(nro, nro2);
        etResultado.setText(String.valueOf(Pot));
    }

    private void Factorial() {
        double nro = Double.valueOf(etNro1.getText().toString());
        double factorial = 1;
        while (nro != 0){
            factorial = factorial * nro;
            nro--;
        }
        etResultado.setText(String.valueOf(factorial));
    }

}