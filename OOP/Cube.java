package OOP;

public class Cube {
    double length, width, height;

    Cube(double l, double w, double h){
        length =l;
        width = w;
        height= h;
    }

    public double getLength(){
        return length;
    }
    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }

    public void setLength(double l){
        length = l;
    }
    public void setWidth(double w){
        width = w;
    }
    public void setHeight(double h){
        height = h;
    }

    public double Litter(){
        return length * width * height / 1000;
    }

    public String cubeInfo(){
        return "Length = : " + length + ", Width = " + width + ", Height = " + height + 
        ". Litter = " + Litter();
    }
}
