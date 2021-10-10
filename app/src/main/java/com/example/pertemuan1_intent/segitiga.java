package com.example.pertemuan1_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class segitiga extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);

        final EditText alas =
                (EditText)findViewById(R.id.input_alas);
        final EditText tinggi =
                (EditText)findViewById(R.id.input_tinggi);

        final TextView hasilnya =
                (TextView)findViewById(R.id.output_luas);

        final Button hitung = (Button)findViewById(R.id.btn_hitung);

        hitung.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                float alasnya = Float.parseFloat(String.valueOf(alas.getText()));
                float tingginya = Float.parseFloat(String.valueOf(tinggi.getText()));
                float totalnya = alasnya*tingginya/2;
                hasilnya.setText(Float.toString(totalnya));
            }
        });
    }
}