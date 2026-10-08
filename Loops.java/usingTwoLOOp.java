import java.util.*;
public class usingTwoLOOp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Enter the number :");
            int i = sc.nextInt();
            if(i%10==0){
                break;
            }
            System.out.println(i);
        }while(true);
        System.out.println("End");
    }
}
