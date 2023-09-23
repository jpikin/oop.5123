package ComplexCalculator;

public class Calculator implements iCalculable {
    private Complex a = new Complex();
    private int m;

    public Calculator(){
        this.a = a;
                   }
    @Override
    public Complex  mult(Complex b){

        a.real = a.real * b.real;
        a.image = a.image * b.image;
        return a;
    }
    @Override
    public Complex sum(Complex b){

        a.real = a.real + b.real;
        a.image = a.image + b.image;
        return a;
    }
    @Override
    public Complex redu(Complex b){

        a.real = a.real - b.real;
        a.image = a.image - b.image;
        return a;
    }
    @Override
    public Complex div(Complex b){
        a.real = a.real / b.real;
        a.image = a.image / b.image;
        return a;
    }
    @Override
    public Complex getResult(){
        return a;
    }


}
