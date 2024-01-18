package org.example;

public class Lista {
    private int size;
    private Nodo head;
    private Nodo tail;

    public Lista(){
        size=0;
        head=null;
        tail=null;
    }
    public void addHead(int num){
        Nodo nodo = new Nodo(num);
        if (size==0) {
            head = nodo;
            tail = nodo;
            size++;
        } else {
            nodo.setNext(head);
            head=nodo;
            size++;
        }
    }

    @Override
    public String toString() {
        Nodo n = head;
        String aux="Size: " + size + "\n" +
                "Values: ";
        while (n!=null){
            aux+=n.getInfo()+" ";
            n=n.getNext();

        }
        return aux;
    }

    private class Nodo{
        private int info;
        private Nodo next;
        public Nodo(int info){
            this.info=info;
            this.next=null;
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
    }
}