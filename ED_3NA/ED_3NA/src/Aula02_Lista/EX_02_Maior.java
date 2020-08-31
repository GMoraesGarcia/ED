/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula02_Lista;

import Aula01_Vetores.EX_04_Inverter;

/**
 *
 * @author Gabriel
 */
public class EX_02_Maior {
    public static void main(String[] args) {
        int n = EX_04_Inverter.leInteiroPositivo();
        int[] v = EX_04_Inverter.leVetorAleatorio(n);
        
        EX_04_Inverter.exibeVetor(v);
        System.out.println("Indice do maior valor: " + maior(v));
        System.out.println("Indice do Menor valor: " + menor(v));
    }
    
    public static int maior(int []v){
        int j =0;
        for(int i =1;i<v.length;i++){
            if(v[i] > v[j])
                j=i;
      
        }
        return j;
    }
       public static int menor(int []v){
        int j =0;
        for(int i =1;i<v.length;i++){
            if(v[i] < v[j])
                j=i;
            
        }
        return j;
    }
    
}
