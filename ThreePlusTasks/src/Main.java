public class Main {
    public static void main(String[] args) {
        int a = 5, b = 7;
        int temp;
        System.out.println("Before swap a = "+a+" b = "+b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("After swap a = "+a+" b = "+b);
    }
}