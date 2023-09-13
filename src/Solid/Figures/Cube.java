package Solid.Figures;

public class Cube implements ShapeArea, ShapeVoluve {
    private int edge;
    public Cube(int edge) {
        this.edge = edge;
    }
    @Override
    public double area() {
        return 6 * edge * edge;
    }
    @Override
    public double volume() {
        return edge * edge * edge;
    }
}
