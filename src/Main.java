import app.classes.JdmCar;
import app.classes.MuscleCar;
import app.classes.MyThread;
import app.classes.Thread;
import app.interfaces.ICar;

import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        ICar car1 = new JdmCar();
//        ICar car2 = new MuscleCar();
//        String car = "jdm";
//
//        System.out.println("Choose your car");
//        System.out.println("Jdm or muscle car?");
//        Scanner in = new Scanner(System.in);
//        car = in.nextLine();
//
////        JOptionPane.showMessageDialog(null, "Hello message", "Title", JOptionPane.INFORMATION_MESSAGE);
////        int result = JOptionPane.showConfirmDialog(null, "What car do you choose ", "Choose your car", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
//
//
//        if(car.equals("jdm")) {
//            car1.getName();
//            car1.getColour();
//            car1.carAge();
//            System.out.println("\n");
//
//        }
//        else {
//            car2.getName();
//            car2.getColour();
//            car2.carAge();
//        }

        MyThread mth = new MyThread();
        Thread th = new Thread();
        while(true){
            mth.run();
            ;
        }




    }
}
