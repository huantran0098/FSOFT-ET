package model;

public class BookOnTape extends Things {

    public BookOnTape(String id, String title, String description) {
        super(id, title, description);
    }

    @Override
    public String getDescription() {
        return "Book Description";
    }
}
