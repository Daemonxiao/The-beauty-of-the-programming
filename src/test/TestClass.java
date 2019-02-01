package test;


import main.ListNode;

import main.Solution;
import org.junit.Test;

import java.util.HashSet;

public class TestClass {
    @Test
    public void test1(){
        ListNode head = new ListNode(1);
        ListNode current = head;
        for (int i = 2; i <= 5; i++) {
            ListNode next = new ListNode(i);
            current.next = next;
            current = next;
            System.out.println(current.val);
        }
        while (head.next != null) {
            System.out.print(head.val);
            head = head.next;
            System.out.println(head.val);
            System.out.println(current.val);
        }

        ListNode head2 = Solution.reverseList(head);
        if (head2.next != null) {
            System.out.println(head.val);
            head2  = head2.next;
        }
    }

    @Test
    public void test2() {
        Solution ss = new Solution();
        int num =1;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(num++ +" ");
            }
            System.out.println();
        }
        int[][] gm = ss.generateMatrix(4);

        for (int i = 0; i < gm.length; i++) {
            for (int j = 0; j < gm.length; j++) {
                System.out.print(gm[i][j]+" ");
            }
            System.out.println();
        }
    }

}
