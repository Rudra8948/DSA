//Find the sum of negative numbers.
import java.util.*;
public class number15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Given  First Number =");
        int n = sc.nextInt();
        System.out.print("Given Negative  Number =");
        int m = sc.nextInt();
        int numbernegative=0;
        for(int i=n;i<=m;i++){
            if(i>0){
                System.out.println(i);
            }
            else{
                System.out.println(i);
                numbernegative=numbernegative+i;

            }
        }
        System.out.println("Sum of Negative number =" +numbernegative);
    }
}
