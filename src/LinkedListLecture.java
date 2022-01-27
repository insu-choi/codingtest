public class LinkedListLecture {
    public static void main(String[] args) {
        CustomLinkedList<Integer> customLinkedList = new CustomLinkedList<>();
        customLinkedList.add(1);
        customLinkedList.add(2);
        customLinkedList.add(3);
        customLinkedList.add(4);
        customLinkedList.add(5);
        customLinkedList.printAll();
        customLinkedList.delItem(3);
        customLinkedList.printAll();
        customLinkedList.addItemAfterData(7, 4);
        customLinkedList.printAll();
    }
}
