/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_07_insercao_busco;



/**
 *
 * @author Gabriel
 */
public class TestaListaEncadeada1 {
    public static void main(String[] args) {
        ListaEncadeada1 lst = new ListaEncadeada1();
        System.out.println(lst);
        
        lst.insereInicio(7);
        lst.insereInicio(5);
        lst.insereInicio(3);
       
        lst.insereFinal(12);
        
        lst.insereFinalR(20);
        
        lst.insereOrdenado(9);
        lst.insereOrdenado(1);
        
        lst.insereOrdenadaR(10);
        lst.insereOrdenadaR(0);
       lst.insereOrdenadaR(30);
       
        System.out.println( lst.buscaLinearIT2(3));
        System.out.println(lst.buscaLinearR2(1));
        System.out.println(lst);
       
        lst.removeInicio();
        System.out.println(lst);
    }
   
    
    
}
