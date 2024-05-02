/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package skatelab;

/**
 *
 * @author ROGER
 */
public class EscenarioDeportivo {
    private String codigoEscenario;
    private Integer docenteEncargado;
    private Integer capacidadPersonas;
    private String horariosDisponibles;

    public EscenarioDeportivo(String codigoEscenario, Integer docenteEncargado, Integer capacidadPersonas, String horariosDisponibles) {
        this.codigoEscenario = codigoEscenario;
        this.docenteEncargado = docenteEncargado;
        this.capacidadPersonas = capacidadPersonas;
        this.horariosDisponibles = horariosDisponibles;
    }

    public String getCodigoEscenario() {
        return codigoEscenario;
    }

    public void setCodigoEscenario(String codigoEscenario) {
        this.codigoEscenario = codigoEscenario;
    }

    public Integer getDocenteEncargado() {
        return docenteEncargado;
    }

    public void setDocenteEncargado(Integer docenteEncargado) {
        this.docenteEncargado = docenteEncargado;
    }

    public Integer getCapacidadPersonas() {
        return capacidadPersonas;
    }

    public void setCapacidadPersonas(Integer capacidadPersonas) {
        this.capacidadPersonas = capacidadPersonas;
    }

    public String getHorariosDisponibles() {
        return horariosDisponibles;
    }

    public void setHorariosDisponibles(String horariosDisponibles) {
        this.horariosDisponibles = horariosDisponibles;
    }
    
    
    
}
