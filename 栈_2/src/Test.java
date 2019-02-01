/*单向链表*
结构：有一个结点类（内部类）
成员内部类包括：Object
和类本身的对象引用；

功能：1.添加头结点
2.删除头结点；
3.删除任意结点；
4.查找结点；
5.访问头元素


 *//*

class SingleLinkedList{
    private int size;
    private Node head;
    class Node{
        private Object data;
        private Node next;
        public Node(Object data){
            this.data=data;
        }
    }
    //添加头结点
    public void addHead(Object obj){
        Node newHead=new Node(obj);
        if (size == 0) {
            head=newHead;
            size++;
        }else{
            newHead.next=head;
            head=newHead;
            size++;
        }
    }
    //删除头结点
    public Object removeHead(){
        Object obj=head.data;
        head=head.next;
        size--;
        return obj;
    }
    //删除结点
    public boolean remove(Object obj){
        if(size==0){
            return  false;
        }
        Node current=head;
        Node privious=head;
        while(current.data!=obj){
            if(current.data==null){
                return  false;
            } else {
                privious=current;
                current=current.next;
            }
        }
        if(current==head){
            head=head.next;
            size--;
        }else{
            privious.next=current.next;
            size--;
        }
        return true;
    }
    //差找结点
    public Node find(Object obj){
        int tempSize=size;
        Node temp=head;
        while (tempSize>0){
            if(temp.data.equals(obj)){
                return temp;
            }else{
                temp=temp.next;
                tempSize--;
            }
        }
        return null;
    }
    //访问头结点
    public Object peek(){
        return head.data;
    }
    //链表判空
    public boolean ifEmpty(){
        return size==0;
    }
    public void display(){
        int tempSize=size;
        Node temp=head;
        while(tempSize>0){
            if(temp.next!=null) {
                System.out.print(temp.data + "->");
            }else{
                System.out.print(temp.data);
            }
            temp=temp.next;
            tempSize--;

        }
        System.out.println();
    }
}
public class Test {
    public static void main(String[] args) {
        SingleLinkedList node=new SingleLinkedList();
        node.addHead(1);
        node.addHead(2);
        node.addHead(3);
        node.addHead("abc");
        node.display();
        node.removeHead();
        node.display();
        node.remove(2);
        node.display();
    }
}*/
/*

