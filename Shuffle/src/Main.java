//import java.util.HashMap;
//import java.util.Arrays;
public class Main {
    public static String restoreString(String s, int[] indices) {
        String [] ar = s.split("");
        String [] mas = new String[ar.length];
        //HashMap <Integer, String> str = new HashMap<Integer,String>();
        for(int i = 0; i < ar.length; i++){
            //str.put(indices[i],ar[i]);
            mas[indices[i]] = ar[i];

        }
        String ss = mas.toString();
        /*for (int i : str.keySet()) {
            System.out.println("key: " + i + " value: " + str.get(i));
            ss += str.get(i);
        }*/
        /*for (String i : mas) {
            System.out.println("key: " + i);
            ss += i;
        }*/


        return ss;
    }

    public static void main(String[] args) {
        int [] arr = {4,5,6,7,0,2,1,3};
        String shf = "codeleet";
        System.out.println(restoreString(shf,arr));

    }
}