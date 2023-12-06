public class SelectionSort {

    public SelectionSort() {
    }

    public int[] basicSelectionSort(int[] x) {
        for (int i = 0; i < x.length - 1; ++i) {
            // Assume the minimum is the first element
            int minIndex = i;
            // Search the array for a smaller element
            for (int j = i + 1; j < x.length; ++j) {
                if (x[minIndex] > x[j]) {
                    minIndex = j;
                }
            }
            // Swap the smallest found element with the first element
            if (minIndex != i) {
                int temp = x[minIndex]; // temp is now a local variable
                x[minIndex] = x[i];
                x[i] = temp;
            }
        }
        return x;
    }
}
