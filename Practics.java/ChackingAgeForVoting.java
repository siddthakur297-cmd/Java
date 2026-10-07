import java.util.*;
public class anothern {
    public static int votingage(int age){
        if(age>=18){
            System.out.println("The persion has legal age for vote");
            return age;
        }
        else{
            System.out.println("The person has not attain the legal age for vote");
            return age;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        votingage(age);
        
    }
}
