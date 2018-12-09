public class Cylinder extends Circle{
    private int height;


    public Cylinder(String name, String color, double radius, int height) {
        super(name, color, radius);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }


    public int calcVolume() {
        return (int) (super.calcSquare() * height);
    }
}
