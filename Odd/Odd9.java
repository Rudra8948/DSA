//find the sum of 1 to  n 
import java.util.*;
public class Odd9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Given NUmber = ");
        int n = sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2==1){
                sum=sum+i;
                System.out.println(i);
            }
        }
        System.out.println("sum of odd number =" + sum);
    }
}
