public class lk {
    public static void main(String[] args) {
        int n = 2341;
        while(n>0){
            int lastdigit = n%10;
            System.out.print(lastdigit);
            n=n/10;
        }
    }
}
