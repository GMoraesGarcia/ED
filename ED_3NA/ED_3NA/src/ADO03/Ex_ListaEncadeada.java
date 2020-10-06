/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADO03;

import Aula_06_ADO_02.No;


/**
 *  10) Intercalação de duas listas ordenadas com menor complexidade -- Feito

    11) União de duas listas quaisquer

    12) Intersecção de duas listas quaisquer
 * @author Gabriel
 */
public class Ex_ListaEncadeada {
    
    private No ini;
    
    public Ex_ListaEncadeada(){
        this.ini = null;
    }
    
    public boolean vazia(){
        return this.ini == null;
    }
    public Ex_ListaEncadeada intercalacao(Ex_ListaEncadeada lst1){
        Ex_ListaEncadeada list3 = new Ex_ListaEncadeada();
       
        No lis1 = lst1.ini;
        No lis2 = ini;
 
        while(lis1 != null && lis2 != null){
            
            if(lis1.getElemento() <= lis2.getElemento()){
               list3.insereFinal(lis1.getElemento());
               lis1 = lis1.getProx();
                
            }
            else{
                list3.insereFinal(lis2.getElemento());
                lis2 = lis2.getProx();
            }
        }
        while(lis1 != null){
                list3.insereFinal(lis1.getElemento());
                lis1 = lis1.getProx();
            
            }
        while(lis2 != null){
                list3.insereFinal(lis2.getElemento());
                lis2 = lis2.getProx();
            }
    
        return list3;
    }
    
    public Ex_ListaEncadeada uniao(Ex_ListaEncadeada list){
        Ex_ListaEncadeada l3 = new Ex_ListaEncadeada();
        No l= ini;
        No l2 = list.ini;
        
        while(l != null){
            l3.insereFinal(l.getElemento());
            l = l.getProx();
            if(l == null){
                while(l2 != null){
                    l3.insereFinal(l2.getElemento());
                    l2 = l2.getProx();
               } 
            }
        }
    
       return l3;
    }
    public Ex_ListaEncadeada Interseccao(Ex_ListaEncadeada l){
        Ex_ListaEncadeada lista = new Ex_ListaEncadeada();
        No temp = ini;
        No list = l.ini;
    
        while(temp != null ){
            while(list != null){
                if(temp.getElemento() == list.getElemento()){
                    lista.insereOrdenado(temp.getElemento());
                    temp = temp.getProx();  list = list.getProx();
                }
                else
                    list = list.getProx();
            }
          list = l.ini;  
          temp = temp.getProx();
        }
        
        return lista;
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
    
}
