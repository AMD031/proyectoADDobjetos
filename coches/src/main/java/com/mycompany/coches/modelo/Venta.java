package com.mycompany.coches.modelo;

import java.io.Serializable;
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
import javax.persistence.Table;


@NamedQueries({
@NamedQuery(name="recupearTodoVenta", query="select c from Venta c") 
})



@Entity
@Table(name = "Ventas")
public class Venta implements Serializable{
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_ventas", updatable = false, nullable = false)
    private int id;
    private String fecha;
    
    @ManyToOne(cascade = CascadeType.ALL) 
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;
    
    @ManyToOne(cascade = CascadeType.ALL) 
    @JoinColumn(name = "id_concesionario")
    private Concesionario concesionario;
    
    
    @ManyToOne(cascade = CascadeType.ALL) 
    @JoinColumn(name = "id_coche")
    private Coche coche;
    
    
    @Column(name = "precio")
    private float precio; 

    public Venta(String fecha, float precio) {
        this.fecha = fecha;
        this.precio = precio;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
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

   public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
        cliente.addVentaCli(this);
    }

    public Concesionario getConcesionario() {
        return concesionario;
    }

    public void setConcesionario(Concesionario concesionario) {
        this.concesionario = concesionario;
    }

  

    @Override
    public String toString() {
        return "Venta{" + "id=" + id + ", fecha=" + fecha + ", coche=" + coche + ", precio=" + precio + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.id;
        hash = 67 * hash + Objects.hashCode(this.fecha);
        hash = 67 * hash + Objects.hashCode(this.cliente);
        hash = 67 * hash + Objects.hashCode(this.concesionario);
        hash = 67 * hash + Objects.hashCode(this.coche);
        hash = 67 * hash + Float.floatToIntBits(this.precio);
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
        if (!Objects.equals(this.cliente, other.cliente)) {
            return false;
        }
        if (!Objects.equals(this.concesionario, other.concesionario)) {
            return false;
        }
        if (!Objects.equals(this.coche, other.coche)) {
            return false;
        }
        return true;
    }

 


    
      
      
    

    
}
