public class majorityelement{
    public static void main(String[] args) {
        int arr [] ={3,2,3};
        int n = arr.length-1;
        int i = 0 ;
        int j = i+1;
        int count = 1;
        while(i < arr.length -1 && j < arr.length){
            if(arr[i] == arr[j]){
                count++;
            }
            if(count > (n/2)){
                System.out.println(arr[i]);
                break;
            }
            if(j == arr.length){
                i++;
                j=i+1;
            }
            j++;
        }
        System.out.println("not present");
    }
}