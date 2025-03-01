package br.com.smartmarket.smartmarket.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Setor {
    private Long id;
    private String nome;
    private String icon;
    private List<Produto> produtos;

    public Setor(String nome, String icon) {
        this.id = Math.abs( new Random().nextLong() );
        this.nome = nome;
        this.icon = icon;
        this.produtos = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getIcon() {
        return icon;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void addProduto(Produto produto) {
        this.produtos.add(produto);
    }
}
