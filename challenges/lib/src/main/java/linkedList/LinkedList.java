package linkedList;

public class  LinkedList {
    NodeII head;
    NodeII tail;


    public void insert(int value) {
        NodeII newNode = new NodeII(value);
        newNode.next = this.head;
        this.head = newNode;
        if (this.tail == null) {
            this.tail = newNode;
        }
    }

    public boolean includes(int value) {
        NodeII currentNode = this.head;
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
        NodeII currentNode = this.head;
        while (currentNode != null) {
            str += "{ " + currentNode.value + " } -> ";
            currentNode = currentNode.next;
        }
        str += "NULL";
        System.out.println("STRING RESULTS:" + str);
        return str;
    }

    public void append(int value){
        NodeII currentNode = this.head;
        while (currentNode != null){
            if(currentNode.next == null){
                NodeII newNode = new NodeII(value);
                newNode.next = null;
                currentNode.next = newNode;
                return;
            }
            currentNode = currentNode.next;
        }
    }

    public void insertBefore(int value, int newValue){
        NodeII currentNode = this.head;
        while (currentNode != null){
            if (currentNode.next.value == value){
                NodeII newNode = new NodeII(newValue);
                newNode.next = currentNode.next;
                currentNode.next = newNode;
                return;
            }
            currentNode = currentNode.next;
        }

    }

    public void insertAfter(int value, int newValue){
        NodeII currentNode = this.head;
        while (currentNode != null){
            if (currentNode.value == value){
                NodeII newNode = new NodeII(newValue);
                newNode.next = currentNode.next;
                currentNode.next = newNode;
                return;
            }
            currentNode = currentNode.next;
        }

    }
}

