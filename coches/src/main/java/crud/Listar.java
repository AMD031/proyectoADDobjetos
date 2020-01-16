/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import com.mycompany.coches.modelo.Cliente;
import com.mycompany.coches.modelo.Coche;
import com.mycompany.coches.modelo.CocheFavorito;
import com.mycompany.coches.modelo.Concesionario;
import com.mycompany.coches.modelo.Conexion;
import com.mycompany.coches.modelo.Fabricante;
import com.mycompany.coches.modelo.Venta;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author Antonio Martínez Díaz
 */
public class Listar {
    
    
   //Recuperar coches
    public static Coche rCochePorId(int id){
        EntityManager manager = Conexion.getConexion().getEmf();
        Coche coche = manager.find(Coche.class, id);
        return coche;
    }
    
    public static List<Coche>rCocheTodos(){
       TypedQuery<Coche> consulta= Conexion.getConexion().getEmf().createNamedQuery("recupearTodo", Coche.class);
       return consulta.getResultList();
    }
    
    
    //Recuperar cocheFavorito
      
     public static CocheFavorito rCocheFavoritoPorId(int id){
        EntityManager manager = Conexion.getConexion().getEmf();
        CocheFavorito coche = manager.find(CocheFavorito.class, id);
        return coche;
    }
   
    public static List<CocheFavorito>rCocheFavoritoTodos(){         
       TypedQuery<CocheFavorito> consulta= Conexion.getConexion().getEmf().createNamedQuery("recupearTodo", CocheFavorito.class);
       return consulta.getResultList();
    }
      
   //Recuperar Concesionario
         
     public static Concesionario rConcesionarioPorId(int id){
        EntityManager manager = Conexion.getConexion().getEmf();
       Concesionario concesionario = manager.find(Concesionario.class, id);
        return concesionario;
    }
     
     
    public static List<Concesionario>rConcesionarioTodos(){   
         TypedQuery<Concesionario> consulta= Conexion.getConexion().getEmf().createNamedQuery("recupearTodo", Concesionario.class);
          return consulta.getResultList();
    }
      
      
      
   //Recuperar cliente
    public static Cliente rClientePorId(int id){
        EntityManager manager = Conexion.getConexion().getEmf();
        Cliente cliente = manager.find(Cliente.class, id);
        return cliente;
    }
      
   public static List<Cliente>rclienteTodos(){   
        TypedQuery<Cliente> consulta= Conexion.getConexion().getEmf().createNamedQuery("recupearTodo", Cliente.class);
        return consulta.getResultList();
    }
      
      
   //Recuperar Fabricante
      
      public static Fabricante rFabricantePorId(int id){
        EntityManager manager = Conexion.getConexion().getEmf();
        Fabricante fabricante = manager.find(Fabricante.class, id);
        return fabricante;
    }
      
    public static List<Fabricante>rfabricanteTodos(){   
        TypedQuery<Fabricante> consulta= Conexion.getConexion().getEmf().createNamedQuery("recupearTodo", Fabricante.class);
        return consulta.getResultList();
    }  
      
   //Recuperar Venta   
      
      public static Venta rVentaPorId(int id){
        EntityManager manager = Conexion.getConexion().getEmf();
        Venta venta = manager.find(Venta.class, id);
        return venta;
    }
     public static List<Venta>rVentaTodos(){   
        TypedQuery<Venta> consulta= Conexion.getConexion().getEmf().createNamedQuery("recupearTodo", Venta.class);
        return consulta.getResultList();
    }  
      
    
    
    
    
}
