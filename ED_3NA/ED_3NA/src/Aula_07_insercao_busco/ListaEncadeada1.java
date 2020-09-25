/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_07_insercao_busco;

import Aula_06_ADO_02.*;

/**
 *
 * @author Gabriel
 */
public class ListaEncadeada1 {
    private No ini;
    
    //Criar uma lista vazia
    public ListaEncadeada1(){
        this.ini=null;
    }
    
    //Verifica se a lista está vazia
    public boolean vazia(){
        return this.ini == null;
    }

    @Override
    public String toString() {
        String strLista = "";
        No temp = ini;
        
        while (temp != null){
            strLista = strLista + temp.getElemento() + " ";
            temp = temp.getProx();
        }
        return strLista;
                
    }
    
    public void insereInicio(int elemento){
        No novo = new No(elemento, ini);
        ini = novo;
    }
    
    public void insereFinal(int elemento){
        No novo = new No(elemento, null);
        No temp = ini;
        
        //Lista vazia
        if(temp == null){
            ini = novo;
        }
        else {
            //Lista 1 ou mais nós
            while (temp.getProx() != null){
                temp = temp.getProx(); 
            }
            temp.setProx(novo);
        }
    }
     public void insereFinalR(int elemento){
         insereFinalR(ini, elemento);
     }
    public void insereFinalR(No temp, int elemento){
        //Lista vazia
        if(temp == null){
            No novo = new No(elemento, null);
            ini = novo;
            return;
        }
       
            //Último nó
        if(temp.getProx() == null){ 
            No novo = new No(elemento, null);
            temp.setProx(novo);
            return;
        }
           
        insereFinalR(temp.getProx(),elemento);
         
        
    }
    
    public void insereOrdenado(int elemento){
        No novo = new No(elemento, ini);
        No temp  = ini;
        No anterior = null;
        
        while(temp != null && temp.getElemento() < novo.getElemento()){
            anterior = temp;
            temp = temp.getProx();
            
        }
        //Inserção no inicio
        if(anterior == null){
            ini = novo;
        }
         //Inserir entre 2 nós ou no final
        else{
            novo.setProx(temp);
            anterior.setProx(novo);
        }
    }
    public void insereOrdenadaR(int elemento){
        insereOrdenadaR(null,ini,elemento);
    }

    public void insereOrdenadaR(No anterior, No temp, int elemento) {
        
        //Lista Vazia
        if(temp == null && anterior == null){
             No novo = new No(elemento, ini);
             ini = novo;
             return;
        }
        
        //inserção no inicio
        if(anterior == null && temp.getElemento() > elemento){
             No novo = new No(elemento, ini);
             ini = novo;
             return;
        }
        //Inserção no final
        if(temp == null && anterior.getProx() == null){
            No novo = new No(elemento, null);
            anterior.setProx(novo);
            return;
        }
        //Inserção entre 2 nós
        if(anterior != null && temp.getElemento() > elemento){
             No novo = new No(elemento, ini);
            novo.setProx(temp);
            anterior.setProx(novo);
            return;
        }
        
        insereOrdenadaR(temp, temp.getProx(), elemento);
    }
    
    public boolean buscaLinearIT(int x){
        No temp = ini;
        while(temp != null){
            if(x == temp.getElemento())
                return true;
            
            temp = temp.getProx();
        }
        return false;
    
    }
    
    public boolean buscaLinearR(int x){
       
      return  buscarLinearR(ini,x);
    }

    public boolean buscarLinearR(No temp, int x) {
        if(temp.getElemento() == x){
            return true;
        }
        if(temp ==  null){
            return false;
        }
        
        return buscarLinearR(temp.getProx(),x);
       
    }
    
    
     public No buscaLinearIT2(int x){
        No temp = ini;
        while(temp != null){
            if(x == temp.getElemento())
                return temp;
            
            temp = temp.getProx();
        }
        return null;
    
    }
    
    public No buscaLinearR2(int x){
       
      return buscarLinearR2(ini,x);
    }

    public No buscarLinearR2(No temp, int x) {
        
        if(temp ==  null){
            return null;
        }
        if(temp.getElemento() == x){
            return temp;
        }
        
        
        return buscarLinearR2(temp.getProx(),x);
       
    }
    
    public void removeInicio(){
        if(ini == null){
            System.out.println("Lista Vazia");
            return;
        }
        ini = ini.getProx();
    }
  }
