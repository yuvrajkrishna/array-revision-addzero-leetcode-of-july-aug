public class max {
    public static void main(String[] args) {
        int arr [] = {4,1,3,7,5,9,2};
        if(arr==null || arr.length == 0){
            throw new IllegalArgumentException("Array is Empty");
        }
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
