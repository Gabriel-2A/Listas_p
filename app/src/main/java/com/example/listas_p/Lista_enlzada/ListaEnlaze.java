package com.example.listas_p.Lista_enlzada;

public class ListaEnlaze {

    private NodoLista primero;

    public ListaEnlaze(){
        primero = null;
    }

    public void crearLista(){
        primero = new NodoLista(9);
        primero = new NodoLista(8, primero);
        primero = new NodoLista(7, primero);
        primero = new NodoLista(6, primero);
        primero = new NodoLista(5, primero);
        primero = new NodoLista(4, primero);
        primero = new NodoLista(3, primero);
        primero = new NodoLista(2, primero);
        primero = new NodoLista(1, primero);
    }

    @Override
    public String toString() {

        String resultado = "";
        NodoLista aux = primero;
        while (aux != null){
            resultado += aux + " ->";
            aux = aux.getEnlace();
        }

        return resultado;
    }
}
