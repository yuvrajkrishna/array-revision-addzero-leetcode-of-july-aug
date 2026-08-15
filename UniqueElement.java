public class UniqueElement {
    public static void main(String[] args) {
        int arr [] = {4,3,1,2,3,4,5,6,6};
        int target = 7 ;
        boolean found = false;
        for(int i = 0; i < arr.length ; i++){
            if(arr[i] == target){
                if(found){
                    System.out.println("Target occurs more than once");
                    return;
                }
                found = true;
            }
        }
        if(found){
            System.out.println("Target occurs only once");
        }
        else{
            System.out.println("Target Not Present");
        }
    }
}
