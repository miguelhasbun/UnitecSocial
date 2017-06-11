package com.example.miguelpaz.unitecsocial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void callperfil(View view){
        Toast.makeText(this, "Credenciales aceptadas.", Toast.LENGTH_SHORT).show();
        Intent i= new Intent(this,  Contactos.class);
        startActivity(i);
    }
}
