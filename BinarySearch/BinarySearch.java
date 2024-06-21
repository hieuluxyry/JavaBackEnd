public class BinarySearch {
    static int[] list = {2, 4, 10, 30, 56, 99,9999, 45678, 8909, 0};

    static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;
        while (low < high) {
            int mid = (low + high) / 2;
            if (key < list[mid]) {
                high = mid - 1;
            } else if (key == list[mid]) {
                return mid;
            } else
                low = mid + 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(binarySearch(list, 9999));
        System.out.println(binarySearch(list, 0));
    }
}
