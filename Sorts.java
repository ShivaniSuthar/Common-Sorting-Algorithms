
import java.util.ArrayList;

/**
 * Sorts class.
 * @param <T> Generic type
 */
public class Sorts<T extends Comparable<? super T>> {

    private static final int MIDDLE_IDX = 2;
    private static final int BASIC_SIZE = 2;

    /**
     * This method performs insertion sort on the input arraylist
     *
     * @param list The arraylist we want to sort
     * @param start The initial index on subsection of Arraylist we want to sort
     * @param end The final index of the subsection of Arraylist we want to sort
     */
    public void InsertionSort(ArrayList<T> list, int start, int end) {
        assert (start < end);
        //initializes i to iterate through the array
        for (int i = start+1; i<=end; i++) {
            //initializes j to track the position of the inserted element
            for (int j = 0; j<i; j++) {
                //going through array and comparing the value with the one next to it
                if (list.get(i-j).compareTo(list.get(i-j-1)) < 0) {
                    // swapping elements to set them in order
                    T temp = list.get(i-j);
                    list.set(i-j, list.get(i-j-1));
                    list.set(i-j-1, temp);
                }
                //breaks out of the for loop if done
                else {
                    break;
                }
            }
        }


    }

    /**
     * This method performs merge sort on the input arraylist
     *
     * @param list The arraylist we want to sort
     * @param start The inital index on subsection of Arraylist we want to sort
     * @param end The final index of the subsection of Arraylist we want to sort
     */
    public void MergeSort(ArrayList<T> list, int start, int end) {

        if (start < end)
        {
            int mid = start + (end - start) / MIDDLE_IDX;
            MergeSort(list, start, mid);
            MergeSort(list , mid + 1, end);

            merge(list, start, mid, end);
        }
    }

    /**
     * merge helper function for MergeSort
     *
     * @param arr The arraylist we want to sort
     * @param l left-most index we want to merge
     * @param m the middle index we want to merge
     * @param r right-most index we want to merge
     */
    private void merge(ArrayList<T> arr, int l, int m, int r) {

        int mergedSize = r - l + 1;

        ArrayList<T> mergedNums = new ArrayList<>();
        int left = l, right = m + 1;
        while (left <= m && right <= r) {
            if (arr.get(left).compareTo(arr.get(right)) <= 0) {
                mergedNums.add(arr.get(left));
                left++;
            }
            else {
                mergedNums.add(arr.get(right));
                right++;
            }
        }

        while (left <= m) {
            mergedNums.add(arr.get(left));
            left++;
        }
        while (right <= r) {
            mergedNums.add(arr.get(right));
            right++;
        }
        for (int i = 0; i < mergedSize; i++) {
            arr.set(l + i, mergedNums.get(i));
        }
    }

    /**
     * This method performs quick sort on the input arraylist
     *
     * @param list The arraylist we want to sort
     * @param start The inital index on subsection of Arraylist we want to sort
     * @param end The final index of the subsection of Arraylist we want to sort
     */
    public void QuickSort(ArrayList<T> list, int start, int end) {
        // returns the array as is if its' size is less than 2
        if (list.size() < BASIC_SIZE) {
            return;
        }
        //otherwise, manually checks and swaps elements
        // to their proper position if its' size is 2
        else if (list.size() == BASIC_SIZE) {
            if (list.get(0).compareTo(list.get(1)) > 0) {
                T temp = list.get(0);
                list.set(0, list.get(1));
                list.set(1, temp);
            }
            return;
        }


        int pivot = partition(list, start, end);
        int leftLength = pivot-start;
        int rightLength = end - pivot;
        // sorting the left hand side if its' length is 2
        if (leftLength == BASIC_SIZE) {
            //manually checking and swapping start with start + 1 if start is greater
            if (list.get(start).compareTo(list.get(start+1)) > 0) {
                T temp = list.get(start);
                list.set(start, list.get(start + 1));
                list.set(start+1, temp);

            }
        }
        // calling quicksort to sort the left hand side if its' greater than 2
        else if (leftLength > BASIC_SIZE) {
            QuickSort(list, start, pivot-1);
        }

        // sorting the right hand side if its' length is 2
        if (rightLength == BASIC_SIZE) {
            //manually checking and swapping pivot + 1 with end if pivot + 1 is greater
            if (list.get(pivot + 1).compareTo(list.get(end)) > 0) {
                T temp = list.get(pivot + 1);
                list.set(pivot + 1, list.get(end));
                list.set(end, temp);

            }
        }
        // calling quicksort to sort the right hand side if its' greater than 2
        else if (rightLength > BASIC_SIZE) {
            QuickSort(list, pivot + 1, end);
        }

    }

    /**
     * partition helper function for QuickSort
     *
     * @param arr The arraylist we want to sort
     * @param l left-most index we want to merge
     * @param h right-most index we want to merge
     */
    private int partition(ArrayList<T> arr, int l, int h) {
        assert (l+1 < h);
        int pivot = (int) Math.floor((h - l) / MIDDLE_IDX) + l;  //variable for the pivot
        T value = arr.get(pivot);
        ArrayList<T> newList = new ArrayList<T>(); //making a new array list

        //making the left side the partition
        for (int j = l; j<=h; j++) {
            if (arr.get(j).compareTo(value) < 0) {
                newList.add(arr.get(j));
            }
        }
        //adding the pivot
        newList.add(value);
        int pivotReturn = l+ newList.size() - 1;
        //making the right side the partition
        for (int j = l; j<=h; j++) {
            if (arr.get(j).compareTo(value) > 0 || arr.get(j).compareTo(value) == 0) {
                if (j != pivot)
                    newList.add(arr.get(j));
            }

        }
        //copying back into arr
        for (int k = 0; k < newList.size(); k++) {
            arr.set(k+l, newList.get(k));
        }
        return pivotReturn;
    }

    /**
     * This method performs a modified QuickSort that switches to insertion sort
     * after a certain cutoff
     *
     * @param list The arraylist we want to sort
     * @param start The inital index on subsection of Arraylist we want to sort
     * @param end The final index of the subsection of Arraylist we want to sort
     * @param cutoff the minimum length of an subsection of the arraylist
     *               such that we switch to Insertion Sort
     */
    public void Modified_QuickSort(ArrayList<T> list, int start, int end, int cutoff) {
        // returns the array as is if its' size is less than 2
        if (list.size() < BASIC_SIZE) {
            return;
        }
        //otherwise, manually checks and swaps elements
        // to their proper position if its' size is 2
        else if (list.size() == BASIC_SIZE) {
            if (list.get(0).compareTo(list.get(1)) > 0) {
                T temp = list.get(0);
                list.set(0, list.get(1));
                list.set(1, temp);
            }
            return;
        }


        int pivot = partition(list, start, end);
        int leftLength = pivot-start;
        int rightLength = end - pivot;
        // sorting the left hand side if its' length is 2
        if (leftLength == BASIC_SIZE) {
            //manually checking and swapping start with start + 1 if start is greater
            if (list.get(start).compareTo(list.get(start+1)) > 0) {
                T temp = list.get(start);
                list.set(start, list.get(start + 1));
                list.set(start+1, temp);

            }
        }

        // calling quicksort and insertion sort based on the conditions
        else if (leftLength > BASIC_SIZE) {
            if (leftLength <= cutoff)
                InsertionSort(list, start, pivot-1);
            else
                QuickSort(list, start, pivot-1);
        }

        // sorting the right hand side if its' length is 2
        if (rightLength == BASIC_SIZE) {
            //manually checking and swapping pivot + 1 with end if pivot + 1 is greater
            if (list.get(pivot + 1).compareTo(list.get(end)) > 0) {
                T temp = list.get(pivot + 1);
                list.set(pivot + 1, list.get(end));
                list.set(end, temp);

            }
        }
        // calling quicksort and insertion sort based on the conditions
        else if (rightLength > BASIC_SIZE) {
            if (rightLength <= cutoff)
                InsertionSort(list, pivot + 1, end);
            else
                QuickSort(list, pivot + 1, end);
        }

    }

    /**
     * This method performs cocktail sort on the input list
     *
     * @param list The arraylist we want to sort
     * @param start The inital index on subsection of Arraylist we want to sort
     * @param end The final index of the subsection of Arraylist we want to sort
     */
    public void cocktailSort(ArrayList<T> list, int start, int end){
        while (true) {
            boolean swapped = false;
            // for loop for right pass implementation
            for (int i = start; i<end-1; i++) {
                //swaps elements if element next to the current one is greater than it
                if (list.get(i).compareTo(list.get(i+1)) > 0) {
                    T temp = list.get(i);
                    list.set(i, list.get(i+1));
                    list.set(i+1, temp);
                    swapped = true;

                }
            }
            if (swapped == false) {
                break;
            }

            //for loop for left pass implementation
            for (int i = end-1; i>=start; i--) {
                //swaps elements if element next to the current one is greater than it
                if (list.get(i).compareTo(list.get(i+1)) > 0) {
                    T temp = list.get(i);
                    list.set(i, list.get(i+1));
                    list.set(i+1, temp);
                    swapped = true;

                }
            }
            //breaks out of the loop if swapped is finally false
            if (swapped == false) {
                break;
            }
        }
    }
}
