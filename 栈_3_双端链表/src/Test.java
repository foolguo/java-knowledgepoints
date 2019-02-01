
class DoublePointLinkedList{
    private int size;
    private Node head;
    private Node tail;
    class Node{
        private Object data;
        private Node next;
        public Node(Object obj){
            this.data=obj;
        }
    }
    //添加头结点
    public void addHead(Object obj) {
        Node newNode = new Node(obj);
        if (size == 0) {
            head = newNode;
            tail = newNode;
            size++;
        } else {
            newNode.next = head;
            head = newNode;
            size++;
        }
    }
    //添加尾结点
    public void addTail(Object obj){
        Node newNode = new Node(obj);
        if(size==0){
            head=newNode;
            tail=newNode;
            size++;
        }else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }
    //删除头结点
    public boolean removeHead(){
        if(size==0){
            return false;
        }
        head=head.next;
        size--;
        return true;
    }
    //删除结点
    public Object remove(Object obj){
        if(size==0){
            return false;
        }
        Node current=head;
        Node privous=head;
        while(current.data!=obj){
            if(current==null){
                return false;
            }else{
                privous=current;
                current=current.next;
            }
        }
        privous.next=current.next;
        size--;
        return true;
    }
    //寻找指定结点
    public Node find(Object obj){
        int tempSize=size;
        Node temp=head;
        while(tempSize>0){
            if(temp.data.equals(obj)){
                return temp;
            }else{
                temp=temp.next;
            }
        }
        return null;
    }
    //打印信息
    public void display(){
        if(size==0){
            System.out.println("[]");
        }
        int tempSize=size;
        Node temp=head;
        while (tempSize>0) {
            if (temp.next != null) {
                System.out.print(temp.data+"->");
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
        DoublePointLinkedList node=new DoublePointLinkedList();
        node.addHead(1);
        node.addHead(2);
       node.addTail("abc");
       node.addHead("1n3");
        node.display();
        node.removeHead();
        node.display();
        node.remove(1);
        node.display();
    }
}
