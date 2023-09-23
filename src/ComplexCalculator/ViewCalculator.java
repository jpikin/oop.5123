package ComplexCalculator;

import java.util.Scanner;

public class ViewCalculator {
    private iCalculable calculator;
    private Complex primary;
    private Complex secondary;
    public ViewCalculator(iCalculable calculator){
        this.calculator = calculator;
    }

    public void run(){
        while (true){
            System.out.println("Комплексные числа вводятся в формате A+Bi, где A и B - числа");
            System.out.println("например: 5+5i");
            System.out.println("---------------------------------");
            System.out.println("Введите первое комплексное число: ");

            primary = calculator.sum(new Complex().setComplex());

            while (true) {
                String cmd = prompt("Введите команду (*, +, -, /, =) : ");
                if(cmd.equals("*")){
                    System.out.println("Введите второе комплексное число: ");
                    secondary = new Complex().setComplex();
                    primary = calculator.mult(secondary);
                    continue;
                }
                if(cmd.equals("-")){
                    System.out.println("Введите второе комплексное число: ");
                    secondary = new Complex().setComplex();
                    primary = calculator.redu(secondary);
                    continue;
                }
                if(cmd.equals("+")){
                    System.out.println("Введите второе комплексное число: ");
                    secondary = new Complex().setComplex();
                    calculator.sum(secondary);
                    continue;
                }
                if(cmd.equals("/")){
                    System.out.println("Введите второе комплексное число: ");
                    secondary = new Complex().setComplex();
                    boolean t = testDivByZero(secondary);
                    if(t) {
                        primary = calculator.div(secondary);
                        continue;
                    } else {
                        System.out.println("На ноль делить нельзя, введите команду заново: ");
                    }
                }
                if(cmd.equals("=")){
                    System.out.println("Результат: "+(int)calculator.getResult().real+"+"
                                       +(int)calculator.getResult().image+"i");
                    break;
                }
            }

            break;
        }
    }
    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
    private boolean testDivByZero(Complex a){
        if (a.real == 0 || a.image == 0){
            return false;
        }
        else return true;
    }
//public static Complex getPrimary(){
//        return primary;
//}
//    public double getPrimaryImage(){
//        return primary.image;
//    }
    }



