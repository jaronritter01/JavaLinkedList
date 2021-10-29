import LinkedList.LinkedList;

public class linkedListTest {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.addNode(2);
        list.addNode(3);
        list.addNode(6);
        list.addNode(4);
        list.printList();

        Integer newInt = new Integer("3");
        list.removeIfGreater(newInt);
        list.printList();
    }
}
