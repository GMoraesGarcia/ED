/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula04_Ex_ADO_01;

import static Aula01_Vetores.EX_01_BuscaLinear.buscaLinear;
import static Aula01_Vetores.EX_04_Inverter.exibeVetor;
import static Aula01_Vetores.EX_04_Inverter.leInteiroPositivo;
import static Aula01_Vetores.EX_04_Inverter.leVetorAleatorio;
import static Aula03_desempenho.EX_03_TrocarMaiorMenor.troca;


/**
 *
 * @author Gabriel
 */
public class Ex_06_Interseccao {
    public static void main(String[] args) {
        int n = leInteiroPositivo();
        int m = leInteiroPositivo();
        int []v1 =leVetorAleatorio(n);
        int []v2 = leVetorAleatorio(m);
    
        bubbleSort(v1);
        bubbleSort(v2);
        
        exibeVetor(v1);
        exibeVetor(v2);
      
 
  
    }
    public static void interseccao(int[] v1,int[] v2){
        int j =0,i=0;
        
      while(i<v1.length && j<v2.length){
             if(v1[i]==v2[j]){
                 j++;i++;
                  System.out.println(v1[i] +"");
             }
             else if(v1[i]<v2[j]){
                 i++;
             }
             else{
              j++;
                
             }
        }
       
    }

    public static void bubbleSort(int[] v1) {
        for(int i = 0;i<v1.length-1;i++){    
           for(int j = 0;j<v1.length-1-i ;j++) {
              if(v1[j]>v1[j+1])
                troca(v1,j,j+1);
            }
        }
    }
}

