public class Main {
    public static void main(String[] args) {
        int [] arr = new int[10];
        int sum = 0;
        for(int i: arr){
            i = (int)Math.round((Math.random()*50)-10);
            System.out.print(i + " ");
            sum += i;
        }
        System.out.println("\nThe sum of the array is "+sum);
    }
}