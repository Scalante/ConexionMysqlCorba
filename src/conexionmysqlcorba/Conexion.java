package conexionmysqlcorba;

import java.sql.*;
import javax.swing.JOptionPane;


/**
 *
 * @author Ruben Dario Scalante Rojas
 */
public class Conexion {
    
    public String db = "bdcontactos";
    public String url = "jdbc:mysql://localhost/"+db;
    public String user = "root";
    public String pass = "123";


   public Connection Conectar(){

       Connection link = null;

       try{

           Class.forName("org.gjt.mm.mysql.Driver");

           link = DriverManager.getConnection(this.url, this.user, this.pass);

       }catch(Exception ex){

           JOptionPane.showMessageDialog(null, ex);

       }


       return link;

   }

}
    
    
