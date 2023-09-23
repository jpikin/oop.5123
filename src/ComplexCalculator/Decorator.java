package ComplexCalculator;


public class Decorator implements iCalculable {
    private Calculator oldCalculator;
    private Logger logger;



    public Decorator(Calculator oldCalculator, Logger logger) {
        this.oldCalculator = oldCalculator;
        this.logger = logger;
    }

    @Override
    public Complex sum(Complex b) {
        Complex firstArg = oldCalculator.getResult();
        String str = toString(firstArg);
        String str2 = toString(b);
        logger.log("Первое значение калькулятора "+str+" Начало вызова метода sum с параметром "+str2);
        Complex result = oldCalculator.sum(b);
        logger.log(String.format("Вызова метода sum произошел"));

        return result;
    }

    @Override
    public Complex mult(Complex b) {
        Complex firstArg = oldCalculator.getResult();
        String str = toString(firstArg);
        String str2 = toString(b);
        logger.log("Первое значение калькулятора "+str+" Начало вызова метода mult с параметром "+str2);
        Complex result = oldCalculator.mult(b);
        logger.log(String.format("Вызова метода mult произошел"));
        return result;
    }
    @Override
    public Complex div(Complex b) {
        Complex firstArg = oldCalculator.getResult();
        String str = toString(firstArg);
        String str2 = toString(b);
        logger.log("Первое значение калькулятора "+str+" Начало вызова метода div с параметром "+str2);
        Complex result = oldCalculator.div(b);
        logger.log(String.format("Вызова метода div произошел"));
        return result;
    }
    @Override
    public Complex redu(Complex b) {
        Complex firstArg = oldCalculator.getResult();
        String str = toString(firstArg);
        String str2 = toString(b);
        logger.log("Первое значение калькулятора "+str+" Начало вызова метода redu с параметром "+str2);
        Complex result = oldCalculator.redu(b);
        logger.log(String.format("Вызова метода redu произошел"));
        return result;
    }

    @Override
    public Complex getResult() {
        Complex result = oldCalculator.getResult();
        logger.log("Получение результата");
        return result;
    }
    private String toString(Complex a){
        return (int)a.real +"+"+(int)a.image + "i";
    }
}

