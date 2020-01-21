/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Antonio Martínez Díaz
 */
public class Utilidades {
    
    //Variables columna ventas
    public static final int ID = 0;
    public static final int FECHA = 1;
    public static final int PRECIO = 2;
    public static final int COCHE = 3;
    public static final int CONCESIONARIO =4;
    public static final int CLIENTE =5;
    //--------------auxiliar---------------
     public static final int COCHEFAVORITO = 1000;
     public static final int FABRICANTE = 2000;
    

    
      public static boolean esNumerico(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    public static boolean validarNIF(String nif) {
        boolean correcto = false;
        Pattern pattern = Pattern.compile("(\\d{1,8})([TRWAGMYFPDXBNJZSQVHLCKEtrwagmyfpdxbnjzsqvhlcke])");
        Matcher matcher = pattern.matcher(nif);
        if (matcher.matches()) {
            String letra = matcher.group(2);
            String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
            int index = Integer.parseInt(matcher.group(1));
            index = index % 23;
            String reference = letras.substring(index, index + 1);
            if (reference.equalsIgnoreCase(letra)) {
                correcto = true;
            } else {
                correcto = false;
            }
        } else {
            correcto = false;
        }
        return correcto;
    }
    
    
    
    
}
