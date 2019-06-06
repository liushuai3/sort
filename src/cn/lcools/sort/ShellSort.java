package cn.lcools.sort;

/**
 * Created by liushuai3 on 2019/6/6.
 * 希尔排序
 * 1959年Shell发明，第一个突破O(n2)的排序算法，是简单插入排序的改进版。
 * 它与插入排序的不同之处在于，它会优先比较距离较远的元素。希尔排序又叫缩小增量排序。
 * 算法描述
 * 先将整个待排序的记录序列分割成为若干子序列分别进行直接插入排序，具体算法描述：
 * •选择一个增量序列t1，t2，…，tk，其中ti>tj，tk=1；
 * •按增量序列个数k，对序列进行k 趟排序；
 * •每趟排序，根据对应的增量ti，将待排序列分割成若干长度为m 的子序列，分别对各子表进行直接插入排序。
 * 仅增量因子为1 时，整个序列作为一个表来处理，表长度即为整个序列的长度
 *
 */
public class ShellSort<T extends Comparable> implements SortInterface<T>{
    @Override
    public void sort(T[] array) throws Exception {
        for(int gap = array.length/2 ; gap>0 ; gap=gap/2){
            for(int i=gap ; i<array.length ; i++){
                int preIndex = i-gap;
                T current = array[i];
                while (preIndex>=0 && current.compareTo(array[preIndex])<0){
                    array[preIndex+gap] = array[preIndex];
                    preIndex = preIndex-gap;
                }
                array[preIndex+gap] = current;
            }
        }
    }
}
