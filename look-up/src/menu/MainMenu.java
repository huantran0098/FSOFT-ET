package menu;

import model.Furniture;
import service.LookUpService;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMenu {
    private final LookUpService service = new LookUpService();
    private final Scanner scanner = new Scanner(System.in);

    public MainMenu() {
    }

    public void start(){
        try {
            int choice;
            do {
                System.out.println("1. ADD something");
                System.out.println("2. Get all furniture");
                System.out.println("3. Find something by serial number");

                System.out.println("data: " + service.getData().toString());
                choice = scanner.nextInt();

                switch (choice){
                    case 1:
                        addThingsByChoice();
                        break;
                    case 2:
                        getAllFurniture();
                        break;
                    case 3:
                        findThingsBySerialNumber();
                        break;
                    case 0:
                }
            } while (choice != 0);
        } catch (InputMismatchException e){
            System.err.println("Input wrong");
            System.err.println("Try again");
        }
    }

    private void findThingsBySerialNumber() {
        scanner.nextLine();
        System.out.println("Enter Serial Number to get result:");
        String serialNumber = scanner.nextLine();
        System.out.println(service.getDetailsBySerialNumber(serialNumber));

    }

    private void getAllFurniture() {
        System.out.println("Result for all Furniture: ");
        ArrayList<Furniture> furnitures = service.getAllFurniture();
        furnitures.forEach(Furniture::display);

    }

    private void addThingsByChoice() {

        System.out.println("Enter your choice");
        int choice = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter serial number");
        String serialNumber = scanner.next();
        System.out.println("Enter title");
        String title = scanner.next();
        System.out.println("Enter description");
        String description = scanner.next();
        scanner.nextLine();
        service.addByChoice(choice, serialNumber, title, description);


    }
}
