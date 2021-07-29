package com.example.chapter2_latihan2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editTextAngka1;
    EditText editTextAngka2;
    TextView textViewHasil;
    Button buttonCompare;
    float angka1;
    float angka2;

    String hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextAngka1 =  findViewById(R.id.editTextAngka1);
        editTextAngka2 = findViewById(R.id.editTextAngka2);
        textViewHasil = findViewById(R.id.textViewHasil);
        buttonCompare  = findViewById(R.id.buttonCompare);

        buttonCompare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                angka1 = Float.parseFloat(editTextAngka1.getText().toString()) ;
                angka2 = Float.parseFloat(editTextAngka2.getText().toString()) ;

                if (angka1 > angka2){
                    hasil = angka1 + " lebih besar daripada " + angka2;
                }else if (angka1 < angka2){
                    hasil = angka2 + " lebih besar daripada " + angka1;
                }else{
                    hasil = "Kedua angka sama";
                }
                textViewHasil.setText(hasil);
            }
        });
    }
}