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
}
