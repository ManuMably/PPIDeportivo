
package skatelab;

import java.util.ArrayList;
import java.util.List;


public class ControladorPerfiles {
    // Perfil Logueado actualmente en el sistema
    static Usuario sesionActualUsuario;
    
    //listas que contendran los perfiles que hay en la base de datos
    static List<Usuario> perfilesBD = new ArrayList<>();
    static List<Administrativo> perfilesAdmin = new ArrayList<>();
    static List<Instructor> perfilesInstruc = new ArrayList<>();
    static List<Alumno> perfilesAlumno = new ArrayList<>();
    
    public static void cargarOrganizarPerfiles(){
        ConexionBD conectorBD= new ConexionBD();
        
        perfilesBD = conectorBD.cargarListaUsuarios();
        for (Usuario usuario : perfilesBD) {
            if (usuario instanceof Alumno) {
                perfilesAlumno.add((Alumno)usuario);
                
            }else if (usuario instanceof Administrativo) {
                perfilesAdmin.add((Administrativo)usuario);
                
            } else{
                perfilesInstruc.add((Instructor)usuario);
            }
            
        }
        
    }
    public  static  void actualizarPerfil(Usuario PerfilUsuario){
        for (int i = 0; i < perfilesBD.size(); i++) {
            if (perfilesBD.get(i).getCedula() == PerfilUsuario.getCedula()) {
                perfilesBD.set(i, PerfilUsuario);
                                
            }
            
        }
        if (PerfilUsuario instanceof Alumno) {
            for (int i = 0; i < perfilesAlumno.size(); i++) {
                if (perfilesAlumno.get(i).getCedula() == PerfilUsuario.getCedula()) {
                perfilesAlumno.set(i, (Alumno)PerfilUsuario);
                                
            }
                
            }
            
        }else if (PerfilUsuario instanceof Administrativo) {
            for (int i = 0; i < perfilesAdmin.size(); i++) {
                if (perfilesAdmin.get(i).getCedula() == PerfilUsuario.getCedula()) {
                perfilesAdmin.set(i, (Administrativo)PerfilUsuario);
                                
            }
                
            }
            
        }else{
            for (int i = 0; i < perfilesInstruc.size(); i++) {
                if (perfilesInstruc.get(i).getCedula() == PerfilUsuario.getCedula()) {
                perfilesInstruc.set(i, (Instructor)PerfilUsuario);
                                
            }
                
            }
        
        }
        ConexionBD conectorBD= new ConexionBD();
        conectorBD.actualizarUsuario(PerfilUsuario);
    }
    
    public  static  void borrarPerfil(Usuario PerfilUsuario){
        for (int i = 0; i < perfilesBD.size(); i++) {
            if (perfilesBD.get(i).getCedula() == PerfilUsuario.getCedula()) {
                perfilesBD.remove(i);
                                
            }
            
        }
        if (PerfilUsuario instanceof Alumno) {
            for (int i = 0; i < perfilesAlumno.size(); i++) {
                if (perfilesAlumno.get(i).getCedula() == PerfilUsuario.getCedula()) {
                perfilesAlumno.remove(i);
                                
            }
                
            }
            
        }else if (PerfilUsuario instanceof Administrativo) {
            for (int i = 0; i < perfilesAdmin.size(); i++) {
                if (perfilesAdmin.get(i).getCedula() == PerfilUsuario.getCedula()) {
                perfilesAdmin.remove(i);
                                
            }
                
            }
            
        }else{
            for (int i = 0; i < perfilesInstruc.size(); i++) {
                if (perfilesInstruc.get(i).getCedula() == PerfilUsuario.getCedula()) {
                perfilesInstruc.remove(i);
                                
            }
                
            }
        
        }
        ConexionBD conectorBD= new ConexionBD();
        conectorBD.eliminarUsuario(PerfilUsuario);
    
    }
    public static void registrarPerfil(Usuario perfilNuevo){
        perfilesBD.add(perfilNuevo);
        if (perfilNuevo instanceof Alumno) {
            perfilesAlumno.add((Alumno)perfilNuevo);
        }else if (perfilNuevo instanceof Administrativo) {
            perfilesAdmin.add((Administrativo)perfilNuevo);
        }else{
            perfilesInstruc.add((Instructor)perfilNuevo);
        }
        
        ConexionBD conectorBD= new ConexionBD();
        conectorBD.InsertarUsuario(perfilNuevo);
    }
    
    public static Usuario buscarPerfil(Integer cedulaUsuario){
        for (Usuario usuario : perfilesBD) {
            if (usuario.getCedula().equals(cedulaUsuario)) {
                System.out.println("Cedula Encontrada");
                return usuario;
            }             
        }
        System.out.println("Cedula no Encontrada");
        Alumno nn= new Alumno(); 
        nn.setCedula(0);
        return nn;
    }
    
    public static Usuario getSesionActualUsuario() {
        return sesionActualUsuario;
    }

    public static void setSesionActualUsuario(Usuario sesionActualUsuario) {
        ControladorPerfiles.sesionActualUsuario = sesionActualUsuario;
    }    
}
