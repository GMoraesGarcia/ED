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
public class EX_01_BuscaLinear {
    public static void main(String[] args) {
        int n = EX_04_Inverter.leInteiroPositivo();
        int []v = EX_04_Inverter.leVetor(n);
        
        EX_04_Inverter.exibeVetor(v);
        System.out.println(quantidadeVezes(v, 20)); 
        
    }
    
    public static int quantidadeVezes(int []v,int x){
        int count =0;
        for(int i =0;i<v.length;i++){
            if(v[i] ==x){
                count++;
            }
        }  
        return count;
    }
    
}
