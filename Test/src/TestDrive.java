public class TestDrive {
    public static void main(String[] args) {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        /*singleLinkedList.addFirst(1);
        singleLinkedList.addFirst(2);
        singleLinkedList.addFirst(3);
        singleLinkedList.addLast(1);*/
        singleLinkedList.addLast(1);
        singleLinkedList.addLast(2);
        singleLinkedList.addLast(0);
        SingleLinkedList singleLinkedList2 = new SingleLinkedList();
//        singleLinkedList2.addFirst(1);
//        singleLinkedList2.addFirst(2);
//        singleLinkedList2.addFirst(3);
//        singleLinkedList2.addFirst(4);
//        singleLinkedList2.addFirst(5);
        singleLinkedList2.addLast(1);
        singleLinkedList2.addLast(2);
        singleLinkedList2.addLast(1);
        singleLinkedList2.addLast(1);
        singleLinkedList2.addLast(2);
        singleLinkedList2.addLast(1);
//        singleLinkedList.display();
//        System.out.println(singleLinkedList.size());
//        System.out.println(singleLinkedList.contains(20));
//        singleLinkedList.remove(5);
//        singleLinkedList.addIndex(4,7);
//        singleLinkedList.addIndex(5,7);
//        singleLinkedList.addIndex(0,7);
//        singleLinkedList.addIndex(0,7);
        //singleLinkedList.display();
        System.out.println("................................");
//        singleLinkedList.removeAllKey(2);
//        singleLinkedList.clear();
//        singleLinkedList.removeAllKey(1);
//        singleLinkedList.reverseList();
//        singleLinkedList.deleteDuplication();
  //      singleLinkedList.middleNode();
//        singleLinkedList.FindKthToTail(4);
//        singleLinkedList.cycle();
//        singleLinkedList.detectCycle();
//        singleLinkedList.crossLinkedlist(singleLinkedList.head,singleLinkedList2.head);
        singleLinkedList2.display();
//        Node ret = singleLinkedList.getIntersectionNode(singleLinkedList.head,singleLinkedList2.head);
        System.out.println("................................");
        singleLinkedList.mergeList(singleLinkedList.head,singleLinkedList2.head);
        singleLinkedList.display();
        singleLinkedList.cycle();
 //       System.out.println(singleLinkedList2.chkPalindrome());
        //      System.out.println(ret.data);
        //singleLinkedList.display();
    }
}
