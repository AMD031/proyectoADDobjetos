/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



package Controlador;

import com.mycompany.coches.modelo.Coche;
import crud.*;
import com.mycompany.coches.modelo.Venta;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;


/**
 *
 * @author Your Name <Antonio Martinez Diaz>
 */
public class Controlador {

      public static List<Venta> devolverVentas() {
        return  Listar.rVentaTodos();
    }
    
     
      
       public static String obtenerCampoMo(String campo, int indice) {
        String resultado = "";

        if (campo.equals("id")) {
            resultado = Listar.rVentaTodos().get(indice).getId() + "";
        }

        if (campo.equals("fecha")) {
            resultado = Listar.rVentaTodos().get(indice).getFecha()+ "";
        }
        
        if (campo.equals("precio")) {
            resultado = Listar.rVentaTodos().get(indice).getPrecio()+ "";
        }
        return resultado;
    }

    public static void actualizarMo(int in, int campo, String cambio) {
      
        Actualizar.actulizarCampoMo(in, campo, cambio);
        
        
    }

    public static Coche obtenerCocheVenta(int id) {
       return Listar.rVentaPorId(id).getCoche();
    }
    
    
     public static Coche obtenerCoche(int id){
          return Listar.rCochePorId(id);
      }

    public static void actualizarCocheVenta(Coche coche, int Campo,int id) {
        Actualizar.actualizarVenta(coche,Campo,id);
    }
}
