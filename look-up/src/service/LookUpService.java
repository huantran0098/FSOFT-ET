package service;

import ioFile.IOFile;
import model.BookOnTape;
import model.Furniture;
import model.Things;
import model.Video;
import source.PathProperties;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class LookUpService {
    private ArrayList<Things> data = new ArrayList<>() ;
    private ArrayList<Video> videos = new ArrayList<>();
    private ArrayList<Furniture> furnitures = new ArrayList<>();
    private ArrayList<BookOnTape> book = new ArrayList<>();
    private final Scanner scanner = new Scanner(System.in);
    private final IOFile<Things>  ioFile = new IOFile<>();
    private final IOFile<Furniture>  ioFileFurniture = new IOFile<>();


    public LookUpService() {
    }

    public void writeToFile(ArrayList<Things> data){
        ioFile.writerFileData(data, PathProperties.PATH_FILE);
    }

    public ArrayList<Things> readFromFile(){
        try {
            if (new File(PathProperties.PATH_FILE).length() == 0){
                data = new ArrayList<>();
            } else {
                data = ioFile.readFileData(PathProperties.PATH_FILE);
            }
        } catch (NullPointerException e){
            System.err.println("File is null");
        }

        return data;
    }

    public ArrayList<Things> getData(){
        return data;
    }

    public void addByChoice(int choice, String serialNumber, String title, String description){
        if (choice == 1){
            addVideo(serialNumber, title, description);
        } else if (choice == 2){
            addBook(serialNumber, title, description);
        } else if (choice == 3){
            addFurniture(serialNumber, title, description);
        }
    }

    /**Add 3 things to the database
     * Add both of Things and instance of Things
     *
     */
    public void addFurniture(String serialNumber, String title, String description) {

//        data = readFromFile();
        ArrayList<Furniture> furnitures = new ArrayList<>();
        Furniture furniture = new Furniture(serialNumber, title, description);

        data.add(furniture);
        furnitures.add(furniture);

//        writeToFile(data);
//        ((new IOFile<Furniture>())).writerFileData(furnitures, PathProperties.PATH_FILE_FURNITURE);
    }

    public void addBook(String serialNumber, String title, String description) {

//        data = readFromFile();
        ArrayList<BookOnTape> books = new ArrayList<>();
        BookOnTape book = new BookOnTape(serialNumber, title, description);

        data.add(book);
        books.add(book);

//        writeToFile(data);
//        ((new IOFile<BookOnTape>())).writerFileData(books, PathProperties.PATH_FILE_BOOK);
    }

    public void addVideo(String serialNumber, String title, String description) {

//        data = readFromFile();
        ArrayList<Video> videos = new ArrayList<>();
        Video video = new Video(serialNumber, title, description);

        data.add(video);
        videos.add(video);

//        writeToFile(data);
//        ((new IOFile<Video>())).writerFileData(videos, PathProperties.PATH_FILE_BOOK);
    }

    public Things getDetailsBySerialNumber(String serialNumber){

//        ArrayList<Things> things = readFromFile();
        Things result = null;
        for (Things thing: data) {
            if (thing.getSerialNumber().equals(serialNumber)){
                result = thing;
            }
        }
        return result;

    }

    public ArrayList<Furniture> getAllFurniture(){
//        ArrayList<Furniture> furnitures = ioFileFurniture.readFileData(PathProperties.PATH_FILE_FURNITURE);
        if (furnitures.isEmpty()){
            return new ArrayList<>();
        }
        return furnitures;
    }
    public boolean checkSerialNumberIsExisted(String serialNumber){
//        ArrayList<Things> things = readFromFile();
        for (Things thing: data) {
            if (thing.getSerialNumber().equals(serialNumber)){
                return true;
            }
        }
        return false;
    }
}
