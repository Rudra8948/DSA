//chek weather n number is positive and negative
import java.util.*;
public class number11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Give  Number = ");
        int number = sc.nextInt();
        if(number>0){
            System.out.println("Positive number");
        }
        else{
            System.out.println("Negative Number");
        }
    }
    
}
