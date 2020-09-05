/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula03_desempenho;
import Aula01_Vetores.EX_04_Inverter;
import static Aula01_Vetores.EX_04_Inverter.exibeVetor;
import static Aula01_Vetores.EX_04_Inverter.leInteiroPositivo;
import static Aula01_Vetores.EX_04_Inverter.leVetor;
import static Aula01_Vetores.EX_04_Inverter.leVetorAleatorio;
import static Aula04_Ex_ADO_01.Ex_06_Interseccao.bubbleSort;
/**
 *
 * @author Gabriel
 */
public class EX_08_Intercalacao {
    public static void main(String[] args) {
        int n  = leInteiroPositivo();
        int m  = leInteiroPositivo();
        
        int[] v1 = leVetorAleatorio(n);
        int[] v2 = leVetorAleatorio(m);
        bubbleSort(v1);
         bubbleSort(v2);
         
         exibeVetor(v1);
         exibeVetor(v2);
        exibeVetor(intercala(v1, v2));
        exibeVetor(intercalaCorrecao(v1, v2));
    }
    
    public static int[] intercala(int[] v1,int[] v2){
         int v3[] = new int[v1.length+v2.length];
        int k=0,i=0,j=0,count =0;//count contador de passos
        while(i<v1.length && j<v2.length){
            if(v1[i]< v2[j]){
                v3[k++] = v1[i++];
               
            }
            else{
                v3[k++] = v2[j++];
               
            }
        }
         while(i<v1.length){
            v3[k++] = v1[i++];
            count++;
             }
             while(j<v2.length){
            v3[k++] = v2[j++];
            count++;
             }
    return v3;
        
    }
    
    public static int[] intercalaCorrecao(int v1[], int v2[]){
        int v3[] = new int[v2.length+v1.length];
        int i =0,j=0,k=0;
        while(k<v3.length){
            if(i == v1.length)
                v3[k++] = v2[j++];
            
            else if(j == v2.length)
                v3[k++] = v1[i++];
            
            else if(v1[i]< v2[j])
                v3[k++] = v1[i++];
            
            else
                v3[k++] = v2[j++];
            
        }
            return v3;
    }
    
}
