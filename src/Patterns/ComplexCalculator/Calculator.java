package Patterns.ComplexCalculator;

public class Calculator {

    public static Complex mult(Complex a, Complex b){

        a.real = a.real * b.real;
        a.image = a.image * b.image;
        return a;
    }
    public static Complex sum(Complex a, Complex b){

        a.real = a.real + b.real;
        a.image = a.image + b.image;
        return a;
    }
    public static Complex redu(Complex a, Complex b){

        a.real = a.real - b.real;
        a.image = a.image - b.image;
        return a;
    }
}
