/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.coches.modelo;

import crud.Listar;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

/**
 *
 * @author Antonio Martínez Díaz
 */
public class Main {

    public static void main(String[] args) {
        
         
         
        EntityManager manager = Conexion.getConexion().getEmf();
        manager.getTransaction().begin();
        
         Venta venta = new Venta("hoy", 1000);
         Cliente cliente = new Cliente("Pedro", "Perez", "Madrid", "jfldsjkl", "hoy");
         Cliente cliente2 = new Cliente("Maria", "Perez", "Madrid", "jfldsjkl", "hoy");
         Coche coche =  new Coche("341223ab", "seat sport", "rojo");
         coche.setFabricante(new Fabricante("131223CX", "Seat"));
         coche.addVenta(venta);
         cliente.setCocheFavorito(new CocheFavorito("seat", "cordoba"));
         venta.setCliente(cliente);
         venta.setConcesionario(new Concesionario("12378291b", "opel", "sevill"));
         
         manager.persist(venta);
         manager.persist(cliente2);
         
        manager.getTransaction().commit();
        manager.close();

      
        
        
        

      
       // System.out.println(Controlador.Controlador.obtenerCampoMo("id",1));
    
    
        
        
    }
}
