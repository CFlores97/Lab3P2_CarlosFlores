
package Lab3P2_CarlosFlores;

import java.awt.Color;
import java.util.Date;


public class Vehiculo {
    private String numPlaca, marca, modelo, tipo;
    private Color color; 
    private Date year;

    public Vehiculo() {
    }

    public Vehiculo(String numPlaca, String marca, String modelo, String tipo, Color color, Date year) {
        
        if(numPlaca.length() > 4 || numPlaca.length() <= 1){
            System.out.println("El numero de la placa debe ser de 3 a 4 caracteres");
        }
        else{
            this.numPlaca = numPlaca;
        }
        
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.color = color;
        this.year = year;
    }

    public String getNumPlaca() {
        return numPlaca;
    }

    public void setNumPlaca(String numPlaca) {
        this.numPlaca = numPlaca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Date getYear() {
        return year;
    }

    public void setYear(Date year) {
        this.year = year;
    }

    @Override
    public String toString() {
        super.toString();
        return "Vehiculo{" + "numPlaca=" + numPlaca + ", marca=" + marca + ", modelo=" + modelo + ", tipo=" + tipo + ", color=" + color + ", year=" + year + '}';
    }
    
    
    public void validar(){
        
    }
    
}
