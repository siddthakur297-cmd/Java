import java.util.*;
public class Skip {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        do{
            System.out.print("Enetr the number :");
            int i = sc.nextInt();
            if(i%10==0){
                    continue;
                }
            
            System.out.print(i);
        }while(true);
        
    
    }
}
