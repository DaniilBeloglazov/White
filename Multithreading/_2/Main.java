package Multithreading._2;

public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM(1000);
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                atm.giveMoney("Andrew", 300);
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                atm.giveMoney("Dante", 500);
            }
        });
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                atm.giveMoney("Alex", 200);
            }
        });
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
