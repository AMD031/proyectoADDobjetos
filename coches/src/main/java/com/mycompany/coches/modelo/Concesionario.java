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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Antonio Martínez Díaz
 */

@NamedQueries({
    @NamedQuery(name="recupearTodoConcesionario", query="select c from Concesionario c")
  
})


@Entity
@Table(name = "Concesionario")
public class Concesionario {
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_concesionario", updatable = false, nullable = false)
    private int id;
    @Column(name = "cif")
    private String cif;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "localidad")
    private String localidad;

    public Concesionario() {
    }
    
    public Concesionario(String cif, String nombre, String localidad) {
        this.cif = cif;
        this.nombre = nombre;
        this.localidad = localidad;
    }

        @OneToMany(mappedBy="concesionario", cascade = CascadeType.ALL)
        private List<Venta>ventasCon;  
       
        
        public void addVentaCon(Venta v){
            if(ventasCon==null){
                ventasCon= new ArrayList<>();
            }
            if(! ventasCon.contains(v)){
                   ventasCon.add(v);
                   v.setConcesionario(this);
             }
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

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public List<Venta> getVentasCon() {
        return ventasCon;
    }

    public void setVentasCon(List<Venta> ventasCon) {
        this.ventasCon = ventasCon;
    }

    @Override
    public String toString() {
        return "Concesionario{" + "id=" + id + ", cif=" + cif + ", nombre=" + nombre + ", localidad=" + localidad + '}';
    }

 
 
    
    
}
