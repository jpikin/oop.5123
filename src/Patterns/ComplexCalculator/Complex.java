package Patterns.ComplexCalculator;

import java.util.Scanner;

public class Complex {
    Scanner sc = new Scanner(System.in);
    double real;
    double image;
    public Complex() {
        double real = sc.nextDouble();
        double image = sc.nextDouble();
        sc.close();
        Complex(real,image);
    }
    private void Complex(double real, double image){
        this.real = real;
        this.image = image;
    }

}
