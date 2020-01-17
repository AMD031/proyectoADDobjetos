package com.mycompany.coches.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@NamedQueries({
@NamedQuery(name="recupearTodo", query="select c from Ventas c") 
})



@Entity
@Table(name = "Ventas")
public class Venta implements Serializable{
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_ventas", updatable = false, nullable = false)
    private int id;
    private String fecha;
    
    @ManyToMany(mappedBy="ventasCli")
    private List<Cliente>clientes;
    
    @ManyToMany(mappedBy="ventasCon")
    private List<Concesionario>concesionarios;
    
    
    @ManyToOne(fetch = FetchType.LAZY ) 
    @JoinColumn(name = "id_coche")
    private Coche coche;
    @Column(name = "precio")
    private float precio; 

    public Venta(String fecha, float precio) {
        this.fecha = fecha;
        this.precio = precio;
    }

    public List<Concesionario> getConcesionarios() {
        return concesionarios;
    }

    public void setConcesionarios(List<Concesionario> concesionarios) {
        this.concesionarios = concesionarios;
    }

    public Coche getCoche() {
        return coche;
    }

    public void setCoche(Coche coche) {
        this.coche = coche;
    }
    
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String Fecha) {
        this.fecha = Fecha;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }
   
    public void addCliente(Cliente cliente){
      if(clientes==null){
         clientes = new ArrayList<>();
      }
     clientes.add(cliente);
  }
    
      public void addConcesionario(Concesionario concesionario){
      if(concesionario==null){
         concesionarios = new ArrayList<>();
      }
      concesionarios.add(concesionario);
  }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + this.id;
        hash = 89 * hash + Objects.hashCode(this.fecha);
        hash = 89 * hash + Objects.hashCode(this.coche);
        hash = 89 * hash + Float.floatToIntBits(this.precio);
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
        final Venta other = (Venta) obj;
        if (this.id != other.id) {
            return false;
        }
        if (Float.floatToIntBits(this.precio) != Float.floatToIntBits(other.precio)) {
            return false;
        }
        if (!Objects.equals(this.fecha, other.fecha)) {
            return false;
        }
        if (!Objects.equals(this.coche, other.coche)) {
            return false;
        }
        return true;
    }


    
      
      
    

    
}
