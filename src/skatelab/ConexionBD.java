
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
                    String celular = rs.getString("celular");
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
                    String celular = rs.getString("celular");
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
                    String celular = rs.getString("celular");
                    String contrasena = rs.getString("contrasena");
                    String respuestaSeguridad = rs.getString("respuestaSeguridad");
                    Boolean vinculado = rs.getBoolean("vinculado");
                    String codigoDias = rs.getString("codigoDias");
                    
                    Docente docenteBD = new Docente(vinculado, codigoDias, carnet, nombres, apellidos, correo, celular, contrasena, respuestaSeguridad);
                    perfilesbdList.add(docenteBD);
                    }else {
                        Integer carnet = rs.getInt("carnet");
                        String nombres = rs.getString("nombres");
                        String apellidos = rs.getString("apellidos");
                        String correo = rs.getString("correo");
                        String celular = rs.getString("celular");
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
                pstmt.setString(5, instancia.getCelular());
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
                String sql = "INSERT INTO usuarios (carnet, nombres, apellidos, correo, celular, contrasena, respuestaSeguridad, vinculado, codigoDias) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement pstmt = con.prepareStatement(sql);

                // Establecemos los valores de los parámetros en la sentencia SQL
                pstmt.setInt(1, instancia.getCarnet());
                pstmt.setString(2, instancia.getNombres());
                pstmt.setString(3, instancia.getApellidos());
                pstmt.setString(4, instancia.getCorreo());
                pstmt.setString(5, instancia.getCelular());
                pstmt.setString(6, String.valueOf(instancia.getContrasena()));
                pstmt.setString(7, instancia.getRespuestaSeguridad());
                pstmt.setBoolean(8, ((Docente) instancia).getVinculado());
                pstmt.setString(9, ((Docente) instancia).getCodigoDias());

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
                pstmt.setString(5, instancia.getCelular());
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
                pstmt.setString(5, instancia.getCelular());
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
                String sql = "UPDATE usuarios SET nombres= ?, apellidos = ?, correo = ?, celular = ?, contrasena = ?, respuestaSeguridad = ?, vinculado = ?, codigoDias = ? WHERE carnet = ?";
                PreparedStatement pstmt = con.prepareStatement(sql);

                // Establecemos los valores de los parámetros en la sentencia SQL
                
                pstmt.setString(1, instancia.getNombres());
                pstmt.setString(2, instancia.getApellidos());
                pstmt.setString(3, instancia.getCorreo());
                pstmt.setString(4, String.valueOf(instancia.getCelular()));
                pstmt.setString(5, String.valueOf(instancia.getContrasena()));
                pstmt.setString(6, instancia.getRespuestaSeguridad());
                pstmt.setBoolean(7, ((Docente) instancia).getVinculado());
                pstmt.setString(8, ((Docente) instancia).getCodigoDias());
                pstmt.setInt(9, ((Docente) instancia).getCarnet());

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
    
    // Deportes CRUD: ---------------------------------------------------------------------------------
    public List cargarListaDeportes(){
        List<Deporte> deportesbdList = new ArrayList<>();
        try {
            // preparamos el statement para solicitar los datos 
            con = DriverManager.getConnection(url, usuario, clave);
            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT * FROM deportes");
            rs.next();
            do {   
                String codigoDeporte = rs.getString("codigoDeporte");
                String nombreDeporte = rs.getString("nombreDeporte");
                Integer docenteEncargado = rs.getInt("carnetDocenteEncargado");
                String exigencia = rs.getString("exigencia");
                
                Deporte deporteBD = new Deporte(codigoDeporte, nombreDeporte, docenteEncargado, exigencia);
                deportesbdList.add(deporteBD);
                
            } while (rs.next());
        }
            catch (Exception e) {
            System.out.println("Error al conectar con la base de datos: " + e.getMessage());
        }return deportesbdList;
        }
    
    public void InsertarDeporte(Deporte nuevoDeporte) {
        try {
             // Preparamos la conexión y la sentencia SQL para insertar los datos
                con = DriverManager.getConnection(url, usuario, clave);
                String sql = "INSERT INTO deportes (codigoDeporte, nombreDeporte, carnetDocenteEncargado, exigencia) VALUES (?, ?, ?, ?)";
                PreparedStatement pstmt = con.prepareStatement(sql);
                
                pstmt.setString(1, nuevoDeporte.getCodigoDeporte());
                pstmt.setString(2, nuevoDeporte.getNombreDeporte());
                pstmt.setInt(3, nuevoDeporte.getDocenteEncargado());
                pstmt.setString(4, nuevoDeporte.getExigencia());
                
                // Ejecutamos la sentencia SQL para insertar los datos
                int filasAfectadas = pstmt.executeUpdate();

                if (filasAfectadas > 0) {
                    System.out.println("Los datos se han insertado correctamente.");
                } else {
                    System.out.println("No se han insertado datos.");
                }
            
        } catch (Exception e) {
            System.out.println("Error al conectar con la base de datos o al insertar datos: " + e.getMessage());
        }
    }
    
    public void actualizarDeporte(Deporte actualizaDeporte) {
        
        try {
                // Preparamos la conexión y la sentencia SQL para insertar los datos
                con = DriverManager.getConnection(url, usuario, clave);
                String sql = "UPDATE deportes SET nombreDeporte = ?, carnetDocenteEncargado = ?, exigencia = ? WHERE codigoDeporte = ?";
                PreparedStatement pstmt = con.prepareStatement(sql);

                // Establecemos los valores de los parámetros en la sentencia SQL
                
                pstmt.setString(1, actualizaDeporte.getNombreDeporte());
                pstmt.setInt(2, actualizaDeporte.getDocenteEncargado());
                pstmt.setString(3, actualizaDeporte.getExigencia());
                pstmt.setString(4, actualizaDeporte.getCodigoDeporte());
                

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
    public void eliminarDeporte(Deporte deporteBorrar){
            String codigoDeporte = deporteBorrar.getCodigoDeporte();
        try {
            con = DriverManager.getConnection(url, usuario, clave);
            stmt = con.createStatement();
            // Sentencia DELETE para eliminar el usuario con la cédula proporcionada
            String sql = "DELETE FROM deportes WHERE codigoDeporte = ?";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, codigoDeporte);

            int filasAfectadas = pstmt.executeUpdate();
            if (filasAfectadas > 0) {
                System.out.println("deporte eliminado correctamente.");
            } else {
                System.out.println("No se encontró ningún deporte con el codigo proporcionado.");
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
        
    
    // fin Deportes Acccesos: ----------------------------------------------------------------------------
    
    //Escenarios CRUD:------------------------------------------------------------------------------------
    public List cargarListaEscenarios(){
        List<EscenarioDeportivo> escenariosbdList = new ArrayList<>();
        try {
            // preparamos el statement para solicitar los datos 
            con = DriverManager.getConnection(url, usuario, clave);
            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT * FROM escenariosdeportivos");
            rs.next();
            do {   //codigoEscenario	carnetDocenteEncargado	capacidadPersonas	horariosDisponibles
                String codigoEscenario = rs.getString("codigoEscenario");
                Integer carnetDocenteEncargado = rs.getInt("carnetDocenteEncargado");
                Integer capacidadPersonas = rs.getInt("capacidadPersonas");
                String horariosDisponibles = rs.getString("horariosDisponibles");
                
                EscenarioDeportivo escenarioBD = new EscenarioDeportivo(codigoEscenario, carnetDocenteEncargado, capacidadPersonas, horariosDisponibles);
                escenariosbdList.add(escenarioBD);
                
            } while (rs.next());
        }
            catch (Exception e) {
            System.out.println("Error al conectar con la base de datos: " + e.getMessage());
        }return escenariosbdList;
        }
    
    public void InsertarEscenario(EscenarioDeportivo nuevoEscenarioDeportivo) {
        try {
             // Preparamos la conexión y la sentencia SQL para insertar los datos
                con = DriverManager.getConnection(url, usuario, clave);
                String sql = "INSERT INTO escenariosdeportivos (codigoEscenario, carnetDocenteEncargado, capacidadPersonas, horariosDisponibles) VALUES (?, ?, ?, ?)";
                PreparedStatement pstmt = con.prepareStatement(sql);
                
                pstmt.setString(1, nuevoEscenarioDeportivo.getCodigoEscenario());
                pstmt.setInt(2, nuevoEscenarioDeportivo.getDocenteEncargado());
                pstmt.setInt(3, nuevoEscenarioDeportivo.getCapacidadPersonas());
                pstmt.setString(4, nuevoEscenarioDeportivo.getHorariosDisponibles());
                
                // Ejecutamos la sentencia SQL para insertar los datos
                int filasAfectadas = pstmt.executeUpdate();

                if (filasAfectadas > 0) {
                    System.out.println("Los datos se han insertado correctamente.");
                } else {
                    System.out.println("No se han insertado datos.");
                }
            
        } catch (Exception e) {
            System.out.println("Error al conectar con la base de datos o al insertar datos: " + e.getMessage());
        }
    }
    
    public void actualizarEscenario(EscenarioDeportivo actualizaEscenario) {
        
        try {
                // Preparamos la conexión y la sentencia SQL para insertar los datos
                con = DriverManager.getConnection(url, usuario, clave);
                String sql = "UPDATE escenariosdeportivos SET carnetDocenteEncargado = ?, capacidadPersonas = ?, horariosDisponibles = ? WHERE codigoEscenario = ?";
                PreparedStatement pstmt = con.prepareStatement(sql);

                // Establecemos los valores de los parámetros en la sentencia SQL
                
                pstmt.setInt(1, actualizaEscenario.getDocenteEncargado());
                pstmt.setInt(2, actualizaEscenario.getCapacidadPersonas());
                pstmt.setString(3, actualizaEscenario.getHorariosDisponibles());
                pstmt.setString(4, actualizaEscenario.getCodigoEscenario());
                

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
    
    public void eliminarEscenario(EscenarioDeportivo escenarioBorrar){
            String codigoEscenario = escenarioBorrar.getCodigoEscenario();
        try {
            con = DriverManager.getConnection(url, usuario, clave);
            stmt = con.createStatement();
            // Sentencia DELETE para eliminar el usuario con la cédula proporcionada
            String sql = "DELETE FROM escenariosdeportivos WHERE codigoEscenario = ?";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, codigoEscenario);

            int filasAfectadas = pstmt.executeUpdate();
            if (filasAfectadas > 0) {
                System.out.println("escenario eliminado correctamente.");
            } else {
                System.out.println("No se encontró ningún escenario con el codigo proporcionado.");
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
    // fin Escenarios CRUD:-------------------------------------------------------------------------------
    
    // CRUD ESCENarios y deportes de la lista en BD:------------------------------------------------------
    public void InsertarEscenario(EscenarioDeportivo EscenarioDeportivo, Deporte deporteAgregar) {
        String codigoDeporte = deporteAgregar.getCodigoDeporte();
        String codigoEscenario = EscenarioDeportivo.getCodigoEscenario();
        try {
             // Preparamos la conexión y la sentencia SQL para insertar los datos
                con = DriverManager.getConnection(url, usuario, clave);
                String sql = "INSERT INTO escenariodeporte (codigoDeporte, codigoEscenario) VALUES (?, ?)";
                PreparedStatement pstmt = con.prepareStatement(sql);
                
                pstmt.setString(1, codigoDeporte);
                pstmt.setString(2, codigoEscenario);
                
                // Ejecutamos la sentencia SQL para insertar los datos
                int filasAfectadas = pstmt.executeUpdate();

                if (filasAfectadas > 0) {
                    System.out.println("Los datos se han insertado correctamente.");
                } else {
                    System.out.println("No se han insertado datos.");
                }
            
        } catch (Exception e) {
            System.out.println("Error al conectar con la base de datos o al insertar datos: " + e.getMessage());
        }
    }
    
    // FIN CRUD ESCENarios y deportes de la lista en BD:--------------------------------------------------
    
    
}
