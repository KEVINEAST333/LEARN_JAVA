public class TestDrive {
    public static void main(String[] args) {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        /*singleLinkedList.addFirst(1);
        singleLinkedList.addFirst(2);
        singleLinkedList.addFirst(3);
        singleLinkedList.addFirst(4);
        singleLinkedList.addFirst(5);*/
        singleLinkedList.addLast(1);
        singleLinkedList.addLast(2);
        singleLinkedList.addLast(2);
        singleLinkedList.addLast(2);
        singleLinkedList.addLast(1);
//        singleLinkedList.display();
//        System.out.println(singleLinkedList.size());
//        System.out.println(singleLinkedList.contains(20));
//        singleLinkedList.remove(5);
//        singleLinkedList.addIndex(4,7);
//        singleLinkedList.addIndex(5,7);
//        singleLinkedList.addIndex(0,7);
//        singleLinkedList.addIndex(0,7);
        singleLinkedList.display();
        System.out.println("................................");
        singleLinkedList.removeAllKey(2);
        singleLinkedList.display();
    }
}
