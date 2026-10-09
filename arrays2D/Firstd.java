import java.util.*;
public class Firstd {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int row= sc.nextInt();
        int colm= sc.nextInt();
        int [][] number = new int [row][colm];
        for(int i = 0 ; i < row; i++){
            for(int j = 0 ; j<colm; j++){
                number[i][j]=sc.nextInt();
            }
        }
        for(int i = 0; i<row;i++){
            for(int j = 0 ; j<colm; j++){
                System.out.print(number[i][j]+ " ");
            }
            System.out.println();
        }

    }
}
