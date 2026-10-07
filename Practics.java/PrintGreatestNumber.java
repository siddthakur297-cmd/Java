import java.util.*;
public class thirdn {
    public static int printgreatest(int a , int b ){
        if(a>b){
            System.out.println("A is greatest");
            return a;
        }
        else{
            System.out.println("B is greatest");
            return b;

        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        printgreatest(a, b);
        
    }
}
