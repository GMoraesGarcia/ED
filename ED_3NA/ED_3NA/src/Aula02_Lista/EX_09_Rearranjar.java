/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula02_Lista;

import static Aula01_Vetores.EX_04_Inverter.exibeVetor;
import static Aula01_Vetores.EX_04_Inverter.leInteiroPositivo;
import static Aula01_Vetores.EX_04_Inverter.leVetor;
import static Aula01_Vetores.EX_04_Inverter.leVetorAleatorio;

/**
 *
 * @author Gabriel
 */
public class EX_09_Rearranjar {
    public static void main(String[] args) {
        int n = leInteiroPositivo();
        int v[] = leVetorAleatorio(n);
        exibeVetor(v);
        
        rearranjar(v);
        exibeVetor(v);
        
    }

    public static void rearranjar(int[] v) {
        
        int i =1,j =v.length-1;
        while(i<=j){
            if(v[i]>v[0] && v[j]<=v[0]){
            int inter = v[i];
            v[i] = v[j];
            v[j] = inter;
            i++;j--;
            }
            else if(v[j]>v[0]){
                j--;
            }
            else
                i++;
        }
        int n =v[0];
        v[0] =v[j];
        v[j] =n;
    }
    
}
