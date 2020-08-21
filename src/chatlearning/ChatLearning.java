/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatlearning;


import ClasesBases.Usuario;
import Interfaces.Login;
import java.io.IOException;
import Interfaces.ChatVentana;
import ClasesBases.Chat;

/**
 *
 * @author ivanm
 */
public class ChatLearning {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        //Login l = new Login();
        Usuario usuario1 = new Usuario(0,"David", 1, 0, 0);
        Usuario usuario2 = new Usuario(1,"Iván", 1, 0, 0);
        Chat chat = new Chat(usuario1, usuario2);
        ChatVentana chatVentana = new ChatVentana(chat);
        chatVentana.mostrarVentana();
    }
    
}
