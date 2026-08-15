import java.util.Arrays;

public class SplitArray {
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,6,7,8,9,10};
        int arr2[] = new int [arr.length/2];
        int arr3[] = new int [arr.length/2];
        for(int i = 0 ; i < arr.length/2; i++){
            arr2[i] = arr[i];
            arr3[i] = arr[i+(arr.length/2)];
        }
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
    }
}
