
class Node {
    int data;
    Node next;
    public Node(int data){
        this.data = data;
    }
}

public class LinkedList {
    Node head;
    public boolean isEmpty(){
        return  head == null;
    }
    public void add(int data){
        Node newNode = new Node(data);
        if(isEmpty()){
            head = newNode;
        }
        else {
            Node temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    public void display(){
        if(isEmpty()){
            System.out.println("LIST IS EMPTY");
        }
        else {
            Node temp = head;
            while(temp.next!=null){
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.print(temp.data);
            System.out.println();
        }
    }
    public void delete(int data){
        Node temp = head;
        if(isEmpty()) System.out.println("List is empty");

        else if(head.data == data){
            head = head.next;
        }
        else {
            while (temp.next.data != data){
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }

    }
    public static void main(String[] args) {
        LinkedList obj = new LinkedList();
        System.out.println("IS my linked list empty? " + obj.isEmpty());
        for(int i=0;i<10;i++){
            obj.add(i+1);
        }
        obj.display();
        System.out.println("Is my linked list empty? " + obj.isEmpty());
        obj.delete(7);
        obj.display();
        obj.delete(1);
        obj.display();

    }
}
