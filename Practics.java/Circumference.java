import java.util.*;
public class Circumference {
    public static double circumference(int r ){
        double area = 2 *3.14*r;
        System.out.println(area);
        return area;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        circumference(r);
    }
}
