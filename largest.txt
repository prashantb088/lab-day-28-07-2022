public class largest {
    public static void main(String[] args){

        int[] arr = new int[]{10,25,45,35,76,89};

        int max = arr[0];

        for(int i = 0;i<arr.length;i++){

            if(arr[i]>max)
                max = arr[i];
        }
        System.out.println("largest element in an array" +max);
    }
}
