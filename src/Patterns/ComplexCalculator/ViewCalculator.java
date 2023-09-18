package Patterns.ComplexCalculator;

import java.util.Scanner;

public class ViewCalculator {

    private Complex primary;
    private Complex secondary;
    public void run(){
        while (true){

            System.out.println("Введите первое комплексное число: ");
            primary = new Complex();

            while (true) {
                String cmd = prompt("Введите команду (*, +, -, =) : ");
                if(cmd.equals("*")){
                    System.out.println("Введите второе комплексное число: ");
                    secondary = new Complex();
                    primary = Calculator.mult(primary,secondary);
                    continue;
                }
                if(cmd.equals("-")){
                    System.out.println("Введите второе комплексное число: ");
                    secondary = new Complex();
                    primary = Calculator.redu(primary,secondary);
                    continue;
                }
                if(cmd.equals("+")){
                    System.out.println("Введите второе комплексное число: ");
                    secondary = new Complex();
                    primary = Calculator.sum(primary,secondary);
                    continue;
                }
                if(cmd.equals("=")){
                    System.out.println("Результат: "+(int)primary.real+"+"+(int)primary.image+"i");
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

    }



