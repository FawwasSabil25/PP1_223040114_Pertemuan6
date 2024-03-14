package Pertemuan6;

public class StrukturListTest2 {
    public static void main(String[] args) {
        StrukturList myList = new StrukturList();

        myList.addTail(7);
        myList.addTail(6);
        myList.addTail(4);
        myList.addTail(2);
        myList.addTail(3);

        myList.displayElement();
        System.out.println("\n" + myList.size());
    }
}
