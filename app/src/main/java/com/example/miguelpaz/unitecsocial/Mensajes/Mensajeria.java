package com.example.miguelpaz.unitecsocial.Mensajes;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.miguelpaz.unitecsocial.R;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by Miguel Paz on 11/6/2017.
 */

public class Mensajeria extends AppCompatActivity {

    private RecyclerView rv;
    private Button bEnviarMensaje;
    private EditText eTEscribirMensaje;
    private List<MensajeDeTexto> mensajeDeTextos;
    private MensajesAdapter adapter;
    private int TEXT_LINES=1;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mensajeria);

        mensajeDeTextos= new ArrayList<>();

        Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar);
        bEnviarMensaje=(Button)findViewById(R.id.btEnviarMensaje);
        eTEscribirMensaje=(EditText)findViewById(R.id.eDEscribirMensaje);


        rv=(RecyclerView)findViewById(R.id.rvMensajes);
        LinearLayoutManager lm= new LinearLayoutManager(this);
        lm.setStackFromEnd(true);
        rv.setLayoutManager(lm);

        for(int i=0; i<10; i++){

            MensajeDeTexto mensajeDeTextoAuxiliar= new MensajeDeTexto();
            mensajeDeTextoAuxiliar.setId(""+i);
            mensajeDeTextoAuxiliar.setMensaje("El alumno"+ i+ "te envió un mensaje");
            mensajeDeTextoAuxiliar.setTipoMensaje(1);
            mensajeDeTextoAuxiliar.setHoraDelMensaje(Calendar.getInstance().toString());
            mensajeDeTextos.add(mensajeDeTextoAuxiliar);
        }

        for(int i=0; i<10; i++){

            MensajeDeTexto mensajeDeTextoAuxiliar= new MensajeDeTexto();
            mensajeDeTextoAuxiliar.setId(""+i);
            mensajeDeTextoAuxiliar.setMensaje("El alumno"+ i+ "te envió un mensaje");
            mensajeDeTextoAuxiliar.setTipoMensaje(2);
            mensajeDeTextoAuxiliar.setHoraDelMensaje(Calendar.getInstance().toString());
            mensajeDeTextos.add(mensajeDeTextoAuxiliar);
        }



        adapter= new MensajesAdapter(mensajeDeTextos, this);

        rv.setAdapter(adapter);






        bEnviarMensaje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CreateMensaje(eTEscribirMensaje.getText().toString());
            }
        });




        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    public void CreateMensaje(String mensaje){
        MensajeDeTexto mensajeDeTextoAuxiliar= new MensajeDeTexto();
        mensajeDeTextoAuxiliar.setId("0");
        mensajeDeTextoAuxiliar.setMensaje(mensaje);
        mensajeDeTextoAuxiliar.setTipoMensaje(1);
        mensajeDeTextoAuxiliar.setHoraDelMensaje("12:30");
        mensajeDeTextos.add(mensajeDeTextoAuxiliar);
        adapter.notifyDataSetChanged();
        eTEscribirMensaje.setText("");
        setScrollbarChat();
    }

    public void setScrollbarChat(){
        rv.scrollToPosition(adapter.getItemCount()-1);
    }

    public void callmensajes(){
        Intent i= new Intent(this, Mensajeria.class);
        startActivity(i);
    }
}
