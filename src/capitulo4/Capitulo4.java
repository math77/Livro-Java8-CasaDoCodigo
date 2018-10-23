/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 *
 * @author matheus
 */
public class Capitulo4 {
    public static void main(String[] args) {
        Usuario user1 = new Usuario("Matheus Emanuel", 450);
        Usuario user2 = new Usuario("Heloiza Soares", 300);
        Usuario user3 = new Usuario("Erik Ribeiro", 350);
        Usuario user4 = new Usuario("Franciane", 100);
        Usuario user5 = new Usuario("Jimmy Page", 150);
        
        
        List<Usuario> users = Arrays.asList(user1, user2, user3);
        
        Consumer<Usuario> mostraMsg = u -> System.out.println("Antes de imprimir os nomes...");
        Consumer<Usuario> imprimeNomes = u -> System.out.println(u.getNome());
        users.forEach(mostraMsg.andThen(imprimeNomes));
        
        //Primeira forma.
        
        Predicate<Usuario> predicado = new Predicate<Usuario>(){
            @Override
            public boolean test(Usuario u) {
                return u.getPontos() <= 150;
            }
            
        };
        
        
        List<Usuario> lista = new ArrayList<Usuario>();
        lista.add(user1);
        lista.add(user2);
        lista.add(user3);
        lista.add(user4);
        lista.add(user5);
        
        lista.removeIf(predicado);
        lista.forEach(u -> System.out.println(u.getNome()));
        
        //Segunda forma
        lista.removeIf(u -> u.getPontos() <= 150);
        lista.forEach(u -> System.out.println(u.getNome()));
    }
}
