package Pertemuan6;

public class StrukturListTest3 {
    public static void main(String[] args) {
        StrukturList myList = new StrukturList();

        myList.addTail(4);
        myList.addTail(3);
        myList.addTail(7);
        myList.addTail(8);
        myList.addTail(1);
        myList.addTail(9);

        myList.displayElement();
        myList.removeAll();
        myList.displayElement();
        
    }
}
