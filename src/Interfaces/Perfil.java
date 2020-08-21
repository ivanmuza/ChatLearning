/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;
import ClasesBases.Usuario;
import java.util.Scanner;
import ClasesBases.Puntaje;

/**
 *
 * @author David Morales Norato
 */
public class Perfil {
    private final Usuario usuarioLogueado;
    private final Usuario usuarioAmigo;
    private final Scanner teclado = new Scanner(System.in);
    
    public Perfil(Usuario usuarioLogueado, Usuario usuarioAmigo) {
        this.usuarioAmigo = usuarioAmigo;
        this.usuarioLogueado = usuarioLogueado;
    }
    
    public void mostrarVentana(){
        boolean flag = true;
        while(flag){
            System.out.println("##################################");
            System.out.println("Seleccione acción a realizar: ");
            System.out.println("1 - Imprimir datos usuario");
            System.out.println("2 - Calificar usuario");
            System.out.println("3 - Denunciar usuario");
            System.out.println("4 - Volver");
            
            String entrada = teclado.nextLine();
            int eleccion;
            try {
                eleccion=Integer.parseInt(entrada); 
                switch(eleccion){
                    case 1:
                        imprimirDatosUsuario();
                        break;
                    case 2:
                        calificarUsuario();
                        break;
                    case 3:
                        denunciarUsuario();
                        break;
                    case 4:
                        volver();
                        flag = false;
                        break;
                }
            }
            catch (NumberFormatException excepcion) {
                System.out.println("Elección incorrecta, ingrese un número dentro de las opciones");
            }
            
        }
    }
    
    public void imprimirDatosUsuario(){
        System.out.println(usuarioAmigo.toString());
    }
    
    public void denunciarUsuario(){
       DenunciarVentana denuncia = new DenunciarVentana(usuarioLogueado, usuarioAmigo);
       denuncia.mostrarVentana();
    }
    
    public void calificarUsuario(){
        System.out.println("Ingrese un entero entre 0 y 5");
            
        String entrada = teclado.nextLine();
        int eleccion;
        try {
            eleccion=Integer.parseInt(entrada); 
            Puntaje puntaje = new Puntaje(usuarioLogueado.getIdUsuario(), usuarioAmigo.getIdUsuario(),eleccion);
            usuarioAmigo.añadirPuntaje(puntaje);
        }
        catch (NumberFormatException excepcion) {
                System.out.println("No es posible registrar puntaje, ingrese un valor posible");
            }
        
        
    }
    
    private void volver(){
        /*
        FALTA, cuando sea una ventana, se tiene que destruir
        */
    }
    
}
