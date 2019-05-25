package com.example.raislan.conversordemoeda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void resultConversetion(View view){
        Intent intent = new Intent(this,  ResultMoney.class);
        EditText txtValue = (EditText) findViewById(R.id.txt1);
        String value = txtValue.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, value);
        startActivity(intent);

    }

    
}
