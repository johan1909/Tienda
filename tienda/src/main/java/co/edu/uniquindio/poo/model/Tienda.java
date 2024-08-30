package co.edu.uniquindio.poo.model;

import java.util.Arrays;

public class Tienda {

    private String nombre;
    private int numeroProductos;
    private Producto [] listaProductos;


    public Tienda (String nombre, int numeroProductos){
        this.nombre=nombre;
        this.numeroProductos=numeroProductos;
        this.listaProductos= new Producto [numeroProductos];

    }
    

/**
 * 
 * @return the nombre
 */

    public String getNombre() {
        return nombre;
    }

    /**
     * 
     * @param nombre the nombre to set
     */

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    /**
     * 
     * @return the numeroProductos
     */

    public int getNumeroProductos() {
        return numeroProductos;
    }


    /**
     * 
     * @param numeroProductos the numeroProductos to set
     */

    public void setNumeroProductos(int numeroProductos) {
        this.numeroProductos = numeroProductos;
    }



    /**
     * 
     * @return the listaProductos 
     */
    public Producto[] getListaproductos() {
        return listaProductos;
    }


    /**
     * 
     * @param listaproductos the listaProductos to set
     */


    public void setListaproductos(Producto[] listaproductos) {
        this.listaProductos = listaproductos;
    }




    @Override
    public String toString() {
        return "Tienda [nombre=" + nombre + ", numeroProductos=" + numeroProductos + ", listaproductos="
                + Arrays.toString(listaProductos) + "]";
    }
    

    /**
     * Este metodo agrega un nuevo producto siempre y cuando haya cupo y no este agregado
     * @param nuevoProducto
     * @return
     */


    public String agregarProducto (Producto nuevoProducto){
        String mensaje = "";
        int posDisponible = 0;
        Producto productoEncontrado = null;

        posDisponible = buscarPosicionDisponible();
        if(posDisponible == -1){
            mensaje = "No se pudo agregar el producto";
        }else{
            productoEncontrado = buscarProducto(nuevoProducto.getNombre());
            if(productoEncontrado != null){
                mensaje = "El producto ya existe";
            }else{
                listaProductos[posDisponible] = nuevoProducto;
                mensaje = "El producto se agrego correctamente ";
            }
        }
        return mensaje;
    }


    private Producto buscarProducto(String nombre) {
        Producto productoEncontrado = null;
        for (Producto productoAux : listaProductos) {
            if(productoAux.getNombre().equals(nombre)){
                return productoAux;
            }
        }
        return productoEncontrado;
     }


    private int buscarPosicionDisponible (){
        int posDisponible = -1;
        for (int i = 0; i < listaProductos.length; i++) {
            Producto producto = listaProductos [i];
            if (producto == null){
                posDisponible = i;
                return posDisponible;
            }
        }

        return posDisponible;
    }


    

    /**
     * Este metodo elimina un producto existente mediante el nombre
     * @param nombre
     * @param telefono
     * @return
     */

    public String eliminarProducto( String nombre){
        String mensaje = "Producto inexistente";

        for (int i = 0; i < listaProductos.length; i++) {
            Producto productoAux = listaProductos[i];
            if(productoAux.getNombre().equals(nombre)){
                listaProductos [i] = null;
                mensaje = "El producto se eliminó correctamente";
                return mensaje;
            }
        }
        return mensaje;
    }



    /**
     * Este metodo actualiza la informacion de un producto existente
     * @param nombre
     * @param alias
     * @param direccion
     * @param telefono
     * @param email
     * @return
     */

    public String actualizarProducto(String nombre, int precioCompra, String tipoProducto){

        String mensaje = "Producto no encontrado";
        Producto productoEncontrado = buscarProducto(nombre);
        if(productoEncontrado != null){
            productoEncontrado.setNombre(nombre);
            productoEncontrado.setPrecioCompra(precioCompra);
            productoEncontrado.setTipoProducto(tipoProducto);
            
            mensaje = "El producto se actualizó correctamente";
        }
        return mensaje;
     }




}
