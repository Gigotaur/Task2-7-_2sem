package com.company;

public class DeleterFibIndex {
    public int createFibNum(int a) {
        if(a==0) {
            return 0;
        } else if(a==1) {
            return 1;
        } else if(a<0) {
            return -1;
        } else {
            return createFibNum(a-1)+createFibNum(a-2);
        }
    }

    public void deleteFibIndex(SimpleLinkedList list) {
        for(int i=list.size()-1; i>-1; i--) {
            for(int a=0; a<25; a++) { //а может быть меньше любого другого числа
                if(i==createFibNum(a)){
                    list.remove(i);
                    System.out.println(createFibNum(a));
                }
            }
        }
    }

}
