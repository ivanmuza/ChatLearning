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
//    ArrayList<Puntaje> puntajes = new ArrayList<>();
    ArrayList<Integer> puntajes;

    public Usuario(int idUsuario, String nombre, int idIdiomaMaterno, int idIdiomaPreferido, int idInteres) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.idIdiomaMaterno = idIdiomaMaterno;
        this.idIdiomaPreferido = idIdiomaPreferido;
        this.idInteres = idInteres;
        this.puntajes = new ArrayList<>();
    }

    public Usuario(int idUsuario, String nombre, int idIdiomaMaterno, int idIdiomaPreferido, int idInteres, ArrayList<Integer> puntajes) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.idIdiomaMaterno = idIdiomaMaterno;
        this.idIdiomaPreferido = idIdiomaPreferido;
        this.idInteres = idInteres;
        this.puntajes = puntajes;
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

    public ArrayList<Integer> getPuntajes() {
        return puntajes;
    }

    public void setPuntajes(ArrayList<Integer> puntajes) {
        this.puntajes = puntajes;
    }

    public void añadirPuntaje(int puntaje) {
        this.puntajes.add(puntaje);
    }

    public float getPuntaje() {
        float puntajeTotal = 0;
        if (puntajes.size() > 0) {
            for (int p : puntajes) {
                puntajeTotal = puntajeTotal + p;
            }
            puntajeTotal = puntajeTotal / puntajes.size();
        }
        return puntajeTotal;
    }

    @Override
    public String toString() {
        return "##########\n"
                + "ID usuario: " + String.valueOf(this.idUsuario) + "\n"
                + "Nombre: " + this.nombre + "\n"
                + "Idioma preferido: " + String.valueOf(this.idIdiomaPreferido) + "\n"
                + "Idioma materno: " + String.valueOf(this.idIdiomaMaterno) + "\n"
                + "Intereses: " + String.valueOf(this.idInteres) + "\n";
    }
}
