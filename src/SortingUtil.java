public class SortingUtil {

    public static void swap(int [] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = j;
        arr[j] = temp;
    }

    public static int[] randIntArr(int count) {
        int[] arr = new int[count];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*10001);
        }

        return arr;
    }

    public static boolean checkSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > arr[i+1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkSum(int[] before, int[] after) {
        int sumA = 0;
        int sumB = 0;

        if (before.length != after.length) {
            return false;
        } else {
            for (int i = 0; i < before.length; i++) {
                sumA = sumA + before[i];
                sumB = sumB + after[i];
            }
        }

        if (sumA != sumB) {
            return false;
        }

        return true;
    }

}
