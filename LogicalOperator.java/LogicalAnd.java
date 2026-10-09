import java.util.*;
public class LogicalAnd {
     public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int a = sc.nextInt();
            int b  = sc.nextInt();
            int c = sc.nextInt();
            System.out.println(a<b && a<c);

        }
     }
}
