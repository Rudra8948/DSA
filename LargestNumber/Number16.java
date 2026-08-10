//Find the largest of two numbers.
import java.util.*;
public class Number16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Given First Number ");
        int n=sc.nextInt();

        System.out.print("Given Second Number ");
        int m = sc.nextInt();

        if(n>m){
            System.out.println("Largets NUmber "+n);
        }
        else{
            System.out.println("Largest number "+m);
        }

    }
    
}
