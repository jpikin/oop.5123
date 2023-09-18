package Patterns.ComplexCalculator;

import java.util.Scanner;

public class Complex {
    Scanner sc = new Scanner(System.in);
    double real;
    double image;

    public Complex() {
        String stringNum = sc.nextLine();
//        stringNum = stringNum.substring(0,stringNum.length()-2);
        double real = RealComplexFromString(stringNum);
        double image = ImageComplexFromString(stringNum);
        Complex(real,image);
    }
    private void Complex(double real, double image){
        this.real = real;
        this.image = image;
    }
    private double RealComplexFromString(String tempStringNum){
        tempStringNum = tempStringNum.substring(0, tempStringNum.indexOf('+'));
        return Double.parseDouble(tempStringNum);
    }
    private double ImageComplexFromString(String tempStringNum){
        tempStringNum = tempStringNum.substring(tempStringNum.indexOf('+')+1, tempStringNum.length()-1);
        return Double.parseDouble(tempStringNum);
    }
}
