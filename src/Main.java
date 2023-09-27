import sun.awt.geom.AreaOp;

public class Main {
public static void main (String []args){
    Circle circle = new Circle(6.00);
    Rectangle rectangle =new Rectangle(4.00,6.00);

    System.out.println("Circle Area:"+circle.calculateArea());
    System.out.println("Circle Perimeter:"+circle.calculatePerimeter());

    System.out.println(" Rectangle Area:"+circle.calculateArea());
    System.out.println("Rectangle Perimeter:"+circle.calculatePerimeter());

}
}