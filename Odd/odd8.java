//print odd number b/w two number
import java.util.*;
public class odd8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Given first number = ");
        int n =sc.nextInt();

        System.out.print("Given second number = ");
        int m =sc.nextInt();

        for(int i=n;i<=m;i++){
            if(i%2==1){
                System.out.println(i);
            }
        }
    }
    
}
