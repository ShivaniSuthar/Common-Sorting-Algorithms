
 
import java.util.ArrayList;

/**
 * Runtime Analysis Class
 */
public class RuntimeAnalysis {

    private static final int NUM_DATA = 10000;
    private static final int NUM_RUN = 6;
    private static final int NUM_TEST = 5;
    private static final int MIN = 0;
    private static final int MAX = 100000;
    private static final int[] QuickSortCutoffValues = {2,4,8,16,32,64,128};

    /**
     * Returns an ArrayList of random numbers
     *
     * @param size the number of random numbers wanted
     * @param min the min value for random number
     * @param max the max value for random number
     * @return an ArrayList of random numbers
     */
    public static ArrayList<Integer> randomNumbers(int size, int min, int max) {

        ArrayList<Integer> randNums = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            randNums.add((int) (Math.random() * ((max - min) + 1)) + min);
        }
        return randNums;
    }

    /**
     * Returns a deep copy of the input array list.
     *
     * @param data list to copy
     * @return a deep copy of the list
     */
    private static ArrayList<Integer> deepCopyArrayList(ArrayList<Integer> data) {
        ArrayList<Integer> result = new ArrayList<>();
        for (Integer d : data) {
            result.add(d);
        }
        return result;
    }

    /**
     * Times the insertion sort.
     * @param data list of data to sort
     * @param numRun the number of trials to run
     */
    public static void timeInsertionSort(ArrayList<Integer> data, int numRun) {
        long startTime = 0, endTime = 0, totalTime = 0;
        Sorts<Integer> sorts = new Sorts<>();
        ArrayList<Integer> temp = deepCopyArrayList(data);
        for (int i = 0; i < numRun; i++) {
            data = deepCopyArrayList(temp);
            startTime = System.currentTimeMillis();
            sorts.InsertionSort(data, 0, data.size() - 1);
            endTime = System.currentTimeMillis();
            totalTime += (endTime - startTime);
        }
        System.out.println("Benchmarking insertion sort: ");
        System.out.println("Number of data to sort: " + data.size());
        System.out.println("Average time taken to sort: " + totalTime / numRun + " ms");
        System.out.println();
    }

    /**
     * Times the merge sort.
     * @param data list of data to sort
     * @param numRun the number of trials to run
     */
    public static void timeMergeSort(ArrayList<Integer> data, int numRun) {
        long startTime = 0, endTime = 0, totalTime = 0;
        Sorts<Integer> sorts = new Sorts<>();
        ArrayList<Integer> temp = deepCopyArrayList(data);
        for (int i = 0; i < numRun; i++) {
            data = deepCopyArrayList(temp);
            startTime = System.currentTimeMillis();
            sorts.MergeSort(data, 0, data.size() - 1);
            endTime = System.currentTimeMillis();
            totalTime += (endTime - startTime);
        }
        System.out.println("Benchmarking merge sort: ");
        System.out.println("Number of data to sort: " + data.size());
        System.out.println("Average time taken to sort: " + totalTime / numRun + " ms");
        System.out.println();
    }

    /**
     * Times the Quicksort.
     * @param data list of data to sort
     * @param numRun the number of trials to run
     */
    public static void timeQuickSort(ArrayList<Integer> data, int numRun) {
        long startTime = 0, endTime = 0, totalTime = 0;
        Sorts<Integer> sorts = new Sorts<>();
        ArrayList<Integer> temp = deepCopyArrayList(data);
        for (int i = 0; i < numRun; i++) {
            data = deepCopyArrayList(temp);
            startTime = System.currentTimeMillis();
            sorts.QuickSort(data, 0, data.size() - 1);
            endTime = System.currentTimeMillis();
            totalTime += (endTime - startTime);
        }
        System.out.println("Benchmarking quick sort: ");
        System.out.println("Number of data to sort: " + data.size());
        System.out.println("Average time taken to sort: " + totalTime / numRun + " ms");
        System.out.println();
    }

    /**
     * Times the modified Quicksort.
     * @param data list of data to sort
     * @param numRun the number of trials to run
     * @param param the extra parameter the sorting algorithm takes (cutoff)
     */
    public static void timeModifiedQuickSort(ArrayList<Integer> data, int numRun, int param) {
        long startTime = 0, endTime = 0, totalTime = 0;
        Sorts<Integer> sorts = new Sorts<>();
        ArrayList<Integer> temp = deepCopyArrayList(data);

        for (int i = 0; i < numRun; i++) {
            data = deepCopyArrayList(temp);
            startTime = System.currentTimeMillis();
            sorts.Modified_QuickSort(data, 0, data.size() - 1, param);
            endTime = System.currentTimeMillis();
            totalTime += (endTime - startTime);
        }
        System.out.println("Modified QuickSort Cutoff Value: " + param);
        System.out.println("Benchmarking quick sort: ");
        System.out.println("Number of data to sort: " + data.size());
        System.out.println("Average time taken to sort: " + totalTime / numRun + " ms");
        System.out.println();
    }

    /**
     * Times the cocktail sort.
     * @param data list of data to sort
     * @param numRun the number of trials to run
     */
    public static void timeCocktailSort(ArrayList<Integer> data, int numRun) {
        long startTime = 0, endTime = 0, totalTime = 0;
        Sorts<Integer> sorts = new Sorts<>();
        ArrayList<Integer> temp = deepCopyArrayList(data);
        for (int i = 0; i < numRun; i++) {
            data = deepCopyArrayList(temp);
            startTime = System.currentTimeMillis();
            sorts.cocktailSort(data, 0, data.size() - 1);
            endTime = System.currentTimeMillis();
            totalTime += (endTime - startTime);
        }
        System.out.println("Benchmarking cocktail sort: ");
        System.out.println("Number of data to sort: " + data.size());
        System.out.println("Average time taken to sort: " + totalTime / numRun + " ms");
        System.out.println();
    }

    /**
     * Main method to run the time methods. 
     * @param args arguments (not used)
     */
    public static void main(String[] args) {
        int numData;
        
        numData = NUM_DATA;
        for (int i = 0; i < NUM_TEST; i++) {
            ArrayList<Integer> data = randomNumbers(numData, MIN, MAX);
            timeInsertionSort(data, NUM_RUN);
            numData += numData;
        }
        numData = NUM_DATA;
        for (int i = 0; i < NUM_TEST; i++) {
            ArrayList<Integer> data = randomNumbers(numData, MIN, MAX);
            timeCocktailSort(data, NUM_RUN);
            numData += numData;
        }

        numData = NUM_DATA;
        for (int i = 0; i < NUM_TEST; i++) {
            ArrayList<Integer> data = randomNumbers(numData, MIN, MAX);
            timeQuickSort(data, NUM_RUN);
            numData += numData;
        }
        ArrayList<Integer> data = randomNumbers(1000000, MIN, MAX);
        timeModifiedQuickSort(data, NUM_RUN, 2);
        data = randomNumbers(1000000, MIN, MAX);
        timeModifiedQuickSort(data, NUM_RUN, 4);
        data = randomNumbers(1000000, MIN, MAX);
        timeModifiedQuickSort(data, NUM_RUN, 8);
        data = randomNumbers(1000000, MIN, MAX);
        timeModifiedQuickSort(data, NUM_RUN, 16);
        data = randomNumbers(1000000, MIN, MAX);
        timeModifiedQuickSort(data, NUM_RUN, 32);
        data = randomNumbers(1000000, MIN, MAX);
        timeModifiedQuickSort(data, NUM_RUN, 64);
        data = randomNumbers(1000000, MIN, MAX);
        timeModifiedQuickSort(data, NUM_RUN, 128);


        ArrayList<Integer> data = randomNumbers(1000000, MIN, MAX);
        data = randomNumbers(100000, MIN, MAX);
        timeQuickSort(data, NUM_RUN);
        data = randomNumbers(200000, MIN, MAX);
        timeQuickSort(data, NUM_RUN);
        data = randomNumbers(300000, MIN, MAX);
        timeQuickSort(data, NUM_RUN);
        data = randomNumbers(400000, MIN, MAX);
        timeQuickSort(data, NUM_RUN);
        data = randomNumbers(500000, MIN, MAX);
        timeQuickSort(data, NUM_RUN);
        data = randomNumbers(600000, MIN, MAX);
        timeQuickSort(data, NUM_RUN);

        data = randomNumbers(100000, MIN, MAX);
        timeModifiedQuickSort(data, NUM_RUN, 8);
        data = randomNumbers(200000, MIN, MAX);
        timeModifiedQuickSort(data, NUM_RUN, 8);
        data = randomNumbers(300000, MIN, MAX);
        timeModifiedQuickSort(data, NUM_RUN, 8);
        data = randomNumbers(400000, MIN, MAX);
        timeModifiedQuickSort(data, NUM_RUN, 8);
        data = randomNumbers(500000, MIN, MAX);
        timeModifiedQuickSort(data, NUM_RUN, 8);
        data = randomNumbers(600000, MIN, MAX);
        timeModifiedQuickSort(data, NUM_RUN, 8);
       

    }
}
