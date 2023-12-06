import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class testSelectionSort {
    @Test
    public void test() {
        testPositive();
        testNegative();
        testMixed();
        testDuplicates();
    }

    public testSelectionSort() {
    }

    @Test
    public void testPositive(){
        SelectionSort sorter = new SelectionSort();

        int[] arr = {8, 9, 7, 10, 2};
        int[] sortedArr = sorter.basicSelectionSort(arr);

        int[] expectedSortedArr = {2, 7, 8, 9, 10};
        assertArrayEquals(expectedSortedArr, sortedArr, "Array is sorted in ascending order!");
    }
    @Test
    public void testNegative(){
        SelectionSort sorter = new SelectionSort();

        int[] arr = {-3, -1, -4, -2, -5};
        int[] sortedArr = sorter.basicSelectionSort(arr);

        int[] expectedSortedArr = {-5, -4, -3, -2, -1};
        assertArrayEquals(expectedSortedArr, sortedArr, "Array is sorted in ascending order!");
    }


    @Test
    public void testMixed(){
        SelectionSort sorter = new SelectionSort();

        int[] arr = {3, -1, 0, -2, 5};
        int[] sortedArr = sorter.basicSelectionSort(arr);

        int[] expectedSortedArr = {-2, -1, 0, 3, 5};
        assertArrayEquals(expectedSortedArr, sortedArr, "Array is sorted in ascending order!");
    }


    @Test
    public void testDuplicates(){
        SelectionSort sorter = new SelectionSort();

        int[] arr = {5, -2, 5, -2, 0};
        int[] sortedArr = sorter.basicSelectionSort(arr);

        int[] expectedSortedArr = {-2, -2, 0, 5, 5};
        assertArrayEquals(expectedSortedArr, sortedArr, "Array is sorted in ascending order!!!");
    }

}

