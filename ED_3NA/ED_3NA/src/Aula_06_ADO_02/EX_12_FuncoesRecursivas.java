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
         
        //System.out.println(mediaAritimetica(v, 0, 0));
         System.out.println(MenorValor(v, 0, v[0]));
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
    
    public static int MenorValor(int v[],int i, int n){
        if (i == v.length)
            return n;
        
        if(MenorValor(v, i+1,v[i]) < n)
            n = v[i];
      
        return MenorValor(v, i+1,n);
        
        
    }
    public static double mediaAritimetica(int v[],int i,double n){
    
        if(i == v.length)
            return n/i;
        
          return  mediaAritimetica(v, i+1, n+v[i]);
    }
    
}
