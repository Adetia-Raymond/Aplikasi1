package com.example.aplikasi1;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    //Deklarasi Variabel
    EditText Textnama;
    TextView Hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        //Panggil variabel berdasarkan id
        Textnama = (EditText) findViewById(R.id.TxtNama);
        Hasil = (TextView) findViewById(R.id.Label2);
    }

    public void TampilNama (View v){
        Hasil.setText("Nama Anda: "+Textnama.getText());
    }
}