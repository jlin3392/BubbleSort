public class BubbleSort {

    public static void bubbleSort(int[] arr) {
        int swapCount = 1;

        while (swapCount != 0) {
            swapCount = 0;

            for (int i = 0; i < arr.length; i++) {
                while (i + 1 <= arr.length) {
                    if (arr[i] > arr[i+1]) {
                        SortingUtil.swap(arr, i, i+1);
                        swapCount++;
                    }
                }
            }
        }
    }

}
