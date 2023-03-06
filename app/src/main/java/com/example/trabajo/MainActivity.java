package com.example.trabajo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btn_igual, btn_limpiar, btncero, btnuno, btndos, btntres, btncuatro, btncinco, btnseis, btnsiete, btnocho, btnnueve, btn_suma, btn_resta, btn_multiplicacion, btn_division;
    private EditText etuno, etdos;
    double num1, num2, resultado;
    String operador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        etuno= findViewById(R.id.etuno);
        btncero= findViewById(R.id.btncero);
        btnuno= findViewById(R.id.btnuno);
        btndos= findViewById(R.id.btndos);
        btntres= findViewById(R.id.btntres);
        btncuatro= findViewById(R.id.btncuatro);
        btncinco= findViewById(R.id.btncinco);
        btnseis= findViewById(R.id.btnseis);
        btnsiete= findViewById(R.id.btnsiete);
        btnocho= findViewById(R.id.btnocho);
        btnnueve= findViewById(R.id.btnnueve);
        btn_suma= findViewById(R.id.btn_suma);
        btn_resta= findViewById(R.id.btn_resta);
        btn_multiplicacion= findViewById(R.id.btn_multplicacion);
        btn_division= findViewById(R.id.btn_division);
        btn_igual=findViewById(R.id.btn_igual);
        btn_limpiar=findViewById(R.id.btn_limpiar);

        btncero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etdos = findViewById(R.id.etuno);
                etuno.setText(etdos.getText().toString() + "0");
            }
        });
        btnuno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etdos = findViewById(R.id.etuno);
                etuno.setText(etdos.getText().toString() + "1");

            }
        });
        btndos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etdos = findViewById(R.id.etuno);
                etuno.setText(etdos.getText().toString() + "2");
            }
        });
        btntres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etdos = findViewById(R.id.etuno);
                etuno.setText(etdos.getText().toString() + "3");
            }
        });
        btncuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etdos = findViewById(R.id.etuno);
                etuno.setText(etdos.getText().toString() + "4");
            }
        });
        btncinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etdos = findViewById(R.id.etuno);
                etuno.setText(etdos.getText().toString() + "5");
            }
        });
        btnseis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etdos = findViewById(R.id.etuno);
                etuno.setText(etdos.getText().toString() + "6");
            }
        });
        btnsiete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etdos = findViewById(R.id.etuno);
                etuno.setText(etdos.getText().toString() + "7");
            }
        });
        btnocho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etdos = findViewById(R.id.etuno);
                etuno.setText(etdos.getText().toString() + "8");
            }
        });
        btnnueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etdos = findViewById(R.id.etuno);
                etuno.setText(etdos.getText().toString() + "9");
            }
        });

        btn_igual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etdos = findViewById(R.id.etuno);
                num2 = Double.parseDouble(etdos.getText().toString());
                if(operador.equals("+")){
                    etuno.setText("");
                    resultado = num1 + num2;
                }
                if(operador.equals("-")){
                    etuno.setText("");
                    resultado = num1 - num2;
                }
                if(operador.equals("*")){
                    etuno.setText("");
                    resultado = num1 * num2;
                }
                if(operador.equals("/")){
                    etuno.setText("");
                    if(num2 != 0){
                        resultado = num1 / num2;
                    }else {
                        etuno.setText("Infinito");
                    }
                }
                etuno.setText(String.valueOf(resultado));
            }
        });
        btn_suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operador = "+";
                num1 = Double.parseDouble(etdos.getText().toString());
                etuno.setText("");
            }
        });
        btn_resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operador = "-";
                etdos = findViewById(R.id.etuno);
                num1 = Double.parseDouble(etdos.getText().toString());
                etuno.setText("");
            }
        });
        btn_multiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operador = "*";
                etdos = findViewById(R.id.etuno);
                num1 = Double.parseDouble(etdos.getText().toString());
                etuno.setText("");
            }
        });
        btn_division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operador = "/";
                etdos = findViewById(R.id.etuno);
                num1 = Double.parseDouble(etdos.getText().toString());
                etuno.setText("");
            }
        });
        btn_limpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = 0;
                num2 = 0;
                etuno.setText("");
            }
        });
    }
}