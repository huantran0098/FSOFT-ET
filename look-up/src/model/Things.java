package model;

public abstract class Things {
    private String serialNumber;
    private String title;
    private String description;

    public Things(String id, String title, String description) {
        this.serialNumber = id;
        this.title = title;
        this.description = description;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public abstract String getDescription();

    public void setDescription(String description) {
        this.description = description;
    }


    public void display() {
        System.out.println("INFORMATION: ");;
        System.out.printf("%-15S%-15d", "Serial Number: ", serialNumber);
        System.out.printf("%-15S%-15s", "Title: ", title);
        System.out.printf("%-15S%-15d\n", "Description: ", description);

    }
}
