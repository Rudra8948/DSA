//Check whether a number is positive, negative, or zero.
import java.util.*;
public class number12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Given Number = ");
        int number = sc.nextInt();
        if(number>0){
            System.out.println("Positive Number");
        }
        else if(number<0){
            System.out.println("Negative Number");
        }
        else{
            System.out.println("Number is zero");
        }
      
    }
    
}
