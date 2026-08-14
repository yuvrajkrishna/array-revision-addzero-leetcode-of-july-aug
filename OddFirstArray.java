import java.util.Arrays;

public class OddFirstArray {
    public static void main (String args []){
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int ans[] = new int [arr.length];
        int k = 0 ;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] % 2 == 1){
                ans[k++] = arr[i];
            }
        }
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] % 2 == 0){
                ans[k++] = arr[i];
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
