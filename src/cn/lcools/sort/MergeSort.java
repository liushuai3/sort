package cn.lcools.sort;

import java.util.Arrays;

/**
 * Created by liushuai3 on 2019/6/6.
 * 归并排序
 * 归并排序是建立在归并操作上的一种有效的排序算法。该算法是采用分治法（Divide and Conquer）的一个非常典型的应用。
 * 将已有序的子序列合并，得到完全有序的序列；即先使每个子序列有序，再使子序列段间有序。
 * 若将两个有序表合并成一个有序表，称为2-路归并。
 *
 * 算法描述
 * •把长度为n的输入序列分成两个长度为n/2的子序列；
 * •对这两个子序列分别采用归并排序；
 * •将两个排序好的子序列合并成一个最终的排序序列。
 *
 * 算法分析
 * 归并排序是一种稳定的排序方法。和选择排序一样，归并排序的性能不受输入数据的影响，
 * 但表现比选择排序好的多，因为始终都是O(nlogn）的时间复杂度。代价是需要额外的内存空间。
 */
public class MergeSort{

    public Integer[] sort(Integer[] array) throws Exception {
        return mergeSort(array);
    }

    private Integer[] mergeSort(Integer[] array){
        if(array.length<2){
            return array;
        }
        int middle = array.length/2;
        Integer[] left = Arrays.copyOfRange(array,0,middle);
        Integer[] right = Arrays.copyOfRange(array,middle,array.length);
        return merge(mergeSort(left),mergeSort(right));
    }
    private Integer[] merge(Integer[] left,Integer[] right){
        Integer[] resultList = new Integer[left.length+right.length];
        for(int index=0,i=0,j=0 ; index<resultList.length ; index++){
            if(i>=left.length){
                resultList[index]=right[j++];
            }else if(j>=right.length){
                resultList[index]=left[i++];
            }else if(left[i].compareTo(right[j])>0){
                resultList[index]=right[j++];
            }else {
                resultList[index]=left[i++];
            }
        }
        return resultList;
    }

}
