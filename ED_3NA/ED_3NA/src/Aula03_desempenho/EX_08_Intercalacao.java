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
         exibeVetor(v1);
         exibeVetor(v2);
        exibeVetor(intercala(v1, v2));
    }
    
    public static int[] intercala(int[] v1,int[] v2){
         int v3[] = new int[v1.length+v2.length];
        int k=0,i=0,j=0,count =0;//count contador de passos
        while(i<v1.length && j<v2.length){
            if(v1[i]< v2[j]){
                v3[k++] = v1[i++];
                count++;
            }
            else{
                v3[k++] = v2[j++];
                count ++;
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
    
}
