package ClasesBases;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ivanm
 */
public class Usuario {
    int idUsuario;
    String nombre;
    int idIdiomaMaterno;
    int idIdiomaPreferido;
    int idInteres;
    ArrayList<Puntaje> puntajes = new ArrayList<>();

    public Usuario(int idUsuario, String nombre, int idIdiomaMaterno, int idIdiomaPreferido, int idInteres) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.idIdiomaMaterno = idIdiomaMaterno;
        this.idIdiomaPreferido = idIdiomaPreferido;
        this.idInteres = idInteres;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdIdiomaMaterno() {
        return idIdiomaMaterno;
    }

    public void setIdIdiomaMaterno(int idIdiomaMaterno) {
        this.idIdiomaMaterno = idIdiomaMaterno;
    }

    public int getIdIdiomaPreferido() {
        return idIdiomaPreferido;
    }

    public void setIdIdiomaPreferido(int idIdiomaPreferido) {
        this.idIdiomaPreferido = idIdiomaPreferido;
    }

    public int getIdInteres() {
        return idInteres;
    }

    public void setIdInteres(int idInteres) {
        this.idInteres = idInteres;
    }

    public ArrayList<Puntaje> getPuntajes() {
        return puntajes;
    }

    public void setPuntajes(ArrayList<Puntaje> puntajes) {
        this.puntajes = puntajes;
    }

    @Override
    public String toString() {
        return "Usuario{" + "idUsuario=" + idUsuario + ", nombre=" + nombre + '}';
    }

    
    
}
