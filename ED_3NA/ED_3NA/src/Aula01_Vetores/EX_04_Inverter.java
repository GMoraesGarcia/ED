/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula01_Vetores;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class EX_04_Inverter {

    public static void main(String[] args) {
        int n = leInteiroPositivo();
        System.out.println(n);
        int[] v = leVetorAleatorio(n);
        exibeVetor(v);
        inverter(v);
        exibeVetor(v);
    }
    
    public static int leInteiroPositivo(){
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            System.out.print("\n Digite um numero inteiro positivo");
            n = sc.nextInt();
            
        }while(n<0 || n>10000);   
    return n;
    }

    public static int[] leVetor(int n) {
         Scanner sc = new Scanner(System.in);
        int[] v = new int[n];
        
        System.out.print("\n Digite os elementos do vetor: ");
        for(int i = 0;i<v.length;i++){
            System.out.printf("v[%d] = ", i);
            v[i] = sc.nextInt();
        }
        return v;
       }
    
    public static int[] leVetorAleatorio(int n) { 
        int[] v = new int[n];
        for(int i = 0;i<v.length;i++){
         
            v[i] = (int) (Math.random()*100);
        }
        return v;
       }

    public static void exibeVetor(int[] v) {
        for(int i=0;i<v.length;i++){
            System.out.print(v[i] + " ");
        }
        System.out.println();
    }

    public static void inverter(int[] v) {
            int c =0;
            int f = v.length-1;
            
            while(c<=f){          
            int aux = v[c];
            v[c] = v[f];
            v[f] = aux;
            c++;
            f--;
            } 
    }
    
}
