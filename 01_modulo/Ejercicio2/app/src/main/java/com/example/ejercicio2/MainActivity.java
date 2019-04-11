package com.example.ejercicio2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.txtNumero1)
    EditText txtNumero1;
    @BindView(R.id.txtNumero2)
    EditText txtNumero2;

    @BindView(R.id.rdsuma)
    EditText rdsuma;
    @BindView(R.id.rdresta)
    EditText rdresta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btncalculo)
    public void hacercalculo(){
        Toast.makeText(this, "Presione", Toast.LENGTH_LONG).show();
    }
}
