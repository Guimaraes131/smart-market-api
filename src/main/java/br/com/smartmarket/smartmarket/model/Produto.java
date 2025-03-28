package br.com.smartmarket.smartmarket.model;

import java.util.Random;

public class Produto {
    private Long id;
    private String name;
    private double preco;
    private Setor setor;

    public Produto(String name, double preco, Setor setor) {
        this.id = Math.abs( new Random().nextLong() );
        this.name = name;
        this.preco = preco;
        this.setor = setor;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPreco() {
        return preco;
    }

    public Setor getSetor() {
        return setor;
    }
}
