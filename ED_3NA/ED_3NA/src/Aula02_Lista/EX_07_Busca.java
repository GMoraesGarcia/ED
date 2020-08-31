/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula02_Lista;
import Aula01_Vetores.EX_04_Inverter;
/**
 *
 * @author Gabriel
 */
public class EX_07_Busca {
    public static void main(String[] args) {
        int n = EX_04_Inverter.leInteiroPositivo();
        int [] v = EX_04_Inverter.leVetor(n);
        EX_04_Inverter.exibeVetor(v);
        System.out.println(buscar(v, 15)); 
    }
    
    public static int buscar (int[] v, int x){
        for(int i =0;i<v.length;i++){
            if(v[i] ==x)
                return i;
    }
        return -1;
    }   
}