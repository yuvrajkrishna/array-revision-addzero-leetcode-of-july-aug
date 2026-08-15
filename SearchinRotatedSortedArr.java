public class SearchinRotatedSortedArr {
    public static void main(String[] args) {
        int arr[] = {0,1,2,3,4,5,6,7};
        int nums [] = {4,5,6,7,0,1,2};
        int target = 0;
        int start = 0 ;
        int end = nums.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(nums[mid] == target){
                System.out.println(mid);
                return;
            }
            else if (nums[start] <= nums[mid]){
                if(target >= nums[start] && target < nums[mid]){
                    end = mid - 1;
                }
                else{
                    start = mid+1;
                }
            }
            else{
                if(target > mid && target <= nums[end]){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
        }
        System.out.println(-1);
    }
}
