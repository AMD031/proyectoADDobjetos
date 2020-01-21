/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.coches.modelo;

import java.util.ArrayList;
import java.util.LinkedList;
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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Antonio Martínez Díaz
 * 
 */

@NamedQueries({
@NamedQuery(name="recupearTodoCliente", query="select c from Cliente c"),
@NamedQuery(name="recuperarCriteriaSinOrder", query = "SELECT c FROM Cliente c INNER JOIN c.ventasCli cli INNER JOIN cli.concesionario r  INNER JOIN cli.coche co  where co.ventas.fecha =:fechaVenta and r.cif=:CIFConcesionario order by c.apellidos , c.nombre"),
@NamedQuery(name="recuperarCriteriaConOrder", query = "SELECT c FROM Cliente c INNER JOIN c.ventasCli cli INNER JOIN cli.concesionario r  INNER JOIN cli.coche co  where co.ventas.fecha =:fechaVenta and r.cif=:CIFConcesionario")
  
})



@Entity
@Table(name = "Cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_cliente", updatable = false, nullable = false)
    private int id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellidos")
    private String apellidos;
    @Column(name = "localidad")
    private String localidad;
    @Column(name = "dniNie")
    private String dniNie;
    @Column(name = "fecha")
    private String fecha;
    
    @OneToOne(mappedBy = "cliente", cascade = CascadeType.ALL)
    private CocheFavorito cocheFavorito;
 

    public Cliente() {
    }

    public Cliente(String nombre, String apellidos, String localidad, String dniNie, String fecha) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.localidad = localidad;
        this.dniNie = dniNie;
        this.fecha = fecha;    
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getDniNie() {
        return dniNie;
    }

    public void setDniNie(String dniNie) {
        this.dniNie = dniNie;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @OneToMany (mappedBy = "cliente", cascade = CascadeType.ALL) 
    private List<Venta> ventasCli;
    
    
    public void addVentaCli(Venta v){
        if(ventasCli==null){
            ventasCli = new ArrayList<>();
        }
        if(! ventasCli.contains(v)){
             ventasCli.add(v);
             v.setCliente(this);
         }
    }

    public CocheFavorito getCocheFavorito() {
        return cocheFavorito;
    }

    public void setCocheFavorito(CocheFavorito cocheFavorito) {
        this.cocheFavorito = cocheFavorito;
        cocheFavorito.setCliente(this);
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", localidad=" + localidad + ", dniNie=" + dniNie + ", fecha=" + fecha + ", cocheFavorito=" + cocheFavorito + ", ventasCli=" + ventasCli + '}';
    }

    
    
    
    
    
    

}
