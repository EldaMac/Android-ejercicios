package com.example.ejercicio5;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {
    //Declaracion de las variables
    private EditText txt;
    private Spinner mySpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //buscamos componentes dentro de la vista
        txt = (EditText) findViewById(R.id.txt);
        mySpinner = (Spinner) findViewById(R.id.mySpinner);

        //opciones del spinner
        String opciones[] = {"Normal", "Negritas","Cursivas", "Negritas y Cursivas"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_spinner_item, opciones);
        mySpinner.setAdapter(adapter);

        //Evento para el Spinner
        mySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String opcion = mySpinner.getSelectedItem().toString();
                if(opcion.equals("Normal"))
                    txt.setTypeface(null, Typeface.NORMAL);
                else if (opcion.equals("Negritas"))
                    txt.setTypeface(null, Typeface.BOLD);
                else if (opcion.equals("Cursivas"))
                    txt.setTypeface(null, Typeface.ITALIC);
                else if(opcion.equals("Negritas y Cursivas"))
                    txt.setTypeface(null, Typeface.BOLD_ITALIC);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}
