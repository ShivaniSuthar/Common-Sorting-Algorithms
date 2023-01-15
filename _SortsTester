import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SortsTester {

    @Test
    public void InsertionSortTester1() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        Sorts <Integer> sorts = new Sorts<Integer>();
        sorts.InsertionSort(list, 0, list.size()-1);
        assert(list.get(0) == 1);
        assert(list.get(1) == 2);
        assert(list.get(2) == 3);
        assert(list.get(3) == 4);

    }

    @Test
    public void InsertionSortTester2() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(1);
        Sorts<Integer> sorts = new Sorts<Integer>();
        sorts.InsertionSort(list, 0, list.size() - 1);
        assert (list.get(0) == 1);

    }
    @Test
    public void InsertionSortTester3() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(2);
        list.add(-2);
        list.add(1);
        Sorts<Integer> sorts = new Sorts<Integer>();
        sorts.InsertionSort(list, 0, list.size() - 1);
        assert (list.get(0) == -2);
    }

    @Test
    public void CocktailSortTester1() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        Sorts <Integer> sorts = new Sorts<Integer>();
        sorts.cocktailSort(list, 0, list.size()-1);
        assert(list.get(0) == 1);
        assert(list.get(1) == 2);
        assert(list.get(2) == 3);
        assert(list.get(3) == 4);

    }

    @Test
    public void CocktailSortTester2() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(1);
        Sorts<Integer> sorts = new Sorts<Integer>();
        sorts.cocktailSort(list, 0, list.size() - 1);
        assert (list.get(0) == 1);

    }
    @Test
    public void CocktailSortTester3() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(2);
        list.add(-2);
        list.add(1);
        Sorts<Integer> sorts = new Sorts<Integer>();
        sorts.cocktailSort(list, 0, list.size() - 1);
        assert (list.get(0) == -2);
    }

    @Test
    public void QuickSortTester1() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        Sorts <Integer> sorts = new Sorts<Integer>();
        sorts.QuickSort(list, 0, list.size()-1);
        assert(list.get(0) == 1);
        assert(list.get(1) == 2);
        assert(list.get(2) == 3);
        assert(list.get(3) == 4);

    }

    @Test
    public void QuickSortTester2() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(1);
        Sorts<Integer> sorts = new Sorts<Integer>();
        sorts.QuickSort(list, 0, list.size() - 1);
        assert (list.get(0) == 1);

    }
    @Test
    public void QuickSortTester3() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(2);
        list.add(-2);
        list.add(1);
        Sorts<Integer> sorts = new Sorts<Integer>();
        sorts.QuickSort(list, 0, list.size() - 1);
        assert (list.get(0) == -2);
    }

    @Test
    public void QuickSortTester4() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        Sorts<Integer> sorts = new Sorts<Integer>();
        sorts.QuickSort(list, 0, list.size() - 1);
        assert (list.get(2) == 3);
    }

    @Test
    public void QuickSortTester5() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        Sorts<Integer> sorts = new Sorts<Integer>();
        sorts.QuickSort(list, 0, list.size() - 1);
        assert (list.get(1) == 2);
    }

    @Test
    public void QuickSortTester6() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(1);
        Sorts<Integer> sorts = new Sorts<Integer>();
        sorts.QuickSort(list, 0, list.size() - 1);
        assert (list.get(1) == 2);
    }

    @Test
    public void QuickSortTester7() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        Sorts<Integer> sorts = new Sorts<Integer>();
        sorts.QuickSort(list, 0, list.size() - 1);
        assert (list.get(0) == 1);
    }

    @Test
    public void Modified_QuickSortTester1() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(5);
        list.add(6);
        list.add(7);
        Sorts <Integer> sorts = new Sorts<Integer>();
        sorts.Modified_QuickSort(list, 0, list.size()-1, 3);
        assert(list.get(0) == 1);
        assert(list.get(1) == 2);
        assert(list.get(2) == 3);
        assert(list.get(3) == 4);

    }

    @Test
    public void Modified_QuickSortTester2() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(1);
        Sorts<Integer> sorts = new Sorts<Integer>();
        sorts.Modified_QuickSort(list, 0, list.size() - 1, 3);
        assert (list.get(0) == 1);

    }
    @Test
    public void Modified_QuickSortTester3() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(2);
        list.add(-2);
        list.add(1);
        Sorts<Integer> sorts = new Sorts<Integer>();
        sorts.Modified_QuickSort(list, 0, list.size() - 1, 3);
        assert (list.get(0) == -2);
    }
}

