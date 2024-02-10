package OOP;

public class Circle {
    private double radius;
    private static int numOfObjects = 0;

    public Circle(double newR){
        radius = newR;
        numOfObjects++;
    }

    public double getRadius(){
        return radius;
    }

    public int getNumberOfObjects(){
        return numOfObjects;
    }

    public void setRadius(double newRadius){
        radius = newRadius;
    }

    public void print(){
        System.out.println("The radius is : " + radius);
        System.out.println("the number of objects is : " + numOfObjects);
    }
}
