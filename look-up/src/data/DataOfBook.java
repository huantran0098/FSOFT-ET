package data;

import ioFile.IOFile;
import model.BookOnTape;
import source.PathProperties;

import java.io.File;
import java.util.ArrayList;

public class DataOfBook {

    private static final IOFile<BookOnTape> ioFile = new IOFile<>();

    public DataOfBook(){}

    public ArrayList<BookOnTape> getBooksList(){
        if(new File(PathProperties.PATH_FILE_BOOK).length() == 0)
            return new ArrayList<>();
        return ioFile.readFileData(PathProperties.PATH_FILE_BOOK);
    }
}
