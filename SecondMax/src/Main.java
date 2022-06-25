public class Main {
    public static void main(String[] args) {
        double[] arr = new double[10];
        boolean sorted = true;
        double scale = Math.pow(10,2);
        for(int i = 0; i < arr.length - 1; i++){
            arr[i] = Math.ceil(((Math.random()*20) - 10)*scale)/scale;
        }
        double temp = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 1; j < (arr.length-i); j++){
                if(arr[j-1] > arr[j]){
                    //swap elements
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(double j:arr){
            System.out.print(j+" ");
        }
        System.out.println("\nThe second max number is "+arr[arr.length - 2]);
    }
}