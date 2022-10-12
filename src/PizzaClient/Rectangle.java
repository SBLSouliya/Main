package PizzaClient;
class Rectangle implements IShape {
    private double _width;
    private double _height;
    public Rectangle(double w, double h) {
        _width = w;
        _height = h;
    }
    public double getArea() {
        return _width * _height;
    }

}
