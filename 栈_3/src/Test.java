/*有序链表*/
class OrderLinkedList{
    private Node head;
    class Node{
        private int data;
        private Node next;
        public Node(int data){
            this.data=data;
        }
    }
    //插入数据
    public void addHead(int data){
        Node node=new Node(data);
        Node pre=null;
        Node current=head;
        while(current!=null&&data>head.data){
            pre=current;
            current=current.next;
        }
        if(pre==null){
            head=node;
            head.next=current;
        }else{
            pre.next=node;
            node.next=current;
        }
    }
}
public class Test {
    public static void main(String[] args) {

    }
}
