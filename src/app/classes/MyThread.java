package app.classes;

import app.interfaces.Runnable;

import java.util.Random;

import static java.lang.Thread.sleep;

public class MyThread extends Thread implements Runnable {
    Random n = new Random();

    public void run() {
        while (true) {
            System.out.println("Thread1 "+n.nextInt(255));
            try {
                sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
