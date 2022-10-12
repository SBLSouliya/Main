package PizzaClient;

public class Pizza {
    private double _price;
    private IShape _shape;
    public Pizza(double p, IShape s) {
        _price = p;
        _shape = s;
    }
    public double getPrice() {
        return _price;
    }
    public IShape getShape() {
        return _shape;

    }

    @Override
    public String toString() {
        return "Pizza{" +
                "_price=" + _price +
                ", _shape=" + _shape +
                '}';
    }
}