/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_06_ADO_02;

import static Aula01_Vetores.EX_04_Inverter.exibeVetor;
import static Aula01_Vetores.EX_04_Inverter.leInteiroPositivo;
import static Aula01_Vetores.EX_04_Inverter.leVetorAleatorio;

/**
 *
 * @author Gabriel
 */
public class EX_12_FuncoesRecursivas {
    public static void main(String[] args) {
        int a = leInteiroPositivo();
       
        int v[] = leVetorAleatorio(a);
        exibeVetor(v);
        // int b = leInteiroPositivo();
         
        System.out.println(MenorValor(v, 1));
         //System.out.println(Soma(v, 0,0));
    }
    public static int BuscaLinear(int v[],int n,int i){
        if(v[i] == n)
            return i;
        
        return BuscaLinear(v, n, i+1);
    }
    
    public static int Soma(int v[],int i,int n){
       
        if(i == v.length)
            return n;
        
          return  Soma(v, i+1, n+v[i]);
    }
    
    public static int MenorValor(int v[],int i){
        int j =0;
        if (i == v.length)
            return v[j];
        if(MenorValor(v, i +1) < MenorValor(v, i))
            j=i;
      
        return MenorValor(v, i+1);
        
        
    }
    
}
