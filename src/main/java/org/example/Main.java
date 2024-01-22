package org.example;

public class Main {
    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.addHead(3);
        lista.addHead(2);
        lista.addHead(1);
        lista.addHead(0);
        lista.addTail(4);
        lista.addTail(5);
        lista.addTail(6);
        System.out.println(lista);
        System.out.println(lista.remove(5));


        System.out.println(lista);

    }
}
