package com.example.chapter2_latihan1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editTextJari;
    TextView textViewKeliling;
    TextView textViewLuas;
    Button buttonHitung;
    float  inputJarijari;
    double keliling;
    double luas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextJari =  findViewById(R.id.editTextjari);
        textViewKeliling = findViewById(R.id.textViewKeliling);
        textViewLuas = findViewById(R.id.textViewLuas);
        buttonHitung = findViewById(R.id.buttonHitung);

        buttonHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputJarijari = Float.parseFloat(editTextJari.getText().toString()) ;

                keliling  =  inputJarijari*2* Math.PI;
                textViewKeliling.setText("Keliling: " + String.valueOf(keliling) );

                luas  =  Math.pow(inputJarijari,2)* Math.PI;
                textViewLuas.setText("Luas: " + String.valueOf(luas) );
            }
        });
    }
}