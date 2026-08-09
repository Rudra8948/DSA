//chek weather number is odd
import java.util.*;
public class odd6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Given number = ");
        int n= sc.nextInt();
        if(n%2==1){
            System.out.println("odd number");
        }else{
            System.out.println("This number is not odd");
        }
    }
}
