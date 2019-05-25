package com.example.raislan.conversordemoeda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultMoney extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_money);

        Intent intent = getIntent();
        String val = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        Float value = Float.parseFloat(val);
        Double res_dolar = value*3.79;
        Double res_euro = value*4.4;
        Double res_libra = value*5.1;
        Double res_peso = value*0.08;
        Double res_lari = value*1.4;

        TextView dolar = findViewById(R.id.txt2);
        dolar.setText(res_dolar.toString());

        TextView euro = findViewById(R.id.txt3);
        euro.setText(res_euro.toString());

        TextView libra = findViewById(R.id.txt4);
        libra.setText(res_libra.toString());

        TextView peso = findViewById(R.id.txt5);
        peso.setText(res_peso.toString());

        TextView lari = findViewById(R.id.txt6);
        lari.setText(res_lari.toString());

    }
}
