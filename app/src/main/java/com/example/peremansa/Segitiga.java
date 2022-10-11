package com.example.peremansa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Segitiga extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);

        final EditText alas =
                (EditText)findViewById(R.id.t_alas);
        final EditText tinggi =
                (EditText)findViewById(R.id.t_tinggi);
        final EditText hasil =
                (EditText)findViewById(R.id.t_hasil);
        final Button tampil = (Button)findViewById(R.id.hitung);

        tampil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String isialas = alas.getText().toString(), isitinggi = tinggi.getText().toString();
                double a = Double.parseDouble(isialas);
                double t = Double.parseDouble(isitinggi);
                double h = Luas_Segitiga(a, t);
                String out = String.valueOf(h);
                hasil.setText(out.toString());
                String tampil1 = hasil.getText().toString();
                hasil.setText(tampil1);
            }
        });
    }
    public double Luas_Segitiga(double a, double t){return a*t/2;}
}