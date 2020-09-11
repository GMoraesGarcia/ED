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
public class Ex_06_SomaDigitos {
    public static void main(String[] args) {
     int n = leInteiroPositivo();
        System.out.println(SomaDigitos( n));
    }

    public static int SomaDigitos(int n) {
        if(n <10)
            return n;
        
        return (n%10) + SomaDigitos(n/10);
        
        
    }
    
}
