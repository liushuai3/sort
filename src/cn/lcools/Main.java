package cn.lcools;

import cn.lcools.sort.BubbleSort;
import cn.lcools.sort.InsertionSort;
import cn.lcools.sort.MergeSort;
import cn.lcools.sort.QuickSort;
import cn.lcools.sort.SelectionSort;
import cn.lcools.sort.ShellSort;
import cn.lcools.sort.SortInterface;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception{
        System.out.println();
        System.out.println("------------------------BubbleSort-----------------------------");
        SortInterface<Integer> sortInterface = new BubbleSort<>();
        Integer[] arry = {3,6,1,-2,4,7};
        sortInterface.sort(arry);
        Arrays.stream(arry).forEach(a -> System.out.print(a + "\t"));
        System.out.println();
        System.out.println("------------------------SelectionSort-----------------------------");
        SortInterface<Integer> sortInterface1 = new SelectionSort<>();
        Integer[] arry1 = {3,6,1,-2,4,7};
        sortInterface1.sort(arry1);
        Arrays.stream(arry1).forEach(a -> System.out.print(a + "\t"));
        System.out.println();
        System.out.println("------------------------InsertionSort-----------------------------");
        SortInterface<Integer> sortInterface2 = new InsertionSort<>();
        Integer[] arry2 = {3,6,1,-2,4,7};
        sortInterface2.sort(arry2);
        Arrays.stream(arry2).forEach(a -> System.out.print(a + "\t"));
        System.out.println();
        System.out.println("------------------------ShellSort-----------------------------");
        SortInterface<Integer> sortInterface3 = new ShellSort<>();
        Integer[] arry3 = {3,6,1,-2,4,7};
        sortInterface3.sort(arry3);
        Arrays.stream(arry3).forEach(a -> System.out.print(a + "\t"));
        System.out.println();
        System.out.println("-------------------------QuickSort----------------------------");
        SortInterface<Integer> sortInterface4= new QuickSort<>();
        Integer[] arry4 = {3,6,1,-2,4,7};
        sortInterface4.sort(arry4);
        Arrays.stream(arry4).forEach(a -> System.out.print(a + "\t"));
        System.out.println();
        System.out.println("-------------------------MergeSort----------------------------");
        MergeSort sortInterface5= new MergeSort();
        Integer[] arry5 = {3,6,1,-2,4,7};
        arry5 = sortInterface5.sort(arry5);
        Arrays.stream(arry5).forEach(a -> System.out.print(a + "\t"));
    }
}
