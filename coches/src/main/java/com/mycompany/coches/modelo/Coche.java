/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.coches.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Antonio Martínez Díaz
 */

@NamedQueries({
@NamedQuery(name="recupearTodoCoche", query="select c from Coche c")
  
})

@Entity
@Table(name = "Coche")
public class Coche {
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_coche", updatable = false, nullable = false)
    private int id;
    @Column(name = "bastidor")
    private String bastidor;
    @Column(name = "modelo")
    private String modelo;
    @Column(name = "color")
    private String color;
    
    @OneToMany(mappedBy = "coche", cascade = CascadeType.ALL)
    private List<Venta>ventas;
  
    @ManyToOne(cascade =CascadeType.ALL) 
    @JoinColumn(name = "id_coche")
    private Fabricante fabricante;

    
      public Coche(String Bastidor, String modelo, String color) {
        this.bastidor = Bastidor;
        this.modelo = modelo;
        this.color = color;
    }
    
    
    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

  
    public Coche() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public void setBastidor(String Bastidor) {
        this.bastidor = Bastidor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public String getBastidor() {
        return bastidor;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + this.id;
        hash = 43 * hash + Objects.hashCode(this.bastidor);
        hash = 43 * hash + Objects.hashCode(this.modelo);
        hash = 43 * hash + Objects.hashCode(this.color);
        hash = 43 * hash + Objects.hashCode(this.fabricante);
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
        final Coche other = (Coche) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.bastidor, other.bastidor)) {
            return false;
        }
        if (!Objects.equals(this.modelo, other.modelo)) {
            return false;
        }
        if (!Objects.equals(this.color, other.color)) {
            return false;
        }
        if (!Objects.equals(this.fabricante, other.fabricante)) {
            return false;
        }
        return true;
    }

    public List<Venta> getVentas() {
        return ventas;
    }

    public void setVentas(List<Venta> ventas) {
        this.ventas = ventas;
        
    }
    
    
    
    

    @Override
    public String toString() {
        return "Coche{" + "id=" + id + ", vastidor=" + bastidor + ", modelo=" + modelo + ", color=" + color + '}';
    }
    
     public void addVenta(Venta v){
         if(ventas ==null){
             ventas = new ArrayList<>();
         }
         if(!ventas.contains(v)){
             ventas.add(v);
             v.setCoche(this);
         }
    }

    
    
    
    
    
    
}
