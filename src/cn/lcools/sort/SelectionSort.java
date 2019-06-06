package cn.lcools.sort;

/**
 * Created by liushuai3 on 2019/6/5.
 * 选择排序
 * 选择排序(Selection-sort)是一种简单直观的排序算法。它的工作原理：首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置，
 * 然后，再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾。以此类推，直到所有元素均排序完毕。
 *
 */
public class SelectionSort<T extends Comparable> implements SortInterface<T> {
    @Override
    public void sort(T[] array) throws Exception {
        for(int i =0 ; i<array.length-1 ; i++){
            int minIndex = i;
            for(int j=i+1; j<array.length ; j++){
                if(array[minIndex].compareTo(array[j])>0){
                    minIndex = j;
                }
            }
            T temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }
}
