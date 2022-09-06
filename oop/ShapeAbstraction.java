abstract class Shape{
    String color;
    //abstract methods
    abstract double area();
    public abstract String toString();
    //constructor
    public Shape(String color){
        System.out.println("Constructor of the shape class called...");
        this.color = color;
    }
    //concrete method
    public String getColor(){
        return color;
    }
}

class Circle extends Shape{
    double radius;
    public Circle(String color, double radius){
        super(color);
        System.out.println("Constructor of Circle class called...");
        this.radius = radius;
    }
    @Override
    double area(){
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Color of circle is "+super.color+" and area is "+area();
    }
}

class Rectangle extends Shape{
    double length, breadth;
    public Rectangle(String color, double length, double breadth){
        super(color);
        System.out.println("Constructor of Rectangle class called");
        this.length = length;
        this.breadth = breadth;
    }
    @Override
    double area(){
        return length*breadth;
    }

    public String toString(){
        return "Color of rectangle is "+super.color+" and area is "+area();
    }
}

public class ShapeAbstraction {
    public static void main(String[] args) {
        Shape c = new Circle("Red", 22.4);
        Shape r = new Rectangle("Blue", 12.3, 54.3);
        System.out.println(c);
        System.out.println(r);
        System.out.println(c.getColor()+" "+r.getColor());
        System.out.println(c.area()+" "+r.area());
    }
}
