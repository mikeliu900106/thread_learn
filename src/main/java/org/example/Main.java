package org.example;

public class Main {
    public static void main(String[] args) {
    Thread t = new Thread(new dv());
        t.start();
//        t.interrupt();
        System.out.println("main Hello world!");
    }
}
class  dv implements Runnable{

    @Override
    public void run() {
        try {

        } catch (InterruptedException e) {
            System.out.println("Exiting block thread");
        }
        System.out.println("Hello world!");
    }
}