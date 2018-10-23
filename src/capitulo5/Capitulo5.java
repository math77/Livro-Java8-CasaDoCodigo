/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author matheus
 */
public class Capitulo5 {
    public static void main(String[] args) {
        
        Usuario user1 = new Usuario("Matheus Emanuel", 450);
        Usuario user2 = new Usuario("Heloiza Soares", 300);
        Usuario user3 = new Usuario("Erik Ribeiro", 350);
        Usuario user4 = new Usuario("Franciane", 100);
        Usuario user5 = new Usuario("Jimmy Page", 150);
        
        List<Usuario> usuarios = new ArrayList<Usuario>();
        usuarios.add(user1);
        usuarios.add(user2);
        usuarios.add(user3);
        usuarios.add(user4);
        usuarios.add(user5);
        
        Comparator<Usuario> comparator = new Comparator<Usuario>(){
            @Override
            public int compare(Usuario u1, Usuario u2) {
                return u1.getNome().compareTo(u2.getNome());
            }
            
        };
        
        Collections.sort(usuarios, comparator);
        
        //Lambda <3
        Comparator<Usuario> comparator2 = (u1, u2) -> u1.getNome().compareTo(u2.getNome());
        Collections.sort(usuarios, comparator2);
        
        //Sem variavel local.
        Collections.sort(usuarios, (u1, u2) -> u1.getNome().compareTo(u2.getNome()));
        
        //Default method sort() in List
        usuarios.sort((u1, u2) -> u1.getNome().compareTo(u2.getNome()));
        usuarios.forEach(u -> System.out.println(u.getNome()));
        
        Comparator<Usuario> comparator3 = Comparator.comparing(u -> u.getNome());
        usuarios.sort(comparator3);
        
        //Lambda <3
        usuarios.sort(Comparator.comparing(u -> u.getNome()));
        
        //Ordenando por pontos.
        usuarios.sort(Comparator.comparing(u -> u.getPontos()));
        usuarios.forEach(u -> System.out.println(u.getPontos()));
    }
}
