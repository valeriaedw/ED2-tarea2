package UI;

import Gestor.Gestor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class UI {

    static BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream imprimir = System.out;

    private Gestor gestor = new Gestor();

    public UI () throws java.io.IOException {

        System.out.println("Bienvenido a la tarea 2 del curso estructuras de datos 2");

        menu();
    }

    public void menu() throws IOException {

        int opcion = 0;

        do {

            imprimir.println("Menu");
            imprimir.println("1. Insertar");
            imprimir.println("2. Preorden");
            imprimir.println("3. Inonrden");
            imprimir.println("4. PostOrden");
            imprimir.println("6. Salir");

            opcion = Integer.parseInt(leer.readLine());
            procesarOpcion(opcion);

        } while (opcion != 0);

    }

    public void procesarOpcion(int opcion) throws IOException {

        switch (opcion) {
            case 1:
                insertarDato();
                break;
            case 2:
                muestraPreorden();
                break;
            case 3:
                muestraInorden();
                break;
            case 4:
                muestraPostorden();
                break;
            case 6:
                System.out.println("Hasta luego!");
                System.exit(0);
            default:
                System.out.println("Opción Inválida");

        }

    }

    public void insertarDato() throws IOException {

        gestor.insertar(13);
        gestor.insertar(5);
        gestor.insertar(1);
        gestor.insertar(11);
        gestor.insertar(25);
        gestor.insertar(17);
        gestor.insertar(21);
    }

    public void muestraPreorden() throws IOException {

        imprimir.println("El resultado es: "+ gestor.preorden());
    }

    public void muestraInorden() throws IOException {

        imprimir.println("El resultado es: " + gestor.inorden());
    }

    public void muestraPostorden() throws IOException {

        imprimir.println("El resultado es: " + gestor.postorden());
    }
}
