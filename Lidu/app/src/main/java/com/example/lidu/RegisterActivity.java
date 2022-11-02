package com.example.lidu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void onclick(View view) {
        Intent miIntent = null;
        switch (view.getId()){
            case R.id.btnAnterior:
                miIntent = new Intent(RegisterActivity.this, MainActivity.class);
                break;
            case R.id.btnRegistrar:
                miIntent = new Intent(RegisterActivity.this, PruebaActivity.class);
                break;
        }
        startActivity(miIntent);
    }
}