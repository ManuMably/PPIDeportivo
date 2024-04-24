
package skatelab;

import java.util.ArrayList;
import java.util.List;


public class ControladorPerfiles {
    // Perfil Logueado actualmente en el sistema
    static Usuario sesionActualUsuario;
    
    //listas que contendran los perfiles que hay en la base de datos
    static List<Usuario> perfilesBD = new ArrayList<>();
    static List<Administrativo> perfilesAdmin = new ArrayList<>();
    static List<Docente> perfilesInstruc = new ArrayList<>();
    static List<Estudiante> perfilesAlumno = new ArrayList<>();
    
    public static void cargarOrganizarPerfiles(){
        ConexionBD conectorBD= new ConexionBD();
        
        perfilesBD = conectorBD.cargarListaUsuarios();
        for (Usuario usuario : perfilesBD) {
            if (usuario instanceof Estudiante) {
                perfilesAlumno.add((Estudiante)usuario);
                
            }else if (usuario instanceof Administrativo) {
                perfilesAdmin.add((Administrativo)usuario);
                
            } else{
                perfilesInstruc.add((Docente)usuario);
            }
            
        }
        
    }
    public  static  void actualizarPerfil(Usuario PerfilUsuario){
        for (int i = 0; i < perfilesBD.size(); i++) {
            if (perfilesBD.get(i).getCedula() == PerfilUsuario.getCedula()) {
                perfilesBD.set(i, PerfilUsuario);
                                
            }
            
        }
        if (PerfilUsuario instanceof Estudiante) {
            for (int i = 0; i < perfilesAlumno.size(); i++) {
                if (perfilesAlumno.get(i).getCedula() == PerfilUsuario.getCedula()) {
                perfilesAlumno.set(i, (Estudiante)PerfilUsuario);
                                
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
                perfilesInstruc.set(i, (Docente)PerfilUsuario);
                                
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
        if (PerfilUsuario instanceof Estudiante) {
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
        if (perfilNuevo instanceof Estudiante) {
            perfilesAlumno.add((Estudiante)perfilNuevo);
        }else if (perfilNuevo instanceof Administrativo) {
            perfilesAdmin.add((Administrativo)perfilNuevo);
        }else{
            perfilesInstruc.add((Docente)perfilNuevo);
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
        Estudiante nn= new Estudiante(); 
        nn.setCedula(0);
        return nn;
    }
    
    public static Usuario getSesionActualUsuario() {
        return sesionActualUsuario;
    }

    public static void setSesionActualUsuario(Usuario sesionActualUsuario) {
        ControladorPerfiles.sesionActualUsuario = sesionActualUsuario;
    } 

    public static List<Usuario> getPerfilesBD() {
        return perfilesBD;
    }

    public static void setPerfilesBD(List<Usuario> perfilesBD) {
        ControladorPerfiles.perfilesBD = perfilesBD;
    }

    public static List<Administrativo> getPerfilesAdmin() {
        return perfilesAdmin;
    }

    public static void setPerfilesAdmin(List<Administrativo> perfilesAdmin) {
        ControladorPerfiles.perfilesAdmin = perfilesAdmin;
    }

    public static List<Docente> getPerfilesInstruc() {
        return perfilesInstruc;
    }

    public static void setPerfilesInstruc(List<Docente> perfilesInstruc) {
        ControladorPerfiles.perfilesInstruc = perfilesInstruc;
    }

    public static List<Estudiante> getPerfilesAlumno() {
        return perfilesAlumno;
    }

    public static void setPerfilesAlumno(List<Estudiante> perfilesAlumno) {
        ControladorPerfiles.perfilesAlumno = perfilesAlumno;
    }
    
}
