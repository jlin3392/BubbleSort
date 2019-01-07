public class BubbleSortRunner {

    public static void main(String[] args) {

        int[] testArr = SortingUtil.randIntArr(5);
        int[] before = testArr;

        System.out.println("Before: ");
        for (int num:testArr) {
            System.out.println(num + " ");
        }
        System.out.println();

        BubbleSort.bubbleSort(testArr);


        System.out.println("After: ");
        for (int num:testArr) {
            System.out.println(num + " ");
        }
        System.out.println();

        if (!SortingUtil.checkSum(before, testArr)) {
            System.out.println("There is an error!");
        }

        long time = System.nanoTime();
        time = System.nanoTime() - time;
        System.out.println("Time taken: " + time);

    }
}
