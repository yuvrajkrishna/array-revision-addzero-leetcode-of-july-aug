import java.util.Arrays;

public class ReverseCopyArray{
    public static void main (String args []){
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int arr2[] = new int [arr.length];
        for(int i = 0; i<arr.length; i++){
            arr2[i] = arr[arr.length-1-i];
        }
        System.out.println(Arrays.toString(arr2));
    }
}
