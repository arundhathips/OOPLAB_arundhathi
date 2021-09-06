import java.util.*;
abstract class Shape{
    public int l,b;
    abstract void printArea();
}
class Rectangle extends Shape{
    Scanner sc = new Scanner(System.in);
    void printArea(){
        System.out.println("Enter length:");
        super.l = sc.nextInt();
        System.out.println("Enter breath:");
        super.b = sc.nextInt();
        System.out.println("Area of rectangle:"+(l*b));
    }
}
class Triangle extends Shape{
    Scanner sc = new Scanner(System.in);
    void printArea(){
        System.out.println("Enter height:");
        super.l = sc.nextInt();
        System.out.println("Enter breath:");
        super.b = sc.nextInt();
        System.out.println("Area of triangle:"+(0.5f*l*b));
    }
}
class Circle extends Shape{
    Scanner sc = new Scanner(System.in);
    void printArea(){
        System.out.println("Enter radius:");
        super.l = sc.nextInt();
        System.out.println("Area of Circle:"+((3.14f)*l*l));
    }
}
public class ShapeArea {
    public static void main(String ...a){
        Shape s = new Rectangle();
        Shape s1 = new Triangle();
        Shape s2 = new Circle();
        s.printArea();
        s1.printArea();
        s2.printArea();
    }
}
