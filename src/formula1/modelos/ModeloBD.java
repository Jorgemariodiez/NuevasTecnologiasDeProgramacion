
package formula1.modelos;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author 503
 */
public class ModeloBD {
    //donde vive la BD
    private String servidorBD="jdbc:mysql://localhost/formula1";
    private String usuarioBD="root1";
    private String passwordBD="";

    public ModeloBD() {
    }
    public Connection conectar(){
        
        Connection conexion=null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion=DriverManager.getConnection(servidorBD,usuarioBD,passwordBD);
            System.out.println("Coneccion establecida");
            return conexion;
            
        }catch(Exception error){
            System.out.println("upsss..."+error);
            return null;
        }
    }
    
    
}
