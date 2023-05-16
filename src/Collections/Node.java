package Collections;
public class Node {
    int data;
    Node nextNode;
}
     class MyList {
    Node head , temp;

    public int add(int a) {
        Node b = new Node();
        b.data = a;
        if (head == null) {
            head = b;
            temp = b;
        } else {
            temp.nextNode = b;
            temp = b;
        }
        return a;
    }


    public int remove(){
        System.out.println("gfggkhjkhjfhg");
        return 0;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.nextNode;
        }

    }

    public static void main(String[] args) {
        MyList list = new MyList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.display();
    }
  }
