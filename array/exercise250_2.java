package array;
import java.util.Scanner;
public class exercise250_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 5 number for list 1 : ");
        int[] list1 = new int[5];
        for(int i = 0; i < list1.length; i++){
            list1[i] = scan.nextInt();
        }
        System.out.print("Enter 5 numbers for list 2 : ");
        int[] list2 = new int[5];
        for(int i = 0; i < list1.length; i++){
            list2[i] = scan.nextInt();
        }
        System.out.println(equals(list1, list1));
    }
    public static boolean equals(int[] list1, int[] list2){
        boolean result;
        for(int i = 0; i < list1.length && i < list2.length; i++){
            if(list1[i] == list2[i]){
                result = true;
            }
            result = false;
        }
        return result;
    }
}
