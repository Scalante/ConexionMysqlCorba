package conexionmysqlcorba;

/**
 *
 * @author Ruben Dario Scalante Rojas.
 */
public class PruebaConexion {
    
    public static void main(String[] args) {
        
        //Importante llamar el idll como el nombre de la tabla.
        
        
        //Instanciacion de la clase Conexion.
        
        Conexion conex = new Conexion();
        
        
        conex.Conectar();
        
        
        
    }
     
}
