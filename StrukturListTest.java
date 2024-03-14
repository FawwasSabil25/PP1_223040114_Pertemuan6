package Pertemuan6;

public class StrukturListTest {
    public static void main(String[] args) {
        StrukturList myList = new StrukturList();

        myList.addTail(5);
        myList.addTail(4);
        myList.addTail(6);

        myList.displayElement();
        System.out.println("\n" + myList.find(6));
    }
}
