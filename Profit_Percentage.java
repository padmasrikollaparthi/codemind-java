import java.util.*;
public class Nums{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int x = read.nextInt();
        int y = read.nextInt();
        float  profit = y - x ; 
        float pro = (profit*100)/x;
        System.out.printf("%.2f",pro);
    }
}