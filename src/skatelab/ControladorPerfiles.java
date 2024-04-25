
package skatelab;

import java.util.ArrayList;
import java.util.List;


public class ControladorPerfiles {
    // Perfil Logueado actualmente en el sistema
    static Usuario sesionActualUsuario;
    
    //listas que contendran los perfiles que hay en la base de datos
    static List<Usuario> perfilesBD = new ArrayList<>();
    static List<Administrativo> perfilesAdmin = new ArrayList<>();
    static List<Docente> perfilesdocentes = new ArrayList<>();
    static List<Estudiante> perfilesEstudiantes = new ArrayList<>();
    static List<TrabajadorExterno> perfilesExternos = new ArrayList<>();
    
    public static void cargarOrganizarPerfiles(){
        ConexionBD conectorBD= new ConexionBD();
        
        perfilesBD = conectorBD.cargarListaUsuarios();
        for (Usuario usuario : perfilesBD) {
            if (usuario instanceof Estudiante) {
                perfilesEstudiantes.add((Estudiante)usuario);
                
            }else if (usuario instanceof Administrativo) {
                perfilesAdmin.add((Administrativo)usuario);
                
            } else if (usuario instanceof Docente){
                perfilesdocentes.add((Docente)usuario);
            }else{
                perfilesExternos.add((TrabajadorExterno)usuario);
            }
            
        }
        
    }
    public  static  void actualizarPerfil(Usuario PerfilUsuario){
        for (int i = 0; i < perfilesBD.size(); i++) {
            if (perfilesBD.get(i).getCarnet()== PerfilUsuario.getCarnet()) {
                perfilesBD.set(i, PerfilUsuario);
                                
            }
            
        }
        if (PerfilUsuario instanceof Estudiante) {
            for (int i = 0; i < perfilesEstudiantes.size(); i++) {
                if (perfilesEstudiantes.get(i).getCarnet()== PerfilUsuario.getCarnet()) {
                perfilesEstudiantes.set(i, (Estudiante)PerfilUsuario);
                                
            }
                
            }
            
        }else if (PerfilUsuario instanceof Administrativo) {
            for (int i = 0; i < perfilesAdmin.size(); i++) {
                if (perfilesAdmin.get(i).getCarnet()== PerfilUsuario.getCarnet()) {
                perfilesAdmin.set(i, (Administrativo)PerfilUsuario);
                                
            }
                
            }
            
        }else if (PerfilUsuario instanceof Docente){
            for (int i = 0; i < perfilesdocentes.size(); i++) {
                if (perfilesdocentes.get(i).getCarnet()== PerfilUsuario.getCarnet()) {
                perfilesdocentes.set(i, (Docente)PerfilUsuario);
                                
            }
                
            }
        
        }else{
            for (int i = 0; i < perfilesExternos.size(); i++) {
                if (perfilesExternos.get(i).getCarnet()== PerfilUsuario.getCarnet()) {
                perfilesExternos.set(i, (TrabajadorExterno)PerfilUsuario);
                                
            }
                
            }
        
        }
        ConexionBD conectorBD= new ConexionBD();
        conectorBD.actualizarUsuario(PerfilUsuario);
    }
    
    public  static  void borrarPerfil(Usuario PerfilUsuario){
        for (int i = 0; i < perfilesBD.size(); i++) {
            if (perfilesBD.get(i).getCarnet()== PerfilUsuario.getCarnet()) {
                perfilesBD.remove(i);
                                
            }
            
        }
        if (PerfilUsuario instanceof Estudiante) {
            for (int i = 0; i < perfilesEstudiantes.size(); i++) {
                if (perfilesEstudiantes.get(i).getCarnet()== PerfilUsuario.getCarnet()) {
                perfilesEstudiantes.remove(i);
                                
            }
                
            }
            
        }else if (PerfilUsuario instanceof Administrativo) {
            for (int i = 0; i < perfilesAdmin.size(); i++) {
                if (perfilesAdmin.get(i).getCarnet()== PerfilUsuario.getCarnet()) {
                perfilesAdmin.remove(i);
                                
            }
                
            }
            
        }else if (PerfilUsuario instanceof Docente){
            for (int i = 0; i < perfilesdocentes.size(); i++) {
                if (perfilesdocentes.get(i).getCarnet()== PerfilUsuario.getCarnet()) {
                perfilesdocentes.remove(i);
                                
            }
                
            }
        
        }else{
            for (int i = 0; i < perfilesExternos.size(); i++) {
                if (perfilesExternos.get(i).getCarnet()== PerfilUsuario.getCarnet()) {
                perfilesExternos.remove(i);
                                
            }
                
            }
        
        }
        ConexionBD conectorBD= new ConexionBD();
        conectorBD.eliminarUsuario(PerfilUsuario);
    
    }
    public static void registrarPerfil(Usuario perfilNuevo){
        perfilesBD.add(perfilNuevo);
        if (perfilNuevo instanceof Estudiante) {
            perfilesEstudiantes.add((Estudiante)perfilNuevo);
        }else if (perfilNuevo instanceof Administrativo) {
            perfilesAdmin.add((Administrativo)perfilNuevo);
        }else if (perfilNuevo instanceof Docente){
            perfilesdocentes.add((Docente)perfilNuevo);
        }else {
            perfilesExternos.add((TrabajadorExterno)perfilNuevo);
        }
        
        ConexionBD conectorBD= new ConexionBD();
        conectorBD.InsertarUsuario(perfilNuevo);
    }
    
    public static Usuario buscarPerfil(Integer carnetUsuario){
        for (Usuario usuario : perfilesBD) {
            if (usuario.getCarnet().equals(carnetUsuario)) {
                System.out.println("Carnet Encontrado");
                return usuario;
            }             
        }
        System.out.println("Carnet no Encontrado");
        Estudiante nn= new Estudiante(); 
        nn.setCarnet(0);
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

    public static List<Docente> getPerfilesDocentes() {
        return perfilesdocentes;
    }

    public static void setPerfilesDocentes(List<Docente> perfilesDocentes) {
        ControladorPerfiles.perfilesdocentes = perfilesDocentes;
    }

    public static List<Estudiante> getPerfilesEstudiantes() {
        return perfilesEstudiantes;
    }

    public static void setPerfilesEstudiantes(List<Estudiante> perfilesAlumno) {
        ControladorPerfiles.perfilesEstudiantes = perfilesAlumno;
    }
    
}
