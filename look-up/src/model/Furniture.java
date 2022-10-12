package model;

public class Furniture extends Things {

    public Furniture(String id, String title, String description) {
        super(id, title, description);
    }

    @Override
    public String getDescription() {
        return "Furniture Description";
    }
}
