import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1 = l1.next;
        l1.next = new ListNode(3);
        l1 = l1.next;
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2 = l2.next;
        l2.next = new ListNode(4);
        l2 = l2.next;


        System.out.println(AddTwoNumbers.addTwoNumbers(l1, l2));

    }
}
