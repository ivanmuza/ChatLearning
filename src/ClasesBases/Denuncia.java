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
public class Denuncia {
    int idDenuncia;
    int idUsuarioDemandante;
    int idUsuarioDemandado;
    String descripcion;

    public Denuncia(int idDenuncia, int idUsuarioDemandante, int idUsuarioDemandado, String descripcion) {
        this.idDenuncia = idDenuncia;
        this.idUsuarioDemandante = idUsuarioDemandante;
        this.idUsuarioDemandado = idUsuarioDemandado;
        this.descripcion = descripcion;
    }

    public int getIdDenuncia() {
        return idDenuncia;
    }

    public void setIdDenuncia(int idDenuncia) {
        this.idDenuncia = idDenuncia;
    }

    public int getIdUsuarioDemandante() {
        return idUsuarioDemandante;
    }

    public void setIdUsuarioDemandante(int idUsuarioDemandante) {
        this.idUsuarioDemandante = idUsuarioDemandante;
    }

    public int getIdUsuarioDemandado() {
        return idUsuarioDemandado;
    }

    public void setIdUsuarioDemandado(int idUsuarioDemandado) {
        this.idUsuarioDemandado = idUsuarioDemandado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
