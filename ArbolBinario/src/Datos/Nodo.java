package Datos;

public class Nodo {

    //atributos
    private int dato;
    private Nodo izquierda;
    private Nodo derecha;

    //constructor
    public Nodo(){
        this.dato = dato;
        this.izquierda = this.derecha = null;
    }

    public Nodo(int dato){
        this.dato = dato;
        this.izquierda = this.derecha = null;
    }

    //Metodos Getters y Setters
    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }

    public Nodo getDerecha() {
        return derecha;
    }

    public void setDerecha(Nodo derecha) {
        this.derecha = derecha;
    }
}
