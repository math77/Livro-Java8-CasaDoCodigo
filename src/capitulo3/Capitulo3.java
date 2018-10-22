/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo3;

/**
 *
 * @author matheus
 */
public class Capitulo3 {
    
    public static void main(String[] args) {
        
        Validador<String> validaCEP = new Validador<String>(){
            @Override
            public boolean valida(String t) {
                return t.matches("[0-9]{5}-[0-9]{3}");
            }
        };
        
        Validador<String> validaCEPlambda = valor -> valor.matches("[0-9]{5}-[0-9]{3}");
        
        System.out.println("Usando classe anonima: ");
        System.out.println(validaCEP.valida("59200-000"));
        System.out.println("");
        System.out.println("Usando lambda: ");
        System.out.println(validaCEPlambda.valida("59200-000"));
        
        final int numero = 7;
        
        new Thread(()->{
            System.out.println(numero); 
        }).start();
        
       /*
        
        int numero = 7;
        
        new Thread(()->{
            System.out.println(numero); 
        }).start();
        
        numero = 10
        
        Nao compila pq esta acontecendo uma nova atribuçao a variavel o que nao e permitido no lambda.
        
        */
    }
    
}
