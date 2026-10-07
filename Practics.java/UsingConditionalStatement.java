import java.util.*;
public class fifthn {
    public static boolean votingage(int age){
        if(age>=18){
            System.out.println("true");
            return true;
        }
        else{
            System.out.println("false");
        }
        return false ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        votingage(n);
    }
}
