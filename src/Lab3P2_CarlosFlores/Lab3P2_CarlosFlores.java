package Lab3P2_CarlosFlores;

import java.awt.Color;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JColorChooser;

public class Lab3P2_CarlosFlores {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Vehiculo> vehiculos = new ArrayList<>();

    public static void main(String[] args) {

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

                    break;
                case 2:
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

    static void addAutomovil() {
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
        Date fecha = new Date(year);

    }
}
