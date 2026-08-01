package DSA.Two_Pointers;
// public class BinarySearchExample {

//     public static int binarySearch(int[] arr, int target) {

//         int left = 0;
//         int right = arr.length - 1;

//         while (left <= right) {

//             int mid = left + (right - left) / 2;

//             // target found
//             if (arr[mid] == target) {
//                 return mid;
//             }

//             // target is greater
//             if (arr[mid] < target) {
//                 left = mid + 1;
//             }

//             // target is smaller
//             else {
//                 right = mid - 1;
//             }
//         }

//         return -1; // not found
//     }

//     public static void main(String[] args) {

//         int[] arr = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};

//         int target = 23;

//         int result = binarySearch(arr, target);

//         if (result != -1) {
//             System.out.println("Element found at index: " + result);
//         } else {
//             System.out.println("Element not found");
//         }
//     }
// }


public class BinarySearchExample{
    public static int searchNo(int []arr, int n){
        int left = 0;
        int right = arr.length - 1;

        while (left<=right) {
            int mid = (left + right) / 2;

            if(arr[mid] == n){
                return mid;
            }

            else if(n > arr[mid]){
                left = mid + 1;
            }

            else{
                right = mid - 1;
            }
        }

        return -1;
    }


    public static void main(String[] args) {

        int []arr = {10, 20, 30, 40, 50, 60, 70, 80, 90};

        int result = searchNo(arr, 90);

        if(result != -1)
            System.out.println("Element Found at index: " +result);

        else
            System.out.println("element not found");
    }
}