//Find the sum of positive numbers.
import java.util.*;
public class number14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Given Number =");
        int n =sc.nextInt();
        System.out.print("Second Number =");
        int m =sc.nextInt();
        int positivesum=0;
        for(int i=n;i<=m;i++){
            if(i>0){
                System.out.println(i);
                positivesum=positivesum+i;
            }
            else{
                System.out.println(i);
            }
        }
        System.out.println("Positive Sum = "+ positivesum);
        
    }
    
}
