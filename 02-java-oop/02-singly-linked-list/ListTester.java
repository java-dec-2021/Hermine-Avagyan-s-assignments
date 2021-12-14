public class ListTester {
    public static void main(String[] args) {
SinglyLinkedList sll = new SinglyLinkedList();
        sll.add(200);
        sll.add(300);
        sll.add(500);
        sll.add(400);
        sll.add(100);
        sll.add(700);
        sll.add(800);
        //sll.printValues();
        System.out.println(" Printing th found value" + sll.find(300));
         sll.removeAt(3);
       System.out.println();
       sll.printValues();

    }
}
