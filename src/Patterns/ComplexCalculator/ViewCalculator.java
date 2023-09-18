package Patterns.ComplexCalculator;

import java.util.Scanner;

public class ViewCalculator {

    private Complex primary;
    private Complex secondary;
    public void run(){
        while (true){

            System.out.println("Введите первое комплексное число: ");
            primary = new Complex();
            System.out.println("Введите второе комплексное число: ");
            secondary = new Complex();
            System.out.println(primary.real + " " + primary.image);
            System.out.println(secondary.real + " " + secondary.image);
            break;


        }

    }

    }



