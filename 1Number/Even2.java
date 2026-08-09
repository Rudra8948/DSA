//print even number from 1 to 100

/*public class Even2{
    public static void main(String[] args) {
        int i=1;
        for(i=1;i<=100;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
        
        
    }
} */

//print even number from 1 to n
import java.util.*;
public class Even2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }

    }
}