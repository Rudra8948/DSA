//print even number between two number
/*public class Even3 {
    public static void main(String[] args) {
       int i=40;
       int j=60;
       for(i=40; i<=j; i++){
        if(i%2==0){
            System.out.println(i);
        }
       }
    }
}
*/
import java.util.*;
public class Even3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First NUmber =");
        int i= sc.nextInt();
        
        System.out.print("Enter Last Number =");
        int j=  sc.nextInt();

        for(i=i;i<=j;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}