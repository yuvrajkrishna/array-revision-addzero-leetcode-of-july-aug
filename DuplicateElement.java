public class DuplicateElement {
    public static void main(String[] args) {
        int arr [] = {1,2,2,3,1,5,4};
        int target = 5;
        int freq = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == target){
                freq++;
                if(freq > 1){
                    System.out.println("Duplicate Element");
                    return;
                }
            }
        }
        if(freq == 0){
            System.out.println("Target doesn't Exist");
        }
        else{
            System.out.println("UniqueElement");
        }
    }
}
