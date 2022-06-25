import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a == 0){
            System.out.println("The number a is 0");
        }
        String pn = (a > 0) ? "positive" : "negative";
        System.out.println("The number is "+pn);
    }
}