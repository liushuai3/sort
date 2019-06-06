package cn.lcools.sort;

import java.util.Arrays;

/**
 * Created by liushuai3 on 2019/6/6.
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
