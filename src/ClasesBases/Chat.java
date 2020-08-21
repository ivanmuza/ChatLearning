/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesBases;

import java.util.ArrayList;

/**
 *
 * @author ivanm
 */
public class Chat {
    int idUsuario1;
    int idUsuario2;
    ArrayList<String> mensajes = new ArrayList<>();

    public Chat(int idUsuario1, int idUsuario2) {
        this.idUsuario1 = idUsuario1;
        this.idUsuario2 = idUsuario2;
    }

    public int getIdUsuario1() {
        return idUsuario1;
    }

    public void setIdUsuario1(int idUsuario1) {
        this.idUsuario1 = idUsuario1;
    }

    public int getIdUsuario2() {
        return idUsuario2;
    }

    public void setIdUsuario2(int idUsuario2) {
        this.idUsuario2 = idUsuario2;
    }

    public ArrayList<String> getMensajes() {
        return mensajes;
    }

    public void setMensajes(ArrayList<String> mensajes) {
        this.mensajes = mensajes;
    } 

}

