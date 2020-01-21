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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 *
 * @author Antonio Martínez Díaz
 */


@NamedQueries({
@NamedQuery(name="recupearTodoFabricante", query="select c from Fabricante c")
  
})

@Entity
@Table(name = "Fabricante")
public class Fabricante {
     private static final long serialVersoinUID=1L;
     
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name="id_fabricante" , updatable = false, nullable = false)  
    private int id;
    @Column(name = "cif")
    private String cif;
    @Column(name ="nombre")
    private String nombre;
    @OneToMany(mappedBy = "fabricante", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Coche> coches;

    public Fabricante() {
    }

    
    public Fabricante(String cif, String nombre) {
        this.cif = cif;
        this.nombre = nombre;
        this.coches = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

     public void addCoche(Coche c){
         if(!coches.contains(c)){
            coches.add(c);
             c.setFabricante(this);
         }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + this.id;
        hash = 19 * hash + Objects.hashCode(this.cif);
        hash = 19 * hash + Objects.hashCode(this.nombre);
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
        final Fabricante other = (Fabricante) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.cif, other.cif)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }

     
    @Override
    public String toString() {
        return "Fabricante{" + "id=" + id + ", cif=" + cif + ", nombre=" + nombre + '}';
    }

    
    
    
    
    
    
    
    
    
    
}
