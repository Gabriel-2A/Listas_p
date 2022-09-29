package com.example.listas_p;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.listas_p.Lista_enlzada.ListaEnlaze;
import com.example.listas_p.Lista_enlzada.NodoLista;

public class MainActivity extends AppCompatActivity {

    private EditText etAgrergar;
    private Button bGuardar, bMostrar;
    private NodoLista primero = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etAgrergar= findViewById(R.id.etAgregar);
        bGuardar = findViewById(R.id.bGuardar);
        bMostrar = findViewById(R.id.bMostrar);

        bGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int aux = Integer.parseInt(etAgrergar.getText().toString().trim());

                primero = new NodoLista(aux, primero);



                etAgrergar.setText(null);
            }
        });



        bMostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String resultado = "";
                NodoLista auxPri = primero;
                while (auxPri != null){
                    resultado += auxPri + " ->";
                    auxPri = auxPri.getEnlace();
                }

                Log.i("log", resultado);

            }
        });


        /*ListaEnlaze l = new ListaEnlaze();
        l.crearLista();

        Log.i("log", l.toString());*/
    }
}