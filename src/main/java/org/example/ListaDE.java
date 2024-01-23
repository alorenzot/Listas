package org.example;

public class ListaDE {
    private int size;
    private Nodo head;
    private Nodo tail;

    public void addHead(int num){
        Nodo nodo = new Nodo(num);
        if (size == 0) {
            tail = nodo;
        } else {
            nodo.setNext(head);
            nodo.setPrev(null);
            head.setPrev(nodo);
        }
        head = nodo;
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


    private class Nodo{
        private int info;
        private Nodo next;
        private Nodo prev;

        public Nodo(int info) {
            this.info = info;
            next=null;
            prev=null;
        }

        public int getInfo() {
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
