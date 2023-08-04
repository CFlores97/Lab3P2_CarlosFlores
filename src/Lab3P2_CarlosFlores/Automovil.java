package Lab3P2_CarlosFlores;

import java.awt.Color;
import java.util.Date;

public class Automovil extends Vehiculo {

    private String tipoCobustible, tipoTransmision;
    private int numPuertas, numAsientos;

    public Automovil() {
        super();
    }

    public Automovil(String tipoCobustible, String tipoTransmision, int numPuertas, int numAsientos, String numPlaca, String marca, String modelo, String tipo, Color color, Date year) {
        super(numPlaca, marca, modelo, tipo, color, year);
        this.tipoCobustible = tipoCobustible;
        this.tipoTransmision = tipoTransmision;
        this.numPuertas = numPuertas;
        this.numAsientos = numAsientos;
    }

    public String getTipoCobustible() {
        return tipoCobustible;
    }

    public void setTipoCobustible(String tipoCobustible) {
        this.tipoCobustible = tipoCobustible;
    }

    public String getTipoTransmision() {
        return tipoTransmision;
    }

    public void setTipoTransmision(String tipoTransmision) {
        this.tipoTransmision = tipoTransmision;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public int getNumAsientos() {
        return numAsientos;
    }

    public void setNumAsientos(int numAsientos) {
        this.numAsientos = numAsientos;
    }

    @Override
    public String toString() {
        return super.toString() + "Automovil{" + "tipoCobustible=" + tipoCobustible + ", tipoTransmision=" + tipoTransmision + ", numPuertas=" + numPuertas + ", numAsientos=" + numAsientos + '}';
    }
    
    
    @Override
    public void validar(){
        super.toString();
        System.out.println("validado");
    }
    
    

}
