import java.util.Arrays;

public class sortzeroonetwo{
    public static void main(String[] args) {
        int arr[] = {1, 0, 2, 1, 0};
        int zero = 0;
        for(int i = 0 ; i < arr.length; i++){
            if(arr[i] == 0){
                zero++;
            }
        }
        int one = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i]==1){
                one++;
            }
        }
        for(int i = 0 ; i < zero ; i++){
            arr[i] = 0;
        }
        for(int i = zero ; i < zero+one; i++){
            arr[i] = 1;
        }
        for(int i = zero+one ; i < arr.length; i++){
            arr[i] = 2;
        }
        System.out.println(Arrays.toString(arr));
    }
}