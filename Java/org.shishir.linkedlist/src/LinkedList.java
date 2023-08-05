public class LinkedList {
    Node head;
    Integer length = 0;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", next=" + next +
                    '}';
        }
    }

    public void insertElement(int data) {
        if (this.head == null) {
            this.head = new Node(data);
        } else {
            Node currNode = this.head;
            while (currNode.next != null) {
                if(currNode.data == data){
                    throw new Error("Duplicate Element found.");
                }
                currNode = currNode.next;
            }
            currNode.next = new Node(data);
        }
        length++;
    }

    public void insertElement(int data, int index) {
        if(this.length+1 < index) throw new Error("Index out of bound error.");
        if (this.head == null) {
            if(index == 0) this.head = new Node(data);
            else throw new Error("List is empty, cannot insert element at given index.");
        }
        else {
            Node currNode = this.head;
            Node previousNode = null;
            int currIndex = 0;
            while (currNode.next != null) {
                if(currNode.data != data){
                    throw new Error("Duplicate Element found.");
                }
                Node newNode = new Node(data);
                if(index == 0) {
                    newNode.next = this.head;
                    this.head = newNode;
                } else {
                    if(index == currIndex) {
                        newNode.next = previousNode.next;
                        previousNode.next = newNode;
                    }
                }
                previousNode = currNode;
                currNode = currNode.next;
                currIndex++;
            }
            currNode.next = new Node(data);
        }
        length++;
    }

    public String removeElement(int data) {
        Node currNode = this.head;
        Node previousNode = null;
        while(currNode.next != null){
            if(currNode.data == data) {
                if(previousNode == null) this.head = this.head.next;
                else {
                    previousNode.next = currNode.next;
                }
                return "Node has been deleted with data : " + Integer.toString(data);
            } else {
                previousNode = currNode;
                currNode = currNode.next;
            }
        }
        return "No Node found with data : "+Integer.toString(data);
    }

    public Integer findElement(int data) {
        Integer index = 0;
        Node currNode = this.head;
        while(currNode.next != null) {
            if(currNode.data == data) return index;
            else index++;
            currNode = currNode.next;
        }
        return -1;
    }
}


