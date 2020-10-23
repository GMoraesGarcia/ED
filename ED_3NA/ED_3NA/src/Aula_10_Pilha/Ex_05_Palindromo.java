/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_10_Pilha;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class Ex_05_Palindromo {
    public static void main(String[] args) throws Exception {
      Scanner entrada = new Scanner(System.in);
      
        System.out.println("Digite uma palavra");
        String palavra = entrada.nextLine();
        
        Pilha p = new Pilha();
        for(int i =0;i<palavra.length();i++){
            char caracteres = palavra.charAt(i);
            p.push(caracteres);
        }
       String p_inv = "";
       while(!p.vazia()){
           p_inv = p_inv + p.pop();
       }
       if(palavra.equals(p_inv))
            System.out.println("é palindromo");
       else
            System.out.println("não é palindromo");
    }
    
}
