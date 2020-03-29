public class TestDrive {
    public static void main(String[] args) {
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
        /*doubleLinkedList.addFirst(1);
        doubleLinkedList.addFirst(2);
        doubleLinkedList.addFirst(3);
        doubleLinkedList.addFirst(4);
        doubleLinkedList.display();*/
        doubleLinkedList.addLast(1);
        doubleLinkedList.addLast(4);
        doubleLinkedList.addLast(3);
        doubleLinkedList.addLast(4);
        doubleLinkedList.display();
        System.out.println("............................");
//        doubleLinkedList.removeAllKey(4);
//        doubleLinkedList.addIndex(0,0);
//        doubleLinkedList.addIndex(4,0);
//        doubleLinkedList.addIndex(6,0);
//        doubleLinkedList.display();
        System.out.println(doubleLinkedList.contains(5));
    }
}
