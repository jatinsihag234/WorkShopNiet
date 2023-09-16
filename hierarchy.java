class Shape {
    public void printArea() {
        System.out.println("Area of the shape is undefined.");
    }
}
class Circle extends Shape {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public void printArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of the Circle: " + area);
    }
}
class Square extends Shape {
    private double side;
    public Square(double side) {
        this.side = side;
    }
    @Override
    public void printArea() {
        double area = side * side;
        System.out.println("Area of the Square: " + area);
    }
}
public class hierarchy {
    public static void main(String[] args) {
        double input1 = 5.0;
        double input2 = 10.0;
        Shape shape1 = new Shape();
        Circle circle = new Circle(input1);
        Square square = new Square(input2);
        System.out.println("Using static binding:");
        shape1.printArea();
        circle.printArea();
        square.printArea();
    }
}

