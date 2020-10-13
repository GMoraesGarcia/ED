/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads.pi3.exemplosweb;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Gabriel
 */
public class dados {
    
    private Integer id;
    private String nome;
    private LocalDate dataNascimento;
    private BigDecimal peso;
    private BigDecimal altura;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public BigDecimal getPeso() {
        return peso;
    }

    public void setPeso(BigDecimal peso) {
        this.peso = peso;
    }

    public BigDecimal getAltura() {
        return altura;
    }

    public void setAltura(BigDecimal altura) {
        this.altura = altura;
    }
    
    
    public BigDecimal getImc(){
        BigDecimal altura = (this.altura.multiply(this.altura));
        BigDecimal imc =  peso.divide(altura, 2, RoundingMode.HALF_UP);
        return imc;
    }
    public Integer getIdade(){
        Period peridod = Period.between(dataNascimento, LocalDate.now());
        int idade = peridod.getYears();
       return idade;
    }
    
    
}
