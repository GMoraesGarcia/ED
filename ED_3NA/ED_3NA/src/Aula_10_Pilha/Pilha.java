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
public class Pilha {
    private No topo;
    private int tam;
    
     // Criar a pilha vazia  
    public Pilha(){
        this.topo =null;
        this.tam =0;
    }
    //Verificar se a pilha esta vazia
    public boolean vazia(){
        return this.tam ==0;
    }
    
    //Empilhar um elemento no topo(inserção no inicio)
    public void push(Object x){
       No novo = new No(x,topo);
        topo = novo;
        this.tam++;
    }
    
     public Object pop() throws Exception{
         if(vazia())
             throw new Exception("Erro: Pilha está vazia");
     
         Object elemento = this.topo.getElemento();
         topo = topo.getProx();
         this.tam--;
         return elemento; 
         
    }
     
     //Tamanho da pilha em tempo constante
     public int size(){
         return this.tam;
     }
     
    
    
    
}
