import java.util.Scanner;
public class FourthTask {
    public static void MaxOfThree(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max;
        if( b > a){
            max = b;
        }
        else {
            max = a;
        }
        if(max < c){
            max = c;
        }
        System.out.println("Maximum number is: "+max);
    }
}
