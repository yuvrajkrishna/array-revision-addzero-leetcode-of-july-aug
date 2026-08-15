import java.util.Arrays;
public class CountArray {
    public static void main(String[] args) {
        int arr [] = {4,5,3,2,9};
        int CountArr [] = new int [arr.length];
        for(int i = 0 ; i < arr.length ; i++){
            int count = 0 ;
            for(int j = 0 ; j < arr.length ; j++){
                if (arr[i] > arr[j] && i!=j){
                    count++;
                }
            }
            CountArr[i] = count;
        }
        System.out.println(Arrays.toString(CountArr));
    }
}
