package co.edu.uniquindio.poo.model;

public class Producto {

    private String nombre;
    private double precioCompra;
    private String tipoProducto;
    private double precioVenta;



    public Producto (String nombre, double precioCompra, String tipoProducto, double precioVenta){
        this.nombre=nombre;
        this.precioCompra=precioCompra;
        this.tipoProducto=tipoProducto;
        this.precioVenta=precioVenta;

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
    * @return the precioCompra
    */
    public double getPrecioCompra() {
        return precioCompra;
    }



    /**
     * 
     * @param precioCompra the precioCompra to set
     */


    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }




    /**
     * 
     * @return the tipoProducto
     */

    public String getTipoProducto() {
        return tipoProducto;
    }



    /**
     * 
     * @param tipoProducto the tipoProducto to set
     */

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }



    /**
     * 
     * @return the precioVenta
     */

    public double getPrecioVenta() {
        return precioVenta;
    }


    /**
     * 
     * @param precioVenta the precioVenta to set
     */


    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }



    @Override
    public String toString() {
        return "Producto [nombre=" + nombre + ", precioCompra=" + precioCompra + ", tipoProducto=" + tipoProducto
                + ", precioVenta=" + precioVenta + "]";
    }
    
    /**
     *  Este metodo calcula el precio de venta de un producto dependiendo del tipo de y el precio de compra
     * @param precioCompra
     * @param tipoProducto
     * @return
     */

    public double calcularPrecio(double precioCompra, String tipoProducto) {
        double precioVenta = 0;
        if (tipoProducto.equals("refrigerados")) {
            precioVenta = ((precioCompra * 10) / 100) + precioCompra;
        } else if (tipoProducto.equals("perecederos")) {
            precioVenta = ((precioCompra * 15) / 100) + precioCompra;
        } else if (tipoProducto.equals("noperecederos")) {
            precioVenta = ((precioCompra * 5) / 100) + precioCompra;
        }
        return precioVenta;
    }


    
    
}
