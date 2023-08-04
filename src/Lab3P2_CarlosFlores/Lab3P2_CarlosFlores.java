package Lab3P2_CarlosFlores;

import java.awt.Color;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JColorChooser;

public class Lab3P2_CarlosFlores {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Vehiculo> vehiculos = new ArrayList<>();

    public static void main(String[] args) throws ParseException {

        boolean running = true;

        while (running) {
            System.out.println("""
                               1. Agregar Autom\u00f3vil
                               2. Agregar Motocicleta
                               3. Agregar Autob\u00fas
                               4. Modificar Veh\u00edculo
                               5. Eliminar Veh\u00edculo
                               6. Mostrar Veh\u00edculos
                               7. Generar Boleta
                               8. Salir""");
            int op = sc.nextInt();

            switch (op) {
                case 1:
                    addAutomovil();
                    break;
                case 2:
                    addMoto();
                    break;

                case 3:
                    break;

                case 4:
                    break;

                case 5:

                    break;
                case 6:

                    break;
                case 7:

                    break;
                case 8:
                    running = false;
                    break;

                default:
                    break;
            }

        }
    }

    static void addAutomovil() throws ParseException {
        System.out.println("Ingrese el tipo de combustible: ");
        String comb = sc.next();
        System.out.println("Ingrese el tipo de transmision: ");
        String trans = sc.next();
        System.out.println("Ingrese el numero de puertas: ");
        int numPuertas = sc.nextInt();
        System.out.println("Ingrese el numero de asientos: ");
        int numAsientos = sc.nextInt();
        System.out.println("Ingrese el numero de placa: ");
        String numPlaca = sc.next();

        while (numPlaca.length() > 4 || numPlaca.length() <= 1 && numPlaca.charAt(0) != 'H' && numPlaca.charAt(0) != 'B' && numPlaca.charAt(0) != 'b' && numPlaca.charAt(0) != 'h') {
            System.out.println(" El numero de la placa debe ser de 3 a 4 caracteres y el numero de tiene que empezar con b o h");
            System.out.println("Ingrese el numero de placa: ");
            numPlaca = sc.next();
        }

        System.out.println("Ingrese la marca: ");
        String marca = sc.next();
        System.out.println("Ingrese el modelo: ");
        String modelo = sc.next();
        System.out.println("Ingrese el tipo de auto: ");
        String tipo = sc.next();
        Color color = JColorChooser.showDialog(null, "Ingrese color", Color.yellow);
        DateFormat df = new SimpleDateFormat("yyyy");
        System.out.println("Ingrese el año: ");
        String year = sc.next();
        Date fecha = df.parse(year);

        vehiculos.add(new Automovil(comb, trans, numPuertas, numAsientos, numPlaca, marca, modelo, tipo, color, fecha));

        System.out.println("Se ha agregado el vehiculo exitosamente!");
    }

    static void addMoto() throws ParseException {

        System.out.println("Ingrese la velocidad maxima: ");
        double vel = sc.nextDouble();
        System.out.println("Ingrese el peso de la moto: ");
        double peso = sc.nextDouble();
        System.out.println("Ingrese el consumo de combustible: ");
        double consComb = sc.nextDouble();

        System.out.println("Ingrese el numero de placa: ");
        String numPlaca = sc.next();

        while (numPlaca.length() > 4 || numPlaca.length() <= 1 && numPlaca.charAt(0) != 'H' && numPlaca.charAt(0) != 'B' && numPlaca.charAt(0) != 'b' && numPlaca.charAt(0) != 'h') {
            System.out.println(" El numero de la placa debe ser de 3 a 4 caracteres y el numero de tiene que empezar con b o h");
            System.out.println("Ingrese el numero de placa: ");
            numPlaca = sc.next();
        }

        System.out.println("Ingrese la marca: ");
        String marca = sc.next();
        System.out.println("Ingrese el modelo: ");
        String modelo = sc.next();
        System.out.println("Ingrese el tipo de auto: ");
        String tipo = sc.next();
        Color color = JColorChooser.showDialog(null, "Ingrese color", Color.yellow);
        DateFormat df = new SimpleDateFormat("yyyy");
        System.out.println("Ingrese el año: ");
        String year = sc.next();
        Date fecha = df.parse(year);

        vehiculos.add(new Moto(vel, peso, consComb, numPlaca, marca, modelo, tipo, color, fecha));

        System.out.println("Se ha agregado la moto exitosamente");
    }

    static void addBus() throws ParseException {
        System.out.println("Ingrese la capacidad de pasajeros: ");
        int capPasa = sc.nextInt();
        System.out.println("Ingrese el numero de ejes: ");
        int numEjes = sc.nextInt();
        System.out.println("Ingrese la longitud: ");
        int longitud = sc.nextInt();

        System.out.println("Ingrese el numero de placa: ");
        String numPlaca = sc.next();

        while (numPlaca.length() > 4 || numPlaca.length() <= 1 && numPlaca.charAt(0) != 'H' && numPlaca.charAt(0) != 'B' && numPlaca.charAt(0) != 'b' && numPlaca.charAt(0) != 'h') {
            System.out.println(" El numero de la placa debe ser de 3 a 4 caracteres y el numero de tiene que empezar con b o h");
            System.out.println("Ingrese el numero de placa: ");
            numPlaca = sc.next();
        }

        System.out.println("Ingrese la marca: ");
        String marca = sc.next();
        System.out.println("Ingrese el modelo: ");
        String modelo = sc.next();
        System.out.println("Ingrese el tipo de auto: ");
        String tipo = sc.next();
        Color color = JColorChooser.showDialog(null, "Ingrese color", Color.yellow);
        DateFormat df = new SimpleDateFormat("yyyy");
        System.out.println("Ingrese el año: ");
        String year = sc.next();
        Date fecha = df.parse(year);

        vehiculos.add(new Autobus(capPasa, numEjes, longitud, numPlaca, marca, modelo, tipo, color, fecha));

        System.out.println("Se ha agregado la moto exitosamente");
    }
}
