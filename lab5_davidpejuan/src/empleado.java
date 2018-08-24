/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author david
 */
public class empleado {
    private String Nombre; 
    private String fechanaci;
    private String usuario;
    private String contraseña;
    private String correo;
    private int puesto;

    public empleado() {
    }

    public empleado(String Nombre, String fechanaci, String usuario, String contraseña, String correo, int puesto) {
        this.Nombre = Nombre;
        this.fechanaci = fechanaci;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.correo = correo;
        this.puesto = puesto;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getFechanaci() {
        return fechanaci;
    }

    public void setFechanaci(String fechanaci) {
        this.fechanaci = fechanaci;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getPuesto() {
        return puesto;
    }

    public void setPuesto(int puesto) {
        this.puesto = puesto;
    }

    @Override
    public String toString() {
        String pues="";
        if (puesto==1) {
            pues="dulceria";
        }else if (puesto==2) {
            pues="boleteria";
        }else if (puesto==3) {
            pues="aseo";
        }
        return "empleado{" + "Nombre=" + Nombre + ", fechanaci=" + fechanaci + ", usuario=" + usuario + ", contrase\u00f1a=" + contraseña + ", correo=" + correo + ", puesto=" + pues + '}';
    }
    
    
    
}
