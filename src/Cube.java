public class Cube extends Rectangle{
    private int height;


    public Cube(String name, String color, int width, int length, int height) {
        super(name, color, width, length);
        this.height = height;
    }


    public int calcVolume() {
       return (int) (height * super.calcSquare());
    }
}
