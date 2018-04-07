/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labo;

/**
 *
 * @author Mery Acevedo
 */
public class producto {
    private String nombrepr;
    private double precio;
    private int cantidad;
    
    proveedor proveedor=new proveedor();

    public String getNombrepr() {
        return nombrepr;
    }

    public void setNombrepr(String nombrepr) {
        this.nombrepr = nombrepr;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = this.cantidad+cantidad;
    }

    public void insertproN(String nombre){
        proveedor.setNombre(nombre);  
    }
    
    public void insertproE(String empresa){
        proveedor.setEmpresa(empresa);  
    }
    
    public void insertproT(String telefono){
        proveedor.setTelefono(telefono);  
    }
    
    public void mostrarprov(){
        System.out.println(proveedor.getEmpresa());
        System.out.println(proveedor.getNombre());
        System.out.println(proveedor.getTelefono());
    }
    
}
