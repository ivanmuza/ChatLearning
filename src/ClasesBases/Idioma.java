package ClasesBases;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ivanm
 */
public class Idioma {
    int idIdioma;
    String nombreIdioma;

    public Idioma(int idIdioma, String nombreIdioma) {
        this.idIdioma = idIdioma;
        this.nombreIdioma = nombreIdioma;
    }

    public int getIdIdioma() {
        return idIdioma;
    }

    public void setIdIdioma(int idIdioma) {
        this.idIdioma = idIdioma;
    }

    public String getNombreIdioma() {
        return nombreIdioma;
    }

    public void setNombreIdioma(String nombreIdioma) {
        this.nombreIdioma = nombreIdioma;
    }

    @Override
    public String toString() {
        return "Idioma{" + "idIdioma=" + idIdioma + ", nombreIdioma=" + nombreIdioma + '}';
    }
    
}
