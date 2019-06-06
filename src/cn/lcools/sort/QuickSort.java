package cn.lcools.sort;

/**
 * Created by liushuai3 on 2019/6/6.
 */
public class QuickSort<T extends Comparable> implements SortInterface<T>{
    @Override
    public void sort(T[] array) throws Exception {
        quickSort(array,0,array.length);
    }
    private void quickSort(T[] array,int left,int right){
        if(left<right){
            //分区操作，将数据划分为3份(小-中-大)，partitionIndex为中间位置的索引。
            int partitionIndex = partition(array, left, right);
            quickSort(array,left,partitionIndex-1);
            quickSort(array,partitionIndex+1,right);
        }
    }
    /**
     * 分区操作，将数据划分为3份(小-中-大)
     *
    */
    private int partition(T[] array,int left,int right){
        int pivot = left; //设定基准值pivot
        int index = pivot+1;
        for(int i = index ; i<right ; i++){
            if (array[pivot].compareTo(array[i])>0){
                swap(array,i,index);
                index++;
            }
        }
        swap(array, pivot, index - 1);
        return index - 1;
    }

    /**
     * 交换数组元素
     * */
    private void swap(T[] array,int i,int j){
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
