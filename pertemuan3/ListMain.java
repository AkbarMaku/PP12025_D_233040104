package pertemuan3;

public class ListMain {
    public static void main(String[] args) {

        // latihan4
        StrukturList lat4 = new StrukturList();
        lat4.addTail(3);
        lat4.addTail(4);
        lat4.addTail(5);
        System.out.print("Elemen (Latihan-4 output): ");
        lat4.displayElement();

        // tes1-a
        StrukturList tes1a = new StrukturList();
        tes1a.addTail(3);
        tes1a.addTail(2);
        tes1a.addTail(1);
        System.out.print("Elemen (tes1-a output): ");
        tes1a.displayElement();

        // tes1-b
        StrukturList tes1b = new StrukturList();
        tes1b.addTail(1);
        tes1b.addTail(4);
        tes1b.addTail(5);
        tes1b.addTail(7);
        System.out.print("Elemen (tes1-b output): ");
        tes1b.displayElement();

        // tes2
        StrukturList tes2 = new StrukturList();
        tes2.addHead(5);
        tes2.addHead(4);
        tes2.addHead(3);
        System.out.print("Elemen (tes2 output): ");
        tes2.displayElement();

        // tes3-a
        StrukturList tes3a = new StrukturList();
        tes3a.addHead(1);
        tes3a.addHead(2);
        tes3a.addHead(3);
        System.out.print("Elemen (tes3-a output): ");
        tes3a.displayElement();

        // tes3-b
        StrukturList tes3b = new StrukturList();
        tes3b.addHead(1);
        tes3b.addHead(2);
        tes3b.addHead(3);
        System.out.print("Elemen (tes3-b output): ");
        tes3b.displayElement();
    }
}