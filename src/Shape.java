public class Shape {

    private String name;
    private String color;
    private int width = 2;
    private int height = 2;

    public Shape(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double calcSquare() {
        return width * height;
    }

}
