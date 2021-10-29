package LinkedList;

public class LinkedList<T extends Comparable<T>> {
    Node<T> head = null;

    class Node<t extends Comparable<t>> {
        t data;
        Node<t> next;

        Node(t data) {
            this.data = data;
            next = null;
        }

    }

    public void addNode(T data) {
        if (head == null) {
            head = new Node<T>(data);
            head.next = null;
        } else {
            Node<T> tempNode = head;
            Node<T> insertionNode = new Node<T>(data);

            while (tempNode != null) {
                if (tempNode.next == null) {
                    tempNode.next = insertionNode;
                    break;
                }
                tempNode = tempNode.next;
            }
        }
    }

    public T removeByValue(T data) {
        if (this.head.data == data) {
            T returnValue = this.head.data;
            this.head = this.head.next;
            return returnValue;
        } else {
            Node<T> tempNode = head;
            T returnValue = null;
            while (tempNode != null) {
                if (tempNode.next.data == data) {
                    Node<T> nextNode = tempNode.next.next;
                    returnValue = tempNode.next.data;
                    tempNode.next = null;
                    tempNode.next = nextNode;
                    break;
                }
                if (tempNode.next == null) {
                    break;
                }
                tempNode = tempNode.next;
            }

            return returnValue;
        }
    }

    public T removeIfGreater(T data) {
        if (this.head.data == data) {
            T returnValue = this.head.data;
            this.head = this.head.next;
            return returnValue;
        } else {
            Node<T> tempNode = head;
            T returnValue = null;
            while (tempNode != null) {
                if (tempNode.next.data.compareTo(data) > 0) {
                    Node<T> nextNode = tempNode.next.next;
                    returnValue = tempNode.next.data;
                    tempNode.next = null;
                    tempNode.next = nextNode;
                    break;
                }
                if (tempNode.next == null) {
                    break;
                }
                tempNode = tempNode.next;
            }

            return returnValue;
        }
    }

    public void printList() {
        Node<T> tempNode = head;

        String returnString = "";

        while (tempNode != null) {
            returnString += tempNode.data;
            returnString += " ";
            tempNode = tempNode.next;
        }

        System.out.println(returnString);
    }
}
