
public class Library {
    public static Library single_instance = null;
    private String libraryName;
    private int totalBooks;
    private int availableBooks;
    private Library() {
        libraryName = "UB Library";
        totalBooks = 100;
        availableBooks = 100;
    }
    public static Library getInstance() {
        if (single_instance == null) {
            single_instance = new Library();
        }
        return single_instance;
    }
    // Ном нэмэх
    public void addBook(int amount) {
        totalBooks += amount;
        availableBooks += amount;
        System.out.println(amount + "nom nemegdlee.");
    }
    // Ном зээлэх
    public void borrowBook(int amount) {
        if (amount <= availableBooks) {
            availableBooks -= amount;
            System.out.println(amount + " nom zeelegdlee.");
        } else {
            System.out.println("Hureltsengui baina. Bolomjit nom: " + availableBooks);
        }
    }
    // Ном буцаах
    public void returnBook(int amount) {
        availableBooks += amount;
        System.out.println(amount + " nom bucaagdlaa.");
    }
    public int getAvailableBooks() { return availableBooks; }
    public int getTotalBooks()     { return totalBooks; }
    public String getLibraryName() { return libraryName; }
}
