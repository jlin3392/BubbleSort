public class BubbleSortRunner {

    public static void main(String[] args) {

        int[] testArr = SortingUtil.randIntArr(5);

        System.out.println("Before: ");
        for (int num:testArr) {
            System.out.println(num + " ");
        }
        System.out.println();

        long time = System.nanoTime();
        BubbleSort.bubbleSort(testArr);
        time = System.nanoTime() - time;
        System.out.println("Time taken: " + time);

        System.out.println("After: ");
        for (int num:testArr) {
            System.out.println(num + " ");
        }
        System.out.println();


    }
}
