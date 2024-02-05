import java.util.Scanner;
public class exercise250_1 {
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter 10 integers to fill the array : ");
    int[] myList = new int[10];
    for(int i = 0; i < myList.length; i++){
        myList[i] = scan.nextInt();
    }
    System.out.println("min = " + indexOfSmallestElement(myList));
}
    public static int indexOfSmallestElement(int[] A){
        int min = A[0];
        for(int i = 0; i < A.length; i++){
            if(A[i] < min){
                min = A[i];
            }
        }
        return min;
    }

}