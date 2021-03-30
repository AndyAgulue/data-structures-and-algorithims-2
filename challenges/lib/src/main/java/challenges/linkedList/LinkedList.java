package challenges.linkedList;

class Node {
    int value;
    Node next;

    public Node(int value){
        this.value = value;
        this.next = next;
    }
}

public class  LinkedList {
    Node head;
    Node tail;


    public void insert(int value) {
        Node newNode = new Node(value);
        newNode.next = this.head;
        this.head = newNode;
        if (this.tail == null) {
            this.tail = newNode;
        }
    }

    public boolean includes(int value) {
        Node currentNode = this.head;
        while (currentNode != null) {
            if (currentNode.value == value) {
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }

    public String toString() {
        String str = "";
        Node currentNode = this.head;
        while (currentNode != null) {
            str += "{ " + currentNode.value + "} ->";
            currentNode = currentNode.next;
        }
        str += "NULL";
        System.out.println("STRING RESULTS: " + str);
        return str;
    }

    public void append(int value){
        Node currentNode = this.head;
        while (currentNode != null){
            if(currentNode.next == null){
                Node newNode = new Node(value);
                newNode.next = null;
                currentNode.next = newNode;
                return;
            }
            currentNode = currentNode.next;
        }
    }

    public void insertBefore(int value, int newValue){
        Node currentNode = this.head;
        while (currentNode != null){
            if (currentNode.next.value == value){
                Node newNode = new Node(newValue);
                newNode.next = currentNode.next;
                currentNode.next = newNode;
                return;
            }
            currentNode = currentNode.next;
        }

    }

    public void insertAfter(int value, int newValue){
        Node currentNode = this.head;
        while (currentNode != null){
            if (currentNode.value == value){
                Node newNode = new Node(newValue);
                newNode.next = currentNode.next;
                currentNode.next = newNode;
                return;
            }
            currentNode = currentNode.next;
        }

    }
}

