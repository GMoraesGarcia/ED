/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula02_Lista;
import static Aula01_Vetores.EX_01_BuscaLinear.buscaLinear;
import Aula01_Vetores.EX_04_Inverter;
import static Aula02_Lista.EX_05_Inserir.exibeVetorTam;
import static Aula02_Lista.EX_05_Inserir.leVetorAleatorioTam;
import java.util.Scanner;
/**
 *
 * @author Gabriel
 */
public class EX_06_Remover {
    public static void main(String[] args) {
        int n = EX_04_Inverter.leInteiroPositivo();
        int []v = new int [30];
         
        leVetorAleatorioTam(v, n);
        exibeVetorTam(v, n);
   
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número que deseja remover: ");
        int x = sc.nextInt();
        
        int pos = buscaLinearTam (v, n, x);
        if (pos != -1){
             int novoN = remover(v,n,pos); 
             exibeVetorTam(v,novoN);
        } else {
            System.out.printf("\nO elemento %d NAO está no vetor", x);
        }
        /*EX_04_Inverter.exibeVetor(v);
        remove(v, 20);
        EX_04_Inverter.exibeVetor(v);*/
        
    }
    public static int buscaLinearTam(int[] v, int n, int x) {
       for (int i=0; i< n;i++){
           if(v[i] == x) {
               return i; //Achou
           }
       }
       return -1; //Não achou
    }
    
    public static void remove(int[]v,int x){
        int j =0;
        for(int i =0;i<v.length;i++){
            if(v[i] == x){
                v[i] =0;
                j=i;
               while(j<v.length-1){
                    int inter = v[j];
                    v[j] = v[j+1];
                    v[j+1] = inter;
                    j++;
                }
            }
        }    
    }
    public static int remover(int v[],int n, int pos){
        for(int i =pos;i<n;i++){
            v[i] = v[i+1];
        }
        return n-1;
    }
    
    
}
