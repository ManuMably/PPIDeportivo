
package skatelab;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class ConexionBD {
    
    //Atributos
    String usuario = "root";
    String clave = "";
    String url = "jdbc:mysql://localhost:3306/bd_poli";
    Connection con;
    Statement stmt;
    ResultSet rs;
    
    //Pruebas de conexion
    public void conectar() {
        try {
            // Establecer la conexión
            con = DriverManager.getConnection(url, usuario, clave);
            System.out.println("Conexión exitosa.");
        } catch (SQLException e) {
            System.out.println("Error al conectar con la base de datos: " + e.getMessage());
        }
    }

    public void desconectar() {
        try {
            if (con != null) {
                con.close();
                System.out.println("Desconexión exitosa.");
            }
        } catch (SQLException e) {
            System.out.println("Error al cerrar la conexión: " + e.getMessage());
        }
    }
    
    public List cargarListaUsuarios(){
        List<Usuario> perfilesbdList = new ArrayList<>();
        try {
            // preparamos el statement para solicitar los datos 
            con = DriverManager.getConnection(url, usuario, clave);
            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT * FROM usuario");
            rs.next();
            do {
                if (rs.getString("programaMatriculado")!= null) {
                    Integer carnet = rs.getInt("carnet");
                    String nombres = rs.getString("nombres");
                    String apellidos = rs.getString("apellidos");
                    String correo = rs.getString("correo");
                    Long celular = Long.parseLong(rs.getString("celular"));
                    String contrasena = rs.getString("contrasena");
                    String respuestaSeguridad = rs.getString("respuestaSeguridad");                    
                    String programaMatriculado = rs.getString("programaMatriculado");
                    
                    Estudiante estudianteBD = new Estudiante(programaMatriculado, carnet, nombres, apellidos, correo, celular, contrasena, respuestaSeguridad);
                    perfilesbdList.add(estudianteBD);
                }
                else if (rs.getString("claveAdmin")!= null) {
                    Integer carnet = rs.getInt("carnet");
                    String nombres = rs.getString("nombres");
                    String apellidos = rs.getString("apellidos");
                    String correo = rs.getString("correo");
                    Long celular = Long.parseLong(rs.getString("celular"));
                    String contrasena = rs.getString("contrasena");
                    String respuestaSeguridad = rs.getString("respuestaSeguridad"); 
                    String claveAdmin = rs.getString("claveAdmin");
                    
                    Administrativo administrativoBD = new Administrativo(claveAdmin, carnet, nombres, apellidos, correo, celular, contrasena, respuestaSeguridad);
                    perfilesbdList.add(administrativoBD);
                    
                }else if (rs.getString("vinculado")!= null) {
                    Integer carnet = rs.getInt("carnet");
                    String nombres = rs.getString("nombres");
                    String apellidos = rs.getString("apellidos");
                    String correo = rs.getString("correo");
                    Long celular = Long.parseLong(rs.getString("celular"));
                    String contrasena = rs.getString("contrasena");
                    String respuestaSeguridad = rs.getString("respuestaSeguridad");
                    Boolean vinculado = rs.getBoolean("vinculado");
                    
                    Docente docenteBD = new Docente(vinculado, carnet, nombres, apellidos, correo, celular, contrasena, respuestaSeguridad);
                    perfilesbdList.add(docenteBD);
                    }else {
                        Integer carnet = rs.getInt("carnet");
                        String nombres = rs.getString("nombres");
                        String apellidos = rs.getString("apellidos");
                        String correo = rs.getString("correo");
                        Long celular = Long.parseLong(rs.getString("celular"));
                        String contrasena = rs.getString("contrasena");
                        String respuestaSeguridad = rs.getString("respuestaSeguridad");
                        String ocupacion = rs.getString("ocupacion");
                        
                        TrabajadorExterno trabajadorBD = new TrabajadorExterno(ocupacion, carnet, nombres, apellidos, correo, celular, contrasena, respuestaSeguridad);
                        perfilesbdList.add(trabajadorBD);
                }                         
               
            } while (rs.next());
        } catch (SQLException e) {
            System.out.println("Error al conectar con la base de datos: " + e.getMessage());
        }
        return perfilesbdList;
    }
    // Insersiones: Usuarios,claseParticular-------------------------------------------
    public <T extends Usuario> void InsertarUsuario(T instancia) {
        if (instancia instanceof Estudiante) {
                    try {
                // Preparamos la conexión y la sentencia SQL para insertar los datos
                con = DriverManager.getConnection(url, usuario, clave);
                String sql = "INSERT INTO usuarios (carnet, nombres, apellidos, correo, celular, contrasena, respuestaSeguridad, programaMatriculado) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement pstmt = con.prepareStatement(sql);

                // Establecemos los valores de los parámetros en la sentencia SQL
                pstmt.setInt(1, instancia.getCarnet());
                pstmt.setString(2, instancia.getNombres());
                pstmt.setString(3, instancia.getApellidos());
                pstmt.setString(4, instancia.getCorreo());
                pstmt.setString(5, String.valueOf(instancia.getCelular()));
                pstmt.setString(6, String.valueOf(instancia.getContrasena()));
                pstmt.setString(7, instancia.getRespuestaSeguridad());    
                pstmt.setString(8, ((Estudiante) instancia).getProgramaMatriculado());

                // Ejecutamos la sentencia SQL para insertar los datos
                int filasAfectadas = pstmt.executeUpdate();

                if (filasAfectadas > 0) {
                    System.out.println("Los datos se han insertado correctamente.");
                } else {
                    System.out.println("No se han insertado datos.");
                }
            } catch (SQLException e) {
                System.out.println("Error al conectar con la base de datos o al insertar datos: " + e.getMessage());
            } finally {
                // Cerramos los recursos
                try {
                    if (stmt != null) stmt.close();
                    if (con != null) con.close();
                } catch (SQLException e) {
                    System.out.println("Error al cerrar la conexión: " + e.getMessage());
                }
            }
            
        }
        else if (instancia instanceof Docente) {
            try {
                // Preparamos la conexión y la sentencia SQL para insertar los datos
                con = DriverManager.getConnection(url, usuario, clave);
                String sql = "INSERT INTO usuarios (carnet, nombres, apellidos, correo, celular, contrasena, respuestaSeguridad, vinculado) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement pstmt = con.prepareStatement(sql);

                // Establecemos los valores de los parámetros en la sentencia SQL
                pstmt.setInt(1, instancia.getCarnet());
                pstmt.setString(2, instancia.getNombres());
                pstmt.setString(3, instancia.getApellidos());
                pstmt.setString(4, instancia.getCorreo());
                pstmt.setString(5, String.valueOf(instancia.getCelular()));
                pstmt.setString(6, String.valueOf(instancia.getContrasena()));
                pstmt.setString(7, instancia.getRespuestaSeguridad());
                pstmt.setBoolean(8, ((Docente) instancia).getVinculado());

                // Ejecutamos la sentencia SQL para insertar los datos
                int filasAfectadas = pstmt.executeUpdate();

                if (filasAfectadas > 0) {
                    System.out.println("Los datos se han insertado correctamente.");
                } else {
                    System.out.println("No se han insertado datos.");
                }
            } catch (SQLException e) {
                System.out.println("Error al conectar con la base de datos o al insertar datos: " + e.getMessage());
            } finally {
                // Cerramos los recursos
                try {
                    if (stmt != null) stmt.close();
                    if (con != null) con.close();
                } catch (SQLException e) {
                    System.out.println("Error al cerrar la conexión: " + e.getMessage());
                }
            }
            
        }
        else if (instancia instanceof Administrativo){
            try {
                // Preparamos la conexión y la sentencia SQL para insertar los datos
                con = DriverManager.getConnection(url, usuario, clave);
                String sql = "INSERT INTO usuarios (carnet, nombres, apellidos, correo, celular, contrasena, respuestaSeguridad, claveAdmin) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement pstmt = con.prepareStatement(sql);

                pstmt.setInt(1, instancia.getCarnet());
                pstmt.setString(2, instancia.getNombres());
                pstmt.setString(3, instancia.getApellidos());
                pstmt.setString(4, instancia.getCorreo());
                pstmt.setString(5, String.valueOf(instancia.getCelular()));
                pstmt.setString(6, String.valueOf(instancia.getContrasena()));
                pstmt.setString(7, instancia.getRespuestaSeguridad());
                pstmt.setString(8, ((Administrativo) instancia).getClaveAdmin());

                // Ejecutamos la sentencia SQL para insertar los datos
                int filasAfectadas = pstmt.executeUpdate();

                if (filasAfectadas > 0) {
                    System.out.println("Los datos se han insertado correctamente.");
                } else {
                    System.out.println("No se han insertado datos.");
                }
            } catch (SQLException e) {
                System.out.println("Error al conectar con la base de datos o al insertar datos: " + e.getMessage());
            } finally {
                // Cerramos los recursos
                try {
                    if (stmt != null) stmt.close();
                    if (con != null) con.close();
                } catch (SQLException e) {
                    System.out.println("Error al cerrar la conexión: " + e.getMessage());
                }
            }
        }else{
            try {
                // Preparamos la conexión y la sentencia SQL para insertar los datos
                con = DriverManager.getConnection(url, usuario, clave);
                String sql = "INSERT INTO usuarios (carnet, nombres, apellidos, correo, celular, contrasena, respuestaSeguridad, ocupacion) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement pstmt = con.prepareStatement(sql);

                pstmt.setInt(1, instancia.getCarnet());
                pstmt.setString(2, instancia.getNombres());
                pstmt.setString(3, instancia.getApellidos());
                pstmt.setString(4, instancia.getCorreo());
                pstmt.setString(5, String.valueOf(instancia.getCelular()));
                pstmt.setString(6, String.valueOf(instancia.getContrasena()));
                pstmt.setString(7, instancia.getRespuestaSeguridad());
                pstmt.setString(8, ((TrabajadorExterno) instancia).getOcupacion());

                // Ejecutamos la sentencia SQL para insertar los datos
                int filasAfectadas = pstmt.executeUpdate();

                if (filasAfectadas > 0) {
                    System.out.println("Los datos se han insertado correctamente.");
                } else {
                    System.out.println("No se han insertado datos.");
                }
            } catch (SQLException e) {
                System.out.println("Error al conectar con la base de datos o al insertar datos: " + e.getMessage());
            } finally {
                // Cerramos los recursos
                try {
                    if (stmt != null) stmt.close();
                    if (con != null) con.close();
                } catch (SQLException e) {
                    System.out.println("Error al cerrar la conexión: " + e.getMessage());
                }
            }
        
        
        }
    }
    
    // fin inserciones: ususarios, claseParticular-------------------------------------
    
    // actualizaciones  : ususarios, claseParticular-----------------------------------
    public <T extends Usuario> void actualizarUsuario(T instancia) {
        if (instancia instanceof Estudiante) {
                    try {
                // Preparamos la conexión y la sentencia SQL para insertar los datos
                con = DriverManager.getConnection(url, usuario, clave);
                String sql = "UPDATE usuarios SET nombres= ?, apellidos = ?, correo = ?, celular = ?, contrasena = ?, respuestaSeguridad = ?, programaMatriculado = ? WHERE carnet = ?";
                PreparedStatement pstmt = con.prepareStatement(sql);

                // Establecemos los valores de los parámetros en la sentencia SQL
                
                pstmt.setString(1, instancia.getNombres());
                pstmt.setString(2, instancia.getApellidos());
                pstmt.setString(3, instancia.getCorreo());
                pstmt.setString(4, String.valueOf(instancia.getCelular()));
                pstmt.setString(5, String.valueOf(instancia.getContrasena()));
                pstmt.setString(6, instancia.getRespuestaSeguridad());
                pstmt.setString(7, ((Estudiante) instancia).getProgramaMatriculado());
                pstmt.setInt(8, ((Estudiante) instancia).getCarnet());

                // Ejecutamos la sentencia SQL para insertar los datos
                int filasAfectadas = pstmt.executeUpdate();

                if (filasAfectadas > 0) {
                    System.out.println("Los datos se han actualizado correctamente.");
                } else {
                    System.out.println("No se han actualizado datos.");
                }
            } catch (SQLException e) {
                System.out.println("Error al conectar con la base de datos o al actualizar datos: " + e.getMessage());
            } finally {
                // Cerramos los recursos
                try {
                    if (stmt != null) stmt.close();
                    if (con != null) con.close();
                } catch (SQLException e) {
                    System.out.println("Error al cerrar la conexión: " + e.getMessage());
                }
            }
            
        }
        else if (instancia instanceof Docente) {
            try {
                // Preparamos la conexión y la sentencia SQL para insertar los datos
                con = DriverManager.getConnection(url, usuario, clave);
                String sql = "UPDATE usuarios SET nombres= ?, apellidos = ?, correo = ?, celular = ?, contrasena = ?, respuestaSeguridad = ?, vinculado = ? WHERE carnet = ?";
                PreparedStatement pstmt = con.prepareStatement(sql);

                // Establecemos los valores de los parámetros en la sentencia SQL
                
                pstmt.setString(1, instancia.getNombres());
                pstmt.setString(2, instancia.getApellidos());
                pstmt.setString(3, instancia.getCorreo());
                pstmt.setString(4, String.valueOf(instancia.getCelular()));
                pstmt.setString(5, String.valueOf(instancia.getContrasena()));
                pstmt.setString(6, instancia.getRespuestaSeguridad());
                pstmt.setBoolean(7, ((Docente) instancia).getVinculado());
                pstmt.setInt(8, ((Docente) instancia).getCarnet());

                // Ejecutamos la sentencia SQL para insertar los datos
                int filasAfectadas = pstmt.executeUpdate();

                if (filasAfectadas > 0) {
                    System.out.println("Los datos se han actualizado correctamente.");
                } else {
                    System.out.println("No se han actualizado datos.");
                }
            } catch (SQLException e) {
                System.out.println("Error al conectar con la base de datos o al actualizar datos: " + e.getMessage());
            } finally {
                // Cerramos los recursos
                try {
                    if (stmt != null) stmt.close();
                    if (con != null) con.close();
                } catch (SQLException e) {
                    System.out.println("Error al cerrar la conexión: " + e.getMessage());
                }
            }
            
        }
        else if (instancia instanceof Administrativo){
            try {
                // Preparamos la conexión y la sentencia SQL para insertar los datos
                con = DriverManager.getConnection(url, usuario, clave);
                String sql = "UPDATE usuarios SET nombres= ?, apellidos = ?, correo = ?, celular = ?, contrasena = ?, respuestaSeguridad = ?, claveAdmin = ? WHERE carnet = ?";
                PreparedStatement pstmt = con.prepareStatement(sql);

                // Establecemos los valores de los parámetros en la sentencia SQL
                
                pstmt.setString(1, instancia.getNombres());
                pstmt.setString(2, instancia.getApellidos());
                pstmt.setString(3, instancia.getCorreo());
                pstmt.setString(4, String.valueOf(instancia.getCelular()));
                pstmt.setString(5, String.valueOf(instancia.getContrasena()));
                pstmt.setString(6, instancia.getRespuestaSeguridad());
                pstmt.setString(7, ((Administrativo) instancia).getClaveAdmin());
                pstmt.setInt(8, ((Administrativo) instancia).getCarnet());

                // Ejecutamos la sentencia SQL para insertar los datos
                int filasAfectadas = pstmt.executeUpdate();

                if (filasAfectadas > 0) {
                    System.out.println("Los datos se han insertado correctamente.");
                } else {
                    System.out.println("No se han insertado datos.");
                }
            } catch (SQLException e) {
                System.out.println("Error al conectar con la base de datos o al insertar datos: " + e.getMessage());
            } finally {
                // Cerramos los recursos
                try {
                    if (stmt != null) stmt.close();
                    if (con != null) con.close();
                } catch (SQLException e) {
                    System.out.println("Error al cerrar la conexión: " + e.getMessage());
                }
            }
        }else{
            try {
                // Preparamos la conexión y la sentencia SQL para insertar los datos
                con = DriverManager.getConnection(url, usuario, clave);
                String sql = "UPDATE usuarios SET nombres= ?, apellidos = ?, correo = ?, celular = ?, contrasena = ?, respuestaSeguridad = ?, ocupacion = ? WHERE carnet = ?";
                PreparedStatement pstmt = con.prepareStatement(sql);

                // Establecemos los valores de los parámetros en la sentencia SQL
                
                pstmt.setString(1, instancia.getNombres());
                pstmt.setString(2, instancia.getApellidos());
                pstmt.setString(3, instancia.getCorreo());
                pstmt.setString(4, String.valueOf(instancia.getCelular()));
                pstmt.setString(5, String.valueOf(instancia.getContrasena()));
                pstmt.setString(6, instancia.getRespuestaSeguridad());
                pstmt.setString(7, ((TrabajadorExterno) instancia).getOcupacion());
                pstmt.setInt(8, ((TrabajadorExterno) instancia).getCarnet());

                // Ejecutamos la sentencia SQL para insertar los datos
                int filasAfectadas = pstmt.executeUpdate();

                if (filasAfectadas > 0) {
                    System.out.println("Los datos se han insertado correctamente.");
                } else {
                    System.out.println("No se han insertado datos.");
                }
            } catch (SQLException e) {
                System.out.println("Error al conectar con la base de datos o al insertar datos: " + e.getMessage());
            } finally {
                // Cerramos los recursos
                try {
                    if (stmt != null) stmt.close();
                    if (con != null) con.close();
                } catch (SQLException e) {
                    System.out.println("Error al cerrar la conexión: " + e.getMessage());
                }
            }
        
        }
    }
    
    // fin actualizaciones  : ususarios, claseParticular-------------------------------

    
    // consultas : nombre, apellido, cedula--------------------------------------------
    public void buscarPorNombres(String nombreSolicitado){
        
        try {
            // preparamos el statement para solicitar los datos 
            con = DriverManager.getConnection(url, usuario, clave);
            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT * FROM usuario WHERE nombres LIKE '%"+nombreSolicitado+"%'");
            rs.next();
            
            do {                
                System.out.println(rs.getString("respuestaSeguridad"));
            } while (rs.next());
        } catch (SQLException e) {
            System.out.println("Error al conectar con la base de datos: " + e.getMessage());
        }
    
    }
    
    public void buscarPorApellidos(String apellidoSolicitado){
        
        try {
            // preparamos el statement para solicitar los datos 
            con = DriverManager.getConnection(url, usuario, clave);
            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT * FROM usuario WHERE apellidos LIKE '%"+apellidoSolicitado+"%'");
            rs.next();
            
            do {                
                System.out.println(rs.getString("correo"));
            } while (rs.next());
        } catch (SQLException e) {
            System.out.println("Error al conectar con la base de datos: " + e.getMessage());
        }
    
    }
    
    public void buscarPorCedula(Integer cedulaSolicitada){
        String cedula = Integer.toString(cedulaSolicitada);
        try {
            // preparamos el statement para solicitar los datos 
            con = DriverManager.getConnection(url, usuario, clave);
            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT * FROM usuario WHERE id_cedula LIKE '%"+cedula+"%'");
            rs.next();
            
            do {                
                System.out.println(rs.getString("celular"));
            } while (rs.next());
        } catch (SQLException e) {
            System.out.println("Error al conectar con la base de datos: " + e.getMessage());
        }
    
    }
    // FIN consultas : nombre, apellido, cedula--------------------------------------------
    
    // Eliminar datos BD: Usuarios---------------------------------------------------------
    public void eliminarUsuario(Usuario usuarioBorrar){
            String cedula = Integer.toString(usuarioBorrar.getCarnet());
        try {
            con = DriverManager.getConnection(url, usuario, clave);
            stmt = con.createStatement();
            // Sentencia DELETE para eliminar el usuario con la cédula proporcionada
            String sql = "DELETE FROM usuario WHERE id_cedula = ?";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, cedula);

            int filasAfectadas = pstmt.executeUpdate();
            if (filasAfectadas > 0) {
                System.out.println("Usuario eliminado correctamente.");
            } else {
                System.out.println("No se encontró ningún usuario con la cédula proporcionada.");
            }

        } catch (SQLException e) {
            System.out.println("Error al conectar con la base de datos: " + e.getMessage());
        } finally {
            // Cerrar recursos
            try {
                if (stmt != null) stmt.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
    }
    // Fin Eliminar datos BD: Usuarios-----------------------------------------------------
}
