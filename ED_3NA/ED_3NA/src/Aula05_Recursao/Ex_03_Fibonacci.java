/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula05_Recursao;

/**
 *
 * @author Gabriel
 */
public class Ex_03_Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(30));
    }
    
    public static int fibonacci(int n){
        if(n == 1)
            return 0;
        if(n == 2)
            return 1;
        else
        return fibonacci(n-1) + fibonacci(n-2);
    }
            
    
}
