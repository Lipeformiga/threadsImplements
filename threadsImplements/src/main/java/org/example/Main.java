package org.example;

public class Main {
    public static void main(String[] args) {

        Carro carro1 = new Carro("fiesta");
        Carro carro2 = new Carro("onix");

        Thread t1 = new Thread(carro1);
        Thread t2 = new Thread(carro2);

        t1.start();
        t2.start();

        carro1.acelerar();
        carro2.frear();
    }
}