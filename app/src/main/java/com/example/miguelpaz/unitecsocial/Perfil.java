package com.example.miguelpaz.unitecsocial;

import android.content.Intent;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

public class Perfil extends AppCompatActivity {

    private DrawerLayout drawerLayout;
    private LinearLayout mainLayout;
    private ListView menuLateral;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

        ActionBar aBar= getSupportActionBar();
        aBar.setHomeButtonEnabled(true);
        aBar.setDisplayHomeAsUpEnabled(true);


        drawerLayout= (DrawerLayout)findViewById(R.id.drawerLayout);
        mainLayout= (LinearLayout)findViewById(R.id.mainLayout);
        menuLateral= (ListView)findViewById(R.id.menuLateral);

        final String[] opciones={"Perfil", "Notificaciones", "Agregar Contacto", "Contactos", "Chats", "Configuraciones"};
        ArrayAdapter<String> adp= new ArrayAdapter<String>(Perfil.this, android.R.layout.simple_list_item_1, opciones);
        menuLateral.setAdapter(adp);



        menuLateral.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String opcionseleccionada= (String)menuLateral.getAdapter().getItem(position);


                Toast.makeText(Perfil.this, opcionseleccionada, Toast.LENGTH_SHORT).show();
                drawerLayout.closeDrawer(menuLateral);

            }

        });


        /*For fallido
           for (int i=0; i<opciones.length; i++) {
                    if (opciones[i].equals("Notificaciones")) {
                        Intent ij = new Intent(this, Notificaciones.class);
                        startActivity(ij);

                    }
                }
         */


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id= item.getItemId();

        if (id==android.R.id.home){
            if (drawerLayout.isDrawerOpen(menuLateral)){
                drawerLayout.closeDrawer(menuLateral);
            }else{
                drawerLayout.openDrawer(menuLateral);
            }
        }

        if (id==R.id.action_settings){
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
