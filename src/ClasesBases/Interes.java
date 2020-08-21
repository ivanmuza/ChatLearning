/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesBases;

/**
 *
 * @author ivanm
 */
public class Interes {
    int idInteres;
    String nombreInteres;

    public Interes(int idInteres, String nombreInteres) {
        this.idInteres = idInteres;
        this.nombreInteres = nombreInteres;
    }

    public int getIdInteres() {
        return idInteres;
    }

    public void setIdInteres(int idInteres) {
        this.idInteres = idInteres;
    }

    public String getNombreInteres() {
        return nombreInteres;
    }

    public void setNombreInteres(String nombreInteres) {
        this.nombreInteres = nombreInteres;
    }

    @Override
    public String toString() {
        return "Interes{" + "idInteres=" + idInteres + ", nombreInteres=" + nombreInteres + '}';
    }
   
}
