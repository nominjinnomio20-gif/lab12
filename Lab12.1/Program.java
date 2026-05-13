
public class Program {
    public static void main(String[] args) {
        Library lib1 = Library.getInstance();
        Library lib2 = Library.getInstance();
        if (lib1 == lib2) {
            System.out.println("Ijil instance. Singleton pattern ajillaj baina.");
            System.out.println("Nomiin san: " + lib1.getLibraryName());
        }
        System.out.println("Niit nom: " + lib1.getTotalBooks());
        lib1.borrowBook(30);   // 100 - 30 = 70
        lib2.borrowBook(50);   // 70  - 50 = 20
        lib1.returnBook(10);   // 20  + 10 = 30
        lib2.addBook(20);      // 30  + 20 = 50


        System.out.println("bolomjit nom (lib1): " + lib1.getAvailableBooks());
        System.out.println("bolomjit nom (lib2): " + lib2.getAvailableBooks());
    }
}
