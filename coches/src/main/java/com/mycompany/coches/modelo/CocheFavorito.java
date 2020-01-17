package com.mycompany.coches.modelo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@NamedQueries({
@NamedQuery(name="recupearTodo", query="select c from CocheFavorito c")
  
})



@Entity
@Table(name = "CocheFavorito")
public class CocheFavorito {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_cochefavorito", updatable = false, nullable = false)
    private int id;
    @Column(name = "marca")
    private String marca;
    @Column(name = "modelo")
    private String modelo;
    
    @OneToOne(mappedBy = "cocheFavorito", cascade = CascadeType.ALL,
              fetch = FetchType.LAZY, optional = false)
    private Cliente cliente;

    public CocheFavorito() {
    }

    public CocheFavorito(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "CocheFavorito{" + "id=" + id + ", marca=" + marca + ", modelo=" + modelo + '}';
    }

 
    
    
    
}
