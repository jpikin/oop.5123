package ComplexCalculator;

import java.util.Scanner;

public class Complex {
    Scanner sc = new Scanner(System.in);
    double real;
    double image;

    public Complex() {
        this.real = 0;
        this.image = 0;

    }

    private double RealComplexFromString(String tempStringNum){
        tempStringNum = tempStringNum.substring(0, tempStringNum.indexOf('+'));
        return Double.parseDouble(tempStringNum);
    }
    private double ImageComplexFromString(String tempStringNum){
        tempStringNum = tempStringNum.substring(tempStringNum.indexOf('+')+1, tempStringNum.length()-1);
        return Double.parseDouble(tempStringNum);
    }
    public Complex setComplex(){
        String stringNum = sc.nextLine();
        this.real = RealComplexFromString(stringNum);
        this.image = ImageComplexFromString(stringNum);
        return this;
    }
}
