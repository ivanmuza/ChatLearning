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
public class Puntaje {
    int idUsuarioPuntua;
    int idUsuarioPunteado;
    int valor;

    public Puntaje(int idUsuarioPuntua, int idUsuarioPunteado, int valor) {
        this.idUsuarioPuntua = idUsuarioPuntua;
        this.idUsuarioPunteado = idUsuarioPunteado;
        this.valor = valor;
    }

    public int getIdUsuarioPuntua() {
        return idUsuarioPuntua;
    }

    public void setIdUsuarioPuntua(int idUsuarioPuntua) {
        this.idUsuarioPuntua = idUsuarioPuntua;
    }

    public int getIdUsuarioPunteado() {
        return idUsuarioPunteado;
    }

    public void setIdUsuarioPunteado(int idUsuarioPunteado) {
        this.idUsuarioPunteado = idUsuarioPunteado;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    
}
