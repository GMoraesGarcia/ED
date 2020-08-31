/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula02_Lista;
import static Aula01_Vetores.EX_01_BuscaLinear.buscaLinear;
import Aula01_Vetores.EX_04_Inverter;
import static Aula01_Vetores.EX_04_Inverter.exibeVetor;
import Aula02_Lista.EX_01_BuscaLinear;
import static Aula02_Lista.EX_05_Inserir.exibeVetorTam;
import org.w3c.dom.events.Event;
/**
 *
 * @author Gabriel
 */
public class EX_08 {
    public static void main(String[] args) {
        int n = EX_04_Inverter.leInteiroPositivo();
        int m = EX_04_Inverter.leInteiroPositivo();
        int []v1 = EX_04_Inverter.leVetorAleatorio(n);
        int []v2 = EX_04_Inverter.leVetorAleatorio(m);
        int[] v3 = new int [n];
        int vUniao[] = new int[n+m];
        
        exibeVetor(v1);
        exibeVetor(v2);
        int inter = interseccao(v1, v2, v3);
        exibeVetorTam(v3, inter);
        
        int uniao = uniao(v1, v2, vUniao);
        exibeVetorTam(vUniao,uniao);
      
        
        
    }
    public static int interseccao(int[] v1,int[] v2,int v3[]){
        int k =0;
        
         for(int i =0;i<v1.length;i++){
                 if(buscaLinear(v2,v1[i])){
                    v3[k] = v1[i];
                    k++;
                }
        }
        return k;
    }
    public static int uniao(int []v1,int[]v2,int vUniao[]){
        int k=0;
         for(int i =0;i<v1.length;i++){
             vUniao[k] = v1[i];
             k++;
             }
             for(int j =0;j<v2.length;j++){
                 if(!buscaLinear(v1, v2[j]))
                     vUniao[k] = v2[j];
                     k++;
             }
         
     return k;
    }
    
}

