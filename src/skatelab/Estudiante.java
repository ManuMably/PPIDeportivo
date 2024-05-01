/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package skatelab;

/**
 *
 * @author ROGER
 */
public class Estudiante extends Usuario {
    private String programaMatriculado;

    public Estudiante() {
    }

    public Estudiante(String ProgramaMatriculado) {
        this.programaMatriculado = ProgramaMatriculado;
    }

    public Estudiante(String ProgramaMatriculado, Integer carnet, String nombres, String apellidos, String correo, String celular, String contrasena, String respuestaSeguridad) {
        super(carnet, nombres, apellidos, correo, celular, contrasena, respuestaSeguridad);
        this.programaMatriculado = ProgramaMatriculado;
    }
    
    
    

    public String getProgramaMatriculado() {
        return programaMatriculado;
    }

    public void setProgramaMatriculado(String programaMatriculado) {
        this.programaMatriculado = programaMatriculado;
    }

    public Integer getCarnet() {
        return carnet;
    }

    public void setCarnet(Integer carnet) {
        this.carnet = carnet;
    }

    

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
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

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
}
