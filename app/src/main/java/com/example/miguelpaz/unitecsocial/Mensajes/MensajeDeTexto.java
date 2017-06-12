package com.example.miguelpaz.unitecsocial.Mensajes;

/**
 * Created by Miguel Paz on 11/6/2017.
 */

public class MensajeDeTexto {
    private String id;
    private String mensaje;
    private String HoraDelMensaje;
    private int tipoMensaje;

    public MensajeDeTexto() {}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getHoraDelMensaje() {
        return HoraDelMensaje;
    }

    public void setHoraDelMensaje(String horaDelMensaje) {
        HoraDelMensaje = horaDelMensaje;
    }

    public int getTipoMensaje() {
        return tipoMensaje;
    }

    public void setTipoMensaje(int tipoMensaje) {
        this.tipoMensaje = tipoMensaje;
    }
}
