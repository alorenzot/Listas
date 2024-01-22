package org.example;

public class Lista {
    private int size;
    private Nodo head;
    private Nodo tail;

    public Lista() {
        size = 0;
        head = null;
        tail = null;
    }
    public Lista(int[] nums){
        this();
        addAll(nums);
    }

    public Integer removeHead() {
        if (head != null) {
            int num = head.info;
            head = head.getNext();
            size--;
            return num;
        }
        if (head == null) tail = null;
        return null;
    }

    public Integer removeTail() {
        if (tail == null) return null;
        if (size == 1 || head == tail) return removeHead();

        Nodo j = head, i = head.next;
        while (i != tail || i.next != null) {
            j = i;
            i = i.next;
        }
        j.next = null;
        tail = j;
        size--;
        return i.info;
    }

    public void addHead(int num) {
        Nodo nodo = new Nodo(num);
        if (size == 0) {
            tail = nodo;
        } else {
            nodo.setNext(head);
        }
        head = nodo;
        size++;
    }

    public void addTail(int num) {
        Nodo nodo = new Nodo(num);
        if (size == 0) {
            head = nodo;
        } else {
            tail.setNext(nodo);
        }
        tail = nodo;
        size++;
    }

    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    public int[] getAsArray() {
        int[] array = new int[size];
        Nodo aux = head;
        int i = 0;
        while (aux != null) {
            array[i] = aux.info;
            aux = aux.next;
            i++;
        }
        return array;
    }
    public void addAll(int[] nums){
        for (int num:nums) addTail(num);
    }

    public boolean contains(int num) {
        if (size == 0) return false;
        if (head.getInfo() == num || tail.getInfo() == num) return true;
        Nodo aux = head;
        boolean encontrado = false;
        while (aux != null && !encontrado) {
            if (aux.info == num) encontrado = true;
            aux = aux.next;
        }
        return encontrado;
    }

    public Integer get(int index) {
        if (index<0 || index>=size) return null;

        Nodo j = head;
        int i=0;
        while (i<index) {
            j=j.next;
            i++;
        }
        return j.info;
    }

    public Integer remove(int index) {
        if (index<0 || index>=size) return null;
        if (index==0) return removeHead();
        if (index==size-1) return removeTail();

        Nodo aux = head;
        Nodo eliminado = head.next;
        int i = 0;
        while(i++<index-1){
            aux=aux.next;
            if (i==index-1){
                eliminado=aux.next;
                aux.setNext(eliminado.next);

            }
        }
        size--;
        return eliminado.info;


    }


    @Override
    public String toString() {
        Nodo n = head;
        String aux = "Size: " + size + "\n" +
                "Values: ";
        while (n != null) {
            aux += n.getInfo() + " ";
            n = n.getNext();

        }
        return aux;
    }

    private class Nodo {
        private int info;
        private Nodo next;

        public Nodo(int info) {
            this.info = info;
            this.next = null;
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