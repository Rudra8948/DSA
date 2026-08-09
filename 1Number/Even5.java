//Count even numbers between two numbers.
import java.util.*;
public class Even5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Given First number = ");
        int n = sc.nextInt();

        System.out.print("Given Second number = ");
        int m = sc.nextInt();
        int count=0;
        for(int i=n;i<=m;i++){
            if(i%2==0){
                count++;
            }
        }
         System.out.println("Count Number =" + count);
    }
}