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

@FunctionalInterface
interface Validador<T> {
    boolean valida(T t);
}
