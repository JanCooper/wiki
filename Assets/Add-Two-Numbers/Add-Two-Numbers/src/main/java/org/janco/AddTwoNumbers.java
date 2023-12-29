package org.janco;

import java.util.*;
public class AddTwoNumbers {
    public static LinkedList<Integer> AddTwo(LinkedList<Integer> inputList1, LinkedList<Integer> inputList2) {
        LinkedList<Integer> output = new LinkedList<>();

        Iterator input1Iterator = inputList1.descendingIterator();
        Iterator input2Iterator = inputList2.descendingIterator();
        int list1Total = 0;
        int list2Total = 0;

        while (input1Iterator.hasNext()) {
            for (Integer i : inputList1) {
                list1Total = 10 * list1Total + i;
                input1Iterator.next();
            }
        }
        while (input2Iterator.hasNext()) {
            for (Integer i : inputList2) {
                list2Total = 10 * list2Total + i;
                input2Iterator.next();
            }
        }
        int total = list1Total + list2Total;

        while (total > 0) {
            output.add(total % 10);
            total = total / 10;
        }
        return output;
    }
}