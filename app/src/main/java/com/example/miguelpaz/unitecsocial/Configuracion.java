package com.example.miguelpaz.unitecsocial;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Configuracion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuracion);

    }
    public void callreproductor(View view){
        Intent i= new Intent(this, Reproductor.class);
        startActivity(i);
    }

    public void bloqueo(View view){
        Toast.makeText(this, "No hay contactos bloqueados", Toast.LENGTH_SHORT).show();
    }

    public void ajustes(View view){
        Toast.makeText(this, "No puede editar su perfil todavía", Toast.LENGTH_SHORT).show();
    }


}
