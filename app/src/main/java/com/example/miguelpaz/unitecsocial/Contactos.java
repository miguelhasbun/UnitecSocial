package com.example.miguelpaz.unitecsocial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class Contactos extends AppCompatActivity {

    String [] item;
    ArrayList<String> listitem;
    ArrayAdapter<String> adapter;
    ListView listView;
    EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactos);
        listView= (ListView)findViewById(R.id.listview);
        editText= (EditText)findViewById(R.id.txtbuscar);
        initlist();
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.toString().equals("")){
                    initlist();
                }else{

                    buscarItem(s.toString());

                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


    }

    public void buscarItem(String texto){
        for (String i:item){
            if (!i.contains(texto)){

                listitem.remove(i);
            }

        }
        adapter.notifyDataSetChanged();
    }

    public void initlist(){
        item= new String[]{"Juan", "José", "Reiner", "Boris", "Esther"};
        listitem= new ArrayList<>(Arrays.asList(item));
        adapter= new ArrayAdapter<String>(this, R.layout.list_item, R.id.txtitem, listitem);
        listView.setAdapter(adapter);
    }
}
