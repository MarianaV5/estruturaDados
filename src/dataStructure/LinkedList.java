package dataStructure;

public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
        }
    }

    public LinkedList(String data){
        length = 1;
        Node newNode = new Node(data);
        head = newNode;
        tail = newNode;
    }

    public void getHead(){
        if(this.head == null){
            System.out.println("lista vazia");
        }else{
            System.out.println("HEAD: "+head.data);
        }
    }
    public void getTail(){
        if(this.tail == null){
            System.out.println("lista vazia");
        }else{
            System.out.println("TAIL: "+tail.data);
        }
    }

    public void getLength(){
        System.out.println("tamanho da lista "+this.length);
    }

    public void makeEmpty(){
        head=null;
        tail=null;
        length=0;
    }
    public void print(){
        System.out.println("######################");
        Node temp = this.head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println("######################");
    }

    public void append(String data){
        Node newNode = new Node(data);
        if(length == 0){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
    }

    public Node removeLast(){
        if(length == 0) return null;
        Node pre = head;
        Node temp = null;

        while(pre.next != tail){
            pre = pre.next;
        }

        temp = tail;
        tail = pre;
        tail.next = null;

        length--;
         if(length == 0){
             head = null;
             tail = null;
         }
         return temp;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList("elemento 1");
        list.append("elemento 2");
        list.append("elemento 3");
        System.out.println(list.removeLast().data);
        list.print();
        list.getHead();
        list.getTail();
        list.getLength();
        list.print();
    }
}
