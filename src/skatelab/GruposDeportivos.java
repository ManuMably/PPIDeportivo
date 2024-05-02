/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package skatelab;

/**
 *
 * @author ROGER
 */
public class GruposDeportivos {
    private String codigoGrupo;
    private String codigoEscenario;
    private String codigoDeporte;
    private Integer docenteEncargado;
    private String diasEntrenamiento;
    private String horasEntrenamiento;

    public GruposDeportivos(String codigoGrupo, String codigoEscenario, String codigoDeporte, Integer docenteEncargado, String diasEntrenamiento, String horasEntrenamiento) {
        this.codigoGrupo = codigoGrupo;
        this.codigoEscenario = codigoEscenario;
        this.codigoDeporte = codigoDeporte;
        this.docenteEncargado = docenteEncargado;
        this.diasEntrenamiento = diasEntrenamiento;
        this.horasEntrenamiento = horasEntrenamiento;
    }

    public String getCodigoGrupo() {
        return codigoGrupo;
    }

    public void setCodigoGrupo(String codigoGrupo) {
        this.codigoGrupo = codigoGrupo;
    }

    public String getCodigoEscenario() {
        return codigoEscenario;
    }

    public void setCodigoEscenario(String codigoEscenario) {
        this.codigoEscenario = codigoEscenario;
    }

    public String getCodigoDeporte() {
        return codigoDeporte;
    }

    public void setCodigoDeporte(String codigoDeporte) {
        this.codigoDeporte = codigoDeporte;
    }

    public Integer getDocenteEncargado() {
        return docenteEncargado;
    }

    public void setDocenteEncargado(Integer docenteEncargado) {
        this.docenteEncargado = docenteEncargado;
    }

    public String getDiasEntrenamiento() {
        return diasEntrenamiento;
    }

    public void setDiasEntrenamiento(String diasEntrenamiento) {
        this.diasEntrenamiento = diasEntrenamiento;
    }

    public String getHorasEntrenamiento() {
        return horasEntrenamiento;
    }

    public void setHorasEntrenamiento(String horasEntrenamiento) {
        this.horasEntrenamiento = horasEntrenamiento;
    }
    
    
    
    
    
}
