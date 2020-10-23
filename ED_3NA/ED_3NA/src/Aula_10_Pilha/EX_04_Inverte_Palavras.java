/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_10_Pilha;

/**
 *
 * @author Gabriel
 */
public class EX_04_Inverte_Palavras {
    public static void main(String[] args) throws Exception {
        String p = "ESTE EXERCÍCIO É MUITO FÁCIL.";
      String result =  inverte(p);
       
        System.out.println(result);
    }
    public static String inverte(String palavra) throws Exception{
        Pilha p = new Pilha();
        String pNova[] = null;
        String res = "";
       
        while(palavra!= null){
         pNova = palavra.split(" ");
          for(int i =0;i<pNova.length;i++){
            char caracteres = palavra.charAt(i);
            p.push(caracteres);
        }
           String p_inv = "";
           
         while(!p.vazia()){
           p_inv = p_inv + p.pop();
 
       }
         
        }    
      
        return res ;
     }
    
}
