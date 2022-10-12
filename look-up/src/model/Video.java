package model;

public class Video extends Things {

    public Video(String id, String title, String description) {
        super(id, title, description);
    }

    @Override
    public String getDescription() {
        return "Video Description";
    }
}
