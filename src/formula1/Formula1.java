
package formula1;

import formula1.controladores.Controlador;
import formula1.modelos.ModeloBD;
import formula1.vistas.Vista;


public class Formula1 {

   
    public static void main(String[] args) {
        ModeloBD modelo = new ModeloBD();
        Vista vista = new Vista();
        vista.setVisible(true);
        
        Controlador controlador = new Controlador(modelo, vista);
    }
    
}
