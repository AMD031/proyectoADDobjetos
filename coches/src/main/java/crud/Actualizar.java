/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import com.mycompany.coches.modelo.Conexion;
import com.mycompany.coches.modelo.Venta;
import javax.persistence.EntityManager;
import Util.Utilidades;
import com.mycompany.coches.modelo.Coche;

/**
 *
 * @author Antonio Martinez Diaz
 */
public class Actualizar {
      public static void actulizarCampoMo(int in, int campo, String cambio) {
       EntityManager manager = Conexion.getConexion().getEmf();   
       try{   
        manager.getTransaction().begin();
        Venta ve = manager.find(Venta.class, in);
        if (ve != null) {
            if (campo == Utilidades.FECHA) {
                ve.setFecha(cambio);
            }
            if (campo == Utilidades.PRECIO) {
                ve.setPrecio( Float.parseFloat(cambio));
            }
        }
        manager.getTransaction().commit();
        manager.close();
       }catch(Exception e){
           manager.getTransaction().rollback();
       }

    }

    public static void actualizarVenta(Coche coche, int Campo,int id) {
       EntityManager manager = Conexion.getConexion().getEmf();   
       manager.getTransaction().begin();
       try{    
        
        if(Campo == Utilidades.COCHE){     
          Venta venta=  manager.find(Venta.class, id);
          venta.setCoche(coche);
          manager.persist(venta);
        }
        
        manager.getTransaction().commit();
        manager.close();
       }catch(Exception e){
           System.out.println(e);
           manager.getTransaction().rollback();
       }
        
        
        
    }

   
    
    
    
    
    
    
    
     
}
