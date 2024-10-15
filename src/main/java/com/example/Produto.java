/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;


/**
 *
 * @author Richiely Batista, Filipe Maciel
 */
public abstract class Produto {	
    
    //@ public invariant this.nome != null;
    //@ public invariant this.codigo != null;
    //@ public invariant this.valor >=0;
    private /*@ spec_public @*/ String nome;
    private /*@ spec_public @*/ String codigo;
    private /*@ spec_public @*/ double valor;

    //@ public initially valor >= 0.0;
    //@ requires codigo != null && !codigo.equals("");
    //@ requires nome != null && !nome.equals("");
    //@ requires valor >= 0.0;
    //@ ensures this.valor == valor;
    //@ pure
    public Produto(String codigo, String nome, double valor) {
        this.nome = nome;
        this.codigo = codigo;
        this.valor = valor;
    }

    //@ requires nome != null && !nome.isEmpty();
    //@ assignable this.nome;
    //@ ensures this.nome.equals(nome);
    public void setNome(String nome) {
        this.nome = nome;
    }

    //@ requires codigo != null && !codigo.isEmpty();
    //@ assignable this.codigo;
    //@ ensures this.codigo.equals(codigo);
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    //@ requires valor >= 0.0;
    //@ assigns this.valor;
    //@ ensures this.valor == valor;
    public void setValor(double valor) {
    	this.valor = valor;
    }    
    
    //@ ensures \result == this.nome;
    //@ pure
    public String getNome() {
    	return nome;
    }
    
    //@ ensures \result == this.codigo;
    //@ pure
    public String getCodigo() {
    	return codigo;
    }

    //@ ensures \result == this.valor;    
    //@ pure
    public double getValor() {
    	return valor;
    }

    //@ requires qtd >= 0.0;
    //@ ensures \result >= 0.0;
    //@ pure
    public abstract double calcularValor(double qtd);

}
