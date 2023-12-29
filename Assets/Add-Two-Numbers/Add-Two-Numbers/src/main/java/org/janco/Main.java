package org.janco;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>(Arrays.asList(2,4,3));
        LinkedList<Integer> list2 = new LinkedList<>(Arrays.asList(5,6,4));
        LinkedList<Integer> list3 = new LinkedList<>(Arrays.asList(0,0));
        LinkedList<Integer> list4 = new LinkedList<>(Arrays.asList(0,0));
        LinkedList<Integer> list5 = new LinkedList<>(Arrays.asList(9,9,9,9,9,9,9));
        LinkedList<Integer> list6 = new LinkedList<>(Arrays.asList(9,9,9,9));

        System.out.println("list1 = " + list1);
        System.out.println("list2 = " + list2);
        System.out.println("list3 = " + list3);
        System.out.println("list4 = " + list4);
        System.out.println("list5 = " + list5);
        System.out.println("list6 = " + list6);

        LinkedList<Integer> sameSizeArray = AddTwoNumbers.AddTwo(list1, list2);
        LinkedList<Integer> zeroArrays = AddTwoNumbers.AddTwo(list3, list4);
        LinkedList<Integer> differentSizeArrays = AddTwoNumbers.AddTwo(list5, list6);

        System.out.println("sameSizeArray = " + sameSizeArray);
        System.out.println("zeroArrays = " + zeroArrays);
        System.out.println("differentSizeArrays = " + differentSizeArrays);
    }
}