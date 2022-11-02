package com.example.lidu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class PruebaActivity extends AppCompatActivity {

    TextView msj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prueba);

        msj = (TextView) findViewById(R.id.etiNombre);

        Bundle miBundle = this.getIntent().getExtras();
        if(miBundle != null)
        {
            String nombre= miBundle.getString("nombre");
            msj.setText("Bienvenido a tu perfil: " + nombre);
        }
    }

    public void onclick(View view) {
        Intent miIntent = null;
        switch (view.getId()){
            case R.id.btnPerfil:
                miIntent = new Intent(PruebaActivity.this, PruebaActivity.class);
                break;
            case R.id.btnChat:
                miIntent = new Intent(PruebaActivity.this, ChatActivity.class);
                break;
            case R.id.btnSalir:
                miIntent = new Intent(PruebaActivity.this, MainActivity.class);

        }
        startActivity(miIntent);
    }
}