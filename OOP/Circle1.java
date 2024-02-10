package OOP;

public class Circle1 {
    double radius;
    public Circle1(){
        radius =1;
    }
    public Circle1(double newRadius){
        radius = newRadius;
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }
    public double getPerimetre(){
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Circle1 circle1 = new Circle1();
        System.out.println("The area of circle 1 is : "+circle1.getArea());
        Circle1 circle2 = new Circle1(25) ; 
        System.out.println("The area of circle 2 is : " + circle2.getArea());  
        System.out.println("The perimeter of circle 2 is : " + circle2.getPerimetre());
    }
}
