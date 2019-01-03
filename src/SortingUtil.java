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

}
