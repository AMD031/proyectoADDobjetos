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

        Fabricante fa1 = new Fabricante("16565656fc", "infocoche");
        fa1.addCoche(new Coche("fsdjl", "fdjsalk", "fjsl"));
        fa1.addCoche(new Coche("jflsdjf", "fdjsalk", "fjsl"));
        Concesionario con1 = new Concesionario("A123", "Cordoba", "NombreCon");
        Cliente cli1 = new Cliente("Juan", "fsdjl", "fjdsl", "fjdfslk", "fjsdkl");
        Venta ventas = new Venta("hoy", 1000);
        Coche coche = new Coche("Opel", "Corsa", "Rosa");
        coche.addVenta(ventas);
        coche.setFabricante(fa1);
        cli1.addVentasCli(ventas);
        CocheFavorito cf1 = new CocheFavorito("Ferrari", "458");
        cli1.setCocheFavorito(cf1);
        con1.addVentasCon(ventas);
        Cliente cli2 = new Cliente("Paco", "Perez", "123", "456", "789");
        cli2.addVentasCli(ventas);
        cli2.setCocheFavorito(cf1);

        EntityManager manager = Conexion.getConexion().getEmf();

        manager.getTransaction().begin();
        manager.persist(ventas);
        manager.persist(coche);
        manager.persist(cli1);
        manager.persist(con1);
        manager.persist(fa1);
        manager.persist(cf1);
        manager.persist(cli2);

        manager.getTransaction().commit();
        manager.close();

        manager = Conexion.getConexion().getEmf();

        List<Cliente> clientes = manager.createQuery("SELECT c FROM Cliente c").getResultList();
        System.out.println("APELLIDOS DE TODOS LOS CLIENTES:");
        for (Cliente cliente : clientes) {
            System.out.println(cliente.getApellidos());
        }
        System.out.println("---------------------------------");

        
        System.out.println("COCHE CON ID 2:");
//        System.out.println("coche" + crud.Listar.rCochePorId(2).getFabricante());
        System.out.println("---------------------------------");

        // SELECT c.nombre, c.cocheFavorito.marca, c.cocheFavorito.modelo FROM Cliente c WHERE c.cocheFavorito.marca="Ferrari"
        //SELECT c.nombre FROM Cliente c, Venta v, Concesionario co WHERE c.ventasCli.id=v.id AND v.id=co.ventasCon.id AND c.ventasCli.fecha="hoy" AND co.cif="jfdsl"
        System.out.println("CLIENTES QUE HAN COMPRADO COCHES HOY AL CONCESIONARIO CON CIF A123:");
        for (Cliente cf : Listar.rClienteCondicion("hoy", "A123", true)) {
            System.out.println(cf);
        }
        System.out.println("---------------------------------");
        
        System.out.println("BORRAMOS COCHE CON ID 2:");
        System.out.println("borrado con exito:" + crud.Borrar.bCochePorId(2));
        System.out.println("borrado con exito:" + crud.Borrar.bConcesionarioPorId(4));
        System.out.println("borrado con exito:" + crud.Borrar.bClientePorId(7));
        System.out.println("---------------------------------");
    }
}
