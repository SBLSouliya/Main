package PizzaClient;

public class Circle implements IShape {
    private double _radius;
    public Circle(double r) {
        _radius = r;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "_radius=" + _radius +
                '}';
    }

    public double getArea() {
        return Math.PI * _radius * _radius;
    }
}