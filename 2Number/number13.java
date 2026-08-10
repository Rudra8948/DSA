//Count positive and negative numbers from a given set.
import java.util.*;
public class number13{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Given First number = ");
        int n = sc.nextInt();

        System.out.print("Given Last  number = ");
        int m = sc.nextInt();

        int positive=0;
        int negative=0;

        for(int i=n;i<=m;i++){
            
            if(i>0){
                System.out.println(i);
                positive++;
            }
            else {
                System.out.println(i);
                negative++;
            }
        }
          System.out.println("Positive Count "+ positive);
          System.out.println("Negative Number"+ negative);
    }
    
}