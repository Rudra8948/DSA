//Find the sum of even numbers from 1 to N.
import java.util.*;
public class Even4 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter Number = ");
       int n= sc.nextInt();
       int sum=0;
       for(int i=1;i<=n;i++){
        if(i%2==0){
           sum =sum+i;
        }
       }
       System.out.println("sum of evenn number =4" + sum);
    }
}
