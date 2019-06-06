package cn.lcools;

import cn.lcools.sort.BubbleSort;
import cn.lcools.sort.InsertionSort;
import cn.lcools.sort.SelectionSort;
import cn.lcools.sort.SortInterface;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception{
        SortInterface<Integer> sortInterface = new BubbleSort<>();
        Integer[] arry = {3,6,1,-2,4,7};
        sortInterface.sort(arry);
        Arrays.stream(arry).forEach(a -> System.out.print(a + "\t"));
        System.out.println();
        System.out.println("-----------------------------------------------------");
        SortInterface<Integer> sortInterface1 = new SelectionSort<>();
        Integer[] arry1 = {3,6,1,-2,4,7};
        sortInterface1.sort(arry1);
        Arrays.stream(arry1).forEach(a -> System.out.print(a + "\t"));
        System.out.println();
        System.out.println("-----------------------------------------------------");
        SortInterface<Integer> sortInterface2 = new InsertionSort<>();
        Integer[] arry2 = {3,6,1,-2,4,7};
        sortInterface1.sort(arry2);
        Arrays.stream(arry2).forEach(a -> System.out.print(a + "\t"));
    }
}
