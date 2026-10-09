import java.util.*;
public class Everycharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        for(int i = 0 ; i<name.length(); i++){
            System.out.println(name.charAt(i));
        }
    }
}
