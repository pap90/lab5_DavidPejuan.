/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author david
 */
public class dulces {
    private String nombre;
    private String sabor;
    private String categoria;

    public dulces() {
    }

    public dulces(String nombre, String sabor, String categoria) {
        this.nombre = nombre;
        this.sabor = sabor;
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    

    @Override
    public String toString() {
       return nombre;
    }
    
    
}
