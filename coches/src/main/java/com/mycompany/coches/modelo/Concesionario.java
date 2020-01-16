/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.coches.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
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
import javax.persistence.Table;

/**
 *
 * @author Antonio Martínez Díaz
 */

@NamedQueries({
@NamedQuery(name="recupearTodo", query="select c from Concesionario ")
  
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
    @Column(name = "localid")
    private String localida;

    public Concesionario() {
    }
    
    public Concesionario(String cif, String nombre, String localida) {
        this.cif = cif;
        this.nombre = nombre;
        this.localida = localida;
    }

 @ManyToMany
 @JoinTable(name="concesionarios")
 private List<Venta>ventasCon;  
 public void addVentasCon (Venta venta){
      if(ventasCon==null){
        ventasCon = new ArrayList<>();
      }
     ventasCon.add(venta);
  } 

    
    
}
