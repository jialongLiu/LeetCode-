import java.util.Scanner;

public class LeetCode {
    public static void main(String[] args) {
        LeetCode demo = new LeetCode();
        ListNode head = new ListNode(0);
        Scanner numscan = new Scanner(System.in);
        System.out.println("请输入链表长度：");
        int num = numscan.nextInt();
        head = demo.input(head,num);
        head = demo.deleteNode(head,2);
        demo.print(head);
        numscan.close();
    }
    void print(ListNode head){
        System.out.println("链表数据为：");
        while(head.next != null){
            System.out.println(head.val);
            head=head.next;
        }
    }
    ListNode input(ListNode head, int num){
        System.out.println("请输入链表数据：");
        Scanner scanner = new Scanner(System.in);
        ListNode realhead = head;
        for (int i =0;i<num;i++){
            int b= scanner.nextInt();
            head.val = b;
            head.next = new ListNode(0);
            head=head.next;
        }
        scanner.close();
        return realhead;
    }
    public ListNode deleteNode(ListNode head, int val) {
        if(head.val==val) return head.next;
        ListNode realhead = head;
        while(true){ 
            if (head.next ==null)break;
            if(head.next.val==val){
                head.next = head.next.next;
                return realhead;
            }
            head=head.next;
        }
        return realhead;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x){val = x;}
}