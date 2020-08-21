/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesBases;

import java.util.ArrayList;

/**
 *
 * @author ivanm, David morales Norato
 */
public class Chat {
    private Usuario usuarioLogueado;
    private Usuario usuarioAmigo;
    private ArrayList<String> mensajes = new ArrayList<>();

    public Chat(Usuario usuarioLogueado, Usuario usuarioAmigo) {
        this.usuarioLogueado = usuarioLogueado;
        this.usuarioAmigo = usuarioAmigo;
    }

    public Usuario getUsuarioLogueado() {
        return this.usuarioLogueado;
    }

    public void setUsuarioLogueado(Usuario usuarioLogueado) {
        this.usuarioLogueado = usuarioLogueado;
    }

    public Usuario getUsuarioAmigo() {
        return this.usuarioAmigo;
    }

    public void setUsuarioAmigo(Usuario usuarioAmigo) {
        this.usuarioAmigo = usuarioAmigo;
    }

    public ArrayList<String> getMensajes() {
        return mensajes;
    }

    public String getMensaje(int idMensaje){
        return this.mensajes.get(idMensaje);
    }
    
    public void setMensajes(ArrayList<String> mensajes) {
        this.mensajes = mensajes;
    } 
    
    public void añadirMensaje(String mensaje){
        this.mensajes.add(mensaje);
    }
    
    public boolean eliminarMensaje(int idMensaje){
        this.mensajes.remove(idMensaje);
        return true;
    }
}

