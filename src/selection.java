public class selection {
    public static void selectionsort (int[] list) {
        int minNum;
        int temp;
        for(int i = 0; i < list.length; i++) {
            minNum = i; // smallest value compared to
            for(int j = i + 1; j < list.length; j++) {
                if (list[minNum] > list[j]) { // j is nextNum
                    minNum = j;
                } // if next num smaller than minNum, that's the new minNum
                // so make it new minNum, and iterate to find smallest minNum
                // otherwise, just iterate j
            }
            // after finding smallest minNum, swap it with index i, the index
            // with the number after the current smallest elememnt
            temp = list[i];
            list[i] = list[minNum];
            list[minNum] = temp; // swap minNum index with, number that's less than minNUm
        }
    }

    public static void mergeSort(int[] array) {

    }

    private static void merge(int[] left)
}
