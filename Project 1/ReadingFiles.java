import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class ReadingFiles {
    public static void main(String[] args) throws IOException {
        var filename = "/Applications/Java (CSC110)/Project 1/Data .txt";// starting point/ entry point
        var filePath = Paths.get(filename);
        // defensive programming 
        if(!File.exists(filePath)) {// the "!" means if file is not found
            System.out.println("The File" + filename + "could not be found");
            return; 
            System.out.println(" ****Success: the file" + filename + "was found!");
        }
        

            
    }
    
}
