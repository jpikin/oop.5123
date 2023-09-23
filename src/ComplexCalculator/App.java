package ComplexCalculator;

public class App {
    public static void main(String[] args) {
        iCalculable decorator = new Decorator(new Calculator(), new Logger());
        ViewCalculator view = new ViewCalculator(decorator);
        Calculator calculator = new Calculator();


        view.run();
    }
}
