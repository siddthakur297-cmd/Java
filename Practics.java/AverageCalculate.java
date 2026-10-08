import java.util.*;
public class AverageCalculate {
    public static float averageofthree (int a , int b , int c){
        float average= (a+b+c)/3;
        return average;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(averageofthree(a, b, c));
        
    }
}
