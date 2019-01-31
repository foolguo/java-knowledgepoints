/*
public class Test {
    public static void main(String[] args) {

    }

}
*/


/*
 class SingleLinkedList {
    private int size;//链表节点的个数
    private Node head;//头节点

    public SingleLinkedList(){
        size = 0;
        head = null;
    }

    //链表的每个节点类
    private class Node{
        private Object data;//每个节点的数据
        private Node next;//每个节点指向下一个节点的连接

        public Node(Object data){
            this.data = data;
        }
    }

    //在链表头添加元素
    public Object addHead(Object obj){
        Node newHead = new Node(obj);
        if(size == 0){
            head = newHead;
        }else{
            */
/*newHead.next = head;
            head = newHead;*//*

            head.next=newHead;
            newHead=head;
        }
        size++;
        return obj;
    }

    //在链表头删除元素
    public Object deleteHead(){
        Object obj = head.data;
        head = head. next;
        size--;
        return obj;
    }

    //查找指定元素，找到了返回节点Node，找不到返回null
    public Node find(Object obj){
        Node current = head;
        int tempSize = size;
        while(tempSize > 0){
            if(obj.equals(current.data)){
                return current;
            }else{
                current = current.next;
            }
            tempSize--;
        }
        return null;
    }

    //删除指定的元素，删除成功返回true
    public boolean delete(Object value){
        if(size == 0){
            return false;
        }
        Node current = head;
        Node previous = head;
        while(current.data != value){
            if(current.next == null){
                return false;
            }else{
                previous = current;
                current = current.next;
            }
        }
        //如果删除的节点是第一个节点
        if(current == head){
            head = current.next;
            size--;
        }else{//删除的节点不是第一个节点
            previous.next = current.next;
            size--;
        }
        return true;
    }

    //判断链表是否为空
    public boolean isEmpty(){
        return (size == 0);
    }

    //显示节点信息
    public void display(){
        */
/*if(size >0){
            Node node = head;
            int tempSize = size;
            if(tempSize == 1){//当前链表只有一个节点
                System.out.println("["+node.data+"]");
                return;
            }
            while(tempSize>0){
                if(node.equals(head)){
                    System.out.print("["+node.data+"->");
                }else if(node.next == null){
                    System.out.print(node.data+"]");
                }else{
                    System.out.print(node.data+"->");
                }
                node = node.next;
                tempSize--;
            }
            System.out.println();
        }else{//如果链表一个节点都没有，直接打印[]
            System.out.println("[]");
        }

    }*//*


}

public class Test{
    public static void main(String[] args) {

        SingleLinkedList singleList = new SingleLinkedList();
        singleList.addHead("A");
        singleList.addHead("B");
        singleList.addHead("C");
        singleList.addHead("D");
        //打印当前链表信息
        singleList.display();
        //删除C
        singleList.delete("C");
        */
/*singleList.display();*//*

        //查找B
        System.out.println(singleList.find("B"));
    }
}*/
class SingleLinkedList{
    private int size;
    private Node head;//头结点
    class Node{
        private Object data;
        private Node next;
        private Node(Object data){
            this.data=data;
        }
    }
    //添加节点，第一个添加的结点是尾结点
    public void add(Object obj){
        Node newNode=new Node(obj);
        if(size==0){
            head=newNode;

        }else{
            newNode.next=head;
            head=newNode;

        }
        size++;
    }
    //删除头结点
    public Object removeHead(){
        Object obj=head.data;
        head=head.next;
        size--;
        return obj;
    }
    //查找元素
    public Node find(Object obj){
       Node temp=head;
        int tempSize=size;
        while(tempSize>0){
            if(temp.data.equals(obj)){
                return head;
            }else{
                temp=temp.next;
            }
            tempSize--;
        }

        return null;
    }
    public boolean remove(Object obj){
       if(size==0){
           return false;
       }
       Node current=head;
       Node privous=head;
       while(current.data!=obj){
           if(current.next==null){
               return false;
           }else{
               privous=current;
               current=current.next;
           }
       }
       if(head==current){
           head = current.next;
           size--;
       }else{
           privous.next=current.next;
           size--;
       }
       return true;
       /* if(size == 0){
            return false;
        }
        Node current = head;
        Node previous = head;
        while(current.data != value){
            if(current.next == null){
                return false;
            }else{
                previous = current;
                current = current.next;
            }
        }
        //如果删除的节点是第一个节点
        if(current == head){
            head = current.next;
            size--;
        }else{//删除的节点不是第一个节点
            previous.next = current.next;
            size--;
        }
        return true;*/
    }
    //判断结点是否为空
    public boolean ifEmpty(){
        return size==0;
    }
    public void display(){
        Node temp=head;
        int tempSize=size;
        if(tempSize==0){
            System.out.println("链表为空");
        }
        while(tempSize>0){
            if(temp.next!=null){
                System.out.print(temp.data+"->");
                temp=temp.next;
                tempSize--;
            }else{
                System.out.print(temp.data);
                tempSize--;
            }
        }
        System.out.println();
    }
}
public class Test{
    public static void main(String[] args) {
        SingleLinkedList node=new SingleLinkedList();
        node.add(1);
        node.add(2);
        node.add("a");
        node.add(9);
        node.display();
        node.removeHead();
        node.display();
        node.remove(2);
        node.display();
        System.out.println(node.find(1));

    }
}

