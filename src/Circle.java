public class Circle extends Shape{
    private double radius;

    public Circle(String name, String color, double radius) {
        super(name, color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    protected double diameter() {
      return  radius * 2;
    }

    @Override
    public double calcSquare() {
        return Math.pow(radius, 2) * Math.PI;
    }
}
