package co.edu.uniquindio.poo.application;

import javax.swing.JOptionPane;

import co.edu.uniquindio.poo.model.Producto;
import co.edu.uniquindio.poo.model.Tienda;


/**
 * 
 *
 */
public class App {
    public static void main(String[] args) {
        String nombreTienda = leerStringVentana("Ingrese el nombre de la tienda:");
        int numeroProductos = leerInt("Ingrese el número de productos:");
        

        Producto producto1 = new Producto("Lentejas", 3000, "noperecederos", 0);
        Tienda tienda= new Tienda(nombreTienda, numeroProductos);


        


    }


    public static String leerStringVentana(String mensaje){
        String respuesta="";
        respuesta=JOptionPane.showInputDialog(mensaje);
        return respuesta;
        }

    public static double leerDouble(String mensaje ){
        double dato=0;
        Double.parseDouble(JOptionPane.showInputDialog("ingrese el numero de productos "));
        return dato;
    }

    public static int leerInt(String mensaje ){
        int dato=0;
        Double.parseDouble(JOptionPane.showInputDialog("ingrese el numero de productos "));
        return dato;
    }
}
