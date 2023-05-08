
package mvc;
import CONTROLADOR.Controlador;
import MODELO.Modelo;
import VISTA.Vista;

public class MVC {
    public static void main(String[] args) {
       //Objetos de las clases       
        Vista Vta = new Vista();
        Modelo Md = new Modelo();
        
        //Llamamos al controlador
        Controlador Ctrl = new Controlador(Vta,Md);
        Ctrl.ComenzarVista();
        Vta.setVisible(true);
    }
}
