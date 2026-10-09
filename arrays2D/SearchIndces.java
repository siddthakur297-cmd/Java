import java.util.*;
public class SearchIndces {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int row = sc.nextInt();
        int colm = sc.nextInt();
        int number [][]= new int [row] [ colm];
        int x = 11;
        for(int i = 0 ; i<row; i++){
            for(int j = 0; j<colm; j++){
                number[i][j]= sc.nextInt();

            }
        } 
        for(int i = 0 ; i<row; i++){
            for(int j = 0; j<colm; j++){
                if(number[i][j] == x){
                    System.out.println(" Found at location(;
                }
                
            }
        }
    }
}
