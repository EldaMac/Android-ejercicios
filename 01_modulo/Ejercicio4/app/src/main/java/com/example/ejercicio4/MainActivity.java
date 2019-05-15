package com.example.ejercicio4;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    CheckBox chkBol, checkBox2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (EditText) findViewById(R.id.txt);
        chkBol = (CheckBox) findViewById(R.id.chkBol);
        checkBox2 = (CheckBox) findViewById(R.id.checkBox2);

        chkBol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chkBol.isChecked()&& !checkBox2.isChecked())
                    editText.setTypeface(null, Typeface.BOLD);
                else if (!chkBol.isChecked() && checkBox2.isChecked())
                    editText.setTypeface(null, Typeface.ITALIC);
                else if (chkBol.isChecked() && checkBox2.isChecked())
                    editText.setTypeface(null, Typeface.BOLD_ITALIC);
                else if (!chkBol.isChecked() && !checkBox2.isChecked())
                    editText.setTypeface(null, Typeface.NORMAL);

            }
        });

        checkBox2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chkBol.isChecked()&& !checkBox2.isChecked())
                    editText.setTypeface(null, Typeface.BOLD);
                else if (!chkBol.isChecked() && checkBox2.isChecked())
                    editText.setTypeface(null, Typeface.ITALIC);
                else if (chkBol.isChecked() && checkBox2.isChecked())
                    editText.setTypeface(null, Typeface.BOLD_ITALIC);
                else if (!chkBol.isChecked() && !checkBox2.isChecked())
                    editText.setTypeface(null, Typeface.NORMAL);
            }
        });
    }
}
