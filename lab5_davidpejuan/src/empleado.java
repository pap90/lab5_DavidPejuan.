
import java.util.Date;

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
    private Date fechanaci;
    private String usuario;
    private String contraseña;
    private String correo;
    private String puesto;

    public empleado() {
    }

    public empleado(String Nombre, Date fechanaci, String usuario, String contraseña, String correo, String puesto) {
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

    public Date getFechanaci() {
        return fechanaci;
    }

    public void setFechanaci(Date fechanaci) {
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

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    
    
    @Override
    public String toString() {
        return "empleado{" + "Nombre=" + Nombre + ", fechanaci=" + fechanaci + ", usuario=" + usuario + ", contrase\u00f1a=" + contraseña + ", correo=" + correo + ", puesto=" + puesto + '}';
    }

    

    
    
    
    
}
