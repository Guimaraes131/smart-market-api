package br.com.smartmarket.smartmarket.model;

import java.util.Random;

public class Produto {
    private Long id;
    private String nome;
    private double preco;
    private Setor setor;

    public Produto(String nome, double preco, Setor setor) {
        this.id = Math.abs( new Random().nextLong() );
        this.nome = nome;
        this.preco = preco;
        this.setor = setor;
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

    public Setor getSetor() {
        return setor;
    }
}
