/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADO03;
import Aula_08_Remocao.ListaEncadeada11.*;
import ADO03.Ex_ListaEncadeada.*;
import Aula_08_Remocao.ListaEncadeada11;
/**
 *
 * @author Gabriel
 */
public class teste {
    public static void main(String[] args) {
        Ex_ListaEncadeada list1 = new Ex_ListaEncadeada();
        Ex_ListaEncadeada list2 = new Ex_ListaEncadeada();
        
        list1.insereOrdenado(10);
        list1.insereOrdenado(9);
        list1.insereOrdenado(0);
        list1.insereOrdenado(20);
        
        list2.insereOrdenado(10);
        list2.insereOrdenado(40);
        list2.insereOrdenado(50);
        list2.insereOrdenado(70);
        list2.insereOrdenado(30);
        list2.insereOrdenado(10);
       
        
        
        Ex_ListaEncadeada ls = new Ex_ListaEncadeada();
       System.out.println(list1);
        System.out.println(list2);
        ls = list1.intercalacao(list2);
        
        System.out.println(ls);
        
   }
    
}
