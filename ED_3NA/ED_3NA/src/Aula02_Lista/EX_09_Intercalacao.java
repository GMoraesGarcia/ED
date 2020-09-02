/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula02_Lista;
import Aula01_Vetores.EX_04_Inverter;
import static Aula01_Vetores.EX_04_Inverter.exibeVetor;
import static Aula01_Vetores.EX_04_Inverter.leInteiroPositivo;
import static Aula01_Vetores.EX_04_Inverter.leVetor;
/**
 *
 * @author Gabriel
 */
public class EX_09_Intercalacao {
    public static void main(String[] args) {
        int n  = leInteiroPositivo();
        int m  = leInteiroPositivo();
        
        int[] v1 = leVetor(n);
        int[] v2 = leVetor(m);
         exibeVetor(v1);
         exibeVetor(v2);
         int v3[] = new int[v1.length+v2.length];
        intercala(v1, v2, v3);
       
        exibeVetor(v3);
       
    }
    
    public static void intercala(int[] v1,int[] v2,int v3[]){
        int k=0,i=0,j=0;
        while(k< v3.length){
            if(i<=j){
                v3[k++] = v1[i++];
                
            }
            else{
                v3[k++] = v2[j++];
                
            }
        }
        
        
    }
    
}
