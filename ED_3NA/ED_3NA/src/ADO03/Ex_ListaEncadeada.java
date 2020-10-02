/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADO03;

import Aula_06_ADO_02.No;


/**
 *  10) Intercalação de duas listas ordenadas com menor complexidade

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
    public Ex_ListaEncadeada intercalacao(Ex_ListaEncadeada lst1, Ex_ListaEncadeada lst2){
        Ex_ListaEncadeada list3 = new Ex_ListaEncadeada();
       
        No lis1 = lst1.ini;
        No lis2 = lst2.ini;
        
       
        
        while(lst2 != null || lst1 != null){
            if(lst1 != null){
                No novo = new No(lis1.getElemento(), ini);
                ini = novo;
                lis1 = lis1.getProx();
                
            }
            if(lst2 != null){
                No novo = new No(lis2.getElemento(), ini);
                ini = novo;
                lis2 = lis2.getProx();
            }
        }
    
        return list3;
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
