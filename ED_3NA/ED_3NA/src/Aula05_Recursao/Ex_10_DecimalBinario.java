/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula05_Recursao;

import static Aula01_Vetores.EX_04_Inverter.leInteiroPositivo;

/**
 *
 * @author Gabriel
 */
public class Ex_10_DecimalBinario {
    public static void main(String[] args) {
         int n = leInteiroPositivo();
         
         System.out.println(decimalBinario(n));
    }

    public static int decimalBinario(int n) {
        if(n < 2)
            return n;
        
        return(10 * decimalBinario(n/2)) + n%2; 
    }
        
         
         

}
