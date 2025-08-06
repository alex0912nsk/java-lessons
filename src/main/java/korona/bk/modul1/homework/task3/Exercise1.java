package korona.bk.modul1.homework.task3;

public class Exercise1 {

    public static void main(String[] args) {
        ListNode head = new ListNode(5);
        head.append(new ListNode(3));
        head.append(new ListNode(8));
        head.append(new ListNode(10));
        head.append(new ListNode(4));
        System.out.println("основной список: " + head);
        ListNode reverse = head.reverseCopy();
        System.out.println("перевернутый список: " + reverse);
    }
}
