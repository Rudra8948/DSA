//Find the largest using three number
import java.util.*;
public class Number17 {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.print("Given First Number = ");
        int i = sc.nextInt();

        System.out.print("Given Second Number = ");
        int j = sc.nextInt();

        System.out.print("Given Third Number = ");
        int k = sc.nextInt();

        if(i>j&&i>k){
            System.out.println("Largest Number :"+i);
        }
        else if(j>i&&j>k){
            System.out.println("Largest Number :"+j);
        }
        else{
            System.out.println("Largest Number:"+k);
        }
    }
    
}
