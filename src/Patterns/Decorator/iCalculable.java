package Patterns.Decorator;

public interface iCalculable {
    iCalculable sum(int arg);
    iCalculable multi(int arg);
    int getResult();
}
