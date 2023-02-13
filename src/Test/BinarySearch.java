package Test;

public class BinarySearch {

    public static boolean binarySearchRecursive(int arr[],int key, int left,int right) {
        if (left > right) {
            return false;
        }
        int mid = ((left + right) / 2);
        if (arr[mid] == key) {
            return true;
        } else if (key < arr[mid]) {
            return binarySearchRecursive(arr, key, left, mid - 1);
        } else if (key > arr[mid]) {
            return binarySearchRecursive(arr, key, mid + 1, right);
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {1,3,4,5,13,20,25,40,42,44,53};
        int key = 50;
        System.out.println(binarySearchRecursive(arr,key,0,arr.length));

    }
}
