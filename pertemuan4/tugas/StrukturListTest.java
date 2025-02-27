package tugas;
public class StrukturListTest {
       public static void main(String[] args) {
       
       //tugas a
       StrukturList list1 = new StrukturList();
       list1.addTail(4.5);
       list1.addMid(3.4, 1);
       list1.addHead(2.1);
       System.out.print("Elemen (Tugas a output): ");
       list1.displayElement();

       //tugas b
       StrukturList list2 = new StrukturList();
       list2.addTail(4.5);
       list2.addTail(5.5);
       list2.addMid(1.1,1);
       list2.addMid(2.1,1);
       list2.addHead(3.4);
       System.out.print("Elemen (Tugas b output): ");
       list2.displayElement();       
       }
}