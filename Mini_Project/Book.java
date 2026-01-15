public class Book {
    private int id;
    private String title;
    private boolean isAvailable;

    // Constructor
    public Book(int id, String title) {
        this.id = id;
        this.title = title;
        this.isAvailable = true; // New books are available by default
    }

    // Getters
    public int getId() { return id; }
    public String getTitle() { return title; }
    public boolean isAvailable() { return isAvailable; }

    // Method to change status
    public void setAvailable(boolean status) {
        this.isAvailable = status;
    }

    @Override
    public String toString() {
        String status = isAvailable ? "[Available]" : "[Checked Out]";
        return id + ": " + title + " " + status;
    }
}