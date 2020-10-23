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
public class Pilha_Vetor {
    private Object item[];
    private int topo;
    
    //Cria uma pilha vazia
    public Pilha_Vetor(int tanMax){
        this.item = new Object[tanMax];
        this.topo = 0;
    }
    
    //Verifica se a pilha está vazia
    public boolean vazia(){
        return this.topo == 0;
    }
    
    //Empilhar um elemento 
    public void push(Object x) throws Exception{
        if(this.topo == this.item.length){
            throw new Exception("Erro: Pilha está cheia");
        }
        this.item[topo] = x;
        this.topo++;
    }
    
     public Object pop() throws Exception{
        if(this.vazia()){
            throw new Exception("Erro: Pilha está vazia");
        }
        this.topo--;
        return this.item[topo];
    }
     
     public int size(){
         return this.topo;
     }
    
    
}
