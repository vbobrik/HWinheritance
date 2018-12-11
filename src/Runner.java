
public class Runner {
    public static void main(String[] args) {
        Circle red = new Circle("circle1", "red", 5);
        System.out.println("Площадь круга: " + red.calcSquare());

        System.out.println("-----------------");
        Cylinder cyl1 = new Cylinder("cyl1", "yellow", 3.9, 7);
        System.out.println("Объем цилиндра: " + cyl1.calcVolume());
        System.out.println(cyl1.calcSquare());

        System.out.println("-----------------");
        Shape rec1 = new Rectangle("rec1" , "white", 6, 4);
        System.out.println("Площадь прямоугольника: " + rec1.calcSquare());

        System.out.println("-----------------");
        Cube cube1 = new Cube("cube1", "blue", 7, 7, 7);
        System.out.println("Объем куба: " + cube1.calcVolume());
        System.out.println("Площадь куба: " + cube1.calcSquare());

        System.out.println("-----------------");
        //Shape shape = new Shape("Myshape" , "black");
        //System.out.println("Площадь любой формы: " + shape.calcSquare());


    }
}
