/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package skatelab;

/**
 *
 * @author ROGER
 */
public class Deporte {
    private String codigoDeporte;
    private String nombreDeporte;
    private Integer docenteEncargado;
    private String exigencia;

    public Deporte(String codigoDeporte, String nombreDeporte, Integer docenteEncargado, String exigencia) {
        this.codigoDeporte = codigoDeporte;
        this.nombreDeporte = nombreDeporte;
        this.docenteEncargado = docenteEncargado;
        this.exigencia = exigencia;
    }

    public String getCodigoDeporte() {
        return codigoDeporte;
    }

    public void setCodigoDeporte(String codigoDeporte) {
        this.codigoDeporte = codigoDeporte;
    }

    public String getNombreDeporte() {
        return nombreDeporte;
    }

    public void setNombreDeporte(String nombreDeporte) {
        this.nombreDeporte = nombreDeporte;
    }

    public Integer getDocenteEncargado() {
        return docenteEncargado;
    }

    public void setDocenteEncargado(Integer docenteEncargado) {
        this.docenteEncargado = docenteEncargado;
    }

    public String getExigencia() {
        return exigencia;
    }

    public void setExigencia(String exigencia) {
        this.exigencia = exigencia;
    }
    
    
    
}
