package org.example;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Data d = new Data();
        Worker worker1 = new Worker(1, d);
        Worker worker2 = new Worker(2, d);
        Worker worker3 = new Worker(3, d);

        worker3.join();
    }
}