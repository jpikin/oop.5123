package Solid.Figures2;

public class Rectangle implements GetArea{
    private int width;
    private int height;
    public int findArea(){
        return this.width * this.height;
    }
}
