/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_12_Fila;

import Aula_10_Pilha.No;

/**
 *
 * @author Gabriel
 */
public class Batata_Quente {
    public static void main(String[] args) throws Exception {
        Fila q = new Fila();
        q.enqueue("Leo");
        q.enqueue("Marcelo");
        q.enqueue("Dayana");
        q.enqueue("Pedro");
        q.enqueue("Castro");
        q.enqueue("Bia");
        q.enqueue("Moraes");
        q.enqueue("Matheus");
        
       Object vencedor = batataQuente(q,4);
        System.out.println("Troxa " +vencedor);
        
    }

    private static Object batataQuente(Fila q, int k) throws Exception {
       while(q.getFirst().getProx()!= null){
            for(int j =0;j<k;j++){
                Object p = q.dequeue();
                q.enqueue(p);
            }
            System.out.println("F " + q.dequeue());
        }
        return q.dequeue();
    }
    
}
