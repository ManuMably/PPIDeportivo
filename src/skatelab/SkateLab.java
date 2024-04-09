
package skatelab;



public class SkateLab {

    
    public static void main(String[] args) {
        ConexionBD conectorBD= new ConexionBD();
        
        conectorBD.buscarPorNombres("anuel");
        conectorBD.buscarPorApellidos("pineda");
        conectorBD.buscarPorCedula(1036665962);
        
    }
    
}
