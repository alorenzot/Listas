package org.example;

public class ListaDE {
    private int size;
    private Nodo head;
    private Nodo tail;

    public void addHead(int num){

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

        @Override
        public String toString() {
            return info+" ";
        }
    }

}
