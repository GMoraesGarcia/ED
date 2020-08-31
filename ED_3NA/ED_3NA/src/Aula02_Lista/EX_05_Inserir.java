/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula02_Lista;
import Aula01_Vetores.EX_04_Inverter;
import static Aula01_Vetores.EX_04_Inverter.exibeVetor;
/**
 *
 * @author Gabriel
 */
public class EX_05_Inserir {
    public static void main(String[] args) {
        int n = EX_04_Inverter.leInteiroPositivo();
        int[]v = new int[30];
        leVetorAleatorioTam(v, n);
        exibeVetorTam(v, n);
       // insere(v, 7, 0); 
        int novov =insercao(v, n, 10, 5);
        exibeVetorTam(v, novov);
    }
    public static void leVetorAleatorioTam(int v[],int n){
        for(int i = 0;i<n;i++){
            v[i] = (int)(Math.random()*50);
        }
    }
    public static void exibeVetorTam(int[] v, int n) {
        for (int i=0; i < n;i++){
            System.out.print(v[i]+ " ");
       }
       System.out.println("");
    }
    
    public static void insere(int[]v,int x,int p){
        int i = v.length-1;
        while(i>p){
            v[i] = v[i-1];
            v[i-1] = x;
            i--;
        }
    }
    public static int insercao(int[] v, int n, int x, int pos) {//CORREÇÃO
        for (int i = n; i > pos; i--){
            v[i] = v[i-1];
        }        
        //i = pos
        v[pos] = x;
           
        return n+1;
    }
    
}
