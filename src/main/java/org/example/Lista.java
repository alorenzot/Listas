package org.example;

public class Lista {
    private int size;
    private Nodo head;
    private Nodo tail;



    private class Nodo{
        private int info;
        private Nodo next;
        public Nodo(int info){
            this.info=info;
            this.next=null;
        }
    }
}