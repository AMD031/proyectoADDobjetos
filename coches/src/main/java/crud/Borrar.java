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

public class Borrar {

    //Borrar cliente
    public static boolean bClientePorId(int id) {
        EntityManager manager = Conexion.getConexion().getEmf();
        try {
            manager.getTransaction().begin();
            manager.remove(manager.find(Cliente.class, id));
            manager.getTransaction().commit();
        } catch (Exception e) {
            manager.getTransaction().rollback();
            manager.close();
            return false;
        }
        manager.close();
        return true;
    }

    //Borrar coche
    public static boolean bCochePorId(int id) {
        EntityManager manager = Conexion.getConexion().getEmf();
        try {
            manager.getTransaction().begin();
            manager.remove(manager.find(Coche.class, id));
            manager.getTransaction().commit();
        } catch (Exception e) {
            manager.getTransaction().rollback();
            manager.close();
            return false;
        }
        manager.close();
        return true;
    }

    //Borrar cocheFavorito
    public static boolean bCocheFavoritoPorId(int id) {
        EntityManager manager = Conexion.getConexion().getEmf();
        try {
            manager.getTransaction().begin();
            manager.remove(manager.find(CocheFavorito.class, id));
            manager.getTransaction().commit();
        } catch (Exception e) {
            manager.getTransaction().rollback();
            manager.close();
            return false;
        }
        manager.close();
        return true;
    }

    //Borrar Concesionario
    public static boolean bConcesionarioPorId(int id) {
        EntityManager manager = Conexion.getConexion().getEmf();
        try {
            manager.getTransaction().begin();
            manager.remove(manager.find(Concesionario.class, id));
            manager.getTransaction().commit();
        } catch (Exception e) {
            manager.getTransaction().rollback();
            manager.close();
            return false;
        }
        manager.close();
        return true;
    }

    //Borrar fabricante
    public static boolean bFabricantePorId(int id) {
        EntityManager manager = Conexion.getConexion().getEmf();
        try {
            manager.getTransaction().begin();
            manager.remove(manager.find(Fabricante.class, id));
            manager.getTransaction().commit();
        } catch (Exception e) {
            manager.getTransaction().rollback();
            manager.close();
            return false;
        }
        manager.close();
        return true;
    }

    //Borrar venta
    public static boolean bVentaPorId(int id) {
        EntityManager manager = Conexion.getConexion().getEmf();
        try {
            manager.getTransaction().begin();
            manager.remove(manager.find(Venta.class, id));
            manager.getTransaction().commit();
        } catch (Exception e) {
            manager.getTransaction().rollback();
            manager.close();
            return false;
        }
        manager.close();
        return true;
    }

}
