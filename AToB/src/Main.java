import java.lang.*;
public class Main {
    public static void main(String[] args) {
        String str = "Trying to change all A letters to B";
        str = str.toLowerCase();
        String [] strarr = str.split("");
        System.out.println(str);
        StringBuilder out = new StringBuilder();
        for(int i = 0; i < strarr.length;i++){
            if(strarr[i].equals("a")){
                strarr[i] = "b";
            }
            out.append(strarr[i]);
        }

        String res = out.toString();
        System.out.println(res);
    }
}