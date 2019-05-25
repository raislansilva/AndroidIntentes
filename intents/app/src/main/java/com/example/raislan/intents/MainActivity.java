package com.example.raislan.intents;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void ligarNumeroFixo(View view){
        Uri numeroFixo = Uri.parse("tel:8632237353");
        Intent ligarIntent = new Intent(Intent.ACTION_DIAL,
                numeroFixo);
        startActivity(ligarIntent);
    }
    public void abrirMapa(View view){
        Uri localizacao = Uri.parse("geo:-5.0757498,-42.7903859");
        Intent mapaIntent = new Intent(Intent.ACTION_VIEW, localizacao);
        startActivity(mapaIntent);
    }
    public void abrirSite(View view){
        Uri site = Uri.parse("https://www.uninassau.edu.br/");
        Intent siteIntent = new Intent(Intent.ACTION_VIEW, site);
        startActivity(siteIntent);
    }

    public void ligarNumeroQualquer(View view){
        EditText txtNumero = (EditText) findViewById(R.id.editText);
        String phoneNumber = txtNumero.getText().toString();
        String numeroQualquer = "tel:" + phoneNumber;
        Uri numeroFixo = Uri.parse(numeroQualquer);
        Intent ligarIntent = new Intent(Intent.ACTION_DIAL,numeroFixo);
        startActivity(ligarIntent);
    }
}
