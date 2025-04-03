package korona.bk.homework.task3;

public class ListNode {
    private final Integer val;
    public ListNode nextListNode;

    public ListNode() {
        this.val = null;
        this.nextListNode = null;
    }

    public ListNode(Integer val) {
        this.val = val;
        this.nextListNode = null;
    }

    public ListNode(Integer val, ListNode nextListNode) {
        this.val = val;
        this.nextListNode = nextListNode;
    }

    public ListNode last() {
        ListNode currentListNode = this;
        while (currentListNode.nextListNode != null) {
            currentListNode = currentListNode.next();
        }
        return currentListNode;
    }

    public void append(ListNode listNode) {
        last().nextListNode = listNode;
    }

    public ListNode next() {
        return nextListNode;
    }

    @Override
    public String toString() {
        ListNode currentListNode = this;
        StringBuilder result = new StringBuilder();
        while (currentListNode != null) {
            result.append(currentListNode.val).append(",");
            currentListNode = currentListNode.next();
        }
        return result.deleteCharAt(result.length() - 1).toString();
    }

    public ListNode appendForward(ListNode head, Integer val) {
        return new ListNode(val, head);
    }

    public ListNode reverseCopy() {
        ListNode currentListNode = this;
        ListNode newListNode = null;
        while (currentListNode != null) {
            newListNode = appendForward(newListNode, currentListNode.val);
            currentListNode = currentListNode.next();
        }
        return newListNode;
    }
}
