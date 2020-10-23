/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_09_ADO_03;

import java.util.Scanner;
import Aula_09_ADO_03.Testa_ADO;
/**
 *
 * @author Gabriel
 */
public class Testa_ADO {
    public static void main(String[] args) {
        ListaEncadeada lst1 = new ListaEncadeada();
       // lst1.geraLista(4);
        System.out.println(lst1);
        
        ListaEncadeada lst2 = new ListaEncadeada();
       // lst2.geraLista(5);
        System.out.println(lst2);
    }
    public  void geraLista(int n){
        Scanner entrada = new Scanner(System.in);
        for(int i =0;i<n;i++){
            System.out.println("elemento: ");
            int elemento = entrada.nextInt();
            this.geraLista(n);
        }
    
    }
    
}
