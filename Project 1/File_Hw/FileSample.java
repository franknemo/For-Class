package File_Hw;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileSample {

    public static void main(String[] args) throws IOException{
        var filename = "/Applications/Java (CSC110)/Project 1/Grades.txt"; 
        var filePath = Paths.get(filename); 
        List<String> lineArray = Files.readAllLines(filePath); 

        for(var linedata : lineArray){
            System.out.println(linedata); 
        }
        System.out.println("The code was Successful --Frank Araujo--");
        System.out.println("the changes were made in git"); 
    }
    
}
