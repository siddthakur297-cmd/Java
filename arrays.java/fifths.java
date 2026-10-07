import java.util.*;
public class fifths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int number []= new int [size];
        for(int i =0; i<size; i++){
            number[i]=sc.nextInt();
        }
        int search=sc.nextInt();
        for(int i = 0 ; i<size;i++){
            if(number[i]==search){
                System.out.println("The number is found"+i);
            }

        }
    }
}
