import java.util.Scanner;;
public class exercise250_2_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of list1 then fill it : ");
        int size1 = scan.nextInt();
        int[] list1 = new int[size1];
        for(int i = 0; i < list1.length; i++)
            list1[i] = scan.nextInt();
    //list2
        System.out.println("Enter the size of list 2, then fill it : ");
        int size2 = scan.nextInt();
        int[] list2 = new int[size2];
        for(int i = 0; i < list2.length; i++){
            list2[i] = scan.nextInt();
        }
        if(equals(list1, list2)){
            System.out.println("Identical");
        }else{
            System.out.println("Not identical");
        }
    }
    public static boolean equals(int[] list1, int[] list2){
        if(list1 .length!= list2.length){
            return false;
        }
        for(int i = 0; i < list1.length; i++){
            if(list1[i] != list2[i]){
                return false;
            }
        }
        return true;
    }
}
