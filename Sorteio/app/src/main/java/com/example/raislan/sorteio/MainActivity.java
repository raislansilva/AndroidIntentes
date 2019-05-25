package com.example.raislan.sorteio;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class MainActivity extends AppCompatActivity {
    private ListView listaSorteio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void sorteio(View view){

        Set<String> setarray = new HashSet<String>();
        TreeSet<String> trearray = new TreeSet<String>();

        while(setarray.size() < 6){
            int numero = (int)(Math.random() * 59) + 1;
            String num = Integer.toString(numero);
            setarray.add(num);
        }

        trearray.addAll(setarray);

        String sena[] = new String[trearray.size()];
        trearray.toArray(sena);



        listaSorteio = findViewById(R.id.lista);
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
           getApplicationContext(),
           android.R.layout.simple_list_item_1,
           android.R.id.text1,
           sena


        ){
            @Override
            public View getView (int position, View convertView, ViewGroup parent) {

                View view = super.getView(position, convertView, parent);

                // Como o simple_list_item_1 retorna um TextView, esse cast pode ser feito sem problemas
                ((TextView) view).setTextColor(Color.BLACK);

                return view;
            }
        };

        listaSorteio = (ListView) findViewById(R.id.lista);
        listaSorteio.setAdapter(adaptador);


    }

}
