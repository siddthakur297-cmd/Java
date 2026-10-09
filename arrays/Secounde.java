import java.util.*;
public class Secounde {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=  sc.nextInt();
        int input [ ] = new int [size];
        for(int i = 0 ; i < size; i++){
            input[i]= sc.nextInt();
        }
        int x = sc.nextInt();


        for(int i = 0; i <input.length; i++){
            if(input[i]==x){
                System.out.println(i);
            }

        }
    }
}
