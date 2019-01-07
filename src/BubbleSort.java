public class BubbleSort {

    public static void bubbleSort(int[] arr) {

        while (!SortingUtil.checkSort(arr)) {
            for (int i = 0; i < arr.length-1; i++) {
                    if (arr[i] > arr[i+1]) {
                        SortingUtil.swap(arr, i, i+1);
                    }
            }
        }
    }

}
