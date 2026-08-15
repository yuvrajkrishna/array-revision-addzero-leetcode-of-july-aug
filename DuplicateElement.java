public class DuplicateElement {
    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 1, 5, 4};
        int target = 5;

        boolean found = false;

        for (int num : arr) {

            if (num == target) {

                if (found) {
                    System.out.println("Duplicate Element");
                    return;
                }

                found = true;
            }
        }

        if (found) {
            System.out.println("Unique Element");
        } else {
            System.out.println("Target Doesn't Exist");
        }
    }
}