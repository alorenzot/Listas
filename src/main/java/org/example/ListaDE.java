package org.example;

public class ListaDE<E> {
    private int size;
    private Nodo head;
    private Nodo tail;

    public void addHead(E num){
        Nodo<E> nodo = new Nodo<E>(num);
        if (size == 0 || head==null) {
            tail = nodo;
        } else {
            nodo.next=head;
            head.prev=nodo;
        }
        head = nodo;
        size++;
    }
    public void addTail(E num){
        Nodo<E> nodo = new Nodo<E>(num);
        if (size == 0) {
            head = nodo;
        } else {
            nodo.prev=tail;
            tail.next=nodo;
        }
        tail = nodo;
        size++;
    }


    @Override
    public String toString() {
        Nodo n = head;
        String aux = "Size: " + size + "\nValues: ";

        while (n != null) {
            aux += n.info + " ";
            n = n.next;
        }
        aux+="\nValues: ";

        n=tail;
        while (n != null) {
            aux += n.info + " ";
            n = n.prev;
        }

        return aux;
    }


    private class Nodo<E>{
        private E info;
        private Nodo next;
        private Nodo prev;

        public Nodo(E info) {
            this.info = info;
            next=null;
            prev=null;
        }

        public E getInfo() {
            return info;
        }

        public Nodo getNext() {
            return next;
        }

        public void setNext(Nodo next) {
            this.next = next;
        }

        public Nodo getPrev() {
            return prev;
        }

        public void setPrev(Nodo prev) {
            this.prev = prev;
        }

        @Override
        public String toString() {
            return info+" ";
        }
    }

}
