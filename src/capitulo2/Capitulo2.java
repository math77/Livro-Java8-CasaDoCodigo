/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author matheus
 */
public class Capitulo2 {
    
    public static void main(String[] args) {
        Usuario user1 = new Usuario("Matheus Emanuel", 100);
        Usuario user2 = new Usuario("Ozanira Feitoza", 50);
        Usuario user3 = new Usuario("Gervane Monay", 80);
        
        //Lista imutavel
        List<Usuario> usuarios = Arrays.asList(user1, user2, user3);
        
        System.out.println("Forma antiga: ");
        for(Usuario u : usuarios){
            System.out.println(u.getNome());
        }
        
        System.out.println("");
        System.out.println("Nova forma - 1:");
        Consumer<Usuario> mostrador = new Consumer<Usuario>(){
          @Override
          public void accept(Usuario u){
              System.out.println(u.getNome());
          }  
        };
        
        usuarios.forEach(mostrador);
        
        System.out.println("");
        System.out.println("Nova forma - 2 - Codigo reduzido:");
        usuarios.forEach(new Consumer<Usuario>(){
            @Override
            public void accept(Usuario u){
                System.out.println(u.getNome());
            }
        });
        
        System.out.println("");
        System.out.println("Nova forma - 3 - Utilizando Lambda: ");
        usuarios.forEach(u -> System.out.println(u.getNome()));
    }
    
}
