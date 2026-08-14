import java.util.Arrays;

public class alternatearraymerge {
    public static void main(String[] args) {
        int arr1 [] = {1,2,3,4,5};
        int arr2 [] = {6,7,8,9,10};
        int arr3 [] = new int [arr1.length + arr2.length];
        int k = 0 ;
        for(int i = 0 ; i < arr3.length/2 ; i++){
            arr3[k++] = arr1[i];
            arr3[k++] = arr2[i];
        }
        System.out.println(Arrays.toString(arr3));
    }
}
