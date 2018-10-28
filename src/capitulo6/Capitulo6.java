/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo6;

import java.util.ArrayList;
import java.util.Comparator;
import static java.util.Comparator.comparing;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 *
 * @author matheus
 */
public class Capitulo6 {
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
        
        //Primeira forma de fazer
        usuarios.forEach(Usuario::tornaModerador);
        
        //Segunda forma de fazer.
        Consumer<Usuario> tornaModerador = Usuario::tornaModerador;
        usuarios.forEach(tornaModerador);
        
        //Ordenando com method reference.
        usuarios.sort(Comparator.comparing(Usuario::getNome));
        
        //Com importe estatico.
        Function<Usuario, String> byName = Usuario::getNome;
        usuarios.sort(comparing(byName));
        
        Comparator<Usuario> ordenar = Comparator.comparing(Usuario::getNome).thenComparing(Usuario::getPontos);
        usuarios.sort(ordenar);
        
        usuarios.sort(Comparator.nullsLast(Comparator.comparing(Usuario::getNome)));
        
        //Ordem inversa.
        usuarios.sort(Comparator.comparing(Usuario::getNome).reversed());
        
        //Referenciando metodos que recebem argumentos.
        usuarios.forEach(System.out::println);
    }
}
