public class checkUnique {
    public static void main(String[] args) {
        int arr [] = {1,3,2,4,5,6,7,6,5,3,2,1};
        boolean found = false;
        int num = -1;
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0; j < arr.length; j++){
                if(arr[i]!=arr[j]){
                    found = true;
                    num = arz;
                }
                else if(arr[i] == arr[j]){
                    break;
                }
            }
        }
        if(found){
            System.out.println("Unique");
            System.out.println(num);
        }
        else{
            System.out.println("Not Unique");
        }
    }
}
