//count odd number b/w two number
import java.util.*;
public class odd10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Given first Number = ");
        int n= sc.nextInt();
        
        System.out.print("Given Second Number = ");
        int m = sc.nextInt();
        int count=0;
        for(int i =n; i<=m;i++){
            if(i%2==1){
                count++;
            }
            System.out.println(i);
        }
        System.out.println("Count number = "+count);

    }
    
}
