public class TestDrive {
    public static void main(String[] args) {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        /*singleLinkedList.addFirst(1);
        singleLinkedList.addFirst(2);
        singleLinkedList.addFirst(3);
        singleLinkedList.addFirst(4);
        singleLinkedList.addFirst(5);*/
        singleLinkedList.addLast(2);
        singleLinkedList.addLast(2);
        singleLinkedList.addLast(4);
        singleLinkedList.addLast(4);
        singleLinkedList.addLast(5);
//        singleLinkedList.display();
//        System.out.println(singleLinkedList.size());
//        System.out.println(singleLinkedList.contains(20));
        singleLinkedList.remove(5);
        singleLinkedList.display();
    }
}
