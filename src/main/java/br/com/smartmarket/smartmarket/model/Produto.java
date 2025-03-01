package br.com.smartmarket.smartmarket.model;

import java.util.Random;

public class Produto {
    private Long id;
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.id = Math.abs( new Random().nextLong() );
        this.nome = nome;
        this.preco = preco;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}
