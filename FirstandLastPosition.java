public class FirstandLastPosition {

    public static int findFirst(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = (start+end)/2;

            if (arr[mid] == target) {
                ans = mid;
                end = mid - 1;   // left side search
            }
            else if (arr[mid] > target) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }

        return ans;
    }

    public static int findLast(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = (start+end)/2;

            if (arr[mid] == target) {
                ans = mid;
                start = mid + 1; // right side search
            }
            else if (arr[mid] > target) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 3, 4, 7};
        int target = 3;

        int first = findFirst(arr, target);
        int last = findLast(arr, target);

        System.out.println("First = " + first);
        System.out.println("Last = " + last);
    }
}