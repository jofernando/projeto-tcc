/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.jofernando.projeto.tcc.model.entidades;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

/**
 *
 *
 * @author Jose Junio
 */
@Entity
public class Revendedor extends Usuario implements Serializable {

    private String cpf;
    @OneToMany
    private Set<Cliente> clientes;
    @OneToMany
    private Set<Pedido> pedidos;
    @OneToMany
    private Set<Produto> produtos;

    public Revendedor() {

    }

    public Revendedor(String cpf, String username, String password, String nome) {
	super(username, password, nome);
	this.cpf = cpf;
	clientes = new HashSet<>();
	pedidos = new HashSet<>();
	produtos = new HashSet<>();
    }

    public String getCpf() {
	return cpf;
    }

    public void setCpf(String cpf) {
	this.cpf = cpf;
    }

    public Set<Cliente> getClientes() {
	return clientes;
    }

    public void setClientes(Set<Cliente> clientes) {
	this.clientes = clientes;
    }

    public Set<Pedido> getPedidos() {
	return pedidos;
    }

    public void setPedidos(Set<Pedido> pedidos) {
	this.pedidos = pedidos;
    }

    public Set<Produto> getProdutos() {
	return produtos;
    }

    public void setProdutos(Set<Produto> produtos) {
	this.produtos = produtos;
    }

    @Override
    public int hashCode() {
	int hash = 3;
	hash = 11 * hash + Objects.hashCode(this.cpf);
	return hash;
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj) {
	    return true;
	}
	if (obj == null) {
	    return false;
	}
	if (getClass() != obj.getClass()) {
	    return false;
	}
	final Revendedor other = (Revendedor) obj;
	if (!Objects.equals(this.cpf, other.cpf)) {
	    return false;
	}
	return true;
    }

    @Override
    public String toString() {
	return "Revendedor{" + "cpf=" + cpf + ", clientes=" + clientes + ", pedidos=" + pedidos + ", produtos=" + produtos + '}';
    }

}
