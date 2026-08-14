public class min {
    public static void main(String[] args) {
        int arr[] = {4,5,6,2,3,0,7,9};
        if(arr == null || arr.length == 0){
            throw new IllegalArgumentException("Array is Empty");
        }
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
