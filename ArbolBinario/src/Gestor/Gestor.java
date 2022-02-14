package Gestor;

import Datos.Arbol;

public class Gestor {

    private Arbol arbol;

    public Gestor() {
       arbol = new Arbol();
    }

    public void insertar(int dato) {
        arbol.insertar(dato);
    }

    public String preorden() {
        arbol.preorden();
        return arbol.imprimirArbol();
    }

    public String inorden() {
        arbol.inorden();
        return arbol.imprimirArbol();
    }

    public String postorden() {
        arbol.postorden();
        return arbol.imprimirArbol();
    }
}
