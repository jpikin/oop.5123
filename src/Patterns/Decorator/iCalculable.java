package Patterns.Decorator;

public interface iCalculable {
    iCalculable sum(int arg);
    iCalculable multi(int arg);
    iCalculable div(int arg);
    int getResult();
}
