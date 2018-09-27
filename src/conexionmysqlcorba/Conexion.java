package conexionmysqlcorba;

import java.sql.*;
import javax.swing.JOptionPane;


/**
 *
 * @author Ruben Dario Scalante Rojas
 */
public class Conexion {
    
    public String db = "basedatocorba";
    public String url = "jdbc:mysql://localhost/"+db;
    public String user = "root";
    public String pass = "corhuila2018";
    public Connection link;


   public Connection Conectar(){
       
       

       Connection link = null;

       try{

           Class.forName("org.gjt.mm.mysql.Driver");

           link = DriverManager.getConnection(this.url, this.user, this.pass);
           
           JOptionPane.showMessageDialog(null, "Conexion establecida.");

       }catch(Exception ex){

           JOptionPane.showMessageDialog(null, ex);

       }


       return link;

   }

}
    
    

