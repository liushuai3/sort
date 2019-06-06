package cn.lcools.sort;

/**
 * Created by liushuai3 on 2019/6/5.
 */
public interface SortInterface<T extends Comparable> {
    void sort(T[] array) throws Exception;
}
