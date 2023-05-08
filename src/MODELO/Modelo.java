
package MODELO;
public class Modelo {
    //Atributos
    private float pesos;
    private final float VLD_DOLAR = 4540;
    //get
    public float getPesos() {
        return pesos;
    }

    public float getVLD_DOLAR() {
        return VLD_DOLAR;
    }
    //set
    public void setPesos(float pesos) {
        this.pesos = pesos;
    }
    
    public float convertir(){
        return pesos/VLD_DOLAR;  
    } 
} 
