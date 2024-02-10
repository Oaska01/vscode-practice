package OOP;

public class test {
    public static void main(String[] args) {
        /*Circle c1 = new Circle(5);
        c1.print();
        Circle c2 = new Circle(2);
        c2.print();

        System.out.println(c1.toString());
        System.out.println(c2.toString());*/

        Cube[] c1 = new Cube[4];

        c1[1] = new Cube(3, 4, 1);
        c1[2] = new Cube(7, 5, 3);
        c1[3] = new Cube(3, 3, 3);
        c1[4] = new Cube(4, 5, 6);

        for(int i = 0; i < c1.length; i++){
            double total = 0;
            System.out.print("Volume cube " + (i+1) + " is : " + c1[i].Litter());

        }
    }
}
