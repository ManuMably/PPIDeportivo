/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package skatelab;

import java.util.ArrayList;
import java.util.List;


public class ControladorDepEsce {
    
    
    //listas que contendran los deportes y escenarios que hay en la base de datos
    static List<Deporte> deportesBD = new ArrayList<>();
    
    static List<EscenarioDeportivo> escenariosBD = new ArrayList<>();
    
    static  List<GruposDeportivos> gruposBD = new ArrayList<>();
    
    // se busca en los grupos disponibles por el codigo de grupo
    public static GruposDeportivos buscarGrupoDeportivoPorCodigo(String codigoGrupo) {
        for (GruposDeportivos grupo : gruposBD) {
            if (grupo.getCodigoGrupo().equals(codigoGrupo)) {
                return grupo;
            }
        }
        return null;
    }
    
    // se cargan los deportes registrados a la lista del sistema
    public static void cargarGrupos(){
        ConexionBD conectorBD = new  ConexionBD();
        gruposBD = conectorBD.cargarListaGrupos();
    }
    
    public static void cargarDeportes(){
        ConexionBD conectorBD= new ConexionBD();
        deportesBD = conectorBD.cargarListaDeportes();
        
    }
    public static void cargarEscenarios(){
        ConexionBD conectorBD= new ConexionBD();
        escenariosBD = conectorBD.cargarListaEscenarios();
    }
    
    public static void actualizarGrupo(GruposDeportivos actualizaGrupo){
        for (int i = 0; i < gruposBD.size(); i++) {
            if (gruposBD.get(i).getCodigoGrupo() == actualizaGrupo.getCodigoGrupo()) {
                gruposBD.set(i, actualizaGrupo);
            }
            
        }
        ConexionBD conectorBD = new ConexionBD();
        conectorBD.actualizarGrupo(actualizaGrupo);
        
        
    }
    
    public static void actualizarDeporte(Deporte actualizaDeporte){
        for (int i = 0; i < deportesBD.size(); i++) {
            if (deportesBD.get(i).getCodigoDeporte() == actualizaDeporte.getCodigoDeporte()) {
                deportesBD.set(i, actualizaDeporte);
                                
            }            
        }
        ConexionBD conectorBD= new ConexionBD();
        conectorBD.actualizarDeporte(actualizaDeporte);
    
    }
    
    public static void actualizarEscenario(EscenarioDeportivo actualizaEscenario){
        for (int i = 0; i < escenariosBD.size(); i++) {
            if (escenariosBD.get(i).getCodigoEscenario()== actualizaEscenario.getCodigoEscenario()) {
                escenariosBD.set(i, actualizaEscenario);
                                
            }            
        }
        ConexionBD conectorBD= new ConexionBD();
        conectorBD.actualizarEscenario(actualizaEscenario);
    
    }
    
    public static void eliminarGrupo(GruposDeportivos eliminarGrupo){
        for (int i = 0; i < gruposBD.size(); i++) {
            if (gruposBD.get(i).getCodigoGrupo() == eliminarGrupo.getCodigoGrupo()) {
                gruposBD.remove(i);
            }
            
        }
        ConexionBD conectorBD= new ConexionBD();
        conectorBD.eliminarGrupo(eliminarGrupo);
    }
    
    public static void eliminarDeporte(Deporte eliminarDeporte){
        for (int i = 0; i < deportesBD.size(); i++) {
            if (deportesBD.get(i).getCodigoDeporte()== eliminarDeporte.getCodigoDeporte()) {
                deportesBD.remove(i);
                                
            }            
        }
        ConexionBD conectorBD= new ConexionBD();
        conectorBD.eliminarDeporte(eliminarDeporte);
    }
    
    public static void eliminarEscenario(EscenarioDeportivo eliminaEscenario){
        for (int i = 0; i < escenariosBD.size(); i++) {
            if (escenariosBD.get(i).getCodigoEscenario()== eliminaEscenario.getCodigoEscenario()) {
                escenariosBD.remove(i);
                                
            }            
        }
        ConexionBD conectorBD= new ConexionBD();
        conectorBD.eliminarEscenario(eliminaEscenario);
    
    }
    
    public static void registrarGrupo(GruposDeportivos grupoNuevo){
        gruposBD.add(grupoNuevo);
        
        
        ConexionBD conectorBD= new ConexionBD();
        conectorBD.InsertarGrupoD(grupoNuevo);
    }
    
    public static void registrarDeporte(Deporte deporteNuevo){
        deportesBD.add(deporteNuevo);
        
        
        ConexionBD conectorBD= new ConexionBD();
        conectorBD.InsertarDeporte(deporteNuevo);
    }
    
    public static void registrarEscenario(EscenarioDeportivo escenarioNuevo){
        escenariosBD.add(escenarioNuevo);
        
        
        ConexionBD conectorBD= new ConexionBD();
        conectorBD.InsertarEscenario(escenarioNuevo);
    }

    public static List<Deporte> getDeportesBD() {
        return deportesBD;
    }

    public static void setDeportesBD(List<Deporte> deportesBD) {
        ControladorDepEsce.deportesBD = deportesBD;
    }

    public static List<EscenarioDeportivo> getEscenariosBD() {
        return escenariosBD;
    }

    public static void setEscenariosBD(List<EscenarioDeportivo> escenariosBD) {
        ControladorDepEsce.escenariosBD = escenariosBD;
    }

    public static List<GruposDeportivos> getGruposBD() {
        return gruposBD;
    }

    public static void setGruposBD(List<GruposDeportivos> gruposBD) {
        ControladorDepEsce.gruposBD = gruposBD;
    }
    
    
    
    
}
