/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package skatelab;

/**
 *
 * @author ROGER
 */
public abstract class Usuario {
    protected Integer cedula;
    protected Integer contrasena;
    protected String respuestaSeguridad;
    protected String nombres;
    protected String apellidos;
    protected Long celular;
    protected String correo;

    public Usuario() {
    }

    public Usuario(Integer cedula, Integer contrasena, String respuestaSeguridad, String nombres, String apellidos, Long celular, String correo) {
        this.cedula = cedula;
        this.contrasena = contrasena;
        this.respuestaSeguridad = respuestaSeguridad;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.celular = celular;
        this.correo = correo;
    }
    

    public Integer getCedula() {
        return cedula;
    }

    public void setCedula(Integer cedula) {
        this.cedula = cedula;
    }

    public Integer getContrasena() {
        return contrasena;
    }

    public void setContrasena(Integer contrasena) {
        this.contrasena = contrasena;
    }

    public String getRespuestaSeguridad() {
        return respuestaSeguridad;
    }

    public void setRespuestaSeguridad(String respuestaSeguridad) {
        this.respuestaSeguridad = respuestaSeguridad;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Long getCelular() {
        return celular;
    }

    public void setCelular(Long celular) {
        this.celular = celular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
}
