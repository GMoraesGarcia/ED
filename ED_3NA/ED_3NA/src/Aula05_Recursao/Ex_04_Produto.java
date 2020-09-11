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
public class Ex_04_Produto {
    public static void main(String[] args) {
        int a = leInteiroPositivo();
        int b = leInteiroPositivo();
        
        System.out.println(produto(a,b));
        
    }

    public static int produto(int a, int b) {
        if(b ==1)
            return a;
        
        return a + produto(a, b-1);
            
    }
    
    
}
