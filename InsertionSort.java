public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, -8, 1, 9};
         insertionSort(arr);
         for(int var:arr){
            System.out.print(var+" ");
        }
    }
    private static void insertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            if(arr[i-1]>arr[i]){
                for(int j=i;j>0;j--){
                    if(arr[j-1]>arr[j]){
                        int temp = arr[j];
                        arr[j] = arr[j-1];
                        arr[j-1] = temp;
                }
                else 
                    break;
            }
    }
}
   
    }
 
}
