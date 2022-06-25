import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int sum, div, prod, diff;
        sum = a + b;
        div = a/b;
        prod = a*b;
        diff = a - b;
        System.out.println("Sum "+sum);
        System.out.println("Difference "+diff);
        System.out.println("Product "+prod);
        System.out.println("Division "+div);
    }
}