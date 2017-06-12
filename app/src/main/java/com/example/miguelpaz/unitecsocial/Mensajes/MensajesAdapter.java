package com.example.miguelpaz.unitecsocial.Mensajes;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.miguelpaz.unitecsocial.R;

import java.util.List;

/**
 * Created by Miguel Paz on 11/6/2017.
 */

public class MensajesAdapter extends RecyclerView.Adapter<MensajesAdapter.MensajesViewHolder> {

    private List<MensajeDeTexto> mensajeDeTextos;
    private Context context;


    public MensajesAdapter(List<MensajeDeTexto> mensajeDeTextos, Context context) {
        this.mensajeDeTextos = mensajeDeTextos;
        this.context= context;
    }



    @Override
    public MensajesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_mensajes, parent, false);
        return new MensajesViewHolder(v);

    }

    @Override
    public void onBindViewHolder(MensajesViewHolder holder, int position) {

        RelativeLayout.LayoutParams rl= (RelativeLayout.LayoutParams) holder.cardView.getLayoutParams();

        FrameLayout.LayoutParams fl= (FrameLayout.LayoutParams) holder.mensajeBG.getLayoutParams();

        LinearLayout.LayoutParams llMensaje= (LinearLayout.LayoutParams) holder.TVMensaje.getLayoutParams();
        LinearLayout.LayoutParams llHora= (LinearLayout.LayoutParams) holder.TVHora.getLayoutParams();


        if(mensajeDeTextos.get(position).getTipoMensaje()==1){
            holder.mensajeBG.setBackgroundResource(R.drawable.in_message_bg);
            rl.addRule(RelativeLayout.ALIGN_PARENT_LEFT,0);
            rl.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
            llMensaje.gravity= Gravity.RIGHT;
            llHora.gravity= Gravity.RIGHT;
            fl.gravity= Gravity.RIGHT;
            holder.TVMensaje.setGravity(Gravity.RIGHT);
        }else if(mensajeDeTextos.get(position).getTipoMensaje()==2){
            holder.mensajeBG.setBackgroundResource(R.drawable.out_message_bg);
            rl.addRule(RelativeLayout.ALIGN_PARENT_RIGHT,0);
            rl.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
            llMensaje.gravity= Gravity.LEFT;
            llHora.gravity= Gravity.LEFT;
            fl.gravity= Gravity.LEFT;
            holder.TVMensaje.setGravity(Gravity.LEFT);
        }

        holder.cardView.setLayoutParams(rl);
        holder.mensajeBG.setLayoutParams(fl);
        holder.TVMensaje.setLayoutParams(llMensaje);
        holder.TVHora.setLayoutParams(llHora);
        holder.TVMensaje.setText(mensajeDeTextos.get(position).getMensaje());
        holder.TVHora.setText(mensajeDeTextos.get(position).getHoraDelMensaje());

        //Revisar esta parte
        holder.cardView.setAlpha(0);

    }

    @Override
    public int getItemCount() {
        return mensajeDeTextos.size();
    }

    static class MensajesViewHolder extends RecyclerView.ViewHolder{

        CardView cardView;
        LinearLayout mensajeBG;
        TextView TVMensaje;
        TextView TVHora;

        MensajesViewHolder(View itemview){
            super(itemview);
            cardView= (CardView) itemview.findViewById(R.id.cvMensaje);
            mensajeBG= (LinearLayout) itemview.findViewById(R.id.mensajeBG);
            TVMensaje= (TextView) itemview.findViewById(R.id.msTexto);
            TVHora= (TextView) itemview.findViewById(R.id.msHora);

        }


    }
}
