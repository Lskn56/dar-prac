import java.util.ArrayList;
import java.util.List;
public class Main {
    public static int sumOddLengthSubarrays(int[] arr) {
        List<Integer> leng = new ArrayList<Integer>();
        int sum = 0;
        for(int i = 0; i < arr.length; i+=2){
            //if(i % 2 == 0){
            leng.add(i);
            //}
        }
        for(int k = 0; k < leng.size();k++){
            for(int n = 0; n < arr.length - leng.get(k);n++){
                for(int m = n; m < n + leng.get(k) + 1;m++){
                    sum += arr[m];
                }
            }
        }

        return sum;

    }
    public static void main(String[] args) {
        int [] mass = {1,4,2,5,3};
        System.out.println(sumOddLengthSubarrays(mass));
    }
}