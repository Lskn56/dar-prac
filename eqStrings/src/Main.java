public class Main {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        //char ch;
        String s1 = "", s2 = "";
        //int prod1 = 1, prod2 = 1;
        //if(word1.length != word2.length) return false;
        for(int i = 0; i < word1.length; i++){
            s1 += word1[i];
        }
        for(int j = 0; j < word2.length; j++){
            s2 += word2[j];
        }
      /*  for(char l: s1.toCharArray()){
            //ch = s1.charAt(i);
            prod1 *= (int)l;
        }
        for(char j: s2.toCharArray()){
            //ch = s2.charAt(i);
            prod2 *= (int)j;
        }*/
        if(s1.equals(s2)){return true;}
        return false;

    }
    public static void main(String[] args) {
        String [] ar1 = {"ab","c"};
        String [] ar2 = {"a","bc"};
        System.out.println(arrayStringsAreEqual(ar1,ar2));
    }
}