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
public class Ex_03_Conversao_Decimal_Binario {
    public static void main(String[] args) throws Exception {
        
         Scanner entrada = new Scanner(System.in);
      
        System.out.println("Digite um Número");
        int num = entrada.nextInt();
        
        Pilha binario = new Pilha();
        
       while(num > 0){
        int result = num%2;
        binario.push(result);
        num = num/2;
        
       }
       
       String valor ="";
       while(!binario.vazia()){
          valor = valor + binario.pop();
       
       }
        System.out.println(valor);
        
    }
    
}
