package app.classes;

import app.interfaces.ICar;

import java.util.Calendar;
import java.util.Scanner;
import java.util.TimeZone;

public class JdmCar implements ICar {

    public String getName(){
        System.out.println("Subaru Impreza WRX STi");
        return null;
    }

    public void getColour(){
        System.out.println("What foil wrap would you like on it?");
        Scanner in = new Scanner(System.in);
        String wrap = in.nextLine();
        System.out.println("The car has now " + wrap + " wrap on it.");
    }

    public int carAge(){
        int year = 2004;
        System.out.println("The fabrication year is: " + year);
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("Europe/Bucharest"));
        int age = cal.get(Calendar.YEAR) - year;
        System.out.println("The car has " + age + " old");
        return 1;
    }
}
