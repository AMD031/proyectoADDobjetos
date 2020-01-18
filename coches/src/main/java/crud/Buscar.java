/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import com.mycompany.coches.modelo.Conexion;
import javax.persistence.EntityManager;
import Util.Utilidades;
import com.mycompany.coches.modelo.Cliente;
import com.mycompany.coches.modelo.Coche;
import com.mycompany.coches.modelo.CocheFavorito;
import com.mycompany.coches.modelo.Concesionario;
import com.mycompany.coches.modelo.Fabricante;
import com.mycompany.coches.modelo.Venta;
import java.util.List;
/**
 *
 * @author Antonio Martinez Diaz
 */
public class Buscar {
    
    
    //Buscar cliente
      public static List<Cliente> busCliente(int parametro){
       EntityManager manager = Conexion.getConexion().getEmf();
       try{ 
        manager.getTransaction().begin();
        
        switch(parametro){
            case 0:
                
            break;
        }
        manager.getTransaction().commit();
        manager.close();
       }catch(Exception e){
          manager.getTransaction().rollback();
          manager.close();
       }
        return null;
  
    }
    
    
    
    
    
    //Buscar coche
    public static List<Coche> busCoche(int parametro){
       EntityManager manager = Conexion.getConexion().getEmf();
       try{ 
        manager.getTransaction().begin();
        
        switch(parametro){
            case 0:
                
            break;
        }
        manager.getTransaction().commit();
        manager.close();
       }catch(Exception e){
          manager.getTransaction().rollback();
          manager.close();
       }
        return null;
    }
    //Buscar CocheFavorito
       public static List<CocheFavorito> busCocheFavorito(int parametro){
       EntityManager manager = Conexion.getConexion().getEmf();
       try{ 
        manager.getTransaction().begin();
        
        switch(parametro){
            case 0:
                
            break;
        }
        manager.getTransaction().commit();
        manager.close();
       }catch(Exception e){
          manager.getTransaction().rollback();
          manager.close();
       }
        return null;
    }
    //Concesionario
        public static List<Concesionario> busConcesionario(int parametro){
       EntityManager manager = Conexion.getConexion().getEmf();
       try{ 
        manager.getTransaction().begin();
        
        switch(parametro){
            case 0:
                
            break;
        }
        manager.getTransaction().commit();
        manager.close();
       }catch(Exception e){
          manager.getTransaction().rollback();
          manager.close();
       }
        return null;
    }
       
       
    
    //Fabricante
       public static List<Fabricante> busFabricante(int parametro){
       EntityManager manager = Conexion.getConexion().getEmf();
       try{ 
        manager.getTransaction().begin();
        
        switch(parametro){
            case 0:
                
            break;
        }
        manager.getTransaction().commit();
        manager.close();
       }catch(Exception e){
          manager.getTransaction().rollback();
          manager.close();
       }
        return null;
    }
    
    //Venta
       public static List<Venta> busVenta(int parametro){
       EntityManager manager = Conexion.getConexion().getEmf();
       try{ 
        manager.getTransaction().begin();
        
        switch(parametro){
            case 0:
                
            break;
        }
        manager.getTransaction().commit();
        manager.close();
       }catch(Exception e){
          manager.getTransaction().rollback();
          manager.close();
       }
        return null;
    }
    
    
    
    
    
}
