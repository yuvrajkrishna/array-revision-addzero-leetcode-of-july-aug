public class linearSearch {
    public static void main(String[] args) {
        int arr [] = {1,3,4,5,7,8,10};
        int target = 7;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == target){
                System.out.println("Present");
                return;
            }
        }
        System.out.println("Not Present");
    }
}
