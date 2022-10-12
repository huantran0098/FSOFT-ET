package data;

import ioFile.IOFile;
import model.BookOnTape;
import model.Furniture;
import source.PathProperties;

import java.io.File;
import java.util.ArrayList;

public class DataOfFurniture {

    private static final IOFile<Furniture> ioFile = new IOFile<>();

    public DataOfFurniture() {
    }

    public ArrayList<Furniture> getFurnitureList(){
        if(new File(PathProperties.PATH_FILE_FURNITURE).length() == 0)
            return new ArrayList<>();
        return ioFile.readFileData(PathProperties.PATH_FILE_FURNITURE);
    }
}
