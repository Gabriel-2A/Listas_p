package com.example.listas_p.Lista_enlzada;

public class NodoLista {

    int dato;
    NodoLista enlace;

    public NodoLista(int x) {
        dato = x;
        enlace = null;
    }

    public NodoLista(int x, NodoLista n){
        dato = x;
        enlace = n;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public NodoLista getEnlace() {
        return enlace;
    }

    public void setEnlace(NodoLista enlace) {
        this.enlace = enlace;
    }

    @Override
    public String toString(){
        return String.valueOf(dato);
    }
}
