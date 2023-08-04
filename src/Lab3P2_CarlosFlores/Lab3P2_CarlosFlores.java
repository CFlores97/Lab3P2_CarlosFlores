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
                case 1 ->
                    addAutomovil();
                case 2 ->
                    addMoto();

                case 3 ->
                    addBus();

                case 4 -> {
                }

                case 5 -> {
                    eliminar();
                }
                case 6 -> {
                    System.out.println("Ingrese los vehiculos que quiere mostrar:\n\n1. Automoviles\n2. Motos\n3. Autobus\n4. Mostrar todo\n5. Salir");
                    int opcion = sc.nextInt();

                    switch (opcion) {
                        case 1 ->
                            mostrar(1);
                        case 2 ->
                            mostrar(2);
                        case 3 ->
                            mostrar(3);
                        case 4 ->
                            System.out.println(vehiculos);
                        default ->
                            System.out.println("Opcion fuera de rango");
                    }
                }

                case 7 -> {
                }
                case 8 ->
                    running = false;

                default -> {
                }
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

        while (numPlaca.charAt(0) != 'H' && numPlaca.charAt(0) != 'B' && numPlaca.charAt(0) != 'b' && numPlaca.charAt(0) != 'h') {
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

        while (numPlaca.charAt(0) != 'H' && numPlaca.charAt(0) != 'B' && numPlaca.charAt(0) != 'b' && numPlaca.charAt(0) != 'h') {
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

        while (numPlaca.charAt(0) != 'H' && numPlaca.charAt(0) != 'B' && numPlaca.charAt(0) != 'b' && numPlaca.charAt(0) != 'h') {
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

    static void eliminar() {

        System.out.println("Ingrese los vehiculos que quiere eliminar:\n\n1. Automoviles\n2. Motos\n3. Autobus\n4. Salir");
        int opcionElegida = sc.nextInt();

        switch (opcionElegida) {
            case 1 -> {

                mostrar(1);

                int opElim = sc.nextInt();

                System.out.println("Seguro que desea eliminar el vehiculo?\n\n1. Si\n2. No");
                int answ = sc.nextInt();

                switch (answ) {
                    case 1:
                        vehiculos.remove(opElim);
                        System.out.println("Eliminado!");
                        break;
                    default:
                        throw new AssertionError();
                }

            }
            case 2 -> {
                mostrar(2);

                int opElim2 = sc.nextInt();

                System.out.println("Seguro que desea eliminar el vehiculo?\n\n1. Si\n2. No");
                int answ = sc.nextInt();

                switch (answ) {
                    case 1:
                        vehiculos.remove(opElim2);
                        System.out.println("Eliminado!");
                        break;
                    default:
                        throw new AssertionError();
                }

            }
            case 3 -> {
                mostrar(3);

                int opElim3 = sc.nextInt();

                System.out.println("Seguro que desea eliminar el vehiculo?\n\n1. Si\n2. No");
                int answ = sc.nextInt();

                switch (answ) {
                    case 1:
                        vehiculos.remove(opElim3);
                        System.out.println("Eliminado!");

                        break;
                    default:
                        throw new AssertionError();
                }

            }
            default ->
                throw new AssertionError();
        }
    }

    static void mostrar(int a) {

        switch (a) {
            case 1:
                for (Vehiculo vehiculo : vehiculos) {
                    if (vehiculo instanceof Automovil) {
                        System.out.println(vehiculos.indexOf(vehiculo) + " - " + vehiculo);
                    }
                }
                break;

            case 2:

                for (Vehiculo vehiculo : vehiculos) {
                    if (vehiculo instanceof Moto) {
                        System.out.println(vehiculos.indexOf(vehiculo) + " - " + vehiculo);
                    }
                }
                break;

            case 3:
                for (Vehiculo vehiculo : vehiculos) {
                    if (vehiculo instanceof Autobus) {
                        System.out.println(vehiculos.indexOf(vehiculo) + " - " + vehiculo);
                    }
                }
                break;
        }
        for (Vehiculo vehiculo : vehiculos) {

        }
    }

    static void modificar() throws ParseException {
        System.out.println("Ingrese los vehiculos que quiere modificar:\n\n1. Automoviles\n2. Motos\n3. Autobus\n4. Salir");
        int opcionElegida = sc.nextInt();

        switch (opcionElegida) {
            case 1 -> {

                mostrar(1);

                System.out.println("\nIngrese el vehiculo a modidificar: ");

                int opElim = sc.nextInt();

                System.out.println("Que elemento del automovil desea modificar?: 1. Tipo combustible\n2. Tipo de transmision \n3. Numero de puertas\n4. Numero de asientos\n5. Numero de placa\n6. Marca \n7. Modelo\n8. Tipo \n9. Color\n10. Año");

                int elemModif = sc.nextInt();

                switch (elemModif) {
                    case 1:
                        System.out.println("Ingrese el tipo de combustible: ");
                        String comb = sc.next();

                        ((Automovil) vehiculos.get(opElim)).setTipoCobustible(comb);
                        break;
                    case 2:
                        System.out.println("Ingrese el tipo de transmision: ");
                        String trans = sc.next();

                        ((Automovil) vehiculos.get(opElim)).setTipoTransmision(trans);
                        break;
                    case 3:
                        System.out.println("Ingrese el numero de puertas: ");
                        int numPuertas = sc.nextInt();

                        ((Automovil) vehiculos.get(opElim)).setNumPuertas(numPuertas);

                        break;
                    case 4:

                        System.out.println("Ingrese el numero de asientos: ");
                        int numAsientos = sc.nextInt();

                        ((Automovil) vehiculos.get(opElim)).setNumAsientos(numAsientos);
                        break;
                    case 5:

                        System.out.println("Ingrese el numero de placa: ");
                        String numPlaca = sc.next();

                        ((Automovil) vehiculos.get(opElim)).setNumPlaca(numPlaca);
                        break;
                    case 6:

                        System.out.println("Ingrese la marca: ");
                        String marca = sc.next();

                        ((Automovil) vehiculos.get(opElim)).setMarca(marca);

                        break;
                    case 7:

                        System.out.println("Ingrese el modelo: ");
                        String modelo = sc.next();

                        ((Automovil) vehiculos.get(opElim)).setModelo(modelo);
                        break;
                    case 8:

                        System.out.println("Ingrese el tipo de auto: ");
                        String tipo = sc.next();

                        ((Automovil) vehiculos.get(opElim)).setTipo(tipo);
                        break;
                    case 9:
                        Color color = JColorChooser.showDialog(null, "Ingrese color", Color.yellow);
                        ((Automovil) vehiculos.get(opElim)).setColor(color);
                        break;
                    case 10:

                        DateFormat df = new SimpleDateFormat("yyyy");
                        System.out.println("Ingrese el año: ");
                        String year = sc.next();
                        Date fecha = df.parse(year);
                        
                        ((Automovil) vehiculos.get(opElim)).setYear(fecha);
                        break;
                    default:
                        throw new AssertionError();
                }

                System.out.println("Seguro que desea eliminar el vehiculo?\n\n1. Si\n2. No");
                int answ = sc.nextInt();

                switch (answ) {
                    case 1:
                        vehiculos.remove(opElim);
                        System.out.println("Eliminado!");
                        break;
                    default:
                        throw new AssertionError();
                }

            }
            case 2 -> {
                mostrar(2);
                System.out.println("\nIngrese el vehiculo a modidificar: ");

                int opElim2 = sc.nextInt();

                System.out.println("Seguro que desea eliminar el vehiculo?\n\n1. Si\n2. No");
                int answ = sc.nextInt();

                switch (answ) {
                    case 1:
                        vehiculos.remove(opElim2);
                        System.out.println("Eliminado!");
                        break;
                    default:
                        throw new AssertionError();
                }

            }
            case 3 -> {

                mostrar(3);

                System.out.println("\nIngrese el vehiculo a modidificar: ");

                int opElim3 = sc.nextInt();

                System.out.println("Seguro que desea eliminar el vehiculo?\n\n1. Si\n2. No");
                int answ = sc.nextInt();

                switch (answ) {
                    case 1:
                        vehiculos.remove(opElim3);
                        System.out.println("Eliminado!");

                        break;
                    default:
                        throw new AssertionError();
                }

            }
            default ->
                throw new AssertionError();
        }
    }

}
