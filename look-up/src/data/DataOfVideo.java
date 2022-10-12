package data;

import ioFile.IOFile;
import model.Video;
import source.PathProperties;

import java.io.File;
import java.util.ArrayList;

public class DataOfVideo {

    private static final IOFile<Video> ioFile = new IOFile<>();

    public DataOfVideo() {
    }

    public ArrayList<Video> getVideosList(){
        if(new File(PathProperties.PATH_FILE_VIDEO).length() == 0)
            return new ArrayList<>();
        return ioFile.readFileData(PathProperties.PATH_FILE_VIDEO);
    }
}
