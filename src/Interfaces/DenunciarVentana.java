/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import ClasesBases.Denuncia;
import ClasesBases.Usuario;
import java.util.Scanner;

/**
 *
 * @author ivanm
 */

public class DenunciarVentana {
    private final Scanner teclado = new Scanner(System.in);
    private final Usuario usuarioDenunciante;
    private final Usuario usuarioDenunciado;
    
    public DenunciarVentana(Usuario usuarioDenunciante, Usuario usuarioDenunciado) {
        this.usuarioDenunciante = usuarioDenunciante;
        this.usuarioDenunciado = usuarioDenunciado;
    }
        
    public void mostrarVentana(){
        String entrada;
        System.out.println("¿Desea denunciar a este usuario? ingrese \"si\" para confirmar: ");
        entrada = teclado.nextLine();
        if(entrada.toLowerCase().equals("si")){
            System.out.println("Ingrese descripción de la denuncia, presione enter para enviar denuncia: ");
            entrada = teclado.nextLine();
            
            Denuncia denuncia = new Denuncia(usuarioDenunciante.getIdUsuario(),usuarioDenunciado.getIdUsuario(), entrada);
            if(denuncia.enviarDenunciaBD()){
                System.out.println("Usuario denunciado satisfactoriamente.");
            }
            else{
                System.out.println("Error en envío de denuncia a base de datos");
            }
        }
        else{
            System.out.println("Denunciar usuario cancelado");
        }
        volver();
    }
    
    private void volver(){
        /*
        FALTA, cuando sea una ventana, se tiene que destruir
        */
    }
}
