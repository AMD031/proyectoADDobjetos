/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.coches.modelo;

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
        
    Fabricante fa1 = new Fabricante("16565656fc", "infocoche");
    fa1.addCoche(new Coche("fsdjl", "fdjsalk", "fjsl"));
    fa1.addCoche(new Coche("jflsdjf", "fdjsalk", "fjsl"));
    Concesionario con1 = new Concesionario("jfdsl", "fjflsd", "jllkf");
     Cliente cli1 = new Cliente("jfldk","fsdjl","fjdsl","fjdfslk","fjsdkl");
    Venta ventas = new Venta("hoy");
    Coche coche = new Coche("fds", "fds", "fsfdfsd");
    coche.addVenta(ventas);
    coche.setFabricante(fa1);
    cli1.addVentasCli(ventas);
    CocheFavorito cf1 = new CocheFavorito("Ferrari", "458");
    cli1.setCocheFavorito(cf1);
    con1.addVentasCon(ventas);

    EntityManager manager = Conexion.getConexion().getEmf();
    
    manager.getTransaction().begin();
    manager.persist(ventas);
    manager.persist(coche);
    manager.persist(cli1);
    manager.persist(con1);
    manager.persist(fa1);
    manager.persist(cf1);

    manager.getTransaction().commit();
    manager.close();
    
    
    
    manager = Conexion.getConexion().getEmf(); 
    
    List<Cliente> clientes = manager.createQuery("SELECT c FROM Cliente c").getResultList();
    for(Cliente cliente : clientes){
        System.out.println(cliente.getApellidos());
    }
    

        System.out.println("coche"+ crud.Listar.rCochePorId(2).getFabricante());
    
    

    // SELECT c.nombre, c.cocheFavorito.marca, c.cocheFavorito.modelo FROM Cliente c WHERE c.cocheFavorito.marca="Ferrari"
         
    //SELECT c.nombre FROM Cliente c, Venta v, Concesionario co WHERE c.ventasCli.id=v.id AND v.id=co.ventasCon.id AND c.ventasCli.fecha="hoy" AND co.cif="jfdsl"
    }
}
