package com.raissa.demo.model;

import lombok.*;



public class Produto {
    private Long idProduto;
    private String nome;
    private int quantidade;
    private double preco;

    public Produto() {
    }

    public Produto(Long idProduto, String nome, int quantidade, double preco) {
        this.idProduto = idProduto;
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public Long getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Long idProduto) {
        this.idProduto = idProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
