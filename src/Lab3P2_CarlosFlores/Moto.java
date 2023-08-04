
package Lab3P2_CarlosFlores;

import java.awt.Color;
import java.util.Date;


public class Moto extends Vehiculo{
    private double velMaxima, peso, consComb;

    public Moto() {
        super();
    }

    public Moto(double velMaxima, double peso, double consComb, String numPlaca, String marca, String modelo, String tipo, Color color, Date year) {
        super(numPlaca, marca, modelo, tipo, color, year);
        this.velMaxima = velMaxima;
        this.peso = peso;
        this.consComb = consComb;
    }

    public double getVelMaxima() {
        return velMaxima;
    }

    public void setVelMaxima(double velMaxima) {
        this.velMaxima = velMaxima;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getConsComb() {
        return consComb;
    }

    public void setConsComb(double consComb) {
        this.consComb = consComb;
    }

    @Override
    public String toString() {
        return "Moto{" + "velMaxima=" + velMaxima + ", peso=" + peso + ", consComb=" + consComb + '}';
    }
    
    
    
    
}
