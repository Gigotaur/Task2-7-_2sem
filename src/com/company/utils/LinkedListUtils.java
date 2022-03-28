package com.company.utils;

import com.company.SimpleLinkedList;

public class LinkedListUtils {

    public static SimpleLinkedList<Integer> intArrayToList(int[] array) {
        SimpleLinkedList<Integer> list = new SimpleLinkedList<>();
        for (int j : array) {
            list.addLast(j);
        }
        return list;
    }

    public static int[] intListToArray(SimpleLinkedList<Integer> list) throws IllegalStateException {
        int[] array = new int[list.size()];
        for (int i = 0; i < array.length; i++) {
            array[i] = list.get(i);
        }
        return array;
    }
}