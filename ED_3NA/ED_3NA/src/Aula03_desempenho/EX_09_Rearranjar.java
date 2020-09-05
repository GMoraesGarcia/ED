/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula03_desempenho;

import static Aula01_Vetores.EX_04_Inverter.exibeVetor;
import static Aula01_Vetores.EX_04_Inverter.leInteiroPositivo;
import static Aula01_Vetores.EX_04_Inverter.leVetorAleatorio;
import static Aula03_desempenho.EX_03_TrocarMaiorMenor.troca;

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
        int pivo = v[0];
        int i =1,j =v.length-1;
        while(i<=j){
            if(v[i]>pivo && v[j]<=pivo){
            troca(v,i,j);
            i++;j--;
            }
            else if(v[j]>pivo){
                j--;
            }
            else
                i++;
        }
        troca(v,0,j);
    }
    
}
