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
public class Ex_12_Correcao {
    public static void main(String[] args) {
         int a = leInteiroPositivo();
       
        int v[] = leVetorAleatorio(a);
        exibeVetor(v);
        int b = leInteiroPositivo();
        
        System.out.println(buscaLinearR(v, b));
    }
    
    public static int buscaLinearR(int v[], int x){
        return buscaLinearR(v,x,v.length);
    }

    public static int buscaLinearR(int[] v, int x, int i) {
        if(i == 0)
            return -1;
        if (x == v[i-1])
                return i-1;
        
      return buscaLinearR(v, x, i-1);
    }
    
    public static int menorVetorR(int v[]){
        return menorVetorR(v,v.length);
    }

    public static int menorVetorR(int[] v, int i) {
        if(i ==1)
            return v[0];
        if(v[i-1]<menorVetorR(v,i-1))
            return v[i-1];
        else
            return menorVetorR(v,i-1);
    }
    public static int somaVetorR(int v[]){
        return somaVetorR(v,0);
    }

    public static int somaVetorR(int[] v, int i) {
        if(i == v.length-1)
            return v[i];
        return v[i] + somaVetorR(v,i+1);
    }
    public static double mediaVetorR(int v[]){
        return mediaVetorR(v,0);
    }

    public static double mediaVetorR(int[] v, int i) {
        if(i == v.length-1)
            return v[i];
        return (v[i] + somaVetorR(v,i+1)/(double)v.length);
    }
    
    
}
