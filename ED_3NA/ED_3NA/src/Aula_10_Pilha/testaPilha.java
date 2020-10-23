/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_10_Pilha;

/**
 *
 * @author Gabriel
 */
public class testaPilha {
    public static void main(String[] args) throws Exception {
       /* Pilha_Vetor p = new Pilha_Vetor(10);
        p.push(9);
        p.push(910);
        p.push(1);  
        p.push(2);
        
        System.out.println(p.size());
        System.out.println(p.pop());
        System.out.println(p.pop());
        System.out.println(p.pop());
        System.out.println(p.pop());
         System.out.println(p.size());*/
         
         Pilha p2 = new Pilha();
         
         p2.push(20);
         p2.push(10);
        System.out.println( p2.pop());
         System.out.println(p2.size());
                 
    }
    
}
