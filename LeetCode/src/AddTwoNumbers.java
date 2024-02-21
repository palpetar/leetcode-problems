import java.lang.Math;

public class AddTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2){


        int num1 = 0, num2 = 0;
        int i = 0;
        while(l1 != null){

            num1 += l1.val * Math.pow(10, i);
            l1 = l1.next;
            i++;

        }

        i = 0;

        while(l2 != null){
            num2 += l2.val * Math.pow(10, i);
            l2 = l2.next;
            i++;
        }

        int sum = num1 + num2;
        ListNode l3 = new ListNode(sum % 10);
        while(sum > 0){
            sum /= 10;
            l3.next = new ListNode(sum % 10);
            l3 = l3.next;
        }
        return l3;
    }
}


