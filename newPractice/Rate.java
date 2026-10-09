import java.util.*;
public class Rate {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

    
    if(a>b&&a>c){
        System.out.println("a is greatest");
    }
    else if (b>a &&b>c){
        System.out.println("b is the greatest");

    }
    else if (c >a && c >b){
        System.out.println("c is greatest");
    }
}
