package com.example.miguelpaz.unitecsocial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Busqueda_General extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_busqueda__general);
    }

    public void callprofile(View view){
        Intent i= new Intent(this, AgregarContacto.class);
        startActivity(i);
    }

    public void nombre(View view){
        Toast.makeText(this, "Ahora puede buscar contactos por nombre", Toast.LENGTH_SHORT).show();
    }

    public void cuenta(View view){
        Toast.makeText(this, "Ahora puede buscar contactos por numero de cuenta", Toast.LENGTH_SHORT).show();
    }
}
