import java.util.Arrays;
public class checkduplicate {
    public static void main(String[] args) {
        int arr [] = {1,4,3,3,2};
        for(int i = 1 ; i < arr.length ; i++){
            int curr = arr[i] ;
            int prev = i - 1 ;
            // finding out correct position to insert
            while(prev >= 0  && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--; 
            }
            // insertion
            arr[prev+1] = curr;
        }
        // System.out.println(Arrays.toString(arr));
        int i = 0 ; 
        int j = i+1;
        while(i < arr.length && j < arr.length-1){
            if(arr[i] == arr[j]){
                System.out.println("Duplicate");
                return;
            }
            i++;
            j++;
        }
        System.out.println("Not duplicate");
    }
}
