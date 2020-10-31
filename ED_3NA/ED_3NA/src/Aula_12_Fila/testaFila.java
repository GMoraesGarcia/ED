/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_12_Fila;

/**
 *
 * @author Gabriel
 */
public class testaFila {
    public static void main(String[] args) throws Exception {
        Fila q = new Fila();
        
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(20);
       
        
        System.out.println(q.dequeue());
         int i = q.size();
        System.out.println(i);
        System.out.println(q);
    }
    
}
