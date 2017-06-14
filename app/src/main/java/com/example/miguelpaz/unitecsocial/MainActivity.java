package com.example.miguelpaz.unitecsocial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.miguelpaz.unitecsocial.Mensajes.Mensajeria;

public class MainActivity extends AppCompatActivity {
    EditText et, et2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et= (EditText)findViewById(R.id.editText);
        et2=(EditText)findViewById(R.id.editText2);
    }

    public void callperfil(View view){

        Toast.makeText(this, "Credenciales aceptadas.", Toast.LENGTH_SHORT).show();
        Intent i= new Intent(this, Perfil.class);
        startActivity(i);
    }


    public void callreproductor(View view){
        Intent i= new Intent(this, Reproductor.class);
        startActivity(i);
    }


}
