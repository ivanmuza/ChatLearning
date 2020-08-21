/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;
import ClasesBases.Chat;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author David Morales Norato
 */
public class ChatVentana {
    private final Chat chat; 
    private final Scanner teclado = new Scanner(System.in);
    
    public ChatVentana(Chat chat){
        this.chat = chat;
    }
    
    public void mostrarVentana(){
        boolean flag = true;
        while(flag){
            System.out.println("##################################");
            System.out.println("Seleccione acción a realizar: ");
            System.out.println("1 - Imprimir mensajes");
            System.out.println("2 - Enviar  mensaje");
            System.out.println("3 - Eliminar mensaje");
            System.out.println("4 - Eliminar todos los mensajes");
            System.out.println("5 - Ver perfil");
            System.out.println("6 - Volver");
            
            String entrada = teclado.nextLine();
            int eleccion;
            try {
                eleccion=Integer.parseInt(entrada); 
                switch(eleccion){
                    case 1:
                        this.imprimirListaMensajes();
                        break;
                    case 2:
                        this.escribirMensaje();
                        break;
                    case 3:
                        this.eliminarMensaje();
                        break;
                    case 4:
                        this.eliminarMensajes();
                        break;
                    case 5:
                        this.verPerfil();
                        break;
                    case 6:
                        this.volver();
                        flag = false;
                        break;
                }
            }
            catch (NumberFormatException excepcion) {
                System.out.println("Elección incorrecta, ingrese un número dentro de las opciones");
            }
            
        }
    }
    
    public void verPerfil(){
        System.out.println(chat.getUsuarioLogueado().toString());
        System.out.println(chat.getUsuarioAmigo().toString());
        Perfil perfil = new Perfil(chat.getUsuarioLogueado(),chat.getUsuarioAmigo());
        perfil.mostrarVentana();
    }
    
    public void imprimirListaMensajes(){
        ArrayList<String> mensajes = chat.getMensajes();
        int contador = 0;
        if(mensajes.size()==0)
        {
            System.out.println("No hay mensajes. ");
        }
        for (String mensaje: mensajes) {
            System.out.print(Integer.toString(contador++) + " - ");
            System.out.println(mensaje);
        }
        System.out.println("\nIntro para continuar: ");
        String mensaje = teclado.nextLine();
    }
    
    public void escribirMensaje(){
        System.out.println("Ingrese mensaje, presione Intro para enviar:");
        String mensaje = teclado.nextLine();
        chat.añadirMensaje(mensaje);
    }
    
    public void eliminarMensaje(){
        System.out.println("Ingrese ID del mensaje a eliminar: ");
        String entrada = teclado.nextLine();
        int eleccion;
        try {
            eleccion=Integer.parseInt(entrada);
            
            String mensaje = chat.getMensaje(eleccion);
            System.out.println("¿Desea eliminar el siguiente mensaje? ingrese \"si\" para confirmar: ");
            entrada = teclado.nextLine();
            if(entrada.toLowerCase().equals("si")){
                System.out.println("Eliminando mensaje");
                if(chat.eliminarMensaje(eleccion)){
                    System.out.println("Mensaje eliminado satisfactoriamente.");
                }
            }
            else{
                System.out.println("Eliminar mensaje cancelado");
            }
            
        }
        catch (NumberFormatException excepcion) {
            System.out.println("Elección incorrecta, ingrese un número válido");
        }
        catch (IndexOutOfBoundsException exception){
            System.out.println("ID de mensaje inválido, debe estar entre los mensajes del chat");
        }
    }
    
    public void eliminarMensajes(){
        chat.setMensajes(new ArrayList<>());
    }
    
    private void volver(){
        /*
        FALTA, cuando sea una ventana, se tiene que destruir
        */
    }
}
