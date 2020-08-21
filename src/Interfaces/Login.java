/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import ClasesBases.Idioma;
import ClasesBases.Interes;
import ClasesBases.Usuario;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author ivanm
 */
public class Login {

    ArrayList<Idioma> idiomas = new ArrayList<>();
    ArrayList<Interes> intereses = new ArrayList<>();
    ArrayList<Usuario> usuarios = new ArrayList<>();
    Usuario usuarioNuevo;
    Scanner teclado = new Scanner(System.in);

    public Login() {

        idiomas.add(new Idioma(idiomas.size(), "Ingles"));
        idiomas.add(new Idioma(idiomas.size(), "Español"));
        idiomas.add(new Idioma(idiomas.size(), "Japones"));
        idiomas.add(new Idioma(idiomas.size(), "Italiano"));
        idiomas.add(new Idioma(idiomas.size(), "Ruso"));
        idiomas.add(new Idioma(idiomas.size(), "Frances"));

        intereses.add(new Interes(intereses.size(), "Tecnologia"));
        intereses.add(new Interes(intereses.size(), "Deportes"));
        intereses.add(new Interes(intereses.size(), "Politica"));
        intereses.add(new Interes(intereses.size(), "Religion"));
        intereses.add(new Interes(intereses.size(), "Turismo"));

        usuarios.add(new Usuario(usuarios.size(), "Maria", 0, 1, 3));
        usuarios.add(new Usuario(usuarios.size(), "Carlos", 1, 2, 0));
        usuarios.add(new Usuario(usuarios.size(), "Luis", 3, 0, 4));
        usuarios.add(new Usuario(usuarios.size(), "Ivan", 5, 3, 1));

        System.out.println("Lista de Idiomas");
        listar(idiomas);
        System.out.println("\n");

        System.out.println("Lista de Intereses");
        listar(intereses);
        System.out.println("\n");

        System.out.println("Lista de Usuarios registrados");
        listarUsuario(usuarios);
        System.out.println("\n");

        usuarioNuevo = new Usuario(usuarios.size(), "Said", 2, 5, 0);
        System.out.println("Presione la tecla Enter para registar a: ");
        System.out.println(usuarioNuevo.toString());
        try {
            String seguir = teclado.nextLine();
            registrarUsuario();
        } catch (Exception e) {
        }

        

    }

    private void registrarUsuario() {
        
        usuarios.add(usuarioNuevo);
        System.out.println("Se registro el usuario Said");

        System.out.println("Lista de Usuarios registrados");
        listarUsuario(usuarios);
    }

    private void listar(ArrayList lista) {
        lista.forEach((o) -> {
            System.out.println(o.toString());
        });
    }
    
    private void listarUsuario(ArrayList<Usuario> lista) {
        lista.forEach((u) -> {
            System.out.println(u.toString() 
                    + " Idioma Materno: " + idiomas.get(u.getIdIdiomaMaterno()).getNombreIdioma()
                    + ", Idioma Preferido: "+ idiomas.get(u.getIdIdiomaPreferido()).getNombreIdioma()
                    + ", Interes: "+ intereses.get(u.getIdInteres()).getNombreInteres()
            );
        });
    }

    private void cargarListaIdiomas() {

    }

    private void cargarListaIntereses() {

    }

}
