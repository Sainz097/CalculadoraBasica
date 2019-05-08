package com.example.sainz.calculadorabasica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    String valor1;
    String valor2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText txtValor1 = (EditText) findViewById(R.id.txtValor1);
        final EditText txtValor2 = (EditText) findViewById(R.id.txtValor2);

        final TextView txtResultado = (TextView) findViewById(R.id.txtResultado);

        final Button btnSumar = (Button) findViewById(R.id.btnSumar);
        final Button btnRestar = (Button) findViewById(R.id.btnRestar);
        final Button btnMultiplicar = (Button) findViewById(R.id.btnMultiplicar);
        final Button btnDivision = (Button) findViewById(R.id.btnDivision);
        final Button btnPotencia = (Button) findViewById(R.id.btnPotencia);
        final Button btnPorcentaje=(Button) findViewById(R.id.btnPorcentaje);
        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                valor1 = String.valueOf(txtValor1.getText());
                int a = Integer.parseInt(valor1);

                valor2 = String.valueOf(txtValor2.getText());
                int b = Integer.parseInt(valor2);

                int resultado = a + b;

                txtResultado.setText(Integer.toString(resultado));
                /*txtValor1.setText("");
                txtValor2.setText("");
                */
            }
        });
        btnRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View b) {
                valor1 = String.valueOf(txtValor1.getText());
                int v1 = Integer.parseInt(valor1);
                valor2 = String.valueOf(txtValor2.getText());
                int v2 = Integer.parseInt(valor2);
                int resul = v1 - v2;
                txtResultado.setText(Integer.toString(resul));
            }
        });

        btnMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View a) {
                valor1 = String.valueOf(txtValor1.getText());
                int v1 = Integer.parseInt(valor1);
                valor2 = String.valueOf(txtValor2.getText());
                int v2 = Integer.parseInt(valor2);
                int resul = v1 * v2;
                txtResultado.setText(Integer.toString(resul));
            }
        });
        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View c) {
                valor1 = String.valueOf(txtValor1.getText());
                int v1 = Integer.parseInt(valor1);
                valor2 = String.valueOf(txtValor2.getText());
                int v2 = Integer.parseInt(valor2);
                int resul = v1 / v2;
                txtResultado.setText(Integer.toString(resul));
            }
        });
        btnPotencia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valor1 = String.valueOf(txtValor1.getText());
                int v1 = Integer.parseInt(valor1);
                valor2 = String.valueOf(txtValor2.getText());
                int v2 = Integer.parseInt(valor2);
                /*int resul=0;
                while(v2>0){
                    resul=v1*v1;
                    v2--;
                }*/
                int resul=(int) Math.pow(v1,v2);
                txtResultado.setText(Integer.toString(resul));
            }
        });
        btnPorcentaje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View c) {
                valor1 = String.valueOf(txtValor1.getText());
                int v1 = Integer.parseInt(valor1);
                valor2 = String.valueOf(txtValor2.getText());
                int v2 = Integer.parseInt(valor2);
                int resul=(v1*v2)/100;
                txtResultado.setText(Integer.toString(resul));
            }
        });

    }
}