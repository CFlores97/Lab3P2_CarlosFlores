
package Lab3P2_CarlosFlores;

import java.awt.Color;
import java.util.Date;


public class Autobus extends Vehiculo {
    
    private int capPasajeros, numEjes, longitud;

    public Autobus() {
        super();
    }

    public Autobus(int capPasajeros, int numEjes, int longitud, String numPlaca, String marca, String modelo, String tipo, Color color, Date year) {
        super(numPlaca, marca, modelo, tipo, color, year);
        this.capPasajeros = capPasajeros;
        this.numEjes = numEjes;
        this.longitud = longitud;
    }

    public int getCapPasajeros() {
        return capPasajeros;
    }

    public void setCapPasajeros(int capPasajeros) {
        this.capPasajeros = capPasajeros;
    }

    public int getNumEjes() {
        return numEjes;
    }

    public void setNumEjes(int numEjes) {
        this.numEjes = numEjes;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    @Override
    public String toString() {
        
        return super.toString() + "Autobus{" + "capPasajeros=" + capPasajeros + ", numEjes=" + numEjes + ", longitud=" + longitud + '}';
    }
    
    
    
    
    
}
