/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.coches.modelo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Antonio Martínez Díaz
 */
public class Conexion {
    
   private static Conexion conexion;  
   private Conexion(){ }
  
   public static Conexion getConexion(){
       if(conexion ==null){
           conexion = new Conexion();
       }
      return conexion;
   }
    
   public  EntityManager getEmf(){
       EntityManagerFactory emf =
       Persistence.createEntityManagerFactory("$objectdb/db/coches.odb");
       EntityManager em = emf.createEntityManager();
       return em;
   } 
   
    
}
