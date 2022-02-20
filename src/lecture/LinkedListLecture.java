package lecture;

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
        System.out.println("----------------------------------------------");
        CustomDoubleLinkedList<Integer> customDoubleLinkedList = new CustomDoubleLinkedList<Integer>();
        customDoubleLinkedList.add(1);
        customDoubleLinkedList.add(2);
        customDoubleLinkedList.add(3);
        customDoubleLinkedList.add(4);
        customDoubleLinkedList.add(5);
        customDoubleLinkedList.printAll();
        System.out.println("----------------------------------------------");
        customDoubleLinkedList.addItemAfterData(6, 2);
        customDoubleLinkedList.printAll();
        System.out.println("----------------------------------------------");
        customDoubleLinkedList.addItemAfterData(7, 4);
        customDoubleLinkedList.printAll();
    }
}
