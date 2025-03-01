package br.com.smartmarket.smartmarket.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Setor {
    private Long id;
    private String name;
    private String icon;
    private List<Produto> produtos = new ArrayList<>();

    public Setor(String name, String icon) {
        this.id = Math.abs(new Random().nextLong());
        this.name = name;
        this.icon = icon;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getIcon() {
        return icon;
    }
}
