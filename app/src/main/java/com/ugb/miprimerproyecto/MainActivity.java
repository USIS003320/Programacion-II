package com.ugb.miprimerproyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void calcular(View view){
        TextView tempVa1 = (TextView)findViewById(R.id.txtnum1);
        double num1 = Double.parseDouble(tempVa1.getText().toString());

        tempVa1 = (TextView)findViewById(R.id.txtnum2);
        double num2 = Double.parseDouble(tempVa1.getText().toString());

        double respuesta = 1;
        RadioButton optOperaciones = findViewById(R.id.optSuma);
        if( optOperaciones.isChecked() ) {
            respuesta = num1 + num2;
        }
        optOperaciones = findViewById(R.id.optResta);
        if( optOperaciones.isChecked() ) {
            respuesta = num1 - num2;
        }
        optOperaciones = findViewById(R.id.optMultiplicacion);
        if( optOperaciones.isChecked() ) {
            respuesta = num1 * num2;
        }
        optOperaciones = findViewById(R.id.optDivision);
        if( optOperaciones.isChecked() ) {
            respuesta = num1 / num2;
        }
        optOperaciones = findViewById(R.id.optFactorial);
        if( optOperaciones.isChecked() ) {
            for(int i=2; i<=num1; i++){
                respuesta *=i;

            }

        }
        optOperaciones = findViewById(R.id.optExponenciacion);
        if(optOperaciones.isChecked()){
            respuesta=Math.pow(num1,num2);
        }
        optOperaciones = findViewById(R.id.optRaizCuadrada);
        if(optOperaciones.isChecked()){
            respuesta = Math.sqrt(num1);
        }
        optOperaciones = findViewById(R.id.optRaiz3);
        if(optOperaciones.isChecked() ){
            respuesta=Math.cbrt(num1);
        }
        optOperaciones = findViewById(R.id.optRaizn);
        if(optOperaciones.isChecked() ){
            respuesta = Math.pow(num1,1.0/num2);
        }

        tempVa1 = findViewById(R.id.lblrespuesta);
        tempVa1.setText("respuesta: "+ respuesta);


    }


}