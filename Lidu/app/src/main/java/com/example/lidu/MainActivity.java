package com.example.lidu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText campoNombre, campoContra;
    TextView etiNombre;
    Button btnLog, btnReg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        campoNombre = (EditText) findViewById(R.id.txtNombre);
        campoContra = (EditText) findViewById(R.id.txtContra);
        etiNombre = (TextView) findViewById(R.id.etiNombre);

        btnLog = (Button) findViewById(R.id.btnIngresar);
        btnReg = (Button) findViewById(R.id.btnRegistro);

    }

    public void onclick(View view) {
        Intent miIntent = null;

        switch (view.getId())
        {
            case R.id.btnIngresar:
                String nombre = campoNombre.getText().toString();
                etiNombre.setText("Bienvenido: " + nombre);
                Toast.makeText(this, "Usuario: " + nombre,Toast.LENGTH_LONG).show();
                miIntent = new Intent(MainActivity.this, PruebaActivity.class);

                Bundle miBundle = new Bundle();
                miBundle.putString("nombre",campoNombre.getText().toString());
                miIntent.putExtras(miBundle);
                break;
            case R.id.btnRegistro:
                miIntent = new Intent(MainActivity.this, RegisterActivity.class);

        }
        startActivity(miIntent);
    }
}