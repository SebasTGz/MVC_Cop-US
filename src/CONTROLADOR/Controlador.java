
package CONTROLADOR;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import MODELO.Modelo;
import java.time.ZonedDateTime;
import VISTA.Vista;
import java.time.format.DateTimeFormatter;

public class Controlador implements ActionListener{
  
    private Vista vis;
    private Modelo mod;  
    
    //Constructor de la clase
    public Controlador (Vista vis, Modelo mod){
        this.vis = vis;
        this.mod = mod;
        this.vis.btnConvertir.addActionListener(this);
        this.vis.btnLimpiar.addActionListener(this);
        this.vis.btnSalir.addActionListener(this);
    }
    
    //Metodo para inicar la vista
    public void ComenzarVista(){
        vis.setTitle("Conversor de Pesos a Dólar 2023");
        vis.setLocationRelativeTo(null);
        vis.lblValorDolar.setText("Valor del Dólar hoy " + ZonedDateTime.now().format(DateTimeFormatter.ISO_DATE)
                + " es: " +String.valueOf(mod.getVLD_DOLAR()));
        vis.btnLimpiar.setText("Limpiar");
        vis.btnLimpiar.setMnemonic('c');//alt + c = clean
        vis.btnSalir.setText("Salir");
        vis.btnSalir.setMnemonic('e');//alt + e = exit
        vis.btnConvertir.setText("Convertir");
        vis.btnConvertir.setMnemonic('x');//alt + x = convertir
       //vis.setLocation(100, 100);
    }
       
    @Override //Funciones de los botones
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==vis.btnConvertir){
        mod.setPesos(Float.parseFloat(vis.txtPesosValor.getText()));
        vis.txtDolaresValor.setText(String.valueOf(mod.convertir()));  
    }else{
          if(e.getSource()==vis.btnLimpiar) {
                vis.txtDolaresValor.setText("");
                vis.txtPesosValor.setText("");
          }else{
               if(e.getSource()==vis.btnSalir){
                   vis.dispose();
               }
           }
       }   
    }
    
    
} 
